package view;


import controller.NumberController;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        var nCont = new NumberController();

        int num;
        int digit;

        do {
            num = getIntegerFromStdIn("Digite um número de 10 a 999999 ");
        } while (num < 10 || num > 999999);

        do {
            digit = getIntegerFromStdIn("Digite um digito de 0 a 9 ");
        } while (digit > 9 || digit < 0);

        System.out.println("O digito " + digit + " aparece " + nCont.countDigits(num, digit) + " vez(es) no número " + num);
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
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if(IsInteger(input)){
                return Integer.parseInt(input);
            }
        }
    }
}
