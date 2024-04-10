package datastructures.genericQueue.model;


public class Node<T> {
    public T data;
    public Node<T> next = null;

    @Override
    public String toString() {
        return "" + this.data;
    }
}
