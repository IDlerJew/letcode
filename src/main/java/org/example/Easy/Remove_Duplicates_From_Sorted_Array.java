package org.example.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args){
        int [] a= {1,1,2};
        System.out.println(Arrays.toString(removeDuplicates(a)));

    }
    public static int[] removeDuplicates(int[] nums) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (var l : nums){
            arrayList.add(l);
        }


        int k=1;
        int value=nums[0];
        for (int i=1;i< arrayList.size();i++){
            if (arrayList.get(i)==value){
                arrayList.remove(i);
            }
            else {
                k++;
                value=arrayList.get(i);
            }
        }
        int[] a= new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++){
            a[i]=arrayList.get(i);
        }

        return a ;
    }
}
