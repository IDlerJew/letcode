package org.example.Easy;

public class Sqrt_Of_x {
    public static void main(String[] args ){
        int test=2147395600;
        System.out.println(mySqrt(test));
        long x= 46340*46340;
        System.out.println(x);
    }
    public static int mySqrt(int x) {
        int start= 1;
        int end= x;
        int mid= -1;
        while(start<=end){
            mid= start+(end - start)/2;
            if ((long) (mid*mid)>(long)x){
                end= mid-1;

            }
            else if (mid*mid==x) return mid;
            else start=mid-1;
        }
        return end ;
    }
}
