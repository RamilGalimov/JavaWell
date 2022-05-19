package lesson14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentsMap {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 24);
        Student student1 = new Student("Vasy", "Pupkin", 34);
        Student student2 = new Student("Gamer", "Simpson", 45);
        Student student5 = new Student("Ivan", "Ivanov", 24);

//        Map<Student, Integer> studentMap = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Map<Student, Integer> studentMap = new TreeMap<>((o1, o2) -> o1.getAge() - o2.getAge());
        studentMap.put(student, 4);
        System.out.println();
        studentMap.put(student1, 5);
        studentMap.put(student2, 3);

        studentMap.putIfAbsent(student5, 3);


        System.out.println(studentMap);


    }
}
