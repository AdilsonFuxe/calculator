package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  void integerDivision() {
    Calculator calculator = new Calculator();
    int result = calculator.integerDivision(4, 2);
    assertEquals(2, result);
  }

  @Test
  void integerSubtraction(){
    Calculator calculator = new Calculator();
    int result = calculator.integerSubtraction(5,2);
    assertEquals(3, result);
  }
}
