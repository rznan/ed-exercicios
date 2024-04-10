package view;

import controller.FibonacciController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        do {
            n = getIntegerFromStdIn("Digite o número de uma posição da sequência fibonacci para saber seu valor: (LIMITE: 20) ");
        }while (n > 20 || n <= 0);

        var fb = new FibonacciController();

        System.out.println(fb.calculate(n));
    }

    public static boolean IsInteger(String num){
        try {
            Integer.parseInt(num);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int getIntegerFromStdIn(String msg) {
        var sc = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if(IsInteger(input)){
                return Integer.parseInt(input);
            }
        }
    }
}