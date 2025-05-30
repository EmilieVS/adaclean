package com.adaclean.backend.tables;
import jakarta.persistence.*;

import java.text.DateFormat;

@Entity
@Table(name="gathering")
public class Gathering {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer volunteer_id;
    private String waste_name;
    private Integer quantity;
    private String city_name;
    private DateFormat create_at;
    private DateFormat update_at;



    public Gathering() {
    }

    public Gathering(Integer id, String name, Integer volunteer_id, String waste_name, Integer quantity, String city_name, DateFormat create_at, DateFormat update_at){
        this.id =id;
        this.name = name;
        this.volunteer_id = volunteer_id;
        this.waste_name = waste_name;
        this.quantity = quantity;
        this.city_name = city_name;
        this.create_at = create_at;
        this.update_at = update_at;
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

}
