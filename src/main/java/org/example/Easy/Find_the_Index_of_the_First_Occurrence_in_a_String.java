package org.example.Easy;

import java.util.Arrays;
import java.util.Objects;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] arg){
        String haystack= "abc";
        String needle = "c";
        System.out.println(strStr(haystack,needle));



    }
    public static int strStr(String haystack, String needle) {
        for (int i=0;i< haystack.length()-needle.length()-1;i++){
            int j=0;
            while (j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if (j==needle.length()) return i;

        }
        return -1;





    }
}
