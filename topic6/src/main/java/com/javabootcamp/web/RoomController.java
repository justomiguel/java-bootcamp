package com.javabootcamp.web;
import com.javabootcamp.model.Room;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rooms")
@Controller
@RooWebScaffold(path = "rooms", formBackingObject = Room.class)
public class RoomController {
}
