package arrays;

/**
 * Created by mohan on 12/05/17.
 */

public class SubArray {

    public static void main(String[] args) {


        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2={3,10,5};

        System.out.println(isSubset(arr1,arr2,arr1.length,arr2.length));

    }

    static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i=0; i<n; i++)
        {
            for (j = 0; j<m; j++)
            {
                if(arr2[i] == arr1[j])
                    break;
            }

        /* If the above inner loop was not broken at all then
           arr2[i] is not present in arr1[] */
            if (j == m)
                return false;
        }

    /* If we reach here then all elements of arr2[]
      are present in arr1[] */
        return true;
    }


    public static boolean find(int[] arr1,int[] arr2){

        for (int i = 0; i < arr2.length; i++) {


            for (int j = 0; j < arr1.length; j++) {

                if(arr2[i]==arr1[j]){
                    break;
                }

            }

            if(i==arr1.length){
                return false;
            }



        }

        return true;

    }


    public boolean isSubArray(){


        return false;
    }




}
