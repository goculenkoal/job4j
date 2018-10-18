package ru.job4j.array;
/**
 * DropDublicate.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import java.util.Arrays;

public class ArrayDuplicate {
    /**
     * @param array - input array
     * @return array without dublicate
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
