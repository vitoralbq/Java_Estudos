import java.util.ArrayList;
import java.util.List;
import model.*;
import Controllers.DatabaseMock;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        DatabaseMock database = new DatabaseMock();
        database.addStudent(1, "15", "Vitor", 10, "Noturno");
        database.addStudent(2, "22", "Roberto", 10, "Noturno");
        database.getStudent(1);

        database.getAllStudents();

        database.deleteStudent(1);

        database.getStudent(1);
    }
}