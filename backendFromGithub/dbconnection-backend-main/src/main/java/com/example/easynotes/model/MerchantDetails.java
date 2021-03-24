package com.example.easynotes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "merchant")

public class MerchantDetails {


    private int merchantid;
    private String logo;


    public MerchantDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MerchantDetails(int merchantid, String logo) {
        this.merchantid = merchantid;
        this.logo = logo;
    }

    @Id
    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

