package com.company;

public class Employee {
    public String firstName, lastName;
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
        System.out.println();
        System.out.println(this.firstName+" "+this.lastName+" was born in "+this.birthDate);

    }
}
