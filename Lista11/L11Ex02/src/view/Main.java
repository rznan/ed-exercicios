package view;

import datastructures.genericQueue.Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final TelefoneController telefoneController = new TelefoneController();
    private static final Queue<String> f = new Queue<>();
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha=0;
        do {
            processEscolha(escolha);
            escolha = mostrarMenuPrincipal();
        } while(escolha  != -1);
    }

    private static int mostrarMenuPrincipal() {
        int opc=0;
        do {
            try {
                System.out.println(
                        """
                                
                                Identificador de Chamadas
                                [1] > Inserir Novo número
                                [2] > Consultar ligações
                                [-1] > SAIR
                                -------------------------
                                >"""
                );
               opc = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nPor Favor Insira um número.\n");
            } finally {
                sc.nextLine();
            }
        } while(opc < -1 || opc > 2 || opc==0);
        return opc;
    }

    private static void processEscolha(int escolha) {
        switch (escolha) {
            case 1: menuNovoNumero();
            break;
            case 2: telefoneController.consultaChamadas(f);
            break;
            default:
            break;
        }
    }

    private static void menuNovoNumero() {
        System.out.print("INSIRA O NÚMERO: ");
        telefoneController.insereLigacao(f, sc.nextLine());
    }
}

class TelefoneController {
    public void insereLigacao(Queue<String> f, String telefone) {
        f.insert(telefone);
    }

    public void consultaChamadas(Queue<String> f) {
        int cont=1;
        System.out.println("LIGAÇÕES RECEBIDAS:");
        while(!f.isEmpty()){
            String telefone = getTelefone(f);
            System.out.printf("%d° --> %s\n", cont++, telefone);
        }
    }

    private String getTelefone(Queue<String> f) {
        try {
            return f.remove();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
