package com.bbrodskyi.innerclass;

public class Laptop {
  public String maker;
  public String model;

  public Laptop() {

  }

  public Laptop(String maker, String model) {
    this.maker = maker;
    this.model = model;
  }

  public String getMaker() {
    return this.maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "{" + " maker='" + getMaker() + "'" + ", model='" + getModel() + "'" + "}";
  }

}