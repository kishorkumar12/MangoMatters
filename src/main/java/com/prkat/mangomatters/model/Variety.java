package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Variety")
public class Variety implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="variety_Id")
    private  int variety_Id;
    @ManyToOne
    @JoinColumn(name="orchardId", nullable=false)
    private Orchard orchard;
    @Column(name="varietyName")
    private String varietyName;
    @Column(name="createDate")
    private Date createDate;
    @Column(name="updatedDate")
    private Date updatedDate;

    public int getVariety_Id() {
        return variety_Id;
    }

    public void setVariety_Id(int variety_Id) {
        this.variety_Id = variety_Id;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }



    public Orchard getOrchard() {
        return orchard;
    }
    public void setOrchard(Orchard orchard) {
        this.orchard = orchard;
    }


}


