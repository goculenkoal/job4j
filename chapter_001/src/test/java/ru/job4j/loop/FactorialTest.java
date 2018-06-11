/**
* Factorial calculation.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial five = new Factorial();
		int result = five.calcFactorial(5);
        assertThat(result, is(120));
		}

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial zero = new Factorial();
		int result = zero.calcFactorial(0);
        assertThat(result, is(1));
		}
}