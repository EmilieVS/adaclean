package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
@Table(name="login")
public class Login {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(unique=true)
    private String email ;
    @Column(unique=true)
    private String password;
    private Integer volunteer_id;
    private DateFormat create_at;
    private DateFormat update_at;

    public Login() {
    }

    public Login(Integer id, String email, String password, Integer volunteer_id, DateFormat create_at, DateFormat update_at){
        this.id =id;
        this.email = email;
        this.password = password;
        this.volunteer_id = volunteer_id;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
