package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasMatchingNegative(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            if (a[i] == -a[j]) {
                return true;
            }
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
