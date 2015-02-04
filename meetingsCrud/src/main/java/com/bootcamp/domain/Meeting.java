
package com.bootcamp.domain;

public class Meeting {
    
    private int idMeeting;
    
    private int idRoom;
    
    private String timeSlot;
    
    private String comments;
    
    
    public int getId() {
        return idMeeting;
    }

    public void setId(int id) {
        this.idMeeting = id;
    }

    public int getRoom() {
        return idRoom;
    }

    public void setRoom(int room) {
        this.idRoom = room;
    }

    public String getTime_slot() {
        return timeSlot;
    }

    public void setTime_slot(String time_slot) {
        this.timeSlot = time_slot;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Meeting{" + "id=" + idMeeting + ", room=" + idRoom + ", time_slot=" + timeSlot + ", comments=" + comments + '}';
    }
    
    public Meeting(){}
    
    public Meeting (int id, int roomid, String comment, String timeslot){
        this.idMeeting = id;
        this.idRoom = roomid;
        this.comments = comment;
        this.timeSlot = timeslot;
    }
}
