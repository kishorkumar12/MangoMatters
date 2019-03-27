package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Variety")
public class Variety implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="varietyId")
    private long varietyId;

    // @ManyToOne
  //  @JoinColumn(name="orchardId", nullable=false)
/*
    private Orchard orchardId;
*/
    @Column(name="varietyName")
    private String varietyName;

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public long getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(long varietyId) {
        this.varietyId = varietyId;
    }





    /*public Orchard getOrchard() {
        return orchard;
    }
    public void setOrchard(Orchard orchard) {
        this.orchard = orchard;
    }*/


}


