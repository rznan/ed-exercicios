package controller;

import datastructures.genericQueue.Queue;
import model.Pessoa;

public class ParqueController {
    public void brinquedo(Queue<Pessoa> f) {
        while (!f.isEmpty()) {
            Pessoa p = getPessoa(f);
            System.out.println(p);
            processarPermicoesDaPessoa(p);
        }
    }

    private static void processarPermicoesDaPessoa(Pessoa p) {
        boolean permitido = true;
        if (p.altura < 1.60) {
            System.out.println("Altura Míníma: >1.60 m");
            permitido = false;
        }
        if (p.idade < 16) {
            System.out.println("Idade Míníma: >16 anos");
            permitido = false;
        }
        if (permitido) {
            System.out.println("Entrada Permitida\n");
        }
        else {

            System.out.println("Entrada Não Permitida\n");
        }
    }

    private static Pessoa getPessoa(Queue<Pessoa> f) {
        Pessoa p;
        try {
            p = f.remove();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
