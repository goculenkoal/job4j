package ru.job4j.collection;
/**
 * @author Goculenko Alexandr (goculenko.al@gmail.com)
 * @version 0.001
 * @since 0.001
 */

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    /**
     * Преобразовываем список с массивом чисел в один список чисел.
     * @param list - входящий лист массивов
     * @return rsl - возвращаем один лист типа Integer
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] innerArray : list) {
            for (int data : innerArray) {
                rsl.add(data);
            }
        }
        return rsl;
    }
}


