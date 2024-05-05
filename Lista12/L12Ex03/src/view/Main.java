package view;

import controller.InversorLista;
import datastrucures.genericList.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new List<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        mostrarLista(list);

        InversorLista<Integer> inversorLista = new InversorLista<>();

        try {
            inversorLista.inverter(list, list.size());
            mostrarLista(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void mostrarLista(List<Integer> list) {
        int size = list.size();
        int cont = 0;
        while(cont < size) {
            try {
                System.out.print(list.get(cont++) + " ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }
}
