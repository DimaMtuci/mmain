package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
        @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }
@Test
    void isPrimeReturnsFalseForNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void isPrimeReturnsTrueForPrimeNumbers() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(7));
        assertTrue(CourseToolkit.isPrime(13));
    }

    @Test
    void isPrimeReturnsFalseForCompositeNumbers() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(12));
    }

    @Test
    void isPrimeReturnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49)); 
    }
    @Test
    void isPalindromeReturnsTrueForValidPalindromes() {
        assertTrue(CourseToolkit.isPalindrome("aba"));
        assertTrue(CourseToolkit.isPalindrome("racecar"));
        assertTrue(CourseToolkit.isPalindrome("")); // Пустая строка — палиндром
    }

    @Test
    void isPalindromeReturnsFalseForInvalidPalindromes() {
        assertFalse(CourseToolkit.isPalindrome("abc"));
        assertFalse(CourseToolkit.isPalindrome("Aba")); // Регистр важен
        assertFalse(CourseToolkit.isPalindrome("aba ")); // Пробелы важны
    }

    @Test
    void isPalindromeThrowsExceptionForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
    }
    @Test
    void averageTests() {
        int[] values = {1, 2, 3, 4};
        assertEquals(2.5, CourseToolkit.average(values), 0.001);
        
        int[] negativeValues = {-1, -2, -3, -4};
        assertEquals(-2.5, CourseToolkit.average(negativeValues), 0.001);
        
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[]{}));
    }

}
