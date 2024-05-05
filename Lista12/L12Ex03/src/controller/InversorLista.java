package controller;

import datastrucures.genericList.List;

public class InversorLista<T> {
    public void inverter(List<T> list, int length) throws Exception {
        if(length <= 0) {
            return;
        }
        T aux = list.get(0);
        list.removeFirst();
        inverter(list, length-1);
        list.addLast(aux);
    }
}
