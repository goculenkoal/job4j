package ru.job4j.singleton;
import ru.job4j.tracker.Item;

/**
 * static final field. Eager loading.
 * сразу создаем и инициализируем объект.
 */

public class TrackerSingleStaticFinalEagerLoading {
    private static final TrackerSingleStaticFinalEagerLoading INSTANCE = new TrackerSingleStaticFinalEagerLoading();

    private TrackerSingleStaticFinalEagerLoading() {
    }

    public static TrackerSingleStaticFinalEagerLoading getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleStaticFinalEagerLoading tracker = TrackerSingleStaticFinalEagerLoading.getInstance();
    }
}
