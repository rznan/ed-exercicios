package view;

import controller.FilaController;
import model.Cliente;
import datastructures.genericQueue.Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Queue<Cliente> filaPrincipal = new Queue<>();
    static Queue<Cliente> filaPrioritarios = new Queue<>();
    static FilaController gerenciadorDeFila = new FilaController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("\n\n");
            showMenu();
            opc = getUserInput(sc);
        } while (!processChoice(opc));

        System.out.println("\n\nOBRIGADO!");
    }

    private static boolean processChoice(int opc) {

        switch (opc) {
            case 1: gerenciadorDeFila.inserirNovaSenha(sc, filaPrincipal);
                return false;
            case 2: gerenciadorDeFila.inserirNovaSenha(sc, filaPrioritarios);
                return false;
            case 3: gerenciadorDeFila.chamarProximoCliente(filaPrincipal, filaPrioritarios);
                return false;
            default: return true;
        }
    }

    private static void showMenu() {

        System.out.println("----------------------------------");
        System.out.println("---------CONTROLE SENHAS----------");
        System.out.println("----------------------------------");
        System.out.println("[1] Nova senha na fila            ");
        System.out.println("[2] Nova senha na fila prioritária");
        System.out.println("[3] Chamar próximo                ");
        System.out.println("[9] SAIR                          ");
        System.out.println("----------------------------------");
    }

    private static int getUserInput(Scanner sc) {

        int opc=0;
        boolean isValid = false;
        do {
            try {
                System.out.print  ("SELECIONE: ");
                opc = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("POR FAVOR, ESCREVA UM NÚMERO.");
                continue;
            } finally {
                sc.nextLine();
            }
            isValid = (opc <= 3 && opc > 0) || opc == 9;
            if(!isValid) {
                System.out.println("POR FAVOR, ESCREVA UM NÚMERO VÁLIDO.");
            }
        } while(!isValid);
        return opc;
    }
}
