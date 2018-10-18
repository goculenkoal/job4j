package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
public class ArrayDuplicateTest {
    @Test
    public void whenArrayHasDuplicatesThenDropIt() {
        String[] input = {"1", "2", "3", "3", "4"};
        String[] except = {"1", "2", "3", "4"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
