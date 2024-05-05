package datastrucures.genericList.model;
public interface IList<T> {
    public void addFirst(T data);
    public void addLast(T data) throws Exception;
    public void add(T data, int index) throws Exception;
    public void removeFirst() throws Exception;
    public void removeLast() throws Exception;
    public void remove(int index) throws Exception;
    public T get(int index) throws Exception;
    public boolean isEmpty();
    public int size();
}
