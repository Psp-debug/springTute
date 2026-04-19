package com.example.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Component
public class Product {

    //defining in private to achieve abstraction
    private int prodId;
    private String proName;
    private int price;

    public Product(int prodId, String proName, int price) {
        this.prodId = prodId;
        this.proName = proName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
