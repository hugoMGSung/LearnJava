package com.example;

import com.logicbig.RendererSupport;
import java.sql.*;

// java.base 그 외 다른 모듈 패키지를 쓰려면 module-info에 require로 넣어줘야함.

public class Component {
  public static void main(String[] args) {
      RendererSupport support = new RendererSupport();
      support.render("Test Object");
  }
}