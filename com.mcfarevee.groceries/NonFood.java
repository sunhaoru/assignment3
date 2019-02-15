package com.mcfarevee.groceries;

public class NonFood implements Item{
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

  public boolean equals(Item other) {
    if (other instanceof NonFood) {
      return this.equals(other);
    } else
      return false;
  }
  public String getName() {
    return this.name;
  }
}

