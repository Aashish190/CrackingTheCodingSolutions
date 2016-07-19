package practice.question.linkedlist;

/**
 * Created by aashish on 7/18/16.
 */

public class PartitionLinkedListAroundElement {

    static Node Head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            next = null;
        }
    }

    void printList(Node node){
        while(node !=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        PartitionLinkedListAroundElement pllae = new PartitionLinkedListAroundElement();
        Head =  new Node(10);
        Head.next = new Node(2);
        Head.next.next = new Node(17);
        Head.next.next.next = new Node(6);
        Head.next.next.next.next = new Node(15);
        Head.next.next.next.next.next = new Node(4);
        Head.next.next.next.next.next.next = new Node(3);
        pllae.printList(Head);

        System.out.println("###########\n");

        pllae.partitionLinkedList(10);

    }

    void appendToEnd(Node node, int a){

        while(node.next !=null) {
            node = node.next;
        }
        node.next = new Node(a);
    }

    void partitionLinkedList(int breakAround){
        Node ListSmaller = null, ListEqaulBreakAround = null ,ListGreater = null , ptr=null;

        ptr= Head;
        while(ptr != null){
            if(ptr.data == breakAround){
                if(ListEqaulBreakAround == null){
                    ListEqaulBreakAround = new Node(ptr.data);
                }else{
                    PartitionLinkedListAroundElement a= new PartitionLinkedListAroundElement();
                    a.appendToEnd(ListEqaulBreakAround, ptr.data);
                }
                ptr = ptr.next;
            }else if(ptr.data < breakAround){

                if(ListSmaller != null){
                    PartitionLinkedListAroundElement a= new PartitionLinkedListAroundElement();
                    a.appendToEnd(ListSmaller, ptr.data);
                }else{
                    ListSmaller = new Node(ptr.data);
                }
                ptr = ptr.next;
            }else{
                if(ListGreater== null) {
                    ListGreater = new Node(ptr.data);
                }else{
                    PartitionLinkedListAroundElement a= new PartitionLinkedListAroundElement();
                    a.appendToEnd(ListGreater, ptr.data);
                }
                ptr = ptr.next;
            }
        }if(ListSmaller != null){
            printList(ListSmaller);
        }if(ListEqaulBreakAround != null){
            printList(ListEqaulBreakAround);
        }if(ListGreater != null){
            printList(ListGreater);
        }
    }


}
