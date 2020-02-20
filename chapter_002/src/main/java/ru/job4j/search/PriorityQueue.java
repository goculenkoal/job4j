package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *
     * @param newTask - входящий параметр
     * Условие проверяется по полю приоритет. 1 - выше .....10 - ниже
     * Сравнивается приоритет входящего значения с текущим, если приоритет текущего элемента больше по значению, то
     * входящий значение записывается в начало списка, а остальные элементы сдвигаются на +1, если нет, то вставка происходит
     * после индекса, у которого значение приоритета выше.
     */
    public void put(Task newTask) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() >= newTask.getPriority()) {
                break;
            } else {
                index++;
            }
        }
        this.tasks.add(index, newTask);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
