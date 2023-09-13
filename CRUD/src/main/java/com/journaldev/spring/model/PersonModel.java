package com.journaldev.spring.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class PersonModel {
    private int id;

@NotEmpty(message = "Name is required.")
@NotNull(message = "Name is required.")
@NotBlank(message = "Name is required")
    private String name;

@NotEmpty(message = "Country is required.")
@NotNull(message = "Country is required.")
@NotBlank(message = "Name is required")
    private String country;

    public PersonModel() {
        super();
    }

    public PersonModel(int id, String name, String country) {
        super();
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public PersonModel(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }

    public PersonModel(String name) {
        super();
        this.name = name;
    }

    public PersonModel(int id) {
        super();
        this.id = id;
    }

    public PersonModel(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public PersonModel(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
