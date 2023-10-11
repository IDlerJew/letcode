package org.example.Easy;

import java.util.Arrays;

public class Remove_Element {
    public static void  main(String [] arg){
        int [] a= {3,2,2,3,5,5, 5, 5};
        System.out.println(a.length);
        int test =removeElement(a,3);
        System.out.println(test);
        String s;
    }
    public static int removeElement(int[] nums, int val) {
        int clock=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[clock]= nums[i];
                clock++;
            }
        }
        return clock;
    }
}

