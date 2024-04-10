package view;

import controller.NumberController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var conversor = new NumberController();

        int valorDecimal;
        do {

            valorDecimal = getIntegerFromStdIn("Digite um número para converter em binário: ");
        } while(valorDecimal > 2000);

        System.out.println("Valor em binário: " + conversor.IntegerToBinary(valorDecimal));
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