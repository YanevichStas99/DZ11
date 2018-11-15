package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Person person=new Person("Yanevich","Stas","Vladimirovich","21.11.1999");
        System.out.println(person);
        Person person1=new Person("Yanevich Stas Vladimirovych");
        System.out.println(person1);
        System.out.println("Full name: "+person.getFullName());
        System.out.println("FIO: "+person1.getFIO());
        System.out.println("Age: "+person.getAge());


        Person student1=new Person("Luke","Kage","Carl","05.02.1985");
        Person student2=new Person("Matt","Murdock","John","09.12.1995");
        Person student3=new Person("Jessica","Jones","Ane","20.04.1990");
        Person student4=new Person("Danial","Rent","Harry","13.01.2000");
        Person student5=new Person("Frank","Castle","Seth","18.08.1988");

        Person[] javaIntroduction={student1,student3};
        Person[] javaElementary={student2,student4};
        Person[] javaProgressive={student1,student5};

        Group groupe=new Group();
        Group groupe1=new Group("Introduction","02.10.2018",16,2,javaIntroduction);
        Group groupe2=new Group("Elementary","08.10.2018",32,2,javaElementary);
        Group groupe3=new Group("FrontEnd","20.10.2018",32,3,javaProgressive);


    }

}
