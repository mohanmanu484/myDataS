package arrays;

import java.util.Arrays;

/**
 * Created by mohan on 12/05/17.
 */

public class InsertionSort {


    public static void main(String[] args) {

        int[] arr={1,5,2,8,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }


    public static void sort(int[] arr){


        for (int i = 1; i < arr.length; i++) {

            int temp=arr[i];
            int j=i-1;


            while (j>=0 && arr[j]>temp){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=temp;
        }



    }



}
