package DSA.LinkedList;

public class LinkedListImplimentation {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
    public void addLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }
    public void printList() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        Node temp = head.next;
        while (temp.next != null) {
            curr = curr.next;
            temp = temp.next;
        }
        curr.next = null;
    }
    public static void main(String[] args) {
        LinkedListImplimentation list = new LinkedListImplimentation();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();

        list.deleteLast();

        list.printList();
    }
}
