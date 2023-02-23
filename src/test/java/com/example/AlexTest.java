package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;
    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex ("Самец", feline);
        int expected = 0;
        Mockito.when(feline.getKittens(anyInt())).thenReturn(0);
        int actual = alex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex ("Самец", feline);
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex ("Самец", feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}