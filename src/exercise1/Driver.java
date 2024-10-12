package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Student> studs = new ArrayList<>();
        studs.add(new Student("Smith", 34));
        studs.add(new Student("Johnson", 21));
        studs.add(new Student("Williams", 67));
        studs.add(new Student("Brown", 53));
        studs.add(new Student("Jones", 48));
        studs.add(new Student("Miller", 36));
        studs.add(new Student("Davis", 44));
        studs.add(new Student("Wilson", 52));
        studs.add(new Student("Anderson", 34));
        studs.add(new Student("Moore", 33));
        
        Collections.sort(studs);

        System.out.println("Sorted Students Using Comparable:");
        for (Student student : studs) {
            System.out.println(student + " // Student Name: " + student.getName());
        }

        System.out.println();
        System.out.println("Sorted Students Using Comparator:");
        Collections.sort(studs, new StudentComparator()); 
        for (Student student : studs) {
            System.out.println(student + " // Student Name: " + student.getName());
        }

    }

}
