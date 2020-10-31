package com.cunnie;

public class MatchingNegativeFinder {
    public static boolean hasMatchingNegative(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (j >= i) {
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
