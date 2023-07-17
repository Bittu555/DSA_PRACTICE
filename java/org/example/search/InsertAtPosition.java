package org.example.search;

public class InsertAtPosition {
// note : postion last index se position tak muze itedrate krna ni h  mtlb shift karani h
    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int x = 10, pos = 2; // position 2 means at index 2

        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=x;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    }

