package queue;

import java.util.LinkedList;

/**
 * Created by mohan on 12/05/17.
 */

public class StackUsingTwoQueue {


    LinkedList<Integer> queue1=new LinkedList<>();
    LinkedList<Integer> queue2=new LinkedList<>();


    public static void main(String[] args) {

        StackUsingTwoQueue stackUsingTwoQueue=new StackUsingTwoQueue();

        stackUsingTwoQueue.push(1);
        stackUsingTwoQueue.push(2);
        stackUsingTwoQueue.push(3);
        stackUsingTwoQueue.push(4);
        stackUsingTwoQueue.push(5);

        System.out.println(stackUsingTwoQueue.pop());
        System.out.println(stackUsingTwoQueue.pop());
        System.out.println(stackUsingTwoQueue.pop());
        stackUsingTwoQueue.push(5);
        stackUsingTwoQueue.push(9);
        System.out.println(stackUsingTwoQueue.pop());
        System.out.println(stackUsingTwoQueue.pop());



    }


    public void push(int x){

        if(queue1.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }


    }

    public int pop(){

        int m=queue1.size();
        int n=queue2.size();



        if(m==0){

            while (queue2.size()>1) {
                queue1.offer(queue2.remove());
            }

            return queue2.remove();

        }else {

            while (queue1.size()>1){
                queue2.offer(queue1.remove());
            }
            return queue1.remove();


        }

    }



}
