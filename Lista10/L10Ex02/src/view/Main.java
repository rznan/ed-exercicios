package view;

import model.Cliente;
import controller.OperacaoController;
import datastructures.genericQueue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Cliente> fila = new Queue<>();
        OperacaoController op = new OperacaoController();

        inicializarFilaClientes(fila, 20);
        op.caixa(fila);
    }

    private static void inicializarFilaClientes(Queue<Cliente> clienteQueue, int quantidade) {
        System.out.println("------------------------------------");
        System.out.println("-----------Inicializacao------------");
        System.out.println("------------------------------------");

        for(int i = 0; i<quantidade; i++) {
            String nome = String.format("Cliente%02d", (i+1));
            int quantidadePecas = (int) (Math.random() * 31) + 20;
            float valorPecas =  (float) (Math.random() * 96) + 5;
            System.out.printf(">%10s | quant.%02d | valor %.2f\n", nome, quantidadePecas, valorPecas);
            clienteQueue.insert(new Cliente(nome, quantidadePecas, valorPecas));
        }
        System.out.println("------------------------------------");
    }
}

