package com.demo.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    PalindromeService service = new PalindromeService();

    @Test
    public void emptyStringIsPalindrome() throws Exception {
        assertTrue(service.isPalindrome(""));
    }

    @Test
    public void singleCharacterIsPalindrome() throws Exception {
        assertTrue(service.isPalindrome("a"));
    }

    @Test
    public void twoDifferentCharactersIsNotPalindrome() throws Exception {
        assertFalse(service.isPalindrome("ab"));
    }

    @Test
    public void oneMiddleCharacterIsPalindrome() throws Exception {
        assertTrue(service.isPalindrome("aba"));
    }

    @Test
    public void firstAndLastCharacterSameDoesNotImplyPalindrome() throws Exception {
        assertFalse(service.isPalindrome("abca"));
    }

    @Test
    public void nonAlphaCharactersAreIgnored() throws Exception {
        assertTrue(service.isPalindrome("a but tuba"));
        assertTrue(service.isPalindrome("a but tuba?"));
        assertTrue(service.isPalindrome("a but tuba."));
    }

    @Test
    public void upperCaseCharactersAreConverted() {
        assertTrue(service.isPalindrome("A but tUba"));
    }

}