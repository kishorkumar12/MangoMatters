package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="harvestingtime")
    private Date harvestingtime;
    @Column(name="deliverytime")
    private Date deliverytime;
    @Column(name="numberOfShares")
    private int numberOfShares;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getHarvestingtime() {
        return harvestingtime;
    }

    public void setHarvestingtime(Date harvestingtime) {
        this.harvestingtime = harvestingtime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
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
