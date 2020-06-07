package com.bbrodskyi.innerclass;

import java.util.Iterator;
import java.util.List;

public class LaptopCollection implements Iterable<Laptop> {
  public List<Laptop> laptops;

  public LaptopCollection(List<Laptop> laptops) {
    this.laptops = laptops;
  }

  @Override
  public Iterator<Laptop> iterator() {
    return new LaptopIterator(this.laptops);
  }

  public static class LaptopIterator implements Iterator<Laptop> {

    private int nextLaptop;
    private final List<Laptop> laptopsList;

    public LaptopIterator(List<Laptop> laptops) {
      this.laptopsList = laptops;
      this.nextLaptop = 0;
    }

    @Override
    public boolean hasNext() {
      if (nextLaptop > laptopsList.size() - 1) {
        return false;
      }
      return true;
    }

    @Override
    public Laptop next() {
      return this.laptopsList.get(this.nextLaptop++);
    }

  }

}