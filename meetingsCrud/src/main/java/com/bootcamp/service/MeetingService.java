
package com.bootcamp.service;

import com.bootcamp.domain.Attendees;
import com.bootcamp.domain.Meeting;
import com.bootcamp.domain.Room;
import java.sql.SQLException;
import java.util.List;


public interface MeetingService {
    /**
     *  Returns a list of all the meetings
     * @return
     * @throws SQLException 
     */
    List<Meeting> getMeeting()throws SQLException;
    
    /**
     * List of registered people eligible for attending meetings
     * @return
     * @throws SQLException 
     */
    List<Attendees> getList() throws SQLException;
    /**
     * Returns a single meeting with the given id
     * @param id
     * @return
     * @throws SQLException 
     */
    Meeting getMeetingById(int id) throws SQLException;
    /**
     * Deletes a single meeting with the given id
     * @param id
     * @return
     * @throws SQLException 
     */
    String deleteMeeting(int id) throws SQLException;
    /**
     * Updates the meeting with the given id with the parameters passed
     * @param id
     * @param comments
     * @param timeSlot
     * @param idRoom
     * @return
     * @throws SQLException 
     */
    Meeting updateMeeting(int id, String comments, String timeSlot, int idRoom) throws SQLException;
    /**
     * Adds an attendee to a meeting given a meeting id and attendee id
     * @param idAttendee
     * @param idMeeting
     * @return
     * @throws SQLException 
     */
    Attendees addAttendeeToMeeting(int idAttendee, int idMeeting) throws SQLException;
    /**
     * Creates new Meeting
     * @param idMeeting
     * @param idRoom
     * @param comments
     * @param timeSlot
     * @return
     * @throws SQLException 
     */
    Meeting addMeeting(int idMeeting, int idRoom, String comments, String timeSlot) throws SQLException;
    /**
     * List of all available Rooms
     * @return
     * @throws SQLException 
     */
    List<Room> getRooms() throws SQLException;
    /**
     * List of all attendees of a given Meeting 
     * @param idMeeting
     * @return
     * @throws SQLException 
     */
    List<Attendees> getAttendeesForMeeting(int idMeeting) throws SQLException;
}
