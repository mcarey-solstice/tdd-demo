package com.demo.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {

    PalindromeService service = new PalindromeService();

    @Test
    public void emptyStringIsPalindrome() throws Exception {
        assertTrue(service.isPalindrome(""));
    }

}