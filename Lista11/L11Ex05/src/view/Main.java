package view;


import controller.ParqueController;
import datastructures.genericQueue.Queue;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Queue<Pessoa> f = new Queue<>();
        ParqueController parque = new ParqueController();
        iniciarFila(f);
        parque.brinquedo(f);
    }

    private static void iniciarFila(Queue<Pessoa> f) {
        for(int i = 0; i<30; i++) {
            String nome = "Pessoa"+(i+1);
            int idade = (int) (Math.random() * 31) + 10;
            float altura = (float) ((int) (Math.random() * (201 - 135)) + 135) / 100;
            f.insert(new Pessoa(nome, idade, altura));
        }
    }
}

