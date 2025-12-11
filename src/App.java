import models.Node;
import models.Person;
import controllers.ListaEnlazada;
import controllers.Queue;
import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Geovanny Cabrera");

        // Instanciando personas y conectando Nodos
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 32));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 31));
        node1.setNext(node2); // Juan a maria
        node2.setNext(node3); // Maria a pepito
        node3.setNext(node4); // Pepito a diego
        System.out.println(node1.toString());
        runStackExample();
        runQueueExample();
        runListExample();
    }

    //Metodo para ejecutar pilas
    public static void runStackExample() {
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

    //Metodo para ejecutar colas
    public static void runQueueExample() {
        System.out.println("Colas Queue");
        Queue<Person> queue = new Queue<Person>();
        queue.enqueue(new Person("Juan", 30));
        queue.enqueue(new Person("Maria", 35));
        queue.enqueue(new Person("Pepito", 32));
        queue.enqueue(new Person("Diego", 31));

        System.out.println("Tamaño: " + queue.size());
        queue.printAllNodes();
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Primera persona: " + queue.getFirst());
        System.out.println("Ultima persona: " + queue.getLast());
        System.out.println("Size luego de DEQUEUE: " + queue.size());
        queue.printAllNodes();
    }

    //Metodo para ejecutar listas
    public static void runListExample() {
        System.out.println("Listas");
        ListaEnlazada<Person> list = new ListaEnlazada<Person>();
        list.append(new Person("Juan", 30));
        list.append(new Person("Maria", 35));
        list.append(new Person("Pepito", 32));
        list.append(new Person("Diego", 31));

        //Impresion de nodos
        System.out.println("Tamaño: " + list.size());
        list.printAllNodes();
        
        list.deleteNode(new Person("Pepito", 32));
        list.printAllNodes();
        System.out.println("Delete First:");
        list.deleteFirst();
        list.printAllNodes();
        System.out.println("Delete Last:");
        list.deleteLast();
        list.printAllNodes();
        System.out.println("Size= " + list.size());
    }
}
