package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
//    	creation of node
        Node2 node = new Node2(10);
        Node2 node1 = new Node2(20);
//        setting up the references
        node.next = node1;
        node1.prev= node;

        System.out.println("Data1:: " + node.data); 
        System.out.println("Data2:: " + node1.data);
        System.out.println("node1 refer next >> " + node.next.next);
    }
}

class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
