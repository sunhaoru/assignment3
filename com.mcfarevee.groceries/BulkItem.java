package com.mcfarevee.groceries;
// https://stackoverflow.com/questions/6149677/comparing-class-types-in-java

public class BulkItem implements Item {

  BulkFood food;
  Unit unit;
  public int amount;


  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  }

  public String toString() {
    String rt = null;
    rt = Integer.toString(this.amount) + " " + this.food.unit.toString() + " of " + this.food.name;
    return rt;
  }

  public Weight getWeight() {
    return (new Weight(this.unit, this.amount));
  }


  public int getPrice() {
    return this.amount * this.food.pricePerUnit;
  }

  public boolean equals(Item other) {
    if (other instanceof BulkItem) {
      return this.equals(other);
    } else
      return false;
  }
  
  public String getName() {
    return this.food.name;
  }
}
