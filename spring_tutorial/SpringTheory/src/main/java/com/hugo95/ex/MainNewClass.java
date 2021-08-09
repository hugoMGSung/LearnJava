package com.hugo95.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainNewClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String configLocation = "classpath:appContext.xml";
    AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
    Calculation calc = ctx.getBean("calculation", Calculation.class);
    
    System.out.println("IoC Container...");
    calc.plus();
    calc.minus();
    calc.multiple();
    calc.divide();
  }
}
