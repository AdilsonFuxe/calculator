package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  void integerDivision() {
    Calculator calculator = new Calculator();
    int result = calculator.integerDivision(4, 2);
    Assertions.assertEquals(2, result);
  }
}
