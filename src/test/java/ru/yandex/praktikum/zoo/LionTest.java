package ru.yandex.praktikum.zoo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensEqualsOne() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals("Проверка количества котят: 0", expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals("Проверка типа еды", expected, actual);
    }

    @Test
    public void createLionWithUnacceptableValue () {
        try {
            Lion lion = new Lion("Детеныш", feline);
        } catch (Exception e) {
            String expected = "Используйте допустимые значения пола животного - самец или самка";
            String actual = e.getMessage();
            assertEquals("Проверка текста исключения", expected, actual);
        }
    }
}