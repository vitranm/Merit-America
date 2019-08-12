package com.models;
public class Dog extends Animal implements Pet, java.io.Serializable{

    public Dog() {
        super();
    }

    public Dog(String name , String breed, double weight) {
        super(name, breed, weight);
    }

    public String showAffection() {
        return weight < 30 ? name + " hopped into your lap and cuddled with you." : name + " curled up next to you.";
    }
}
