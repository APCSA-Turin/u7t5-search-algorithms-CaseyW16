package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        int loopCounter = 0; // for testing
        int leftIdx =  0; // TODO: assign this initial value
        int rightIdx =  elements.length - 1; // TODO: assign this initial value

        while (leftIdx <= rightIdx) {  // TODO: determine this condition (hint: see slides 61-63)
            loopCounter++; // for testing
            System.out.print(loopCounter + " "); // for testing
            int middleIdx = (leftIdx + rightIdx) / 2;

        //     // TODO: write the rest of the code to compare middleIdx to the target
        //     //  and adjust leftIdx and rightIdx as appropriate (see slides if needed)
            if (elements[middleIdx] > target) {
                rightIdx = middleIdx - 1;
            } else if (elements[middleIdx] < target) {
                leftIdx = middleIdx + 1;
            } else {
                return middleIdx;
            }
        }
        return -1; // not found
    }
}
