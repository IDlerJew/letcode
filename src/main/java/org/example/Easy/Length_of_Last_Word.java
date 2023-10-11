package org.example.Easy;

public class Length_of_Last_Word {
    public static void  main(String [] arg){
        String test ="a";
        System.out.println(lengthOfLastWord(test));
    }
    public static int lengthOfLastWord(String s) {
        int val=0;
        int i=s.length()-1;
        boolean flag=false;
        for (;s.charAt(i)==' ';i--){

        }
        for (;i>=0&&s.charAt(i)!=' ';i--){
           val++;
        }
        return val;

    }
}
