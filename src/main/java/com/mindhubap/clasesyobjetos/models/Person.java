package com.mindhubap.clasesyobjetos.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    //Atributos o propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String name;
    private String lastName;

    //Constructores

    public Person(){}

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    //Metodos o Comportamientos


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(!name.isBlank()){
            this.name = name;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
