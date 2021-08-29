package com.bridgelabz;

public class Algorithm {

    public static void main(String[] args) {
        Utility<String> insertionSort = new Utility<>();

        String[] batchMate = {"RamKrishna", "Roja", "Sanjay", "Aviral", "Shubham", "Pallavi", "Prem", "ShivRaj"};

        System.out.println("before Sorting :- ");
        insertionSort.toPrint(batchMate);

        insertionSort.sort(batchMate);

        System.out.println("\nafter sorting :- ");
        insertionSort.toPrint(batchMate);
    }
}
