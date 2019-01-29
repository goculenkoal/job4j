package ru.job4j.tracker;

public class FindById implements UserAction {
	
	@Override
	public int key() {
		return 4;
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
	
	@Override
	public String info() {
		return String.format("%s. %s", this.key(), "Find By ID");
	}
}