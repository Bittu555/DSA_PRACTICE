package org.example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,6,7,1};
        int key=4;
        int n=arr.length;
      //  (search(arr,n));
        for(int i=0;i<n;i++){
            if(arr[i]==key) {
                System.out.println(i);
                break;
            }


        }


    }
}
/*
algorithm

declare array
int[] arr=new int[10];
arr[0]=2
int[] arr={3,5,7,8,9,1}
int n=arr.length;
loop


]
 */
