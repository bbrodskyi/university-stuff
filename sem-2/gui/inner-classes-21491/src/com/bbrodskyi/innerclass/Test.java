package com.bbrodskyi.innerclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
  public static void main(final String[] args) {
    List<Laptop> myLaptops = new ArrayList<Laptop>();
    myLaptops.add(new Laptop("Apple", "MacBook Pro 13 Core i5 1.4 Touch/2019 2 TB 3"));
    myLaptops.add(new Laptop("Apple", "MacBook Pro 16 Core i9 2.3 2019 (Scissor)"));
    myLaptops.add(new Laptop("Apple", " MacBook Pro 15 Core i7 2.8 Touch/Mid-2017"));

    LaptopCollection myLaptopsCollection = new LaptopCollection(myLaptops);

    Iterator<Laptop> iterator = myLaptopsCollection.iterator();
    while (iterator.hasNext()) {
      Laptop tempLap = iterator.next();
      System.out.println(tempLap.toString());
    }

  }
}