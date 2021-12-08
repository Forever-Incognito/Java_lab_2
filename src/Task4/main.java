package Task4;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(final String[] args) {
        final List<Student> studentList = new ArrayList<>();
        final Map<Subject, Marks> hashMap1 = new HashMap<>();
        final Map<Subject, Marks> hashMap2 = new HashMap<>();
        final Map<Subject, Marks> hashMap3 = new HashMap<>();

        final Subject english = new Subject("Англійська мова");
        final Subject math = new Subject("Математика ");
        final Subject physics = new Subject("Фізика ");

        final Marks marks1 = new Marks(70);
        final Marks marks2 = new Marks(90);
        final Marks marks3 = new Marks(80);

        hashMap1.put(english, marks1);
        hashMap1.put(math, marks2);
        hashMap1.put(physics, marks3);

        hashMap2.put(english, marks3);
        hashMap2.put(math, marks2);
        hashMap2.put(physics, marks1);

        hashMap3.put(english, marks2);
        hashMap3.put(math, marks1);
        hashMap3.put(physics, marks3);

        final Student student1 = new Student(19,"Андрій", "IT-21", "ІКНІ",1,hashMap1);
        final Student student2 = new Student(20,"Катерина", "ФЛ-34", "ІКНІ",2,hashMap2);
        final Student student3 = new Student(18,"Марк", "КБ-22", "ІКТА",3,hashMap3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        final Subject circuitry = new Subject("Схемотехніка");

        display(studentList);
        addSubject(studentList, circuitry);
        display(studentList);

        System.out.println();
        System.out.println("Середній бал студента "+ student1.getName() + ": " + average(student1));

        System.out.println("Оцінки студентів за ключем \" Анлійська мова \" :");
        System.out.println(displayByKey(studentList,english));



    }

    public static List<Student> addSubject(final List<Student> list, final Subject subject) {
        for (final Student student : list) {
            student.getMarksMap().put(subject,new Marks());
        }

        return list;
    }

    public static void display(final List<Student> list) {
        for (final Student student : list) {
            System.out.println();
            System.out.println(student);
        }
    }

    public static double average(final Student student) {
        return student.getMarksMap().values().stream()
                .mapToInt(value -> value.getMarks())
                .average()
                .getAsDouble();
    }

    public static Map<Long, Marks> displayByKey(final List<Student> list, final Subject subject){
        return list.stream()
                .distinct()
                .collect(Collectors.toMap(student -> student.getUID(),student -> student.getMarksMap().get(subject)));
    }

}