package com.university.main;
import com.university.model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Student[] mhs = {
            new Student("S001", "Fajar", 20, 3.4),
            new Student("S002", "Adi", 23, 3.5),
            new Student("S003", "Budi", 24, 3.8),
            new Student("S004", "Candra", 19, 2.8),
            new Student("S005", "Dwi", 26, 2.0)
        };

        System.out.println("===Data Mahasiswa===");
        for (Student m : mhs) {
            System.out.println("ID:" + m.getStudentId() + ", Name:" + m.getName() + ", Age:" + m.getAge() + ", GPA:" + m.getGpa());
        }
    }
}