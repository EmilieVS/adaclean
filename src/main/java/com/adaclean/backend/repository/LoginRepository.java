package com.adaclean.backend.repository;

import com.adaclean.backend.tables.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer>{
}
