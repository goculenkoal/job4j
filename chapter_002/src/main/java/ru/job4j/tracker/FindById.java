package ru.job4j.tracker;

public class FindById extends BaseAction {
	
	public FindById(int key, String name) {
		super(key, name);
	}
	
	@Override
	public void execute(Input input, Tracker tracker) {
		System.out.println("------------ Search by id Item ------------");
        System.out.println("------------ Input id Item ------------");
        String id = input.ask("Please, input item id:" + " ");
        Item foundItm = tracker.findById(id);
        if (foundItm != null) {
            System.out.println("-------Item found: " + foundItm + " ");
        } else {
            System.out.println("----------- Not found Item--------");
        }
	}
}