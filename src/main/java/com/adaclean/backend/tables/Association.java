package com.adaclean.backend.tables;
import jakarta.persistence.*;

@Entity
@Table(name="association")
public class Association {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Integer volunteer_id;
    private Integer city_id;
    private Integer gathering_id;

    public Association() {
    }

    public Association (Integer id, Integer volunteer_id, Integer city_id, Integer gathering_id ){
        this.id =id;
        this.volunteer_id = volunteer_id;
        this.city_id = city_id;
        this.gathering_id = gathering_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
