package model;

//Realocando classes para arquivos diferentes
public class StudentModel extends PersonModel{

    private String shift;
    private String year;

    public StudentModel(long id, String name, int age, String shift, String year){
        super(id, name, age);
        this.year = year;
        this.shift = shift;
    }
    @Override
    public String toString() {
        return "StudentModel{id=" + getId() +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", age='" + age + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}

