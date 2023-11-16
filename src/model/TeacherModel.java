package model;

public class TeacherModel extends PersonModel {
        String subject;
        int yearOfExperience;

        public TeacherModel(long id, String name, int age, String subject, int yearOfExperience) {
            super(id, name, age);
            this.subject = subject;
            this.yearOfExperience = yearOfExperience;
        }
    @Override
    public String toString() {
        return "StudentModel{id=" + id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", age='" + age + '\'' +
                ", yearOfExperience='" + yearOfExperience + '\'' +
                '}';
    }
    }


