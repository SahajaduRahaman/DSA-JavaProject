package DSA.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeList {
    static class Node{
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head) {
        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int front = 0;
        int back = list.size() - 1;

        while (front < back) {
            if (!list.get(front).equals(list.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);

        Node temp = head;
        for (int i = 1; i < 5; i++) {
            temp.next = new Node(i + 1);
            temp = temp.next;
        }
        for (int i = 5; i > 0; i--) {
            temp.next = new Node(i);
            temp = temp.next;
        }

        System.out.println(isPalindrome(head));
    }
}
