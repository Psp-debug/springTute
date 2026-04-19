package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 5000),
            new Product(102, "Boat Speaker", 900),
            new Product(103, "Mobile", 10000)
    ));

    public List<Product> getProducts(){
         return productList;
    }

    public Product getProductById(int prodId) {
        return productList.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void updateProduct(Product product) {
        int i;
        for(i = 0; i < productList.size(); i++){
            if(productList.get(i).getProdId() == product.getProdId()){
                break;
            }
        }
        productList.set(i, product);
    }

    public void deleteProduct(int prodId) {
        int i;
        for(i = 0; i < productList.size(); i++){
            if(productList.get(i).getProdId() == prodId){
                break;
            }
        }
        productList.remove(i);
    }
}
