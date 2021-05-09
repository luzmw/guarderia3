package com.company;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "idAnimal")
public class Ave extends Animal {
    private int cantidadAlas;

    public int getCantidadAlas() {
        return cantidadAlas;
    }

    public void setCantidadAlas(int cantidadAlas) {
        this.cantidadAlas = cantidadAlas;
    }
}

