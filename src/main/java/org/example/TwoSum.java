package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class LinkedList<Integer>{
        Node head;
        int size;
        LinkedList(){
            this.head=null;
            this.size=0;
        }
        int size(){
            return size;
        }

        public boolean contains(int val) {
            Node cur =head;
            while(cur != null){
                if(cur.data==val){
                    return true;
                }
                cur=cur.next;
            }
            return false;
        }

        public void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;

            }else{
                Node cur=head;
                while(cur.next != null){
                    cur=cur.next;
                }
                cur.next=newNode;
            }
            size++;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head == null){
                head = newNode;
            }else{
                Node cur=head;
                while(cur.next !=null){
                    cur=cur.next;
                }
                cur.next=newNode;
            }
            size++;
        }

        public void printList(){
            Node cur= head;
            while(cur != null){
                System.out.print(cur.data +" ");
                cur=cur.next;
            }System.out.println();
        }

        public void addFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            this.head=newNode;
            size++;
        }

        public void addAtPosition(int index,int data){
            if(index==0){
                this.addFirst(data);
            }
                Node newNode = new Node(data);
                Node curr = head;
                int i = 1;
                while (i++ < index) {
                    curr = curr.next;
                }
                Node temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
            size++;
        }
        public void removeFirst(){
            this.head=this.head.next;
            size--;
        }

        public void removeLast() {
            Node curr=head;
            while(curr.next.next != null){
                curr=curr.next;
            }
            curr.next=null;
            size--;
        }
        public void swapAdjacent(){
            Node curr=head;
            int n=0;
            while(curr != null && curr.next != null){
                if(n%2 == 0){
                    Node tmp=curr;
                    curr=curr.next;
                    curr.next=tmp;
                }else
                    curr=curr.next;
                n++;
            }
        }
    }
    public static void main(String[] args){
        LinkedList l= new LinkedList();
        System.out.println(l.size());
        System.out.println(l.contains(5));
        l.add(5);
        l.add(1);
        l.add(4);
        l.add(7);
        l.add(0);
        l.add(9);
        l.addFirst(11);
        l.printList();
        System.out.println(l.size());
        System.out.println(l.contains(5));
        l.addLast(20);
        l.printList();
        l.addAtPosition(3,35);
        l.printList();
        System.out.println(l.size());
        l.removeFirst();
        l.printList();
        l.removeLast();
        System.out.println(l.size());
        l.printList();
        System.out.println("Current size is :" +l.size());
        l.swapAdjacent();
        l.printList();
        Map<Integer,Integer> map = new HashMap<>();
    }

}