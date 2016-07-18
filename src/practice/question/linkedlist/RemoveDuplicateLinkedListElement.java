package practice.question.linkedlist;

/**
 * Created by aashish on 7/17/16.
 */
public class RemoveDuplicateLinkedListElement {
    static Node HEAD;

    static class Node{
        int data;
        Node next ;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static void printList(Node node){
        while(node != null){
            System.out.println(node.data+" ");
            node = node.next;
        }
    }

    void removeDuplicate(){
        Node ptr1= null , ptr2 = null, dup =null;
        ptr1 =HEAD;

        while(ptr1 !=null && ptr1.next !=null){
            ptr2 = ptr1;

            while(ptr2.next !=null ){

                if(ptr1.data == ptr2.next.data){
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();

                }else{

                    ptr2 = ptr2.next;

                }
            }
            ptr1 = ptr1.next;
        }

    }

    public static void main(String[] args) {
        RemoveDuplicateLinkedListElement edlle= new RemoveDuplicateLinkedListElement();

        HEAD = new Node(-117);
        HEAD.next = new Node(220);
        HEAD.next.next = new Node(100);
        HEAD.next.next.next = new Node(11);
        HEAD.next.next.next.next = new Node(12);
        HEAD.next.next.next.next.next = new Node(11);
        HEAD.next.next.next.next.next.next = new Node(10);
        HEAD.next.next.next.next.next.next.next = new Node(220);

        printList(HEAD);
        System.out.printf("########### \n");

        edlle.removeDuplicate();
        printList(HEAD);

    }
}
