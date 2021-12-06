package com.example.diansjava.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "kafici")
public class Kafic {
    @Id
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
