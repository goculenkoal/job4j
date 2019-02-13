package ru.job4j.singleton;
import ru.job4j.tracker.Item;

/**
 * private static final class. Lazy loading.
 */

public class TrackerSinglePrivateStaticFinalLazyLoading {
    private TrackerSinglePrivateStaticFinalLazyLoading() {
    }

    public static TrackerSinglePrivateStaticFinalLazyLoading getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivateStaticFinalLazyLoading INSTANCE = new TrackerSinglePrivateStaticFinalLazyLoading();
    }

    public static void main(String[] args) {
        TrackerSinglePrivateStaticFinalLazyLoading tracker = TrackerSinglePrivateStaticFinalLazyLoading.getInstance();
    }
}
