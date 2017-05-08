package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello Inhertance");
        Student s=new Student();
        s.setFirstName("Mohammad");
        s.setLastName("Sawaya");
        System.out.println("Student Name:"+s.getFirstName()+" " +s.getLastName());

        Teacher t=new Teacher();
        t.setFirstName("Alaa");
        t.setLastName("Java");
        System.out.println("Teacher Name :"+t.getFirstName()+" "+t.getLastName());


    }
}
