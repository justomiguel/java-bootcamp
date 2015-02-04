
package com.bootcamp.domain;

public class Room {
    
    private int idRoom;
    private String location;
    private int capacity;

    @Override
    public String toString() {
        return "Room{" + "idRoom=" + idRoom + ", location=" + location + ", capacity=" + capacity + '}';
    }

    public Room() {
    }

    public Room(int idRoom, String location, int capacity) {
        this.idRoom = idRoom;
        this.location = location;
        this.capacity = capacity;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
