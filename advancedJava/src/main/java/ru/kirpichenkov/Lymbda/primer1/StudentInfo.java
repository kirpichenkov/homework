package ru.kirpichenkov.Lymbda.primer1;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'M', 22, 4, 4.4);
        Student st2 = new Student("LOLA", 'W', 18, 2, 5);
        Student st3 = new Student("Greg", 'M', 22, 4, 3.1);
        Student st4 = new Student("Vovik", 'W', 21, 3, 4.8);
        Student st5 = new Student("Patison", 'M', 22, 4, 7.7);

        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);

//        StudentInfo.printStudentsOverGrade(listStudent, 4);
//        StudentInfo.printStudentUnderAge(listStudent, 19);
//        StudentInfo.printStudentMixCondition(listStudent, 20, 'M');
        testStudents(listStudent, (Student st)->{return st.course>1;});
        testStudents(listStudent, st -> st.course>1);

        testStudents(listStudent, st ->
        {   System.out.println("Девчонка капчонка");
            return st.age<20;

        });

        StudentChecks sc =

    }

    static  void testStudents(ArrayList<Student> a1, StudentChecks sc){
        for(Student s : a1){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

//    static void printStudentsOverGrade(ArrayList<Student> a1, double grade){
//        for(Student s: a1){
//            if (s.avgGrade>grade){
//                System.out.println(s.name);
//            }
//        }
//        System.out.println("------------------------------");
//    }
//
//    static void printStudentUnderAge (ArrayList<Student> a1, double age){
//        for(Student s: a1){
//            if (s.age< age){
//                System.out.println(s.name);
//            }
//        }
//        System.out.println("------------------------------");
//    }
//
//    static void printStudentMixCondition (ArrayList<Student> a1, int age, char sex){
//        for(Student s: a1){
//            if (s.age > age && s.sex == 'M'){
//                System.out.println(s.name);
//            }
//        }
//        System.out.println("------------------------------");
//    }
}

interface StudentChecks{
    boolean check(Student s);
}
