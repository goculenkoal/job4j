package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Deleting item by ID ------------");
        System.out.println("------------ Input id item ------------");
        String id = input.ask("Please, Input id item: ");
        if (tracker.delete(id)) {
            System.out.println("------- Deleted --------");
        } else {
            System.out.println("----------- Not found --------");
        }
    }
}
	