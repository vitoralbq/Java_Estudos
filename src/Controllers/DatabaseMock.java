package Controllers;

import java.util.ArrayList;
import java.util.List;
import model.*;
public class DatabaseMock {
    int incrementKey = 1;
    private final List<model.StudentModel> students = new ArrayList<>();
    private final List<TeacherModel> teachers = new ArrayList<>();

    public void getAllStudents() {
        students.forEach(System.out::println);
    }

    public void getAllTeachers() {
        teachers.forEach(System.out::println);
    }

    private boolean isIdExists(long id) {
        return students.stream().anyMatch(student -> student.getId() == id);
    }

    public void getStudent(long id) {
        boolean notfound = true;
        for (StudentModel student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                notfound = false;
                break;
            }
            if(notfound){
                System.out.println("Não encontrado pelo ID");
            }
        }
    }

    public void getTeacher(long id) {
        boolean notfound = true;
        for (TeacherModel teacher : teachers) {
            if (teacher.getId() == id) {
                notfound = true;
                System.out.println(teacher);
                break;
            }
        }
        if (notfound) {
            System.out.println("Professor não encontrado pelo id");
        }
    }

    public StudentModel addStudent(long id, String age, String name, int year, String shift) {
        if (isIdExists(id)) {
            System.out.println("Error: Estudante com esse id " + id + " já existe.");
            return null;
        }
        StudentModel newStudent = new StudentModel(id, name, year, age, shift);
        students.add(newStudent);
        System.out.println("Estudante adicionado: " + newStudent);
        return newStudent;
    }

    public TeacherModel addTeacher(long id, String name, int age, String subject, int yearOfExperience) {
        if (isIdExists(id)) {
            System.out.println("Error: Estudante com ID " + id + " já existe.");
            return null;
        }
        TeacherModel newTeacher = new TeacherModel(id, name, age, subject, yearOfExperience);

        teachers.add(newTeacher);

        System.out.println("Professor adicionado : " + newTeacher);

        return newTeacher;
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

