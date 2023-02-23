package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittens;

    public FelineParameterizedTest(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters
    public static Object[] getKittensData() {
        return new Object[] {-2, 0, 4, 21, 148};
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittensWithNumberInConstructorReturnNumber() {
        Feline feline = Mockito.spy(Feline.class);
        int expected = kittens;
        int actual = feline.getKittens(kittens);
        assertEquals(expected, actual);
    }
}