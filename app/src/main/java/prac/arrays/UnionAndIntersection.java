package prac.arrays;

import java.util.Arrays;

/**
 * Created by mohan on 11/05/17.
 */

public class UnionAndIntersection {


    public static void main(String[] args) {

        printIntersection(new int[]{1,2,3},new int[]{3,4,5});

    }


    public static void printIntersection(int[] arr1,int[] arr2){

        int i=0;
        int j=0;
        int k=0;

        int[] union=new int[arr1.length+arr2.length];


        while (i<arr1.length && j<arr2.length){


            if(arr1[i]<arr2[j]){
                i++;
            }

            if(arr1[i]>arr2[j]){
                j++;
            }
            if(arr1[i]==arr2[j]){
                union[k]=arr1[i];
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(union));

    }


    public static void printUninon(int[] arr1,int[] arr2){


        int i=0;
        int j=0;
        int k=0;

        int[] union=new int[arr1.length+arr2.length];

        while (i<arr1.length && j<arr2.length){


            if(arr1[i]<arr2[j]){

                union[k]=arr1[i];
                i++;
                k++;

            }

            if(arr1[i]>arr2[j]){

                union[k]=arr2[i];
                j++;
                k++;

            }

            if(arr1[i]==arr2[j]){

                union[k]=arr1[i];
                i++;
                j++;
                k++;

            }




        }

        while (i<arr1.length){
            union[k]=arr1[i];
            i++;
            k++;
        }

        while (j<arr2.length){
            union[k]=arr2[j];
            j++;
            k++;
        }


        System.out.println(Arrays.toString(union));;



    }


}
