package COLLECTIONS;

import java.util.Stack;

public class LearnStack {


    public static void main(String[] args) {


//     Last in First Out
//     Stack class hamare pass pahelay se hi avilable hoti hai java k andar so hame usse banane ki jarurat nahi hoti hai

        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());

        System.out.println(animals.pop());

        System.out.println(animals.peek());

        System.out.println("Stack: " + animals);







    }
}
