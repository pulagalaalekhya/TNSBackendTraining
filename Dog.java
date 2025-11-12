package com.avn.tns.oopsdemo;

public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // calling parent class constructor
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void showDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
