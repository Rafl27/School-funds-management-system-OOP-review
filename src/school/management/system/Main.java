package school.management.system;

import java.util.ArrayList;
import java.util.List;

/* TODO: TEXT INTERFACE */

public class Main {
    public static void main(String[] args) {
        Teacher Lizzie = new Teacher(1, "Lizzie", 500);
        Teacher Melissa = new Teacher(2, "Melissa", 800);
        Teacher Joseph = new Teacher(3, "Joseph", 1800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzie);
        teacherList.add(Melissa);
        teacherList.add(Joseph);

        Student Rafael = new Student(1, "Rafael", 4);
        Student dude = new Student(2, "dude", 3);
        Student Alice = new Student(3, "alice", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Rafael);
        studentList.add(dude);
        studentList.add(Alice);

        School puc = new School(teacherList, studentList);

        Rafael.payFees(5000);
        Alice.payFees(6000);
        System.out.println("PUC has earned: $" + puc.getTotalMoneyEarned());


        System.out.println("---------PUC is now paying salaries---------");
        Lizzie.receiveSalary(Lizzie.getSalary());
        System.out.println("PUC has paid " + Lizzie.getName() + " her/his salary: $" + Lizzie.getSalary() + " and now has $" + puc.getTotalMoneyEarned());
        Joseph.receiveSalary(Joseph.getSalary());
        System.out.println("PUC has paid " + Joseph.getName() + " her/his salary: $" + Joseph.getSalary() + " and now has $" + puc.getTotalMoneyEarned());
        System.out.println(Rafael);
        System.out.println(Joseph);
        System.out.println("test");
    }
}
