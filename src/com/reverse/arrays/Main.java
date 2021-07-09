package com.reverse.arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = 4;
        int temp;
        for(int i=0 ;i<5;i++)
        {
            System.out.println("Before Swipe = "+ arr[i]);
        }
        while(start < end ) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for(int i=0 ;i<5;i++)
        {
            System.out.println("After Swipe = "+ arr[i]);
        }


    }
}
