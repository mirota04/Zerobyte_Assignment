package com.logistics.transfer.model;

public class Transfer {
    private int weight;
    private int cost;

    // Constructor (optional if you plan to use setters)
    public Transfer(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    // Default constructor for Jackson to use
    public Transfer() {
    }

    // Getters
    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    // Setters for Jackson to use during deserialization
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
