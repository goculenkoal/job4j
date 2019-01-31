package ru.job4j.tracker;

/**
 * Реализация класса StartUITest.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class StartUITest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    /**
     * Создаём Tracker
     * Создаем StubInput с последовательностью действий(производим замену заявки) - (0 - add), add(Item item) , Item item - name, description), 6 - exit
     * Создаем StartUI и вызываем метод init(), init() - инициализация файла, точка входа для запуска.
     * Проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
     */
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
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
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "desc replace", "y"});
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
        Input input = new StubInput(new String[]{"3", item.getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item35 = tracker.add(new Item("testname", "testdesc"));
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(input, tracker).init();
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("0. Add Item").append(System.lineSeparator())
                                .append("1. Show All Items.").append(System.lineSeparator())
                                .append("2. EditItem").append(System.lineSeparator())
                                .append("3. Delete Item").append(System.lineSeparator())
                                .append("4. Find By ID").append(System.lineSeparator())
                                .append("5. Find By Name").append(System.lineSeparator())
                                .append("------------ Вывод всех заявок --------------")
                                .append(System.lineSeparator())
                                .append("------------ Item`s Id :" + " " + item35.getId() + "." + " " + "Item`s name : " + item35.getName()).append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item[] testItems = new Item[3];
        testItems[0] = new Item("test1", "testdesc1");
        testItems[1] = new Item("test2", "testdesc2");
        testItems[2] = new Item("test1", "testdesc3");
        for (Item items:testItems) {
            tracker.add(items);
        }
        String searchName = "test1";
        Input input = new StubInput(new String[] {"5", searchName, "y"});
        new StartUI(input, tracker).init();
        assertThat(
                this.out.toString(),
                is(new StringBuilder()
                        .append("0. Add Item").append(System.lineSeparator())
                        .append("1. Show All Items.").append(System.lineSeparator())
                        .append("2. EditItem").append(System.lineSeparator())
                        .append("3. Delete Item").append(System.lineSeparator())
                        .append("4. Find By ID").append(System.lineSeparator())
                        .append("5. Find By Name").append(System.lineSeparator())
                        .append("------------ Find item by name --------------").append(System.lineSeparator())
                        .append("------------ Found Item:" + testItems[0]).append(System.lineSeparator())
                        .append("------------ Found Item:" + testItems[2]).append(System.lineSeparator())
                        .toString()
                )
        );
    }
}