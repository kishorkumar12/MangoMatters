package com.prkat.mangomatters.model;

import javax.persistence.*;

@Entity
@Table(name="Variety")
public class Variety {

    @Id
    @GeneratedValue
    @Column(name="id")
    private  int id;
    @Column(name="type")
   private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
