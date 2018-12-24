package ru.job4j.tracker;

/**
 * Реализация класса StartUITest.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    /**
     * Создаём Tracker
     * Создаем StubInput с последовательностью действий(производим замену заявки) - (0 - add), add(Item item) , Item item - name, description), 6 - exit
     * Создаем StartUI и вызываем метод init(), init() - инициализация файла, точка входа для запуска.
     * Проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
     */
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    @Test
    /**
     * Создаём Tracker
     * Напрямую добавляем заявку[tracker.add(name, desc)]
     * Создаем StubInput с последовательностью действий(производим замену заявки) - (2 - edit), replace(String id - item.getId(), Item item - name, description), 6 - exit
     * Создаем StartUI и вызываем метод init(), init() - инициализация файла, точка входа для запуска.
     * Проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
     */
    public void whenUpdateTheTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "desc replace", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    /**
     * Создаём Tracker
     * Напрямую добавляем заявку[tracker.add(name, desc)]
     * Создаем StubInput с последовательностью действий(производим удаление заявки) - (3 - delete), delete(String id) - item.getId(), 6 - exit
     * Создаем StartUI и вызываем метод init(), init() - инициализация файла, точка входа для запуска.
     * Проверяем, что заявка удалена - nullValue.
     */
    public void whenDeleteItemItemIsRemoved() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name ", "test desc"));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}