
package shms.with.oop;

import java.io.*;

public class Employee implements Serializable
{
    private String name;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String jobType;
    private String Designation;
    private String ID;
    private String pinNumber;
    private String Salary;
    private String Paid;
    private String joiningDate;
    private String Message;

    public Employee(String name, String gender, String phone, String email, String address, String jobType, String Designation, String ID, String pinNumber, String Salary, String Paid, String joiningDate, String Message) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.jobType = jobType;
        this.Designation = Designation;
        this.ID = ID;
        this.pinNumber = pinNumber;
        this.Salary = Salary;
        this.Paid = Paid;
        this.joiningDate = joiningDate;
        this.Message = Message;
    }
    
    boolean equals(Employee employee)
    {
        return this.ID.equals(employee.ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getPaid() {
        return Paid;
    }

    public void setPaid(String Paid) {
        this.Paid = Paid;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
};