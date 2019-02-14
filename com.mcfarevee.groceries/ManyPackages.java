package com.mcfarevee.groceries;

public class ManyPackages implements Item {

  Package type;
  int count;

  public ManyPackages(Package type, int count) {
    this.type = type;
    this.count = count;
  }

  public String toString() {
    return Integer.toString(this.count) + " x " + type.toString();
  }

  public Weight getWeight() {
    return new Weight(this.type.getWeight().unit, this.count * this.type.getWeight().amount);
  }

  public int getPrice() {
    return this.count * this.type.getPrice();
  }

  public boolean equals(ManyPackages other) {
    return this.equals(other);
  }
}
