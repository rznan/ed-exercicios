package controller;

import datastructures.genericQueue.Queue;
import model.Impressora;

public class ImpressoraController {
    Impressora impressora;

    public ImpressoraController(Queue<String> fila) {
        this.impressora = new Impressora(fila);
        impressora.start();
    }

    public void insereDocumento(Queue<String> fila, String documento) {
        fila.insert(documento);
    }

    public void desligar() {
        impressora.desligar = true;
    }
}
