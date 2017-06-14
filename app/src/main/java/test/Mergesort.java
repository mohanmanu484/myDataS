package test;

import java.util.Arrays;

/**
 * Created by mohan on 28/05/17.
 */

public class Mergesort {


    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,5,5,9,10,6};
        split(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void split(int[] arr,int low,int high){

        if(low<high){
            int mid=(high+low)/2;
            split(arr,low,mid);
            split(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void merge(int[] arr,int low,int mid,int high){


        int[] temp=new int[high];

        for (int i = low; i <=high; i++) {
            temp[i]=arr[i];
        }

        int a=low;
        int b=high;
        int k=mid+1;
        int index=low;

        while (a<=mid && k<=high){

            if(temp[a]<temp[k]){
                arr[index]=arr[a];
                a++;
            }else {
                arr[index]=arr[k];
                k++;
            }
            index++;
        }

        while (a<=b){

            arr[index]=temp[a];
            a++;
            k++;
        }



    }


}
