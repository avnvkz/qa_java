package ru.yandex.praktikum.zoo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatFelineListForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Проверка типа еды", expected, actual);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Проверка семейства", expected, actual);
    }

    @Test
    public void getKittensWithEmptyConstructorOne() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Проверка количества котят: 0", expected, actual);
    }
}