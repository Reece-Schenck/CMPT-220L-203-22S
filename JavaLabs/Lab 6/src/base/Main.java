package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Printing array:");
        for (int number: numbers) {
            System.out.println(number);
        }

        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(50);
        numbers2.add(100);

        System.out.println("Printing arraylist:");
        for (int number: numbers2) {
            System.out.println(number);
        }

        // Create an LinkedList, Populate it, and Print it out
        System.out.println("Printing linkedlist:");
        LinkedList<String> bagel = new LinkedList<String>();

        bagel.add("Top Bagel Half");
        bagel.add("Cream Cheese");
        bagel.add("Bottom Bagel Half");

        System.out.println(bagel);

        // Create an Queue, Populate it, and Print it out
        System.out.println("Printing queue:");
        Queue<String> nextInLine = new LinkedList<String>();
        nextInLine.add("Billy");
        nextInLine.add("Bob");
        nextInLine.add("Joe");
        nextInLine.add("Jenkins");

        System.out.println(nextInLine);

        // Create an Stack, Populate it, and Print it out
        System.out.println("Printing stack:");
        Stack<String> tower = new Stack<String>();

        tower.push("|");
        tower.push("||");
        tower.push("|||");
        tower.push("||||");
        tower.push("|||||");

        System.out.println(tower);
        
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant someFlower = new Plant("'Cool Lookin' Flower'","The flower family?","It needs water");
        System.out.println(someFlower.name);
        System.out.println(someFlower.plantFamily);
        System.out.println(someFlower.needsWatering);
    }
}
