package view;

import controller.NumberController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var numController = new NumberController();

        int num;
        while (true) {
            try {
                System.out.print("Insira um número inteiro: ");
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                continue;
            }finally {
                sc.nextLine();
            }
            break;
        }

        System.out.println("O número " + num + " Tem " + numController.countDecimalDigits(num) + " Digito(s).");
    }
}
