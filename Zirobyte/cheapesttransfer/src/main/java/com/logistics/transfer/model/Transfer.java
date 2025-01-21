package com.logistics.transfer.model;

public class Transfer {
    private int weight;
    private int cost;

    public Transfer(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public Transfer() {
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
