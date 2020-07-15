package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("A");
        myArray.add("B");

        Vector<String> myVector = new Vector<String>();
        myVector.add("C");
        myVector.add("D");

        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("E");
        myLinkedList.add("F");
    }
}
