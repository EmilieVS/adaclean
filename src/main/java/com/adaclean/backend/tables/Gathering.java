package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="gathering")
public class Gathering {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer volunteer_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "waste_id", nullable = false)
    private Waste waste;

    private Integer quantity;
    private String city_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Gathering() {
    }

    public Gathering(Integer id, String name, Integer volunteer_id, Integer quantity, String city_name, LocalDateTime created_at, LocalDateTime updated_at){
        this.id =id;
        this.name = name;
        this.volunteer_id = volunteer_id;
        this.quantity = quantity;
        this.city_name = city_name;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolunteer_id() {
        return volunteer_id;
    }

    public void setVolunteer_id(Integer volunteer_id) {
        this.volunteer_id = volunteer_id;
    }

    public Waste getWaste(){ return waste;}

    public void setWaste(Waste waste) { this.waste = waste;}

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void getCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void getUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

}
