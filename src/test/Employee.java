package test;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA. User: adio Date: 4/6/11 Time: 6:35 PM To change this template use File | Settings | File
 * Templates.
 */
public class Employee implements Serializable {

    private String firstName;
    private String lastName;
    private int refNumber;
    private float salary;

    public Employee(String fName, String lName, int rNumber, float salary) {

        this.firstName = fName;
        this.lastName = lName;
        this.refNumber = rNumber;
        this.salary = salary;

    }
    public Employee(){
        this("Adio","Gemon",1234,(float)123.8);
    }


    public void setFirstName(String fname) {
        this.firstName = fname;

    }

    public void setLastName(String lname) {

        this.lastName = lname;
    }

    public void setRefNumber(int rNumber) {
        this.refNumber = rNumber;

    }

    public void setSalary(float salary) {

        this.salary = salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public  String getLastName(){
        return this.lastName;
    }
    public int getRefNumber(){
        return this.refNumber;
    }

    public float getSalary(){
        return this.salary;
    }

}
