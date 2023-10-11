package org.example.Easy;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] arg){
        int[] a={2,0};
        int[] b={1};

        System.out.println(Arrays.toString(a));
       merge (a, 1, b, 1);




    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if (n==0){
            return;
        }
        for (int i=0,j=0;i< nums1.length&&j< nums2.length; ){
            if(nums1[i]<nums2[j]){
                if(nums1[i]!=0) {
                    i++;
                }
                else {
                    nums1[i]=nums2[j];
                    i++;
                    j++;
                }
            }
            else {
                int saveNumber;
                int SwapNumber=nums2[j];
                int y= i;
                for (;nums1[y]!=0;y++){
                    saveNumber=nums1[y];
                    nums1[y]= SwapNumber;
                    SwapNumber=saveNumber;
                }
                saveNumber=nums1[y];
                nums1[y]= SwapNumber;
                SwapNumber=saveNumber;
                j++;

            }
        }

        return;

    }
}
