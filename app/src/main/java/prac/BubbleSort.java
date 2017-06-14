package prac;

import java.util.Arrays;

/**
 * Created by mohan on 28/05/17.
 */

public class BubbleSort {



    public static void main(String[] args) {

        int[] arr={4,1,6,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void bubbleSort(int[] arr){

        int n=arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i-1; j++) {

                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }


        }


    }

    public static void sort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = 0; j < arr.length-1; j++) {


                if(arr[j]>arr[j+1]){

                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }




    }



}
