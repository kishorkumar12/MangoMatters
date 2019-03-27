package com.prkat.mangomatters.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.Date;

@Component
public class VarietyDto {
    /*
            private Orchard orchard;
        */
    private long varietyId;
    private String varietyName;


   /* public Orchard getOrchard() {
        return orchard;
    }

    public void setOrchard(Orchard orchard) {
        this.orchard = orchard;
    }*/

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




}
