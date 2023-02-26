package collections;

/**
 *
 * @author michelle
 */
public class LinkedList {

    private Node first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
        // return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean addFirst(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
        return true;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position provided");
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean add(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    public boolean add(int value, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position provided");
        }

        if (index == 0) {
            return addFirst(value);
        }

        Node current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        size++;
        return true;
    }

    private static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
}