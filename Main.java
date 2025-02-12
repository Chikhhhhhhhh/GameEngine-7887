Ось приклад простого Java-коду, який виконує базову обробку даних. Цей код включає в себе створення класу Student, який містить інформацію про студента, а також класу DataProcessing, який виконує різні операції над даними студентів.

```java
import java.util.*;

class Student {
    String name;
    int age;
    float gpa;

    Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    float getGPA() {
        return this.gpa;
    }
}

public class DataProcessing {
    List<Student> students;

    DataProcessing() {
        this.students = new ArrayList<>();
    }

    void addStudent(String name, int age, float gpa) {
        Student student = new Student(name, age, gpa);
        this.students.add(student);
    }

    void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    void updateStudentGPA(String name, float gpa) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.gpa = gpa;
                break;
            }
        }
    }

    float calculateAverageGPA() {
        float totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGPA();
        }
        return totalGPA / students.size();
    }

    void printStudentsInfo() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGPA());
        }
    }

    public static void main(String[] args) {
        DataProcessing dp = new DataProcessing();
        dp.addStudent("John", 20, 3.5f);
        dp.addStudent("Sarah", 22, 3.8f);
        dp.addStudent("Mike", 21, 3.2f);
        dp.removeStudent("John");
        dp.updateStudentGPA("Sarah", 3.9f);
        System.out.println("Average GPA: " + dp.calculateAverageGPA());
        dp.printStudentsInfo();
    }
}
```

Цей код виконує декілька основних операцій обробки даних: додавання нового студента, видалення студента, оновлення середнього балу студента, розрахунок середнього балу всіх студентів і виведення інформації про студентів.