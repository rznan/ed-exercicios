package controller;


import datastructures.genericQueue.Queue;

public class InversorFila<T> {
    public void reverse(Queue<T> q) throws Exception {
        if(q.isEmpty()) throw new Exception("A fila esta vazia");
        else {
            // Viaja até o último elemento da fila removendo e armazenando os valores do topo da fila
            // até o último elemento. Depois volta inserindo esses elementos de trás para frente
            if(!(q.size() == 1)) {
                T head = q.remove();
                reverse(q);
                q.insert(head);
            }
        }
    }
}
