package com.company;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "animales", schema = "guarderiaconhibernate", catalog = "")
public class AnimalesEntity {
    private int idAnimal;
    private String nombre;
    private Integer edad;
    private Integer cantidadpatas;
    private String animalescol;
    private String colorplumas;
    private String largoescamas;

    @Id
    @Column(name = "idAnimal", nullable = false)
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "edad", nullable = true)
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "cantidadpatas", nullable = true)
    public Integer getCantidadpatas() {
        return cantidadpatas;
    }

    public void setCantidadpatas(Integer cantidadpatas) {
        this.cantidadpatas = cantidadpatas;
    }

    @Basic
    @Column(name = "animalescol", nullable = true, length = 45)
    public String getAnimalescol() {
        return animalescol;
    }

    public void setAnimalescol(String animalescol) {
        this.animalescol = animalescol;
    }

    @Basic
    @Column(name = "colorplumas", nullable = true, length = 45)
    public String getColorplumas() {
        return colorplumas;
    }

    public void setColorplumas(String colorplumas) {
        this.colorplumas = colorplumas;
    }

    @Basic
    @Column(name = "largoescamas", nullable = true, length = 45)
    public String getLargoescamas() {
        return largoescamas;
    }

    public void setLargoescamas(String largoescamas) {
        this.largoescamas = largoescamas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalesEntity that = (AnimalesEntity) o;
        return idAnimal == that.idAnimal && Objects.equals(nombre, that.nombre) && Objects.equals(edad, that.edad) && Objects.equals(cantidadpatas, that.cantidadpatas) && Objects.equals(animalescol, that.animalescol) && Objects.equals(colorplumas, that.colorplumas) && Objects.equals(largoescamas, that.largoescamas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnimal, nombre, edad, cantidadpatas, animalescol, colorplumas, largoescamas);
    }
}
