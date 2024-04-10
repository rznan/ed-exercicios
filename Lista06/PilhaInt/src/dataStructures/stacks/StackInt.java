package dataStructures.stacks;
import dataStructures.stacks.model.NodeInt;

public class StackInt {
    private NodeInt top;

    public StackInt() {}

    public boolean isEmpty() { return top == null; }

    public void push(int value) {
        if(isEmpty()) top = new NodeInt(value);
        else {
            NodeInt newTop = new NodeInt(value);
            newTop.setNext(top);
            top = newTop;
        }
    }

    public int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        else {
            int value = top.getData();
            top = top.getNext();
            return value;
        }
    }

    public int top() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        else {
            return top.getData();
        }
    }

    public int size() {
        int cont = 0;
        if(!isEmpty()) {
            NodeInt aux = top.getNext();
            while(aux != null) {
                cont++;
                aux = aux.getNext();
            }
        }
        return cont;
    }

}
