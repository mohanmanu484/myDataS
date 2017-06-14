package arrays;

/**
 * Created by mohan on 12/05/17.
 */

public class LinkedKistSort {

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

        LinkedKistSort linkedKistSort1=new LinkedKistSort();
        linkedKistSort1.add(1);
        linkedKistSort1.add(3);
        linkedKistSort1.add(6);
        linkedKistSort1.add(5);
        linkedKistSort1.add(2);



       /* LinkedKistSort linkedKistSort2=new LinkedKistSort();
        linkedKistSort2.add(2);
        linkedKistSort2.add(4);

        linkedKistSort1.printAll(linkedKistSort1.head);
        linkedKistSort2.printAll(linkedKistSort2.head);

        LinkedKistSort sorting=new LinkedKistSort();
        sorting.sort(linkedKistSort1.head,linkedKistSort2.head);
        sorting.printAll(sorting.head);*/
       linkedKistSort1.printAll(linkedKistSort1.head);
        Node high=linkedKistSort1.head;
        while (high.next!=null){
            high=high.next;
        }
        linkedKistSort1.split(linkedKistSort1.head);


        linkedKistSort1.printAll(linkedKistSort1.head);



    }

    public Node split(Node low){



        Node curr =low;
        if(low==null || low.next==null)
        {
            return low;
        }

        Node left=low;
        Node right=getMiddle(low);
        Node temp=right.next;
        right.next=null;
        split(low);
        split(temp);
        return sort(left,temp);


       // sort(node1,node2);


    }


    public Node getMiddle(Node node){

        Node fast=node;
        Node slow=node;

        while (fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }




    public Node sort(Node head1,Node head2){

        Node newNode=null;



        while (head1!=null && head2!=null){

            if(head1.data>head2.data){

                Node temp=head1.next;
                head1.next=newNode;
                newNode=head1;
                head1=temp;

            }else {

                Node temp=head2.next;
                head2.next=newNode;
                newNode=head2;
                head2=temp;
            }

        }

        while (head1!=null){

            Node temp=head1.next;
            head1.next=newNode;
            newNode=head1;
            head1=temp;
        }

        return head=newNode;

    }





    public void add(int a){

        Node newNode=new Node(a);
        newNode.next=head;
        head=newNode;
    }

    public void printAll(Node head){

        Node cuu=head;

        while (cuu!=null){
            System.out.print(cuu.data+" ");
            cuu=cuu.next;
        }

        System.out.println();
    }



}
