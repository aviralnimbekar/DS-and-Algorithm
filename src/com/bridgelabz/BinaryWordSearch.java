package com.bridgelabz;

public class BinaryWordSearch {

    public static void main(String[] args) {
        Utility<String> binarySearch = new Utility<>();

        String[] batchMate = {"RamKrishna", "Roja", "Sanjay", "Aviral", "Shubham", "Pallavi", "Prem", "ShivRaj"};
        binarySearch.insertionSort(batchMate);
        binarySearch.search(batchMate, "RamKrishna");
        binarySearch.toPrint(batchMate);
    }
}