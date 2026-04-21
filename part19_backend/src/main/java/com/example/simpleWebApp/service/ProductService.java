package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> productList = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 5000),
//            new Product(102, "Boat Speaker", 900),
//            new Product(103, "Mobile", 10000)
//    ));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
       repo.save(product); //for update save is used. If product is there it will update otherwise add
    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);
    }
}
