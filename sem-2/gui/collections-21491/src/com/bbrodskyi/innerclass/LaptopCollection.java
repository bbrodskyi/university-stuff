package com.bbrodskyi.innerclass;

import java.util.List;
import java.util.ListIterator;

public class LaptopCollection {
  public List<Laptop> laptops;

  public LaptopCollection(List<Laptop> laptops) {
    this.laptops = laptops;
  }

  public ListIterator<Laptop> listIterator() {
    return new LaptopIterator(this.laptops);
  }

  public static class LaptopIterator implements ListIterator<Laptop> {

    private int nextLaptop;
    private int previousLaptop;

    private final List<Laptop> laptopsList;

    public LaptopIterator(List<Laptop> laptops) {
      this.laptopsList = laptops;
      this.nextLaptop = 0;
      this.previousLaptop = this.laptopsList.size() - 1;
    }

    @Override
    public boolean hasNext() {
      if (this.nextLaptop > this.laptopsList.size() - 1) {
        return false;
      }
      return true;
    }

    @Override
    public Laptop next() {
      return this.laptopsList.get(this.nextLaptop++);
    }

    @Override
    public boolean hasPrevious() {
      if (this.previousLaptop < 0) {
        return false;
      }
      return true;
    }

    @Override
    public Laptop previous() {
      return this.laptopsList.get(this.previousLaptop--);
    }

    @Override
    public int nextIndex() {
      return this.nextLaptop;
    }

    @Override
    public int previousIndex() {
      return this.previousLaptop;
    }

    @Override
    public void remove() throws UnsupportedOperationException {
      throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override
    public void set(Laptop e) throws UnsupportedOperationException {
      throw new UnsupportedOperationException("set() is not supported");
    }

    @Override
    public void add(Laptop e) throws UnsupportedOperationException {
      throw new UnsupportedOperationException("add() is not supported");
    }

  }
}