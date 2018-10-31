package ru.job4j.array;
/**
 * Сортировка пузырьком.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */

    public class BubbleSort {
    /**
     * @param array - input array
     * @return result - sort array
     */
        public int[] sort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap2(array, j, j + 1);
                    }
                }
            }
            return array;
        }

        static void swap2(int[] a, int left, int right) {
            int temp = a[left];
            a[left] = a [right];
            a[right] = temp;
        }
    }