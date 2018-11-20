package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription1", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription1", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1", 123L);
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2", 123L);
        tracker.add(item2);
        tracker.delete(item1.getId());
        assertThat(tracker.findAll()[0], is(item2));
    }

    @Test
    public void whenFindAllThenGetTrackerWithoutNullItems() {
        Tracker first = new Tracker();
        Tracker second = new Tracker();
        Item firstItem = new Item("test1", "testDescription1", 1L);
        first.add(firstItem);
        Item secondItem = new Item("test2", "testDescription2", 2L);
        first.add(secondItem);
        Item testItem = new Item("test3", "testDescription3", 3L);
        first.add(testItem);
        second.add(testItem);
        first.delete(firstItem.getId());
        first.delete(secondItem.getId());
        assertThat(first.findAll(), is(second.findAll()));
    }

    @Test
    public void whenFindItemByNameThenItemsWithThatName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("A", "Description of A0", 1L));
        tracker.add(new Item("B", "Description of B", 2L));
        tracker.add(new Item("C", "Description of C0", 3L));
        tracker.add(new Item("A", "Description of A1", 15L));
        tracker.add(new Item("C", "Description of C1", 31L));
        tracker.add(new Item("A", "Description of A2", 151L));
        Item[] result = tracker.findByName("A");
        boolean resultIs = false;
        for (Item item : result) {
            resultIs = item.getName().equals("A") | resultIs;
        }
        assertThat(resultIs, is(true));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription1", 37L);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(item, is(result));
    }









}
