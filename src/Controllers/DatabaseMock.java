package Controllers;

import java.util.ArrayList;
import java.util.List;
import model.*;
public class DatabaseMock {
    private final List<StudentModel> students = new ArrayList<>();
    private final List<TeacherModel> teachers = new ArrayList<>();


    public void getAllStudents() {
        students.forEach(System.out::println);
    }

    public void getAllTeachers() {
        teachers.forEach(System.out::println);
    }

    public void getPerson(long id, String type) {
        if (type.equalsIgnoreCase("student")) {
            for (StudentModel student : students) {
                if (student.getId() == id) {
                    System.out.println(student);
                    return;
                }
            }
        } else if (type.equalsIgnoreCase("teacher")) {
            for (TeacherModel teacher : teachers) {
                if (teacher.getId() == id) {
                    System.out.println(teacher);
                    return;
                }
            }
        } else {
            System.out.println("Invalid type specified");
            return;
        }

        System.out.println("Person not found by ID");
    }


    public void addStudent(long id, String age, String name, int year, String shift) {
        StudentModel newStudent = new StudentModel(id, name, year, age, shift);
        students.add(newStudent);
        System.out.println("Estudante adicionado: " + newStudent);
    }

    public void addTeacher(long id, String name, int age, String subject, int yearOfExperience) {
        TeacherModel newTeacher = new TeacherModel(id, name, age, subject, yearOfExperience);

        teachers.add(newTeacher);

        System.out.println("Professor adicionado : " + newTeacher);
    }
    public void deleteStudent(long id) {
        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("O aluno com id:  " + id + " foi removido.");
        } else {
            System.out.println("Error: id: " + id + " não encontrado.");
        }
    }
    public void deleteTeacher(long id) {
        boolean removed = teachers.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("O professor com id:  " + id + " foi removido.");
        } else {
            System.out.println("Error: id: " + id + " não encontrado.");
        }
    }
}

