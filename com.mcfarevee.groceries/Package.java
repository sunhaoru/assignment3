package com.mcfarevee.groceries;

public class Package implements Item {

  String name;
  Weight weight;
  int price;

  public Package(String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  public String toString() {
    String rt = null;
    rt = Integer.toString(this.weight.amount) + " " + this.weight.unit.toString() + " package of "
        + this.name;
    return rt;

  }

  public Weight getWeight() {
    return this.weight;
  }

  public int getPrice() {
    return this.price;
  }

  public boolean equals(Item other) {
    if (other instanceof Package) {
      return this.equals(other);
    } else
      return false;
  }

  public String getName() {
    return this.name;
  }
}
