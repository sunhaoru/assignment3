package com.mcfarevee.groceries;

public class NonFood {
  String name;
  Weight weight;
  int price;

  public NonFood(String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  public String toString() {
    return this.name;
  }

  public Weight getWeight() {
    return this.weight;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean equals(NonFood other) {
    return this.equals(other);
  }
}

