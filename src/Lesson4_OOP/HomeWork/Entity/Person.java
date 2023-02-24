package Lesson4_OOP.HomeWork.Entity;

public class Person {
    private String name;
    private String surName;
    private int personNumber;
    public Person(String name, String surName, int personNumber){
        this.name = name;
        this.surName = surName;
        this.personNumber = personNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
////////////////////////////////////////////
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
////////////////////////////////////////////
    public int getPersonNumber(){
        return personNumber;
    }

    public void setPersonNumber(int personNumber){
        this.personNumber = personNumber;
    }

}
