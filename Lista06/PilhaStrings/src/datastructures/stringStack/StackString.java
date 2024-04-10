package datastructures.stringStack;

import datastructures.stringStack.model.NodeString;

public class StackString {
    private NodeString top;

    public StackString() {}

    public boolean isEmpty() { return top == null; }

    public void push(String value) {
        if(isEmpty()) top = new NodeString(value);
        else {
            NodeString newTop = new NodeString(value);
            newTop.setNext(top);
            top = newTop;
        }
    }

    public String pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        else {
            String value = top.getData();
            top = top.getNext();
            return value;
        }
    }

    public String top() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        else {
            return top.getData();
        }
    }

    public int size() {
        int cont = 0;
        if(!isEmpty()) {
            NodeString aux = top.getNext();
            while(aux != null) {
                cont++;
                aux = aux.getNext();
            }
        }
        return cont;
    }

}
