package org.example.search;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,5,3,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("########################## ");

        int temp;
        int start=0;
        int end = n-1;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

    }

