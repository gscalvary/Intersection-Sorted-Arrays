package com.oliver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{2,3,3,5,5,6,7,7,8,12};
        int[] b = new int[]{5,5,6,8,8,9,10,10};
        IntersectionDetector intersectionDetector = new IntersectionDetector();

        ArrayList<Integer> intersect = intersectionDetector.detect(a, b);
        System.out.print("The intersect is: ");
        for(Integer i : intersect) {
            System.out.print(" " + i);
        }
    }
}
