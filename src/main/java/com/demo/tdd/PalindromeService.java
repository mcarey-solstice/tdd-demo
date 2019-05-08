package com.demo.tdd;

public class PalindromeService {

    public boolean isPalindrome(String subject) {
        return _isPalindrome(subject.replaceAll("[^a-zA-Z]", "").toLowerCase());
    }

    public boolean _isPalindrome(String subject) {
        if (subject.length() <= 1) {
            return true;
        }

        return subject.charAt(0) == subject.charAt(subject.length() - 1)
                && isPalindrome(subject.substring(1, subject.length() - 1));
    }

}
