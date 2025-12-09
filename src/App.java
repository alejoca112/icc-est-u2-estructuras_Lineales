import models.Node;
import models.Person;
import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Geovanny Cabrera");

        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 32));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 31));
        node1.setNext(node2);   // Juan a maria
        node2.setNext(node3);   // Maria a pepito
        node3.setNext(node4);   // Pepito a diego
        System.out.println(node1.toString());
        runStackExample();
    }
    public static void runStackExample(){
        Stack<Person> stack = new Stack<Person>();
        stack.push(new Person("Juan", 30));
        stack.push(new Person("Maria", 35));
        stack.push(new Person("Pepito", 32));
        stack.push(new Person("Diego", 31));

        System.out.println("Tamaño: " + stack.size());
        stack.printAllNodes();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size luego de POP: " + stack.size());
        stack.printAllNodes();

        }
        
    }
