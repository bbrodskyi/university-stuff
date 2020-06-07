package com.bbrodskyi.innerclass.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.bbrodskyi.innerclass.Laptop;

import org.junit.jupiter.api.Test;

public class LaptopTest {
  Laptop l = new Laptop("Dell", "XPS 15");

  @Test
  void getMaker() {
    assertEquals("Dell", l.getMaker());
  }

  @Test
  void getModel() {
    assertEquals("XPS 15", l.getModel());
  }

  @Test
  void setMaker() {
    l.setMaker("Lenovo");
    assertEquals("Lenovo", l.getMaker());
  }

  @Test
  void setModel() {
    l.setModel("Thinkpad T1");
    assertEquals("Thinkpad T1", l.getModel());
  }

}