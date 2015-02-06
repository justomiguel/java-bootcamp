package com.javabootcamp.web;
import com.javabootcamp.model.Attendee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/attendees")
@Controller
@RooWebScaffold(path = "attendees", formBackingObject = Attendee.class)
public class AttendeeController {
}
