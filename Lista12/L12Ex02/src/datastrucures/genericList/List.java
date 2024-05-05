package datastrucures.genericList;


import datastrucures.genericList.model.IList;

public class List<T> implements IList<T> {

    private Node<T> head;

    @Override
    public void addFirst(T data) {
        if(isEmpty()) {
            head = new Node<>(data);
        } else {
            head = new Node<>(data, head.getNext());
        }
    }

    @Override
    public void addLast(T data) throws Exception{
        if(isEmpty()) {
            addFirst(data);
        } else {
            getNode(size()-1).setNext(new Node<>(data));
        }
    }

    @Override
    public void add(T data, int index) throws Exception {
        int size = size();
        if(index < 0 || index > size-1) {
            throw new Exception("Invalid Index");
        } else if(isEmpty() || index == 0) {
            addFirst(data);
        } else if(index == size-1) {
            addLast(data);
        } else {
            Node<T> previous = getNode(index-1);
            Node<T> current = previous.getNext();
            previous.setNext(new Node<>(data, current.getNext()));
        }
    }

    @Override
    public void removeFirst() throws Exception {
        if(isEmpty()) throw new Exception("List is empty");
        head = head.getNext();
    }

    @Override
    public void removeLast() throws Exception {
        if(isEmpty()) throw new Exception("List is empty");
        int size = size();
        if(size == 1) {
            removeFirst();
        } else {
            Node<T> previous = getNode(size-2);
            previous.setNext(null);
        }
    }

    @Override
    public void remove(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("List is Empty");
        }
        int size = size();
        if(index < 0 || index > size-1) {
            throw new Exception("Invalid Index");
        }

        if(index == 0) {
            removeFirst();
        } else if(index == size-1) {
            removeLast();
        } else {
            Node<T> previous = getNode(index-1);
            Node<T> current = previous.getNext();
            previous.setNext(current.getNext());
        }
    }

    @Override
    public T get(int index) throws Exception {
        return getNode(index).getData();
    }

    private Node<T> getNode(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("List is Empty");
        }
        int size = size();
        if(index < 0 || index > size-1) {
            throw new Exception("Invalid Index");
        }

        Node<T> response = head;
        for(int i = 1; i < index; i++) {
            response = response.getNext();
        }

        return response;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int c = 0;
        if(!isEmpty()) {
            Node<T> aux = head;
            while(aux != null) {
                c++;
                aux = aux.getNext();
            }
        }
        return c;
    }
}
