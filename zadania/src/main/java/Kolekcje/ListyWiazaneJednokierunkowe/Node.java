package Kolekcje.ListyWiazaneJednokierunkowe;


public class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}