package prac;

import java.util.Arrays;

/**
 * Created by mohan on 07/05/17.
 */

public class QuickSort {


    public static void main(String[] args) {

        int[] arr={1,3,2,5,5,9,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


    public static void quickSort(int[] arr,int p,int r){

        if(p<r) {
            int temp = partition(arr, p, r);
            quickSort(arr, p, temp - 1);
            quickSort(arr, temp + 1, r);
        }

    }

    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
         arr[i]=arr[j];
        arr[j]=temp;


    }

    public static int partition(int[] arr,int p,int r){

        int i=p-1;
        int j;
        int x=arr[r];

        for ( j = p; j < r-1; j++) {

            if(arr[j]<x){
                i=i+1;
                swap(arr,i,j);
            }

        }
        swap(arr,i+1,r);
        return i+1;
    }
}
