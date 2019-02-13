package ru.job4j.singleton;
import ru.job4j.tracker.Item;

/**
 * enum. Eager loading.
 */

public enum TrackerSingleEagerEnum {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleEagerEnum tracker =  TrackerSingleEagerEnum.INSTANCE;
    }
}

