package ComplexNumberTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ComplexNumberCalculator.ComplexNumber;

public class ComplexNumberTests {

    private static final Logger log = LoggerFactory.getLogger(ComplexNumberTests.class);

    @Test
    void complexNumberAddTwoArgsTest() {
        ComplexNumber complexNumber = new ComplexNumber(10, 5);
        complexNumber.add(2, 3);

        log.info("Complex number after addition with two arguments is real = {} and imaginary = {}",
                                             complexNumber.getReal(), complexNumber.getImaginary());

        Assertions.assertEquals(12.0, complexNumber.getReal(), 0.01);
        Assertions.assertEquals(8.0, complexNumber.getImaginary(), 0.01);
    }

    @Test
    void complexNumberAddTest() {
        ComplexNumber complexNumber = new ComplexNumber(5.5, 3.2);
        complexNumber.add(complexNumber);

        log.info("Complex number after addition with one argumnet is: real = {} and imaginary = {}",
                                             complexNumber.getReal(), complexNumber.getImaginary());

        Assertions.assertEquals(11.0, complexNumber.getReal(), 0.01);
        Assertions.assertEquals(6.4, complexNumber.getImaginary());
    }

    @Test
    void complexNumberSubtractTwoArgsTest() {
        ComplexNumber complexNumber = new ComplexNumber(4, 5.25);
        complexNumber.subtract(10.4, 13);

        log.info("Complex number after subtraction with two arguments is: real = {} and imaginary = {}",
                                                 complexNumber.getReal(), complexNumber.getImaginary());

        Assertions.assertEquals(-6.4, complexNumber.getReal(), 0.01);
        Assertions.assertEquals(-7.75, complexNumber.getImaginary(), 0.01);
    }

    @Test
    void complexNumberSubtractTest() {
        ComplexNumber complexNumber = new ComplexNumber(3.3, 5.32);
        complexNumber.subtract(complexNumber);

        log.info("Complex number after subtraction is: real = {} and imaginary = {}",
                              complexNumber.getReal(), complexNumber.getImaginary());

        Assertions.assertEquals(0.0, complexNumber.getReal(), 0.01);
        Assertions.assertEquals(0.0, complexNumber.getImaginary(), 0.01);
    }

}
