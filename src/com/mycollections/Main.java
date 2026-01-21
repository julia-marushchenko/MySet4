// Java program demonstrating operations with Set like Union, Intersection, and Difference.

package com.mycollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Declaring an object of Integer type of Set
        Set<Integer> mySet = new HashSet<Integer>();

        // Adding all elements to mySet
        mySet.addAll(Arrays.asList( new Integer[] {1, 3, 2, 4, 8, 7}));

        // Declaring another object of Integer type of Set
        Set<Integer> mySet1 = new HashSet<Integer>();

        // Addinf all elements to mySet1
        mySet1.addAll(Arrays.asList(new Integer[]{1, 3, 8, 7, 9, 0, 1}));

        // Find union.
        Set<Integer> union = new HashSet<>(mySet);
        union.addAll(mySet1);
        System.out.println("Union of two sets: " + union);

        // Find intersection.
        Set<Integer> intersection = new HashSet<Integer>(mySet);
        intersection.retainAll(mySet1);
        System.out.println("Intersection of two sets: " + intersection);

        // Find asymmetric difference of two sets.
        Set<Integer> difference = new HashSet<Integer>(mySet);
        difference.removeAll(mySet1);
        System.out.println("Difference of two sets: " + difference);

    }
}