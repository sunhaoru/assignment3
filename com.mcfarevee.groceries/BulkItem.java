package com.mcfarevee.groceries;

public class BulkItem implements Item {

  BulkFood food;
  Unit unit;
  int amount;


  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  }

  public String toString() {
    String rt = null;
    rt = "this.amout" + " " + this.food.unit.toString() + " of " + this.food.name;
    return rt;
  }

  public Weight getWeight() {
    return (new Weight(this.unit, this.amount));
  }


  public int getPrice() {
    return this.amount * this.food.pricePerUnit;
  }

  public boolean equals(BulkItem other) {
    return this.equals(other);
  }
}
