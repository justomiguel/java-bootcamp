
package com.bootcamp.controller;

import com.bootcamp.domain.Attendees;
import com.bootcamp.domain.Meeting;
import com.bootcamp.domain.Room;
import com.bootcamp.service.MeetingService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingController {

    private MeetingService service;
    
    @Autowired
    MeetingController(MeetingService service) {
        this.service = service;
    }

    @RequestMapping(value = "/meeting", method = RequestMethod.GET)
    public List<Meeting> getMeeting() throws SQLException {
        return service.getMeeting();
    }
    
    @RequestMapping(value = "/attendees", method = RequestMethod.GET)
    public List<Attendees> getList() throws SQLException {
        return service.getList();
    }
    
    @RequestMapping(value = "/meeting/{id}", method = RequestMethod.GET)   
    public Meeting getMeetingById(@PathVariable int id) throws SQLException {
        return service.getMeetingById(id);
    }
    
    @RequestMapping(value = "/meeting/{id}", method = RequestMethod.DELETE) 
    public String deleteMeeting(@PathVariable int id) throws SQLException {
        return service.deleteMeeting(id);
        
    }
    
    @RequestMapping(value = "/meeting/{idMeeting}/attendees/{idAttendee}", method = RequestMethod.POST)
    public Attendees addAttendeeToMeeting(@PathVariable int idAttendee, @PathVariable int idMeeting) throws SQLException {
        return service.addAttendeeToMeeting(idAttendee, idMeeting);
        
    }
    
    @RequestMapping(value = "/meeting", method = RequestMethod.POST)
    public Meeting addMeeting(@RequestParam int idMeeting, @RequestParam int idRoom, @RequestParam String comments, @RequestParam String timeSlot) throws SQLException {
        return service.addMeeting(idMeeting, idRoom, comments, timeSlot);
        
    }
    
    @RequestMapping(value = "/meeting/{idMeeting}", method = RequestMethod.PUT)
    public Meeting updateMeeting(@PathVariable int idMeeting, @RequestParam int idRoom, @RequestParam String comments, @RequestParam String timeSlot) throws SQLException {
        return service.updateMeeting(idRoom, comments, timeSlot, idRoom);
    }
    
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public List<Room> getRooms() throws SQLException{
        return service.getRooms();
    }
    
    @RequestMapping(value = "/meeting/attendees/{idMeeting}", method = RequestMethod.GET)
    public List<Attendees> getAttendesForMeeting(@PathVariable int idMeeting) throws SQLException{
        return service.getAttendeesForMeeting(idMeeting);

    }
}
