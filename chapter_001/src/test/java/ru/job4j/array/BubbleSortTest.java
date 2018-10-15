package ru.job4j.array;
/**
 * CheckArray.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenArraySort5Elemets() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {5, 1, 2, 7, 3};
        int[] result = bubble.sort(input);
        assertThat(result, is(new int[] {1, 2, 3, 5, 7}));
    }

    @Test
    public void whenArraySort7Elemets() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {5, 4, 3, 2, 1, 1, 4};
        int[] result = bubble.sort(input);
        assertThat(result, is(new int[] {1, 1, 2, 3, 4, 4, 5}));
    }

}
