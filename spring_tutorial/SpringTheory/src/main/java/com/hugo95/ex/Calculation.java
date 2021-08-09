package com.hugo95.ex;

public class Calculation {
  
  private int firstNum;
  private int secondNum;
  
  public int getFirstNum() {
    return firstNum;
  }
  public void setFirstNum(int firstNum) {
    this.firstNum = firstNum;
  }
  public int getSecondNum() {
    return secondNum;
  }
  public void setSecondNum(int secondNum) {
    this.secondNum = secondNum;
  }
  
  public void plus() {
    System.out.println(">>> plus");
    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
  }
  
  public void minus() {
    System.out.println(">>> minus");
    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
  }
  
  public void multiple() {
    System.out.println(">>> multiple");
    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
  }
  
  public void divide() {
    System.out.println(">>> divide");
    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
  }
}
