package com.hugo95.ex;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calculation calc = new Calculation();
    calc.setFirstNum(20);
    calc.setSecondNum(10);

    calc.plus();
    calc.minus();
    calc.multiple();
    calc.divide();
  }
}
