package com.bbrodskyi.concurrency.hometask;

public class Consumer extends Thread {
  Market market;

  public Consumer(Market theMarket) {
    this.market = theMarket;
  }

  @Override
  public void run() {
    while (true) {
      try {
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      market.consume();
    }
  }

}