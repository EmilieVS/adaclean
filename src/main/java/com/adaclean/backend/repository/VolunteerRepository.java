package com.adaclean.backend.repository;

import com.adaclean.backend.tables.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {
}
