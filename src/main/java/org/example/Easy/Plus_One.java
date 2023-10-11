package org.example.Easy;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args){
        int []a = { 9,9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));

    }
    public static int[] plusOne(int[] digits) {

        for (int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
                if(i==0){
                    int []newArray= new int[digits.length+1];
                    newArray[0]=1;
                    for(int j=1;j<newArray.length;j++){
                        newArray[j]=digits[j-1];
                        return newArray;
                    }
                }
            }
            else {
                digits[i]++;
                break;
            }

        }
        return  digits;
    }
}
