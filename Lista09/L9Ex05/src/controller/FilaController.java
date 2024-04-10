package controller;

import datastructures.genericQueue.Queue;
import model.Cliente;

import java.util.Scanner;

public class FilaController {
    int contadorDeSenhas;
    int contadorDeChamados;

    public FilaController() {

        contadorDeSenhas = 0;
        contadorDeChamados = 0;
    }

    public void inserirNovaSenha(Scanner sc, Queue<Cliente> fila) {

        System.out.println("\n\n");
        System.out.println("----------------------------------");
        System.out.println("-----------Inserir Senha----------");
        System.out.println("NÚMERO: " + contadorDeSenhas+1);
        System.out.println("CLIENTE");
        System.out.print("\tDIGITE O NOME: ");
        String nome = sc.nextLine();
        System.out.println("---------------OK-----------------");
        System.out.println("----------------------------------");

        fila.insert(new Cliente(++contadorDeSenhas, nome));
    }

    public void chamarProximoCliente(Queue<Cliente> fila, Queue<Cliente> filaPrioritarios) {

        Cliente cliente;
        try {
            cliente = getNextCliente(fila, filaPrioritarios);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }

        System.out.println("\n\n");
        System.out.println("------------CHAMANDO--------------");
        System.out.println("-- SENHA: " + cliente.numero);
        System.out.println("-- NOME : " + cliente.nome);
        System.out.println("----------------------------------");
    }

    private Cliente getNextCliente(Queue<Cliente> fila, Queue<Cliente> filaPrioritarios) throws Exception {

        if(!filaPrioritarios.isEmpty()) {
            if(contadorDeChamados < 3) {
                contadorDeChamados++;
                return filaPrioritarios.remove();
            }
        }
        if(!fila.isEmpty()) {
            contadorDeChamados = 0;
            return fila.remove();
        }

        throw new Exception("Não há clientes nas filas");
    }
}
