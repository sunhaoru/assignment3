package com.mcfarevee.shopping;

import com.mcfarevee.groceries.Item;
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
  
  public int numEntries() {
    return this.cart.size();
  }
  
  public void printContents(PrintWriter pen){
    
  }
  
}
