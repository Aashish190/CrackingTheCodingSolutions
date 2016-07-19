package practice.question.linkedlist;

/**
 * Created by aashish on 7/18/16.
 */
public class ReverseNumberAdditionReversePrint {
    static Node Head;
    static Node node = null;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }


    void printList(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println("\n");
    }

    int generateNumber(Node node){
        float numMultiplier =0.1f;
        int number=0;
        while(node !=null){
            numMultiplier =numMultiplier*10;
            number += (int)(node.data *(numMultiplier));
            node = node.next;
        }
        return number;
    }

    public static void main(String[] args) {
        ReverseNumberAdditionReversePrint r = new ReverseNumberAdditionReversePrint();
        Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        r.printList(Head);
        int firstNumber = r.generateNumber(Head);

        Head = new Node(2);
        Head.next = new Node(3);
        Head.next.next = new Node(4);
        r.printList(Head);
        int secondNumber = r.generateNumber(Head);

        //System.out.println("\n"+firstNumber +"  :"+secondNumber);
        Head = r.createOutputLinkedList(firstNumber, secondNumber);
        r.printList(Head);
    }

    Node createOutputLinkedList(int firstNumber, int secondNumber){
        ReverseNumberAdditionReversePrint r= new ReverseNumberAdditionReversePrint();
        int sum= firstNumber + secondNumber, div = 10, base = 1;

        while(sum%1000 !=0){
            if(node ==null){
                node = new Node(sum % div);
                sum  -= (sum %div);
            }else{
                div = div*10;
                base = base * 10;
                r.appendToEnd((sum %div)/base);
                sum  -= (sum %div);
            }
        }
        return node;
    }

    void appendToEnd(int data){
        Node ptr= node;
        while(ptr.next !=null) {
            ptr = node.next;
        }
        ptr.next = new Node(data);


    }

}
