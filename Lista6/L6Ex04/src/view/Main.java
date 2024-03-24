package view;

import controller.ConverteController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverteController converte = new ConverteController();
        int valorEntrada;
        do {
            valorEntrada = getIntegerFromStdIn("Digite um número entre 0 e 1000: ");
        } while(valorEntrada > 1000 || valorEntrada < 0);

        System.out.println(
                "VALOR: " + valorEntrada + "\n" +
                "VALOR EM BINÁRIO: " + converte.decToBin(valorEntrada)
        );
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
