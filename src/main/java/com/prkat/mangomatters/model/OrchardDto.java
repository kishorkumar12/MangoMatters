package com.prkat.mangomatters.model;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
    @Component
    public class  OrchardDto {
    private  Long orchardId;
    private String orchardName;
    private Date createDate;
    private Date updatedDate;
    private String address;
    private List<Variety> variety;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
