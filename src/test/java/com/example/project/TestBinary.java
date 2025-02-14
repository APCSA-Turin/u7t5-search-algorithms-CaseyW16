package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.project.Binary_Search.*;

class TestBinary {

    @Test
    void testBinarySearch_TargetFound() {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int expectedIndex = 3; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should be found at index 3");
    }

    @Test
    void testBinarySearch_TargetNotFound() {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 8;
        int expectedIndex = -1; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should not be found, expected -1");
    }

    @Test
    void testBinarySearch_TargetAtStart() {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 1;
        int expectedIndex = 0; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should be found at index 0");
    }

    @Test
    void testBinarySearch_TargetAtEnd() {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 13;
        int expectedIndex = 6;
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should be found at index 6");
    }

    @Test
    void testBinarySearch_EmptyArray() {
        int[] elements = {};
        int target = 5;
        int expectedIndex = -1; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should not be found in an empty array");
    }

    @Test
    void testBinarySearch_SingleElementArray_TargetFound() {
        int[] elements = {5};
        int target = 5;
        int expectedIndex = 0; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should be found at index 0");
    }

    @Test
    void testBinarySearch_SingleElementArray_TargetNotFound() {
        int[] elements = {5};
        int target = 10;
        int expectedIndex = -1; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        assertEquals(expectedIndex, actualIndex, "Target should not be found, expected -1");
    }
}
