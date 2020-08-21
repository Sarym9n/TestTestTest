package ru.TestTestTest.sandbox;

import org.junit.Test;
import org.testng.Assert;
import ru.TestTestTest.Sandbox.Square;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25);
  }
}
