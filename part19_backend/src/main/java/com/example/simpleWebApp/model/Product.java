package com.example.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Entity
@Component
public class Product {

    //defining in private to achieve abstraction
    //due to GeneratedValue annotation we must pass 0
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int prodId;

    private String proName;
    private int price;

    public Product(){
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
