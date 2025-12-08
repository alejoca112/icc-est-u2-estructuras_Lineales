package models;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    // Getters y Setters de value
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Getters y Setters de next
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    // Getters y Setters de prev
    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }
}
