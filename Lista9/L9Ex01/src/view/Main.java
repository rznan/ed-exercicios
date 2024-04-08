package view;

import controller.InversorFila;
import datastructures.genericQueue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(5);
        System.out.println("Original: \n" + queue);
        InversorFila<Integer> inversorFila = new InversorFila<>();
        try {
            inversorFila.reverse(queue);
            System.out.println("Invertida: \n" + queue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
