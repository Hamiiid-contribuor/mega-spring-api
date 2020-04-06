package com.example.megabackspring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    private Integer id;
    private String title;
    private String image;
    private String images;
    private String description;
    private Float price;
    private Integer quantity;
    private String short_desc;

}
