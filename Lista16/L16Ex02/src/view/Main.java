package view;

import controller.EvenOddHashtable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EvenOddHashtable hashtable = new EvenOddHashtable();
        int[] numbers = generateRandomNumbers(getInput());
        for (int n : numbers) {
            try {
                hashtable.put(n);
            } catch (Exception e) {
                System.err.println("Não foi possível inserir " + n);
            }
        }
        try {
            hashtable.listEven();
            hashtable.listOdd();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static int[] generateRandomNumbers(int amount) {
        int[] a = new int[amount];
        for (int i = 0; i < amount; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n;
            try {
                System.out.print("Insira a quantidade de números: ");
                n = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido");
                continue;
            }
            if (n < 0 || n == 0) {
                System.out.println("Insira um valor válido");
                continue;
            }
            return n;
        }
    }
}
