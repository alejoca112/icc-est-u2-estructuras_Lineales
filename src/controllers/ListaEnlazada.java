package controllers;

import java.util.NoSuchElementException;

import models.Node;

public class ListaEnlazada<T> {
    private Node<T> head;
    private int size;

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void append (T data){
        Node<T> newNode = new Node<T>(data);
        if(isEmpty()){
            head = newNode;
            size++;
            return;
        } else {
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Node<>(data));
            size++;
        }
    }
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("La lista esta vacia");
        }
        head = head.getNext();
        size--;
    }

    public void deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException("La lista esta vacia");
        }
        Node<T> current = head;
        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        size--;
    }

    public void deleteNode(T data){
        if(isEmpty()){
            throw new NoSuchElementException("La lista esta vacia");
        }
        Node<T> current = head;
        while(current.getNext() != null){
            if(current.getNext().getValue().equals(data)){
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public void printAllNodes(){
        Node<T> current = head;
        while(current != null){
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("!!!Fin!!!");
    }

    public String size() {
        return String.valueOf(size);
    }
}
