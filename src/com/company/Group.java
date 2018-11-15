package com.company;

import java.util.Arrays;

public class Group {
    private String kurs;
    private String data;
    private int sumOfLessons;
    private int lessonsPerWeek;
    private Person[] persons;

    public Group(String kurs, String data, int sumOfLessons, int lessonsPerWeek, Person[] persons) {
        this.kurs = kurs;
        this.data = data;
        this.sumOfLessons = sumOfLessons;
        this.lessonsPerWeek = lessonsPerWeek;
        this.persons = persons;
    }
    public Group(){
    }

    @Override
    public String toString() {
        return "Group{" +
                "kurs='" + kurs + '\'' +
                ", data='" + data + '\'' +
                ", sumOfLessons=" + sumOfLessons +
                ", lessonsPerWeek=" + lessonsPerWeek +
                ", persons=" + Arrays.toString(persons) +
                '}';
    }
    public  String titleOfGroupe(String kurs, String data){
        String title="";
        if (this.kurs.equals(kurs)&&this.data.equals(data)){
            title="Java "+kurs;
        }
        return title;
    }
}
