package com.tts.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
