package prac.linkedList;

/**
 * Created by mohan on 10/05/17.
 */

public class DeleteList {

    Node head;


    public static void main(String[] args) {

        DeleteList deleteList=new DeleteList();
        deleteList.push(1);
        deleteList.push(2);
        deleteList.push(3);
        deleteList.push(4);

        deleteList.printAll();
        deleteList.delete(2);
        deleteList.printAll();



    }

    private void printAll(){
        Node cur=head;

        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }


    }

    private void delete(int key) {


        Node curr=head;
        Node prev=null;

        while (curr!=null){

            if(curr.data==key){

                prev.next=curr.next;

            }
            prev=curr;
            curr=curr.next;


        }



    }


    public static class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public void push(int data){

        Node node=new Node(data);
        node.next=head;
        head=node;


    }


}
