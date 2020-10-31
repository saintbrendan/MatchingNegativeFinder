package com.company;

import static com.company.Main.hasMatchingNegative;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void returnsFalseWithEmptyArray() {
        int[] a = new int[0];
        assertFalse(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsFalseWithOneElementArray() {
        int[] a = new int[]{0};
        assertFalse(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueWithJustMatchingInts() {
        int[] a = new int[]{5, -5};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueWithJustMatchingIntsAscending() {
        int[] a = new int[]{-5, 5};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueLastValuesMatch() {
        int[] a = new int[]{-21, -13, -9, -4, -3, 3};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueFirstValuesMatch() {
        int[] a = new int[]{-7, 7, 9, 14, 23, 31};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueMiddleMatch() {
        int[] a = new int[]{-26, -17, -7, 2, 5, 7, 9, 14, 23, 31};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsTrueMiddleMatchDescending() {
        int[] a = new int[]{26, 17, 7, -2, -5, -7, -9, -14, -23, -31};
        assertTrue(hasMatchingNegative(a));
    }

    @org.junit.jupiter.api.Test
    void returnsFalseCloseNoCigar() {
        int[] a = new int[]{-26, -17, -17, -7, -7, 2, 5, 5, 9, 14, 23, 23};
        assertFalse(hasMatchingNegative(a));
    }
}