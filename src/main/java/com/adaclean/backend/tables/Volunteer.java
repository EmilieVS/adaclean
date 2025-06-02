package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.time.LocalDateTime;

@Entity
@Table(name="volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String city_name;
    private String status;
    @Column(unique=true)
    private String email ;
    @Column(unique=true)
    private String password;
    private LocalDateTime  created_at;
    private LocalDateTime updated_at;

    public Volunteer() {
    }

    public Volunteer(Integer id, String first_name, String last_name, String city_name, String status, String email, String password, LocalDateTime  created_at, LocalDateTime  updated_at){
        this.id =id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city_name = city_name;
        this.status = status;
        this.email = email;
        this.password = password;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
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


    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }


}
