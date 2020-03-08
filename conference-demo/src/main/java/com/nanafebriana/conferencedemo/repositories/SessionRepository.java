package com.nanafebriana.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanafebriana.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
