package com.bbrodskyi.concurrency.hometask;

public class MarketTest {
  public static void main(String[] args) {
    Market market = new Market();

    Thread[] producers = new Thread[5];
    for (int i = 0; i < 5; i++) {
      producers[i] = new Producer(market);
      producers[i].start();
    }

    Thread[] consumers = new Thread[10];
    for (int i = 0; i < 10; i++) {
      consumers[i] = new Consumer(market);
      consumers[i].start();
    }
  }
}