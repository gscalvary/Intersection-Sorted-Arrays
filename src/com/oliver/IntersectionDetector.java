package com.oliver;

import java.util.ArrayList;

public class IntersectionDetector {

    public ArrayList<Integer> detect(int[] a, int[] b) {

        if(a.length == 0 || b.length == 0) return null;

        ArrayList<Integer> intersect = new ArrayList<Integer>();

        if(a.length < b.length) {
            findIntersect(intersect, a, b);
        } else {
            findIntersect(intersect, b, a);
        }

        return intersect;
    }

    private void findIntersect(ArrayList<Integer> intersect, int[] a, int[] b) {

        for(int i = 0; i < a.length; i++) {
            if(i == 0 || a[i - 1] != a[i]) {
                if (binarySearch(a[i], b) >= 0) intersect.add(a[i]);
            }
        }
    }

    private int binarySearch(int find, int[] b) {

        int lower = 0, upper = b.length - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if(b[mid] == find) {
                return mid;
            } else if(b[mid] > find) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }

        return -1;
    }
}
