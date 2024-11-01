package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;


@DisplayName("Test Math operator in calculator class")
public class CalculatorTest {
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
    assertEquals(expectedResult, result, () -> "4/2 did not produce 2");
  }

  //@Disabled("TODO: Still need to work on it")
  @DisplayName("Division by zero")
  @Test
  void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrownArithmeticException() {
    // Arrange // Given
    int dividend = 4;
    int divisor = 0;

    // Acct and Assert
    assertThrows(ArithmeticException.class, () -> {
      calculator.integerDivision(dividend, divisor);
    });
  }

  @DisplayName("Test 5-2")
  @ParameterizedTest
  //@MethodSource()
//  @CsvSource({
//      "33, 1, 32",
//      "10, 5, 5",
//      "3, 7, -4"
//  })
  @CsvFileSource(resources = "/integerSubtraction.csv")
  void testIntegerSubtraction_WhenFiveSubtrahendByTwo_ShouldReturnThree(int minuend, int subtrahend, int expectedResult) {
    int result = calculator.integerSubtraction(minuend, subtrahend);
    assertEquals(expectedResult, result, () -> "5-2 did not produce 3");
  }


//  private static Stream<Arguments> testIntegerSubtraction_WhenFiveSubtrahendByTwo_ShouldReturnThree() {
//    return Stream.of(
//        Arguments.of(33, 1, 32),
//        Arguments.of(10, 5, 5),
//        Arguments.of(3, 7, -4)
//    );
//  }

  @ParameterizedTest
  @ValueSource(strings = {"Adilson", "Muta", "Fuxe"})
  void valuedSourceDemonstration(String firstName) {
    System.out.println(firstName);
    assertNotNull(firstName);
  }
}
