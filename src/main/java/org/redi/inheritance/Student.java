package org.redi.inheritance;

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


}
