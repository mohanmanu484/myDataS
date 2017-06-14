package prac.linkedList;

/**
 * Created by mohan on 10/05/17.
 */

public class DetectLoop {

    Node head;


    public static class Node{

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            next=null;
        }
    }

    public static void main(String[] args) {

        DetectLoop detectLoop=new DetectLoop();
        detectLoop.head=new Node(1);
        detectLoop.head.next=new Node(2);
        detectLoop.head.next.next=new Node(3);
        detectLoop.head.next.next.next=new Node(4);
        detectLoop.head.next.next.next.next=new Node(5);
        detectLoop.head.next.next.next.next.next=detectLoop.head.next;


        Node node=detectLoop(detectLoop);
        if(node!=null){
            System.out.println(node.data);
        }else {
            System.out.println("Not found");
        }





    }


    public static Node detectLoop(DetectLoop detectLoop){


        Node slow=detectLoop.head;
        Node fast=slow;

        Node current=detectLoop.head;



        while (slow!=null && fast!=null&& fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;


            if(slow.data==fast.data){
                return slow;
            }
            current=current.next;


        }



        return null;

    }





}
