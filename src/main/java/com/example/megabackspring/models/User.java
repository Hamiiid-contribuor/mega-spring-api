package com.example.megabackspring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    private Integer id;
    private String username;
    private String email;
    private String fname;
    private String lname;
    private int age;
    private int role;

}
