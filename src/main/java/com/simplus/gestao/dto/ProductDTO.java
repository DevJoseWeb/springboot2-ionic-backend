package com.simplus.gestao.dto;

import java.io.Serializable;
import java.util.Date;

import com.simplus.gestao.domain.Product;

public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer gtln;
    private String description;
    private Date lastUpdate;

    public ProductDTO() {
    }

    public ProductDTO(Product obj) {
        id = obj.getId();
        description = obj.getDescription();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGtln() {
        return gtln;
    }

    public void setGtln(Integer gtln) {
        this.id = gtln;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getlastUpdate() {
        return lastUpdate;
    }

    public void setlastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
