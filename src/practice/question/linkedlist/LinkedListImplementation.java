package practice.question.linkedlist;

import com.sun.tools.javac.util.GraphUtils;

/**
 * Created by aashish on 7/17/16.
 * basic implemenation understanding.
 * adding new element to LINKEDLIST
 * and Deleting Element
 */
public class LinkedListImplementation {
    LinkedListImplementation next= null;
    int data;

    void printList(LinkedListImplementation node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public LinkedListImplementation(int d){
        data = d;
    }

    public static void main(String[] args) {
        LinkedListImplementation node = new LinkedListImplementation(1);
        node.appendToTail(2);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(5);
        node.appendToTail(6);
        node.appendToTail(7);

        System.out.println("    ############    ");

        LinkedListImplementation newNode = node.delete(node,3);

        System.out.println("    ############    ");
    }

    public void appendToTail(int d){
        LinkedListImplementation end= new LinkedListImplementation(d);
        LinkedListImplementation n= this;
        while(n.next !=null){
            n = n.next;
        }
        n.next = end;
    }

    public LinkedListImplementation delete(LinkedListImplementation head, int d){
        LinkedListImplementation n = head;
        if(n.data ==d){
            return head.next;
        }
        while(n.next != null){
            if(n.data ==d){
                n.next = n.next.next;
                return head;
            }
            n =n.next;
        }
        return head;
    }
}
