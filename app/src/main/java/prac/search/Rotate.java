package prac.search;

import java.util.Arrays;

/**
 * Created by mohan on 10/05/17.
 */

public class Rotate {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));;


    }


    public static void rotate(int[] arr,int x){


        int[] temp=new int[x];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp
        ));



        for (int i = 0,j=0; i < arr.length-x; i++) {


            arr[i]=arr[i+x];
        }

        for (int i=arr.length-x,j=0;i<arr.length;i++,j++){
            arr[i]=temp[j];
        }


    }



}
