package tree;

import java.util.LinkedList;

/**
 * Created by mohan on 15/05/17.
 */

public class Stack {


    LinkedList<Integer> queue1=new LinkedList<>();
    LinkedList<Integer> queue2=new LinkedList<>();

    // 1 2 3 4 5


    // 1 2 3 4 5

    //


    public void push(int x){

        if(queue1.isEmpty()) {
            queue2.add(x);
        }else {
            queue1.add(x);
        }
    }

    public int pop(){

        if(!queue1.isEmpty()){

            while (queue1.size()>1){
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        }else {

            while (queue2.size()>1){
                queue1.add(queue2.remove());
            }
            return queue2.remove();
        }

    }

    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }




}
