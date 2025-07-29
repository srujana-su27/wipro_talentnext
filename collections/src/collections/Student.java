package collections;

import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;
    
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}
 class Main {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();
    
        students.add(new Student(1, "Alice", 60));
        students.add(new Student(2, "Bob", 45));
        students.add(new Student(3, "Charlie", 70));
        students.add(new Student(4, "David", 55));
        students.add(new Student(5, "Eve", 35));
        int count = 0;
        for (Student s : students) {
            if (s.mark >= 50) {
                count++;
            }
        }
        System.out.println("Number of students who cleared with at least 50 marks: " + count);
    }
}