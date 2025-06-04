package com.adaclean.backend.tables;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="waste")
public class Waste {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "waste", cascade = CascadeType.ALL)
    private List<Gathering> gatherings;

    public Waste() {
    }

    public Waste(Integer id, String name){
        this.id =id;
        this.name = name;
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

    public List<Gathering> getGatherings() {
        return gatherings;
    }

    public void setGatherings(List<Gathering> gatherings) {
        this.gatherings = gatherings;
    }
}
