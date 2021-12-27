package com.example.diansjava.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class Kafic {

    private String ime;
    private String grad;

    public Kafic(String ime, String grad) {
        this.ime = ime;
        this.grad = grad;
    }

    public Kafic() {

    }

    @Override
    public String toString() {
        return "Kafic{" +
                "ime='" + ime + '\'' +
                ", grad='" + grad + '\'' +
                '}';
    }
}
