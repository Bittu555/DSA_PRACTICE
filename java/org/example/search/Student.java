package org.example.search;

import java.lang.reflect.Array;

class Student1 {
    private int id;
    private String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Student {
    public static void main(String args[] ) {
        Student1[] arr=new Student1[2];
        arr[0]=new Student1(1,"b2");
        arr[1]=new Student1(3,"chandra");



    }

}


