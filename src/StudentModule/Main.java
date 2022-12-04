package StudentModule;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator().reversed());
        students.add(new Student("Ali",70));
        students.add(new Student("Ayşe",80));
        students.add(new Student("Halil",10));
        students.add(new Student("Pelin",40));

        for(Student s: students)
        {
            System.out.println(s.getName()+" " + s.getNote());
        }

    }
}
