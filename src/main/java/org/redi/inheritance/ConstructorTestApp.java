package org.redi.inheritance;
import java.util.Date;
/**
 * Created by redi on 5/12/17.
 */
public class ConstructorTestApp {
    public static void main(String[] args) {
        Person p=new Person();
        //p.setFirstName("Mohammad");
        Person person2=new Person("Mohammad","Sawaya",new Date(),"MohammadSawaya@hotmail.com");
        Student s1=new Student("Ali","ali",new Date(),"kdjfk.kid@gmail.com","java");

        System.out.println("the name of the quy is:"+person2.getFirstName());
        System.out.println("student is "+s1.getFirstName());
    }
}

