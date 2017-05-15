package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class Person {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;

    //defoult stracture
    public Person(){
        // do anything you want to initiolaizing her .

    }
    // Structure
    public Person(String firstName,String lastName,Date dateOfBirth,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.email=email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
