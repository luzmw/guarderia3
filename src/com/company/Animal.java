package com.company;

    import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "animales")
    @Inheritance(strategy = InheritanceType.JOINED)
    public class Animal implements Serializable {
        @Id @GeneratedValue
        private int idAnimal;
        private String nombre;
        private int edad;
        private String color;

        public Animal() {
        }

        public int getIdAnimal() {
            return idAnimal;
        }

        public void setIdAnimal(int idAnimal) {
            this.idAnimal = idAnimal;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "idAnimal=" + idAnimal +
                    ", nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", color='" + color + '\'' +
                    '}';
        }

}
