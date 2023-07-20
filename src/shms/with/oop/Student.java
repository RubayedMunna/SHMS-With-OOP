
package shms.with.oop;

import java.io.*;

public class Student implements Serializable
{
    private String name;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String ID;
    private String PIN;
    private String Department;
    private String Batch;
    private String Session;
    private String Hall;
    private String roomNo;
    private String bedNo;
    private String Complain;

    public Student(String name, String gender, String phone, String email, String address, String ID, String PIN, String Department, String Batch, String Session, String Hall, String roomNo, String bedNo, String Complain) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.ID = ID;
        this.PIN = PIN;
        this.Department = Department;
        this.Batch = Batch;
        this.Session = Session;
        this.Hall = Hall;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
        this.Complain = Complain;
    }
    
    boolean equals(Student student)
    {
        return this.ID.equals(student.ID);
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }

    public String getHall() {
        return Hall;
    }

    public void setHall(String Hall) {
        this.Hall = Hall;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getComplain() {
        return Complain;
    }

    public void setComplain(String Complain) {
        this.Complain = Complain;
    }

    
    
};