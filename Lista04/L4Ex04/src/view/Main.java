package view;

import vetores.ordenacao.BubbleSort;
import vetores.ordenacao.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] arr2 = {44, 43, 42, 41, 40, 39, 38};

        printResult(arr1);
        printResult(arr2);

    }

    public static void printResult(int[] arr){
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        int[] arrBubble = arr.clone();
        int[] arrMerge = arr.clone();

        System.out.println();

        System.out.print("Vetor: ");
        printArray(arr);

        System.out.println();

        System.out.print("Ordenação BubbleSort: \t");
        bubbleSort.sort(arrBubble);
        printArray(arrBubble);

        System.out.println();

        System.out.print("Ordenação MergeSort: \t");
        mergeSort.sort(arrMerge, 0, arrMerge.length-1);
        printArray(arrMerge);

        System.out.println();
    }

    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
