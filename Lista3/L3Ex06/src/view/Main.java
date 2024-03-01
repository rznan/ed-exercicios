package view;

import controller.SequenciaController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var seqController = new SequenciaController();

        int n = getIntegerFromStdIn("Digite o valor de N: ");
        System.out.println("A soma da sequência até N é: " + seqController.calcularSequencia(n));

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