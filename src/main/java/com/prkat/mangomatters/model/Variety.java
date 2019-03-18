package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Variety")
public class Variety implements Serializable {
    @Id
    @GeneratedValue
    //@Column(name="orchardId")
   // private  int orchardId;
    @ManyToOne
    @JoinColumn(name="orchardId", nullable=false)
    private Orchard orchard;
    @Column(name="No_Of_Trees")
    private int No_Of_Trees;
    @Column(name="name")
    private String Name;
    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private int price;
    @Column(name="Harvestig_Time")
    private Date Harvestig_Time;

    public Orchard getOrchard() {
        return orchard;
    }

    public void setOrchard(Orchard orchard) {
        this.orchard = orchard;
    }

    public int getNo_Of_Trees() {
        return No_Of_Trees;
    }

    public void setNo_Of_Trees(int no_Of_Trees) {
        No_Of_Trees = no_Of_Trees;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getHarvestig_Time() {
        return Harvestig_Time;
    }

    public void setHarvestig_Time(Date harvestig_Time) {
        Harvestig_Time = harvestig_Time;
    }








}


