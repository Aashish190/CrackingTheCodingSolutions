package practice.question.linkedlist;

/**
 * Created by aashish on 7/17/16.
 */
public class DeleteEntryLinkedList {
    static Node HEAD;

    static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        DeleteEntryLinkedList de = new DeleteEntryLinkedList();
        HEAD =  new Node(2);
        HEAD.next = new Node(122);
        HEAD.next.next = new Node(13);
        HEAD.next.next.next = new Node(11);
        HEAD.next.next.next.next = new Node(12);
        HEAD.next.next.next.next.next = new Node(11);
        HEAD.next.next.next.next.next.next = new Node(10);
        printList(HEAD);

        System.out.println("\n\n Removing 2");
        deleteEntry(11);
    }

    static void printList(Node head){
        while(head !=null){
            System.out.println(head.data);
            head= head.next;
        }
    }

    static void deleteEntry( int i){
        DeleteEntryLinkedList de = new DeleteEntryLinkedList();
        Node copyHead = null;
        if(HEAD.data==i){
            printList(HEAD.next);
        }
        while(HEAD.next != null){
            if(HEAD.data ==i){
                HEAD.next = HEAD.next.next;
            }
            HEAD = HEAD.next;
        }
    }
}
