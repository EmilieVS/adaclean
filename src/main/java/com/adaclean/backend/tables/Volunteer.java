package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.text.DateFormat;

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
    private String email;
    @Column(unique=true)
    private String password;
    private DateFormat created_at;
    private DateFormat updated_at;

    public Volunteer() {
    }

    public Volunteer(Integer id, String first_name, String last_name, String city_name, String status, String email, String password, DateFormat created_at, DateFormat updated_at){
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

}
