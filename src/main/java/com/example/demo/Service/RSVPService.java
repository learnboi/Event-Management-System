package com.example.demo.Service;

import com.example.demo.Model.RSVP;
import com.example.demo.Repository.RSVPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSVPService {
    @Autowired
    private RSVPRepository rsvpRepository;

    public RSVP rsvpToEvent(RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }

    public List<RSVP> getAttendees(Long eventId) {
        return rsvpRepository.findByEventId(eventId);
    }
}
