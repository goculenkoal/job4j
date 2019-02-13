package ru.job4j.singleton;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SingleToneTest {
    @Test
    public void enumSingletonReturnOneObject() {
        TrackerSingleEagerEnum test1 = TrackerSingleEagerEnum.INSTANCE;
        TrackerSingleEagerEnum test2 = TrackerSingleEagerEnum.INSTANCE;
        assertThat(test1 == test2, is(true));
    }

    @Test
    public void privateStaticFinalLazySingletonReturnOneObject() {
        TrackerSinglePrivateStaticFinalLazyLoading test1 = TrackerSinglePrivateStaticFinalLazyLoading.getInstance();
        TrackerSinglePrivateStaticFinalLazyLoading test2 = TrackerSinglePrivateStaticFinalLazyLoading.getInstance();
        assertThat(test1 == test2, is(true));
    }

    @Test
    public void staticFinalEagerSingletonReturnOneObject() {
        TrackerSingleStaticFinalEagerLoading test1 = TrackerSingleStaticFinalEagerLoading.getInstance();
        TrackerSingleStaticFinalEagerLoading test2 = TrackerSingleStaticFinalEagerLoading.getInstance();
        assertThat(test1 == test2, is(true));
    }

    @Test
    public void staticLazySingletonReturnOneObject() {
        TrackerSingleStaticLazyLoading test1 = TrackerSingleStaticLazyLoading.getInstance();
        TrackerSingleStaticLazyLoading test2 = TrackerSingleStaticLazyLoading.getInstance();
        assertThat(test1 == test2, is(true));
    }
}

