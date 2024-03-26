package view;

import controller.FatController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FatController fatController = new FatController();

        int n;
        do {
            n = getIntegerFromStdIn("Escreva um número de 0 a 10 para calcular o fatorial: ");
        } while(n < 0 || n > 10);

        System.out.println("O fatorial de " + n + " é: " + fatController.fatorial(n));
    }

    public static boolean IsInteger(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int getIntegerFromStdIn(String msg) {
        var sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if (IsInteger(input)) {
                return Integer.parseInt(input);
            }
        }
    }
}
