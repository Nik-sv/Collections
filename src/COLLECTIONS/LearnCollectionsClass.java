package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Nikhil",2));
        list.add(new Student("Prashant",4));
        list.add(new Student("Anamika",3));
        list.add(new Student("Singh",1));


        Student s1 = new Student("Nikhil",2);
        Student s2 = new Student("Singh", 3);

//        System.out.println(s1.compareTo(s2));

        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(list);





       /* list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("min element " + Collections.min(list));
        System.out.println("max element " + Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);*/
    }
}
