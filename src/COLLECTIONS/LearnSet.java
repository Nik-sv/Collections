package COLLECTIONS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

        Set<Student> studentsSet = new HashSet<>();

        studentsSet.add(new Student("Nikhil", 21));
        studentsSet.add(new Student("Prashant", 31));
        studentsSet.add(new Student("Lucky", 51));

        studentsSet.add(new Student("Shayam", 21));

        System.out.println(studentsSet);













//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();

        /*set.add(32);    // hashing clalti hai aur maan lo ki 32 = fvniujbn  = ye hai tho ye badale ga nahi unique rahega
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());
*/
//        System.out.println(set.clear());



    }
}
