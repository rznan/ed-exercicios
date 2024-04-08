package controller;

import datastructures.genericQueue.Queue;
import model.Cliente;

public class OperacaoController {
    public void caixa(Queue<Cliente> f) {
        System.out.println("\n------------------------------------");
        System.out.println("---------Total das Compras----------");
        System.out.println("------------------------------------");

        while (!f.isEmpty()) {
            try {
                Cliente c = f.remove();
                System.out.printf("> nome: %s | total: %.2f\n", c.nome, (c.quantidadePecas * c.valorPecas));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------------------------------");
    }
}
