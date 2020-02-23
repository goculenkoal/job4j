package ru.job4j.list;

/**
 * @author Goculenko Alexandr (goculenko.al@gmail.com)
 * @version 0.001
 * @since 0.001
 */

import java.util.ArrayList;
import java.util.List;


public class ConvertMatrix2List {
    /**
     *
     * @param array - входящий двумерный массив данных
     * Создаем новый пустой список, проходим по массиву и записываем данные в список
     * @return list - возвращаем заполненный список
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] innerArray : array) {
            for (int data : innerArray) {
                list.add(data);
            }
        }
        return list;
    }
}