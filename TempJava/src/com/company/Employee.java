package com.company;

/**
 * Created by Администратор on 09.02.2016.
 */
public class Employee {
    private String firstName, lastName;
    public int employeeId;
    private String birthDate;
    public void setNames(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void setInfo(int employeeId, String birthDate){
        this.employeeId=employeeId;
        this.birthDate=birthDate;
    }

    public void getInfo(){
        System.out.println(this.firstName+" "+this.lastName+" was born in "+this.birthDate);
    }
}
