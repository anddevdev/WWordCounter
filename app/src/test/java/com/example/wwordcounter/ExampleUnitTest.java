package com.example.wwordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.wwordcounter.count.counter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test01GetCharsCount() {
        String phrase = "abcd";
        int expectedNumber = 4;
        int actualNumber = counter.getNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test02GetCharsCount(){
        String phrase = null;
        int expectedNumber = -1;
        int actualNumber = counter.getNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test03GetCharsCount(){
        String phrase = "";
        int expectedNumber = 0;
        int actualNumber = counter.getNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test04GetWordsCount(){
        String phrase = "";
        int expectedNumber = 1;
        int actualNumber = counter.getWordNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test05GetWordsCount(){
        String phrase = null;
        int expectedNumber = 0;
        int actualNumber = counter.getWordNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test06GetWordsCount(){
        String phrase = "London is the capital of Great Britain.";
        int expectedNumber = 7;
        int actualNumber = counter.getWordNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test07GetWordsCount(){
        String phrase = ". ? ,";
        int expectedNumber = 3;
        int actualNumber = counter.getWordNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void test08GetWordsCount(){
        String phrase = "Text. with, dots. and, comas?";
        int expectedNumber = 5;
        int actualNumber = counter.getWordNumber(phrase);
        assertEquals(expectedNumber,actualNumber);
    }
}
