package DSA.LinkedList;

public class RevarseLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node revarseList(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static Node reverseListRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void printList(Node head) {
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
        for (int i = 1; i < 5; i++) {
            temp.next = new Node(i + 1);
            temp = temp.next;
        }

        Node current = revarseList(head);

        printList(current);

        Node newCurr = reverseListRecursive(current);

        printList(newCurr);
    }
}
