package view;

import datastrucures.genericList.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        try {
            list.addLast(10);
            list.addLast(5);
            list.addLast(8);
            list.addLast(1);
            list.addLast(9);
            list.addLast(2);
            list.addLast(4);
            list.addLast(7);
            list.addLast(3);
            list.addLast(6);
        } catch (Exception e) {
            System.err.println("Não foi possível inicializar a lista");
            throw new RuntimeException();
        }

        mostrarLista(list);

        organizadorListaInteger organizador = new organizadorListaInteger();
        organizador.quicksort(list, 0, list.size()-1);

        mostrarLista(list);
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

class organizadorListaInteger {
    public void quicksort(List<Integer> l, int inicio, int fim) {
        if(inicio >= fim) return;
        int pivot = 0;
        try {
            pivot = divide(l, inicio, fim);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        quicksort(l, inicio, pivot-1);
        quicksort(l, pivot+1, fim);
    }

    public int divide(List<Integer> l, int inicio, int fim) throws Exception {
        int left = inicio+1, right = fim;
        Integer pivot = l.get(inicio);

        while (left <= right) {
            while (left <= right && l.get(left) < pivot) {
                left++;
            }
            while (left <= right && l.get(right) > pivot) {
                right--;
            }
            if(left <= right) {
                swap(l, left++, right--);
            }
        }

        swap(l, inicio, right);
        return right;
    }

    public void swap(List<Integer> l, int left, int right) {
        int size = l.size();
        try {
            Integer valueLeft = l.get(left);
            Integer valueRight = l.get(right);

            l.add(valueRight, left);
            if(left == size-1) {
                l.remove(left);
            } else {
                l.remove(left+1);
            }

            l.add(valueLeft, right);
            if(right == size-1) {
                l.remove(right);
            } else {
                l.remove(right+1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
