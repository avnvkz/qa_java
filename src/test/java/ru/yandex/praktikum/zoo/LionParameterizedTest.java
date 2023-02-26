package ru.yandex.praktikum.zoo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;

    public LionParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Пол. Тестовые данные: {0}")
    public static Object[] getSexData() {
        return new Object[]{"Самец", "Самка"};
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doesHaveManeLionWithDifferentSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        switch (sex) {
            case ("Самец"):
                assertTrue("Проверка наличия гривы у самца",lion.doesHaveMane());
                break;
            case ("Самка"):
                assertFalse("Проверка наличия гривы у самки", lion.doesHaveMane());
                break;
        }
    }
}