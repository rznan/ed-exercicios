package controller;

import datastructures.genericQueue.Queue;
import model.Processo;

public class EscalonadorProcessos {
    public void escalonador(Queue<Processo> fila) throws Exception {
        if (fila.isEmpty()) {
            throw new Exception("não há processo na fila.");
        }
        Processo p = fila.remove();
        System.out.println(p + " (-1)");
        if (--p.quantidadeRetornos > 0) {
            fila.insert(p);
        }
    }
}
