package com.bbrodskyi.concurrency.hometask;

public class Market {
  public int productCount = 0;
  public int productLimit = 5;

  synchronized void produce() {
    if (productCount < productLimit) {
      productCount++;
      System.out
          .println(Thread.currentThread().getName() + ": >>Produced a product. Current productCount: " + productCount);
      notifyAll();
    } else {
      System.out.println(Thread.currentThread().getName()
          + ": >>Product limit reached. Can't produce. Current productCount: " + productCount);
      notifyAll();
    }
  }

  synchronized void consume() {
    if (productCount > 0) {
      productCount--;
      System.out
          .println(Thread.currentThread().getName() + ": >>Consumed a product. Current productCount: " + productCount);
      notifyAll();
    } else {
      System.out.println(
          Thread.currentThread().getName() + ": >>No products. Can't consume. Current productCount: " + productCount);
      notifyAll();
    }
  }

}
