package com.bbrodskyi.innerclass;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {
  public static void main(final String[] args) {
    List<Laptop> myLaptops = new ArrayList<Laptop>();
    myLaptops.add(new Laptop("Apple", "MacBook Pro 13 Core i5 1.4 Touch/2019 2 TB 3"));
    myLaptops.add(new Laptop("Apple", "MacBook Pro 16 Core i9 2.3 2019 (Scissor)"));
    myLaptops.add(new Laptop("Apple", " MacBook Pro 15 Core i7 2.8 Touch/Mid-2017"));

    LaptopCollection myLaptopsCollection = new LaptopCollection(myLaptops);

    ListIterator<Laptop> iterator = myLaptopsCollection.listIterator();
    while (iterator.hasNext()) {
      Laptop tempLap = iterator.next();
      System.out.println(tempLap.toString());
    }

    while (iterator.hasPrevious()) {
      Laptop tempLap = iterator.previous();
      System.out.println(tempLap.toString());
    }

  }
}