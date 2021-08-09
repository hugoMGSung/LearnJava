package com.hugo95.springboard;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {

  @Inject
  private DataSource ds;

  @Test
  public void testDs() throws Exception {
    try (Connection conn = ds.getConnection()) {
      System.out.println("DataSource 설정 성공!");
      System.out.println(conn);
    } catch (Exception e) {
      System.out.println("실패!!");
      e.printStackTrace();
    }
  }
}
