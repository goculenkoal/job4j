package ru.job4j.loop;
/**
* Package for point task.
*
* @author Goculenko Alexandr (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sumEven = new Counter();
        int result = sumEven.add(0, 10);
        assertThat(result, is(30));
    }
}