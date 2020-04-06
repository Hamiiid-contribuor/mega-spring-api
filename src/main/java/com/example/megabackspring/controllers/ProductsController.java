package com.example.megabackspring.controllers;

import com.example.megabackspring.daos.ProductDao;
import com.example.megabackspring.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("")
    public  List<Product> getAllProducts() {
        List<Product> products = productDao.findAll();
        return products;
    }

}
