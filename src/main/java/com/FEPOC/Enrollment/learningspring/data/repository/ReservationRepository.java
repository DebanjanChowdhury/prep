package com.FEPOC.Enrollment.learningspring.data.repository;

import com.FEPOC.Enrollment.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
