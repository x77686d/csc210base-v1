public class LList {
    private Node head;

    public add(Node node) {
        node.setNext(head);
        head = node;
        }

    public static void main(String args[]) {
        LList L;
        L.add(new Node("x"));
        }

}

public class Node {
    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
        next = null;
        }

    }
