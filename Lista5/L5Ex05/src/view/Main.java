package view;

import vetores.ordenacao.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] arr2 = {44, 43, 42, 41, 40, 39, 38};
        int[] arr3 = {31, 32, 33, 34, 99, 98, 97, 96 };

        printResult(arr1);
        printResult(arr2);
        printResult(arr3);

    }

    public static void printResult(int[] arr){
        QuickSort quickSort = new QuickSort();

        // Cabeçario
        System.out.println("------------------------------------------");
        System.out.print("VETOR: ");
        printArray(arr);
        System.out.println();

        // QUICKSORT
        System.out.print("\nQuickSort: ");
        quickSort.sort(arr, 0, arr.length-1);
        printArray(arr);

        System.out.println();
    }

    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
