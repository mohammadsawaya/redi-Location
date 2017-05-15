package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {


    public String getStudentAttendendKurs() {
        return studentAttendendKurs;
    }

    public void setStudentAttendendKurs(String studentAttendendKurs) {
        this.studentAttendendKurs = studentAttendendKurs;
    }

    private String studentAttendendKurs;

    public Student(String firstName, String lastName, Date dateOfBirth,String email,String studentAttendendKurs){
        super(firstName,lastName,dateOfBirth,email);
        this.studentAttendendKurs=studentAttendendKurs;
    }

}
