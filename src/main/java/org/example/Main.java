package org.example;

//import org.example.LinkedList.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


       // System.out.println("Hello, World!");
       // ArraysExample();
        LinkedListExample();
    }


    public static void LinkedListExample(){
//        LinkedList<String> cars = new LinkedList<>();
//
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.size());



        //My Own implementation of LinkedList class

        Node head = new Node("Juan");
        //addElement(head, "Juan");
       // System.out.println(head.toString());
        addElement(head, "Victoria");
        addElement(head, "Laura");
        addElement(head, "Alejandro");
        addElement(head, "Tatiana");
        System.out.println("This is before removing"+head.toString());
        head = removeEl(head, "Alejandro");
        System.out.println("this is after removing"+head.toString());
        head = removeEl(head, "Tatiana");
        System.out.println("this is after removing"+head.toString());
        head = removeEl(head, "Juan");
        System.out.println("this is after removing"+head.toString());
        head = removeEl(head, "Laura");
        System.out.println("this is after removing"+head.toString());
        head = removeEl(head, "Victoria");
        System.out.println("this is after removing"+ head);

        head = removeEl(head, "Liz"); //this should return null as there is nothing on the list

       head =  addElement(head, "Victoria");
        System.out.println("this is after adding"+head);

    }

    //removes the value passed down in the parameter.
    //Edge Cases:
        // if is empty - return null
        // if is removed from the front - return the next node as the head done
        // while loop for any removal inside and last nodes - returns the new head node
    private static Node removeEl(Node head, String val) {

        if (head == null) {
            System.out.println("head is null");
            return null;
        }
         if (head.value.equals(val)) {
            Node temp = head;
            head = temp.next;
            return head;
        }
         Node current = head;
         Node previous = current;

         while(current!= null) {

             if(current.value.equals(val)) {
                 previous.next = current.next;
                 return head;
             }
             previous = current;
             current = current.next;

         }
        return head;
    }


    private static Node addElement(Node head, String newValue){
        if(head == null){
            head = new Node(newValue);
            return head;
        }

        while(head.next != null){
                head = head.next;
            }
            head.next = new Node(newValue);
        //System.out.println(head.toString());
        return head;
    }






    public static void ArraysExample(){

        ArrayList<String> names = new ArrayList<String>();

        names.add("Laura");
        names.add("alejandro");
        names.add("victoria");
        names.add("Laura");
       // names.add(null);

        System.out.println(names.toString());
        names.remove("Laura");
        System.out.println(names.toString());
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.toString());
        System.out.println(names.isEmpty()); //should be empty

    }
}