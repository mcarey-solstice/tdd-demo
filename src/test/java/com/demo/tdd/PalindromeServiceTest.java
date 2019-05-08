package com.demo.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    PalindromeService service = new PalindromeService();

    @Test
    public void emptyStringIsPalindrome() {
        assertTrue(service.isPalindrome(""));
    }

    @Test
    public void singleCharacterIsPalindrome() {
        assertTrue(service.isPalindrome("a"));
    }

    @Test
    public void twoCharactersThatAreNotPalindrome() {
        assertFalse(service.isPalindrome("ab"));
    }

    @Test
    public void twoCharactersThatArePalindrome() {
        assertTrue(service.isPalindrome("aa"));
    }

    @Test
    public void threeCharactersThatArePalindrome() {
        assertTrue(service.isPalindrome("aba"));
    }

    @Test
    public void threeCharactersThatAreNotPalindrome() {
        assertFalse(service.isPalindrome("abca"));
    }

    @Test
    public void realWords() {
        assertTrue(service.isPalindrome("level"));
        assertTrue(service.isPalindrome("racecar"));
    }

    @Test
    public void sentencesCanBePalindromes() {
        assertTrue(service.isPalindrome("a car, a man, a maraca."));
        assertTrue(service.isPalindrome("A car, a man, a maraca."));
    }

    @Test
    public void sentencesCanBeNotPalindromes() {
        assertFalse(service.isPalindrome("a car, a man, a bike, and a maraca."));
    }

}