package com.mcfarevee.shopping;

import com.mcfarevee.groceries.BulkItem;
// https://stackoverflow.com/questions/541749/how-to-determine-an-objects-class
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
import com.mcfarevee.groceries.Item;
import com.mcfarevee.groceries.ManyPackages;
import com.mcfarevee.groceries.Package;
import com.mcfarevee.groceries.Unit;
import java.io.PrintWriter;
import java.util.*;


public class Cart {

  Vector<Item> cart;


  public Cart() {
    this.cart = new Vector<Item>();
  }


  public void addItem(Item item) {
    this.cart.add(item);
  }

  public int numThings() {
    int count = 0;
    for (int i = 0; i < this.cart.size(); i++) {
      if (this.cart.get(i) instanceof ManyPackages) {
        count += ((ManyPackages) this.cart.get(i)).count;
      } else
        count++;
    }
    return count;
  }


  public int numEntries() {
    return this.cart.size();
  }// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

  public void printContents(PrintWriter pen) {
      pen.println(this.cart.toString()); 
  }

  public int getPrice() {
    int price = 0;
    for (int i = 0; i < this.cart.size(); i++) {
      price += this.cart.get(i).getPrice();
    }
    return price;
  }

  


public double[] getWeight() {
    double[] weight = {0, 0, 0, 0};// stored as POUND, OUNCE, KILOGRAM, and GRAM

    for (int i = 0; i < this.cart.size(); i++) {
      if (this.cart.get(i).getWeight().unit == Unit.POUNDS) {
        weight[0] += this.cart.get(i).getWeight().amount;
      } else if (this.cart.get(i).getWeight().unit == Unit.OUNCES) {
        weight[1] += this.cart.get(i).getWeight().amount;
      } else if (this.cart.get(i).getWeight().unit == Unit.KILOGRAMS) {
        weight[2] += this.cart.get(i).getWeight().amount;
      } else
        weight[3] += this.cart.get(i).getWeight().amount;
    }
    return weight;
  }


  public void remove(String name) {
    for (int i = 0; i < this.cart.size(); i++) {
      if (this.cart.get(i).getName().equals(name)) {
        this.cart.remove(i);
        i--;
      }
    }
  }

  public void merge() {
    for (int i = 0; i < this.cart.size()-1; i++) {
      switch (this.cart.get(i).getClass().toString().substring(30)) {

        case "BulkItem":
          if (this.cart.get(i).equals(this.cart.get(i + 1))) {
            ((BulkItem) this.cart.get(i)).amount += ((BulkItem) this.cart.get(i + 1)).amount;
            this.cart.remove(i + 1);
            i--;   
          }
          break;

        case "Package":
          if (this.cart.get(i).equals(this.cart.get(i + 1))) {
            this.cart.add(i, new ManyPackages((Package) this.cart.get(i), 2));
            this.cart.remove(i + 1);
            i--;
          }
          break;

        case "ManyPackages":
          if (this.cart.get(i).equals(this.cart.get(i + 1))) {
            ((ManyPackages) this.cart.get(i)).count += ((ManyPackages) this.cart.get(i + 1)).count;
            this.cart.remove(i + 1);
            i--;
          } else if (((ManyPackages) this.cart.get(i)).type.equals(this.cart.get(i + 1))) {
            ((ManyPackages) this.cart.get(i)).count++;
            this.cart.remove(i + 1);
            i--;
          }
          break;

        default:
          break;
      }
    }
  }

}
