package com.mcfarevee.groceries;

public class BulkFood {
  String name;
  Unit unit;
  int pricePerUnit;
  int supply;

  public BulkFood(String name, Unit unit, int pricePerUnit, int supply) {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  }
}
