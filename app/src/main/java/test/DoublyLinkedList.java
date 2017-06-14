package test;

/**
 * Created by mohan on 30/05/17.
 */

public class DoublyLinkedList<T>{

    Node head;

    public static class Node<T>{

        T data;
        Node next;
        Node prev;

        public Node(T data) {
            this.data = data;
            next=prev=null;
        }
    }

    public void add(T data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
    }

    public void printAll(){


        Node curr=head;
        while (curr!=null){
            System.out.print(" "+curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public void printReverse(){

        Node curr=head;
        if(curr==null){
            return;
        }

        while (curr.next!=null){
            curr=curr.next;
        }
        while (curr!=null){
            System.out.print(" "+curr.data);
            curr=curr.prev;
        }
        System.out.println();
    }



    public static void main(String[] args) {

        DoublyLinkedList<Integer> doublyLinkedList=new DoublyLinkedList<>();
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.printAll();
        doublyLinkedList.printReverse();


    }





}
