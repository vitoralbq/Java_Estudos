package model;

public class PersonModel {
    private final long id;
    private int age;
    private String name;

    public PersonModel(long id,String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
