package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.time.LocalDate;


@Entity
@Table(name="volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String city;
    private String status;
    private String email ;
    private String password;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Volunteer() {
    }

    public Volunteer(Integer id, String first_name, String last_name, String city, String status, String email, String password, LocalDate  created_at, LocalDate  updated_at){
        this.id =id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.status = status;
        this.email = email;
        this.password = password;
        this.created_at = LocalDate.now();
        this.updated_at = LocalDate.now();
    }

    @PrePersist
    protected void onCreate() {
        created_at = LocalDate.now();
        updated_at = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated_at = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }


}
