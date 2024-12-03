package com.example.LN09_Backend.repository;

import com.example.LN09_Backend.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Short> {

}