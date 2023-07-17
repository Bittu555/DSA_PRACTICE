package org.example.search;

public class RotateArray2 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,55,6,34,56,22,14};
        int n=arr.length;
        int d=2;
        int l=1;
        while (l<=d){
            int last=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            l++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
