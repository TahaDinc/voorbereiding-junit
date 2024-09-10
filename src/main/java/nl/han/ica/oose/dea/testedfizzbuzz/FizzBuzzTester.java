package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class FizzBuzzTester {
    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    @DisplayName("Test execute method with valid input")
    void executeWithValidIntTest(){
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    @DisplayName("Test execute method with input divisible by 3")
    void executeWithDivisibleBy3Test() {
        // Act
        var testValue = sut.execute(9);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    @DisplayName("Test execute method with input divisible by 5")
    void executeWithDivisibleBy5Test() {
        // Act
        var testValue = sut.execute(10);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    @DisplayName("Test execute method with input divisible by 15")
    void executeWithDivisibleBy15Test() {
        // Act
        var testValue = sut.execute(30);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}
