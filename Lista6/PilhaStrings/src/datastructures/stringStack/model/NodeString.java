package datastructures.stringStack.model;

public class NodeString {
    private String data;
    private NodeString next;

    public NodeString(String data) { setData(data); }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeString getNext() {
        return next;
    }

    public void setNext(NodeString next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeString{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
