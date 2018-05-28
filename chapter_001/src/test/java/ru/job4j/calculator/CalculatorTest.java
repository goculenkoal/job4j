/**
* Calculator.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/
package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    /**
    * Test add.
    */@Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	/**
    * Test subtract.
    */@Test
    public void whenSubtractOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	
	/**
    * Test div.
    */@Test
    public void whenDivisionOneByOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
    * Test multiple.
    */@Test
    public void whenMultipleOneByOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
