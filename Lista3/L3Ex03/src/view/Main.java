package view;

import controller.ReversorController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var reversor = new ReversorController();

        System.out.print("Digite um texto para reverter: ");
        String input = sc.nextLine();

        System.out.println("\nTexto Invertido: " + reversor.revert(input, input.length()));
    }
}