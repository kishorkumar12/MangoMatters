package com.prkat.mangomatters.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;
@Entity
@Table(name="Orchard")
public class Orchard {
    @Id
    @GeneratedValue
    @Column(name="id")
    private  int id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
   // @OneToMany(targetEntity=Student.class, mappedBy="college", fetch=FetchType.EAGER)
  //@OneToMany(targetEntity=Variety.class, mappedBy="Orchard", fetch=FetchType.EAGER)
   // private List<Variety> variety;
    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private BigDecimal price;
    @Column(name="harvestingtime")
    private LocalTime harvestingtime;
    @Column(name="deliverytime")
    private LocalTime deliverytime;
    @Column(name="numberOfShares")
    private int numberOfShares;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   /* public List<Variety> getVariety() {
        return variety;
    }
*/
    /*public void setVariety(List<Variety> variety) {
        this.variety = variety;
    }*/

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

    public LocalTime getHarvestingtime() {
        return harvestingtime;
    }

    public void setHarvestingtime(LocalTime harvestingtime) {
        this.harvestingtime = harvestingtime;
    }

    public LocalTime getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(LocalTime deliverytime) {
        this.deliverytime = deliverytime;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
