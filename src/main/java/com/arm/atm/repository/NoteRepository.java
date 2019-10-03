package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arm.atm.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer>{

}
