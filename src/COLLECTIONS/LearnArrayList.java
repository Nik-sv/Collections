package COLLECTIONS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.list;
import static java.util.Collections.singleton;


public class LearnArrayList {

    public static void main(String[] args) {


//        String[] studentsName = new String[30];
//        studentsName[0] = "Nikhil";
//
//        //
//        //  studentsName.... till 28
//        //
//        studentsName[29] = "Harsh";
//
//        //
//        studentsName[30] = "Prashant";


//        ArrayList<String> studentsName = new ArrayList<>();

////        size = n
////                n + n/2 + 1
//        studentsName.add("Nikhil");


//         Add Function

       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);   // This will add 4 at the end of the list
        System.out.println(list);


        list.add(1,50);     // This will add 50 at the first index
        System.out.println(list);


        List<Integer> newList = new ArrayList();   // Creating new Arraylist
        newList.add(150);
        newList.add(160);

        list.addAll(newList);   // This will add all the elements

        System.out.println(list);

        System.out.println(list.get(1));*/



        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }

        for (Integer element: list) {
            System.out.println("foreach element is " + element);    // Recommended way is this
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

       /* list.set(2,1000);     // .set -> Big O(n)
        System.out.println(list);

        System.out.println(list.contains(50));  // true
*/
        /*list.remove(1);  // This will remove the first element from the list
        System.out.println(list);

        list.remove(Integer.valueOf(30));  // this will remove the element directly
        System.out.println(list);

        list.clear();    // This will remove all the elements from the list
        System.out.println(list);*/

        // If we are removing or adding the element so at that time we have O(n) time complexity





















    }
}
