package dataStructures.stacks.model;

public class NodeInt {
    private int data;
    private NodeInt next;

    public NodeInt(int data) { setData(data); }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeInt getNext() {
        return next;
    }

    public void setNext(NodeInt next) {
        this.next = next;
    }
}
