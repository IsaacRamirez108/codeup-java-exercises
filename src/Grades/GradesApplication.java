package Grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Isaac = new Student("Isaac");
        Isaac.addGrade(100);
        Isaac.addGrade(80);
        Isaac.addGrade(95);
        Student Abigial = new Student("Abigial");
        Abigial.addGrade(80);
        Abigial.addGrade(90);
        Abigial.addGrade(95);
        Student Israel = new Student("Israel");
        Israel.addGrade(75);
        Israel.addGrade(85);
        Israel.addGrade(98);
        Student Albert = new Student("Albert");
        Albert.addGrade(100);
        Albert.addGrade(88);
        Albert.addGrade(95);
        System.out.println(Isaac.getGradeAverage());
        System.out.println(Abigial.getGradeAverage());
        System.out.println(Israel.getGradeAverage());
        System.out.println(Albert.getGradeAverage());


    }
}
