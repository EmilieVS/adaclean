package com.adaclean.backend.repository;

import com.adaclean.backend.tables.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}

