package practice.question.linkedlist;

import java.util.Scanner;

/**
 * Created by aashish on 7/17/16.
 */
public class RemoveKthToLastElement {
    static Node HEAD;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void print(Node n){
        while(n !=null){
            System.out.println( n.data +"");
            n = n.next;
        }
    }

    static void printElementThereafter(int d){
        RemoveKthToLastElement rle = new RemoveKthToLastElement();
        Node Temp = HEAD;
        boolean flag=false;
        if(HEAD != null){
            while(HEAD.data != d){
//                System.out.println(HEAD.data);
                if( HEAD.next !=null){
                    HEAD = HEAD.next;
                }else{
                    flag= true;
                    break;
                }
            }if(flag){
                System.out.println("the element doesnt exist in the list");
            }else{
                System.out.println("Linked List from "+d +" till the last element");
                rle.print(HEAD);
            }
        }

    }

    public static void main(String[] args) {
        RemoveKthToLastElement rle = new RemoveKthToLastElement();
        HEAD = new Node(11);
        HEAD.next = new Node(122);
        HEAD.next.next = new Node(13);
        HEAD.next.next.next = new Node(11);
        HEAD.next.next.next.next = new Node(12);
        HEAD.next.next.next.next.next = new Node(11);
        HEAD.next.next.next.next.next.next = new Node(10);

        rle.print(HEAD);
        System.out.println("----------------\n");
        System.out.println("enter int to be searched\n");

        Scanner sc = new Scanner(System.in);
        int searchAfter= Integer.parseInt(sc.next());
        printElementThereafter(searchAfter);

    }
}
