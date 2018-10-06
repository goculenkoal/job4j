package ru.job4j.array;
/**
* CheckTest.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByTrueThenTrue1() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse1() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

//    @Test
    public void whenDataNotMonoByTrueThenFalse2() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    } //
}
