package ru.job4j.singleton;
import ru.job4j.tracker.Item;

/**
 * static field. Lazy loading.
 */
public class TrackerSingleStaticLazyLoading {
    private static TrackerSingleStaticLazyLoading instance;

    private TrackerSingleStaticLazyLoading() {
    }

    public static TrackerSingleStaticLazyLoading getInstance() {
        if (instance == null) {
            instance = new TrackerSingleStaticLazyLoading();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleStaticLazyLoading tracker =  TrackerSingleStaticLazyLoading.getInstance();
    }
}
