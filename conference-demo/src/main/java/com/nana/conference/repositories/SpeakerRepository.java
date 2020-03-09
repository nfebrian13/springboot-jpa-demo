package com.nana.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nana.conference.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
