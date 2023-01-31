//package Grades;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class GradesApplication {
//    public static void main(String[] args) {
//        HashMap<String, Student> students = new HashMap<>();
//        Student Isaac = new Student("Isaac");
//        Isaac.addGrade(100);
//        Isaac.addGrade(80);
//        Isaac.addGrade(95);
//        Student Abigial = new Student("Abigial");
//        Abigial.addGrade(80);
//        Abigial.addGrade(90);
//        Abigial.addGrade(95);
//        Student Israel = new Student("Israel");
//        Israel.addGrade(75);
//        Israel.addGrade(85);
//        Israel.addGrade(98);
//        Student Albert = new Student("Albert");
//        Albert.addGrade(100);
//        Albert.addGrade(88);
//        Albert.addGrade(95);
////        System.out.println(Isaac.getGradeAverage());
////        System.out.println(Abigial.getGradeAverage());
////        System.out.println(Israel.getGradeAverage());
////        System.out.println(Albert.getGradeAverage());
//
//        // Fake Github usernames
//        students.put("Iramirez108", Isaac);
//        students.put("abby1995", Abigial);
//        students.put("Izzyfades", Israel);
//        students.put("Reaper1014", Albert);
//
//        Input in = new Input();
//        System.out.println("Hello, and welcome to CGA-CLI!\nHere is the list of available students:");
//        String usernameList = "";
//        for(HashMap.Entry<String, Student> student: students.entrySet()){
//            usernameList += "|" + student.getKey() + "| ";
//        }
//        System.out.println(usernameList);
//        System.out.println("Which student would you like information about?");
//        String studentUN = in.getString();
//        if (students.containsKey(studentUN)){
//            System.out.println("Student Name: \"%s\";%nStudent Github Username: \"%s\";%nStudent Grade Average: %.2f;%n",);
//        }
//
//    }
//}
