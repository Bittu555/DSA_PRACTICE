package org.example.linkedlist;

public class singlelinkedlist {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head = null;

    // add first position  // head ko bolte h first node
    public void add(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head; //new node ki next h jo point kregi hmari head ki taraf
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void delete(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        }


    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
       Node secondLast=head;
        Node lastNode=head.next; //head.next=null -> lastnode =null
        while (lastNode.next!=null){  // null.next * error deha
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        if (current==null){
            System.out.println("list is empty");
            return;
        }
        while (current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("NULL");

    }

    public static void main(String args[]){
        singlelinkedlist list=new singlelinkedlist();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.addLast("ooo");
        list.printList();
       // list.delete();
       // list.printList();
        list.deleteLast();
        list.printList();


    }
}
