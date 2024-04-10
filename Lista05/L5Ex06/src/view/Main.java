package view;

import vetores.ordenacao.BubbleSort;
import vetores.ordenacao.MergeSort;
import vetores.ordenacao.QuickSort;

public class Main {
    public static void main(String[] args) {
        int TAMANHO = 1000000;
        int[] arr = new int[TAMANHO];
        for(int i=0; i<TAMANHO; i++) {
            arr[i] = TAMANHO - i;
        }
        printResult(arr);
    }

    public static void printResult(int[] arr){
        long start;
        long end;
        int[] aux;
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        // Cabeçario
        System.out.println("------------------------------------------");

        // QUICKSORT
        System.out.print("QuickSort: ");
        aux = arr.clone();

        start = System.nanoTime();
        quickSort.sort(aux, 0, aux.length-1);
        end = System.nanoTime();
        System.out.println("\nDuração: " + (double) (end - start) / 1000000 + "ms");


        // MERGESORT
        System.out.print("\nMergeSort: ");
        aux = arr.clone();

        start = System.nanoTime();
        mergeSort.sort(aux, 0, arr.length-1);
        end = System.nanoTime();
        System.out.println("\nDuração: " + (double)(end - start) / 1000000 + "ms");


        // BUBBLESORT
        System.out.print("\nBubbleSort: ");
        aux = arr.clone();

        start = System.nanoTime();
        bubbleSort.sort(aux);
        end = System.nanoTime();
        System.out.println("\nDuração: " + (double) (end - start) / 1000000 + "ms");
    }
}
