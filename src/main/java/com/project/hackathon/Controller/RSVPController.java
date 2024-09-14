package com.project.hackathon.Controller;

import com.project.hackathon.Model.RSVP;
import com.project.hackathon.Service.RSVPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rsvps")
public class RSVPController {

    @Autowired
    private RSVPService rsvpService;

    @PostMapping
    public RSVP rsvpToEvent(@RequestBody RSVP rsvp) {
        return rsvpService.rsvpToEvent(rsvp);
    }

    @GetMapping("/event/{eventId}")
    public List<RSVP> getAttendees(@PathVariable Long eventId) {
        return rsvpService.getAttendees(eventId);
    }
}