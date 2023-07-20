
package shms.with.oop;

import java.io.*;

class Admin implements Serializable
{
    private String ID;
    private String pinNumber;
    private String Complaint;
    
    public Admin()
    {
        ID="20200";
        pinNumber="56563232";
        Complaint="";
    }   
    public Admin(String ID, String pinNumber, String Complaint) {
        this.ID = ID;
        this.pinNumber = pinNumber;
        this.Complaint = Complaint;
    }
    
    boolean equals(Admin admin)
    {
        return (ID.equals(admin.ID)&&pinNumber.equals(admin.pinNumber));
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

    public String getComplaint() {
        return Complaint;
    }

    public void setComplaint(String Complaint) {
        this.Complaint = Complaint;
    }

}

