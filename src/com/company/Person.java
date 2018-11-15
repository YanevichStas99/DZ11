package com.company;

public class Person {
    private String name;
    private String secondname;
    private String lastname;
    private String birthday;


    public Person(String secondname, String name, String lastname, String birthday) {
        this.name = name;
        this.secondname = secondname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public Person(String secondname, String name, String lastname) {
        this.name = name;
        this.secondname = secondname;
        this.lastname = lastname;
    }
    public Person(String fullName){
        String[] flName=fullName.split("\\s+");
        this.secondname=flName[0];
        this.name=flName[1];
        this.lastname=flName[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getFullName(){
        String fullName=secondname+" "+name+" "+lastname;
        return fullName;
    }
    public String getFIO(){
        String nameFIO=secondname+" "+name.charAt(0)+"."+lastname.charAt(0)+".";
        return nameFIO;
    }
    public int getAge(){
        String[] birth=birthday.split("\\.");
        int age=Integer.parseInt(birth[2]);
        age=2018-age;
        if(Integer.parseInt(birth[1])>=11){
            age--;
            if(Integer.parseInt(birth[1])==11){
                if (Integer.parseInt(birth[0])<=15){
                    age++;
                }
            }
        }
        return age;
    }
}
