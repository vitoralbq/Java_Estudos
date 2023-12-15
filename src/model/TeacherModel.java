package model;

public class TeacherModel extends PersonModel {
        private String subject;
        private int yearOfExperience;

        public TeacherModel(long id, String name, int age, String subject, int yearOfExperience) {
            super(id, name, age);
            this.subject = subject;
            this.yearOfExperience = yearOfExperience;
        }
    @Override
    public String toString() {
        return "StudentModel{id=" + getId() +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", age='" + age + '\'' +
                ", yearOfExperience='" + yearOfExperience + '\'' +
                '}';
    }
    }


