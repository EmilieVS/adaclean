package com.adaclean.backend.repository;

import com.adaclean.backend.tables.Waste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WasteRepository extends JpaRepository<Waste, Integer> {
}
