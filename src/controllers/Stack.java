package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack<T> {
    private Node<T> top;
    private int size;
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    //Metodo Insertar
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    // Metodo y/o eliminar
    public T pop() {
        if (top == null) {
            //return null; Funciona tambien es lo generico para retiornar null o saber que no hay nada y es error
            throw new EmptyStackException();   //Programar un error es un manejo de excepciones
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek(){
        if(top == null)
            return null;
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    /*public int size(){
        if(isEmpty())
            return 0;
        int count = 1;
        Node<T> aux = top;
        while(aux.getNext()!=null){
            count++;
            aux = aux.getNext();
        }
        return count;
    }*/
    public int size(){
        return size;
    }

    public void printAllNodes(){
        Node<T> current = top;
        while(current!=null){
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("!!!Fin!!!");
    }
}
