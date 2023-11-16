package model;

public class PersonModel {
    public long id;
    int age;
    String name;

    public PersonModel(long id,String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public long getId(){
        return id;
    }
}
