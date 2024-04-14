package view;

import controller.EscalonadorProcessos;
import datastructures.genericQueue.Queue;
import model.Processo;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Processo> fila = new Queue<>();
        String input = getInput();
        processInputIntoQueue(input, fila);
        runProcessScheduler(fila);
    }

    private static void runProcessScheduler(Queue<Processo> fila) {
        EscalonadorProcessos escalonador = new EscalonadorProcessos();
        try {
            while (!fila.isEmpty()) {
                escalonador.escalonador(fila);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void processInputIntoQueue(String input, Queue<Processo> fila) {
        String[] processes = input.split(",");
        for(String s : processes) {
            s = s.substring(1, s.length()-1);
            String[] processElements = s.split(";");
            Processo p = new Processo();
            p.nome = processElements[0];
            p.quantidadeRetornos = Integer.parseInt(processElements[1]);
            fila.insert(p);
        }
    }

    private static String getInput() {
        System.out.print(
                """
                Insira  os   processos   para  executar.
                Exemplo: {"notepad.exe;14","write.exe;35"}
                >\s"""
        );
        String input = sc.nextLine();
        input = input.substring(1, input.length()-1);
        return input;
    }
}

