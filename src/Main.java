import java.util.ArrayList;
import java.util.List;
import model.*;
import Controllers.DatabaseMock;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        DatabaseMock database = new DatabaseMock();

        //Testando funções students
        database.addStudent(1, "21", "Vitor", 10, "Matutino");

        database.addStudent(2, "22", "Vhendala", 10, "Noturno");

        database.addStudent(3,"33","Arthur", 15, "Vespertino");

        database.getPerson(1,"student");

        database.getAllStudents();

        database.deleteStudent(1);
//testando se em casos inválidos funciona
        database.getPerson(1,"student");

        //Testes professores
        database.addTeacher(1, "Roberto", 28, "Engineer", 5);

        database.addTeacher(2, "Rafael", 28, "Mathmatics", 10);

        database.addTeacher(3, "Ronaldo", 48, "history", 25);

        database.getPerson(1, "teacher");

        database.getAllTeachers();

        database.deleteTeacher(1);
    }
}