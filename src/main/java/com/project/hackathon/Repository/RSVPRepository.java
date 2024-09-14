package com.project.hackathon.Repository;

import com.project.hackathon.Model.RSVP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RSVPRepository extends JpaRepository<RSVP, Long> {

    List<RSVP> findByEventId(Long eventId);
}
