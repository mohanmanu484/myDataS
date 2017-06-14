package prac.linkedList;

/**
 * Created by mohan on 10/05/17.
 */

public class LinkedListPalindrome {

    Node head;

    public static class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void printAll(Node head){

        Node curr=head;
        while (curr!=null){

            System.out.print(curr.data+" ");
            curr=curr.next;
        }

        System.out.println();

    }

    public static void main(String[] args) {

        LinkedListPalindrome linkedListPalindrome=new LinkedListPalindrome();
        linkedListPalindrome.push(1);
        linkedListPalindrome.push(2);
        linkedListPalindrome.push(3);
        linkedListPalindrome.push(4);
        linkedListPalindrome.push(3);
        linkedListPalindrome.push(2);
        linkedListPalindrome.push(1);

        linkedListPalindrome.isPalindrome(linkedListPalindrome.head);

        /*linkedListPalindrome.printAll(linkedListPalindrome.head);

        linkedListPalindrome.head=linkedListPalindrome.reverse(linkedListPalindrome.head);

        linkedListPalindrome.printAll(linkedListPalindrome.head);
*/
       // linkedListPalindrome.printAll(linkedListPalindrome.head=linkedListPalindrome.reverse(linkedListPalindrome.head));

        //linkedListPalindrome.reverse()

       // linkedListPalindrome.push(7);
       // linkedListPalindrome.printMiddle(linkedListPalindrome.head);






    }


    public void push(int data){

        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }







    public Node printMiddle(Node head){

        Node slow=head;
        Node fast=head;

        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public Node reverse(Node head){

        Node prev=null;
        Node curr=head;
        Node next=null;


        while (curr!=null){

            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return head=prev;




    }

    public void  isPalindrome(Node head){

        Node middle=printMiddle(head);
        Node middleHead=reverse(middle);

        System.out.println(middleHead.data);
        System.out.println(middle.data);

        boolean isPalindrome=true;

        Node curr=head;

        while (middleHead!=null){

            if(middleHead.data!=curr.data){
                isPalindrome=false;
                break;
            }


            middleHead=middleHead.next;
            curr=curr.next;

        }

        System.out.println(isPalindrome);






    }









}
