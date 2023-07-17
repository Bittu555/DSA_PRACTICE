package org.example.search;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,1,2,8,79,34,55};//  <---------- left rotation
        int n=arr.length;
        int d=2;
        int[] temp=new int[n];
        int j=0;
        for(int i=d;i<n;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int l=0;l<d;l++){
            temp[j]=arr[l];
            j++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

    }
    // raju  // 200,100,10,20,1  <---------------- 2
// bittu= 1;


