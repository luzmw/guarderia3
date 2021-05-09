package com.company;

import javax.persistence.*;

@Entity
@Table(name="gatos")
@PrimaryKeyJoinColumn(name="idAnimal")
public class Gato extends Animal{
    private String colorOjos;
    private Integer cantidadVidasRestantes;

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Integer getCantidadVidasRestantes() {
        return cantidadVidasRestantes;
    }

    public void setCantidadVidasRestantes(Integer cantidadVidasRestantes) {
        this.cantidadVidasRestantes = cantidadVidasRestantes;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "colorOjos='" + colorOjos + '\'' +
                ", cantidadVidasRestantes=" + cantidadVidasRestantes +
                '}';
    }
}
