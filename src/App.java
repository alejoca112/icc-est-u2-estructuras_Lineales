import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 32));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 28));
        node1.setNext(node2);   // Juan a maria
        node2.setNext(node3);   // Maria a pepito
        node3.setNext(node4);   // Pepito a diego
        System.out.println(node1.toString());
    }
}
