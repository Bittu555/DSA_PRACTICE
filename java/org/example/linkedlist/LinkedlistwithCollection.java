package org.example.linkedlist;

import java.util.LinkedList;

public class LinkedlistwithCollection {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("rahul");
        list.addFirst("bittu");
        list.addFirst("ramesh");
        list.addLast("deepak");
        list.addLast("raju");
        list.addFirst("bittu");
        System.out.println(list);
      //  list.removeFirst();
        //list.removeLast();
        System.out.println(list);
        list.set(1,"rita"); // for update
        list.add(1,"bhola"); // inset at specific index
        System.out.println(list.removeFirstOccurrence("bittu"));
        System.out.println(list);



    }


}
