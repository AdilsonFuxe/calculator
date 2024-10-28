package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Test Math operator in calculator class")
public class CalculatorTest {

  @DisplayName("Test 4/2")
  @Test
  void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
    Calculator calculator = new Calculator();
    int result = calculator.integerDivision(4, 2);
    assertEquals(2, result, ()-> "4/2 did not produce 2");
  }

  @DisplayName("Division by zero")
  @Test
  void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrownArithmeticException(){
    fail("Not implemented yet");
  }

  @DisplayName("Test 5-2")
  @Test
  void testIntegerSubtraction_WhenFiveSubtrahendByTwo_ShouldReturnThree(){
    Calculator calculator = new Calculator();
    int result = calculator.integerSubtraction(5,2);
    assertEquals(3, result, () -> "5-2 did not produce 3");
  }
}
