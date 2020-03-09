package com.nana.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nana.conference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
