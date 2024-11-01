package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test Math operator in calculator class")
public class DemoRepeatedTest {
  Calculator calculator;

  @BeforeAll
  static void setup() {
    System.out.println("Executing @BeforeAll  method");
  }

  @AfterAll
  static void cleanup() {
    System.out.println("Executing  @AfterAll   method");
  }

  @BeforeEach
  void beforeEachTestMethod() {
    calculator = new Calculator();
    System.out.println("Executing  @BeforeEach  method");
  }

  @AfterEach
  void afterEachTestMethod() {
    System.out.println("Executing  @AfterEach  method");
  }

  @DisplayName("Division by zero")
  @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of {totalRepetitions}")
  void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrownArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo) {


    System.out.println("Running " + testInfo.getTestMethod().get().getName());
    System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition() +
        " of " + repetitionInfo.getTotalRepetitions());

    // Arrange // Given
    int dividend = 4;
    int divisor = 0;

    // Acct and Assert
    assertThrows(ArithmeticException.class, () -> {
      calculator.integerDivision(dividend, divisor);
    });
  }

}
