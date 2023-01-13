package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Returns Students name
    public String getName(){
        return name;
    }

    // Adds the given grade to the grade property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // Returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(int i =0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum / grades.size();
    }



}
