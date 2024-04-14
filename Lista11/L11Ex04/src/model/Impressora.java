package model;

import datastructures.genericQueue.Queue;

public class Impressora extends Thread {
    public Queue<String> fila;
    public boolean desligar = false;

    public Impressora(Queue<String> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (!desligar) {
            imprime();
        }
    }

    public void imprime() {
        try {
            String[] doc_data = fila.remove().split(";");
            System.out.printf(
                    "[#PC: %s - Arquivo: %s]\n",
                    doc_data[0], doc_data[1]
            );
        } catch (Exception e) {
            System.out.println("[Fila de impressão esta vazia]");
        }

        try {
            sleep((int) (Math.random() * 1001) + 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
