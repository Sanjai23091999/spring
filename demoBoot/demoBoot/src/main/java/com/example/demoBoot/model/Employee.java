package com.example.demoBoot.model;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.Period;

@MappedSuperclass
public class Employee {



    private String employeeName;

    private String employeeEmail;

    private long employeeMobileNumber;


    private LocalDate employeeDateOfJoin;


    private LocalDate employeeDateOfBirth;

    private int isActiveEmployee;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public long getEmployeeMobileNumber() {
        return employeeMobileNumber;
    }

    public void setEmployeeMobileNumber(long employeeMobileNumber) {
        this.employeeMobileNumber = employeeMobileNumber;
    }

    public LocalDate getEmployeeDateOfJoin() {
        return employeeDateOfJoin;
    }

    public void setEmployeeDateOfJoin(String employeeDateOfJoin) {

        this.employeeDateOfJoin = LocalDate.parse(employeeDateOfJoin);}


    public LocalDate getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = LocalDate.parse(employeeDateOfBirth);
    }

    public int getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public void setIsActiveEmployee(int isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public int getAgeFromDateOfBirth() {
        LocalDate currentDate = LocalDate.now();
        if (employeeDateOfBirth != null) {
            return (Period.between(employeeDateOfBirth, currentDate).getYears());
        } else {
            return 0;
        }
    }

    public int getExperienceFromDateOfJoin() {
        LocalDate currentDate = LocalDate.now();
        if (employeeDateOfJoin != null) {
            return (Period.between(employeeDateOfJoin, currentDate).getYears());
        } else {
            return 0;
        }
    }
}
