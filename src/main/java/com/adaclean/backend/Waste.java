package com.adaclean.backend;
import jakarta.persistence.*;

@Entity
@Table(name="waste")
public class Waste {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String waste_type;

    public Waste(Integer id, String name, String waste_type){
        this.id =id;
        this.name = name;
        this.waste_type = waste_type;
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

    public String getWaste_type() {
        return waste_type;
    }

    public void setWaste_type(String waste_type) {
        this.waste_type = waste_type;
    }
}
