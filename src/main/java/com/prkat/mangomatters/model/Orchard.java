package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="Orchard")
public class Orchard {
    @Id
    @GeneratedValue
    @Column(name="orchardId")
    private  Long orchardId;
    @Column(name="name")
    private String orchardName;
    @Column(name="address")
    private String address;
    @OneToMany(targetEntity=Variety.class, mappedBy="orchard", fetch=FetchType.EAGER)
    private List<Variety> variety;
    @Column(name="createDate")
    private Date createDate;
    @Column(name="updatedDate")
    private Date updatedDate;

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


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Variety> getVariety() {
        return variety;
    }

    public void setVariety(List<Variety> variety) {
        this.variety = variety;
    }

    public Long getOrchardId() {
        return orchardId;
    }

    public void setOrchardId(Long orchardId) {
        this.orchardId = orchardId;
    }

    public String getOrchardName() {
        return orchardName;
    }

    public void setOrchardName(String orchardName) {
        this.orchardName = orchardName;
    }


}
