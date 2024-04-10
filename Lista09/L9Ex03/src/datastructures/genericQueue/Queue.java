package datastructures.genericQueue;

import datastructures.genericQueue.model.Node;

public class Queue<T> {

    private Node<T> start;
    private Node<T> end;
    public Queue() {
        this.start = null;
        this.end = null;
    }

    public boolean isEmpty() {
        return start == null && end == null;
    }

    public void insert(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        if(this.isEmpty()) {
            start = node;
            end = node;
        } else {
            end.next = node;
            end = end.next;
        }
    }

    public T remove() throws Exception {
        if(this.isEmpty()) throw new Exception("datastructures.Queue is Empty");
        T data = start.data;
        if(start != end) {
            start = start.next;
        } else {
            start = null;
            end = null;
        }
        return data;
    }

    public int size() {
        int cont = 0;
        if(!this.isEmpty()) {
            Node<T> aux = start;
            while(aux != null) {
                cont++;
                aux = aux.next;
            }
        }
        return  cont;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        Node<T> aux = start;
        while(aux != null) {
            buffer.append(aux);
            buffer.append(" --> ");
            aux = aux.next;
        }
        buffer.append("null");
        return buffer.toString();
    }
}
