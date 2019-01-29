package ru.job4j.tracker;

public class ShowItem implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

        System.out.println("------------ Вывод всех заявок --------------");
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s. %s", "------------ Item`s Id : " + item.getId(), "Item`s name : " + item.getName()));
        }
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Show All Items.");
    }
}