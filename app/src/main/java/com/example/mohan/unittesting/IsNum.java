package com.example.mohan.unittesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mohan on 14/06/17.
 */

public class IsNum {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int l = str.length();
        int q = in.nextInt();

        String rev = new StringBuffer(str).reverse().toString();

        List<Integer> z = z_function(rev);

        for(int i=0 ; i< q; i++){
            int a = in.nextInt();
            if(a==l){
                System.out.println(a);
            }
            else{
                System.out.println(z.get(l-a));
            }
        }
        in.close();
    }

    private static List<Integer> z_function (String s) {
        int n = (int) s.length();
        List<Integer> z = new ArrayList<Integer>();
        for(int i=0 ; i< n ;i++){
            z.add(i, 0);
        }
        for (int i=1, l=0, r=0; i<n; ++i) {
            if (i <= r)
                z.set(i, (r-i+1 < z.get(i-l))? r-i+1 : z.get(i-l) );
            while (i+z.get(i) < n && s.charAt(z.get(i)) == s.charAt(i + z.get(i)) ){
                z.set(i, z.get(i) + 1);
            }
            if (i+z.get(i)-1 > r){
                l = i;
                r = i+z.get(i)-1;
            }
        }
        return z;
    }


}
