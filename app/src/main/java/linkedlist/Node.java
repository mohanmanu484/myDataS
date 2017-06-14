package linkedlist;

/**
 * Created by mohan on 09/05/17.
 */

public class Node {

    private int data;
    private Node next;

    private Node head;
    private Node tail;


    public Node(int data) {
        this.data = data;
        next=null;
    }


    private void add(int i){

        if(head==null){
            head=new Node(i);
            tail=head;
        }


    }






}
