package org.example.Easy;

public class Search_Insert_Position {
    public static void  main(String [] arg){
        int [] a= {1,3,5,6};
        System.out.println(searchInsert(a,2));


    }
    public static int searchInsert(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }
            if (nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}
