package arrays;

import java.util.Arrays;

/**
 * Created by mohan on 14/05/17.
 */

public class NextBig {




    public static void main(String[] args) {

        NextBig nextBig=new NextBig();
        System.out.println(Arrays.toString(nextBig.addNumToArray(12345)));  // 12145  14125
     nextBig.nextBig(12451);
    }

    public void nextBig(int num){

        int[] arr=addNumToArray(num);
        for (int i = arr.length-2; i >=0 ; i--) {
            int a=arr[i];
            int b=nextBigIntPos(arr,a,i+1);
            if(b>i) {
                swap(arr, i, b);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private int nextBigIntPos(int[] arr, int a, int i) {

        int num=a;
        int temp[]=arr;

        for (int j = i; j <temp.length ; j++) {

            for (int k = j+1; k < temp.length; k++) {

                if(arr[j]<temp[i]){
                    swap(temp,i,j);
                }
            }

        }
        while (i<=arr.length-1){
            if(temp[i]>=a){
                num=a;
                break;
            }
            i++;
        }

        return i;


    }


    public int[] swap(int[] arr,int i,int j){

        if(i>arr.length-1 ||j>arr.length-1){
            return arr;
        }

        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
        return arr;
    }



    public int getCount(int num,int count){

        if(num==0){
            return count;
        }
        count++;

        return getCount(num/10,count);
    }



    public int[] addNumToArray(int num){
        int count=getCount(num,0);
        int[] array=new int[count];
        for (int i = array.length-1; i >= 0; i--) {
            array[i]=num%10;
            num=num/10;
        }
        return array;
    }



}
