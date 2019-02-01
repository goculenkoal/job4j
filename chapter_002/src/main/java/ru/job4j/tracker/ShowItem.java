package ru.job4j.tracker;

public class ShowItem extends BaseAction {

    public ShowItem(int key, String name) {
        super(key,name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {

        System.out.println("------------ Вывод всех заявок --------------");
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s. %s", "------------ Item`s Id : " + item.getId(), "Item`s name : " + item.getName()));
        }
    }
}