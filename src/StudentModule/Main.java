package StudentModule;

import java.util.TreeSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator().reversed());
        students.add(new Student("Ali",70));
        students.add(new Student("Ayşe",80));
        students.add(new Student("Halil",10));
        students.add(new Student("Pelin",40));

        /*
        for(Student s: students)
        {
            System.out.println(s.getName()+" " + s.getNote());
        }
        */
        Iterator<Student> itr = students.iterator();
        while(itr.hasNext())
        {
            Student tempS = itr.next();
            System.out.println(tempS.getName()+" "+tempS.getNote());
        }
    }
}
