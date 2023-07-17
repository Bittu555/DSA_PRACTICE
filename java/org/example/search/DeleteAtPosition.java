package org.example.search;

public class DeleteAtPosition {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=5;
        arr[2]=8;
        arr[3]=9;
        arr[4]=67;
        int n=5;
        int pos=2;
        for(int i=pos;i<n-1;i++)
            arr[pos]=arr[i+1];


        for(int i=0;i<n-1;i++)
            System.out.println(arr[i]);


    }
    }

