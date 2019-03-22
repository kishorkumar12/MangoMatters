package com.prkat.mangomatters.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.Date;

@Component
public class VarietyDto {

    private Orchard orchard;
        private String varietyName;
    private Date createDate;
    private Date updatedDate;

    public Orchard getOrchard() {
        return orchard;
    }

    public void setOrchard(Orchard orchard) {
        this.orchard = orchard;
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


}
