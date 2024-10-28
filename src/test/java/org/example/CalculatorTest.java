package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


@DisplayName("Test Math operator in calculator class")
public class CalculatorTest {
  Calculator calculator;
  @BeforeAll
  static void  setup(){
    System.out.println("Executing @BeforeAll  method");
  }

  @AfterAll
  static void cleanup() {
    System.out.println("Executing  @AfterAll   method");
  }

  @BeforeEach
  void beforeEachTestMethod(){
    calculator = new Calculator();
    System.out.println("Executing  @BeforeEach  method");
  }

  @AfterEach
  void afterEachTestMethod(){
    System.out.println("Executing  @AfterEach  method");
  }

  @DisplayName("Test 4/2")
  @Test
  void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
    // Arrange // Given
    int dividend = 4;
    int divisor = 2;
    int expectedResult = 2;

    // Act //When
    int result = calculator.integerDivision(dividend, divisor);

    // Assert //Then
    assertEquals(expectedResult, result, ()-> "4/2 did not produce 2");
  }

  //@Disabled("TODO: Still need to work on it")
  @DisplayName("Division by zero")
  @Test
  void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrownArithmeticException(){
    // Arrange // Given
    int dividend = 4;
    int divisor = 0;

    // Acct and Assert
    assertThrows(ArithmeticException.class, ()-> {
      calculator.integerDivision(dividend, divisor);
    });
  }

  @DisplayName("Test 5-2")
  @Test
  void testIntegerSubtraction_WhenFiveSubtrahendByTwo_ShouldReturnThree(){
    int result = calculator.integerSubtraction(5,2);
    assertEquals(3, result, () -> "5-2 did not produce 3");
  }
}
