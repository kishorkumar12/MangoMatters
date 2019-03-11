package com.prkat.mangomatters.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalTime;

@Component
public class OrchardDto {
    private  int id;
    private String name;
    private String address;
    // private List<Variety> variety;
    private int quantity;
    private BigDecimal price;
    private LocalTime harvestingtime;
    private LocalTime deliverytime;
    private int numberOfShares;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
