package com.prkat.mangomatters.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class OrchardDto {
    private  Long orchardId;
    private String name;
    private String address;
    private List<Variety> variety;
    private int quantity;
    private BigDecimal price;
    private Date harvestingtime;
    private Date deliverytime;
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

    public void setId(Long orchardId) {
        this.orchardId = orchardId;
    }
    public List<Variety> getVariety() {
        return variety;
    }

    public void setVariety(List<Variety> variety) {
        this.variety = variety;
    }

}
