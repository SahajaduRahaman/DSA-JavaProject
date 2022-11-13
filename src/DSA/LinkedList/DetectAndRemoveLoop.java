package DSA.LinkedList;

public class DetectAndRemoveLoop {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node detectLoop(Node head) {
        Node temp = head;
        Node temp2 = head;

        while (temp2 != null && temp2.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;

            if (temp == temp2) {
                if (temp == head) {
                    while (temp2.next != temp) {
                        temp2 = temp2.next;
                    }
                }
                else {
                    temp = head;
                    while (temp.next != temp2.next) {
                        temp = temp.next;
                        temp2 = temp2.next;
                    }
                }
                temp2.next = null;
            }
        }
        return head;
    }
    public static void printList(Node head) {
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
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        for(int i = 1;  i < 5; i++) {
            temp.next = new Node(i + 1);
            temp = temp.next;
        }
        temp.next = head;

        Node curr = detectLoop(head);

        printList(curr);
    }
}
