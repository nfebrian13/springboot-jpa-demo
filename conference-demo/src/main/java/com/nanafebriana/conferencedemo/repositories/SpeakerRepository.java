package com.nanafebriana.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanafebriana.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
