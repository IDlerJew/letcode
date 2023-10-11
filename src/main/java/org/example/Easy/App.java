package org.example.Easy;

import java.util.*;

/**
 * Hello world!
 *
 */
class Solution {
    public static void main(String[] args) {
        boolean  n = isValid("())");
        System.out.println(n);
    }

    public static boolean isValid(String s) {
        Stack <Character> stack =new Stack<>();
        char first='(';
        char second='[';
        char third='{';
        char first1='(';
        char second2='[';
        char third3='{';

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==first||s.charAt(i)==second||s.charAt(i)==third){
                stack.push(s.charAt(i));
                continue;
            }
            if (!stack.empty()) {
                char test = stack.pop();
                if (test+1 == s.charAt(i)||test+2 == s.charAt(i) ) {
                    continue;
                } else return false;
            }
            else return false;
        }
        if (stack.empty())return true;
        else return false ;

    }




}


