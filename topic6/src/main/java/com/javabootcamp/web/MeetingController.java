package com.javabootcamp.web;
import com.javabootcamp.model.Meeting;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/meetings")
@Controller
@RooWebScaffold(path = "meetings", formBackingObject = Meeting.class)
public class MeetingController {
}
