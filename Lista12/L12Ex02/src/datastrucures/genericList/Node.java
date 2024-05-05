package datastrucures.genericList;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        setData(data);
        setNext(next);
    }

    public Node(T data) {
        setData(data);
        setNext(null);
    }

    public Node() {
    };

    protected T getData() {
        return data;
    }

    protected void setData(T data) {
        this.data = data;
    }

    protected Node<T> getNext() {
        return next;
    }

    protected void setNext(Node<T> next) {
        this.next = next;
    }
}
