
package shms.with.oop;

import java.io.*;


public class Room implements Serializable
{
    private String roomNo;
    private String Floor;
    private String roomType;
    private String NumberOfSeat;
    private String filledSeat;
    private String emptySeat;
    
    

    public Room(String roomNo, String Floor, String roomType, String NumberOfSeat, String filledSeat, String emptySeat) {
        this.roomNo = roomNo;
        this.Floor = Floor;
        this.roomType = roomType;
        this.NumberOfSeat = NumberOfSeat;
        this.filledSeat = filledSeat;
        this.emptySeat = emptySeat;
    }
    
    public boolean equals(Room room)
    {
        return (this.roomNo.equals(room.roomNo));
        
    }
    
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String Floor) {
        this.Floor = Floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getNumberOfSeat() {
        return NumberOfSeat;
    }

    public void setNumberOfSeat(String NumberOfSeat) {
        this.NumberOfSeat = NumberOfSeat;
    }

    public String getFilledSeat() {
        return filledSeat;
    }

    public void setFilledSeat(String filledSeat) {
        this.filledSeat = filledSeat;
    }

    public String getEmptySeat() {
        return emptySeat;
    }

    public void setEmptySeat(String emptySeat) {
        this.emptySeat = emptySeat;
    }

}