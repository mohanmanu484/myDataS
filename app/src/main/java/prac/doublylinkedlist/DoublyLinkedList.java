package prac.doublylinkedlist;

/**
 * Created by mohan on 11/05/17.
 */

public class DoublyLinkedList {

    Node head;

    public static class Node{

        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            next=prev=null;
        }
    }

    public void push(int data){


        Node newNode=new Node(data);

        newNode.next=head;
        newNode.prev=null;
        if(head!=null){

            head.prev=newNode;

        }
        head=newNode;
    }


    public void reverse(Node node){

        Node curr=node;
        Node temp=null;

        while (curr!=null){

            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }

        head=temp.prev;


    }






    public void delete(Node node){

        Node curr=head;

        if(head!=null){
            if(head==node){
                head=node.next;
                head.prev=null;
            }
            return;
        }

        if(node.next==null){
            node.prev.next=null;
            return;
        }

        if(node.next!=null){

            node.next.prev=node.prev;
            node.prev.next=node.next;
        }




    }







    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.push(1);
        doublyLinkedList.push(2);
        doublyLinkedList.push(3);
        doublyLinkedList.push(4);
        doublyLinkedList.push(5);
        doublyLinkedList.printAll();

        doublyLinkedList.delete(doublyLinkedList.head);
        doublyLinkedList.printAll();

        doublyLinkedList.reverse(doublyLinkedList.head);
        doublyLinkedList.printAll();

    }

    public void printAll(){

        Node curr=head;

        while (curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }

        System.out.println();

    }


}
