package com.bootcamp.service.impl;

import com.bootcamp.databaseConnection.DatabaseConfig;
import com.bootcamp.domain.Attendees;
import com.bootcamp.domain.Meeting;
import com.bootcamp.domain.Room;
import com.bootcamp.service.MeetingService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service("meetingService")
public class MeetingServiceImp implements MeetingService {

    private static Connection conn = null;

    public MeetingServiceImp() {
    }

    @Override
    public List<Meeting> getMeeting() throws SQLException {
        List<Meeting> list = new ArrayList<>();
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("SELECT * FROM meeting");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Meeting m = new Meeting(rs.getInt("idMeeting"), rs.getInt("idRoom"), rs.getString("comments"), rs.getString("timeSlot"));
            list.add(m);
        }
        return list;
    }

    @Override
    public List<Attendees> getList() throws SQLException {
        List<Attendees> listAttendees = new ArrayList<>();
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("SELECT * FROM attendee");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Attendees a = new Attendees(rs.getInt("idAttendee"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"));

            listAttendees.add(a);
        }
        return listAttendees;
    }

    @Override
    public Meeting getMeetingById(int id) throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("SELECT * FROM meeting WHERE idMeeting = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Meeting m = new Meeting(id, rs.getInt("idRoom"), rs.getString("comments"), rs.getString("timeSlot"));
            return m;
        } else {
            throw new IllegalArgumentException("Meeting id not found");
        }

    }

    @Override
    public String deleteMeeting(int id) throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("DELETE FROM meeting WHERE idMeeting = ?");
        ps.setInt(1, id);
        if (ps.executeUpdate() != 1) {
            throw new IllegalArgumentException("Meeting id not found");
        } else {
            return "Meeting with id: " + id + " deleted";
        }
    }

    @Override
    public Attendees addAttendeeToMeeting(int idAttendee, int idMeeting) throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("INSERT INTO meeting_attendee VALUES (?,?)");
        ps.setInt(1, idMeeting);
        ps.setInt(2, idAttendee);
        if (ps.execute() == false) {
            throw new IllegalArgumentException("Meeting or attendee id not found");
        } else {

            ps = conn.prepareStatement("SELECT * FROM attendee WHERE idAttendee = ?");
            ps.setInt(1, idAttendee);
            ResultSet rs = ps.executeQuery();
            Attendees a = new Attendees(idAttendee, rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"));
            return a;
        }
    }

    @Override
    public Meeting addMeeting(int idMeeting, int idRoom, String comments, String timeSlot) throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("INSERT INTO meeting VALUES (?,?,?,?)");
        ps.setInt(1, idRoom);
        ps.setString(2, comments);
        ps.setString(3, timeSlot);
        ps.setInt(4, idMeeting);

        int rs = ps.executeUpdate();
        if (rs == 1) {
            Meeting m = new Meeting(idMeeting, idRoom, comments, timeSlot);
            return m;
        } else {
            throw new IllegalArgumentException("Error inserting new meeting");
        }
    }

    @Override
    public Meeting updateMeeting(int id, String comments, String timeSlot, int idRoom) throws SQLException {
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("UPDATE meeting SET comments = ?, timeSlot = ?, idRoom = ? WHERE idMeeting = ?");
        ps.setString(1, comments);
        ps.setString(2, timeSlot);
        ps.setInt(3, idRoom);
        ps.setInt(4, id);

        int rs = ps.executeUpdate();

        if (rs == 1) {
            Meeting m = new Meeting(id, idRoom, comments, timeSlot);
            return m;
        } else {
            throw new IllegalArgumentException("Error updating meeting");
        }

    }

    @Override
    public List<Room> getRooms() throws SQLException {
        List<Room> roomList = new ArrayList<>();
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("SELECT * FROM room ");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Room r = new Room(rs.getInt("idRoom"), rs.getString("location"), rs.getInt("capacity"));
            roomList.add(r);
        }
        return roomList;
    }

    @Override
    public List<Attendees> getAttendeesForMeeting(int idMeeting) throws SQLException {
        List<Attendees> listAttendees = new ArrayList<>();
        DatabaseConfig db = new DatabaseConfig();
        conn = db.openConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("SELECT a.idAttendee, a.firstName, a.lastName, a.email FROM attendee a, meeting_attendee ma, meeting m WHERE m.idMeeting = ma.idMeeting AND ma.idAttendee = a.idAttendee AND m.idMeeting = ?");
        ps.setInt(1, idMeeting);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Attendees a = new Attendees(rs.getInt("idAttendee"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"));
            listAttendees.add(a);
        }
        return listAttendees;
    }
}
