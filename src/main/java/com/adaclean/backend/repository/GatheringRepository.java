package com.adaclean.backend.repository;

import com.adaclean.backend.tables.Gathering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GatheringRepository extends JpaRepository<Gathering, Integer> {
}
