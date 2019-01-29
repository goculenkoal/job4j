package ru.job4j.tracker;

public class FindByName implements UserAction {
	
	@Override
	public int key() {
		return 5;
	}
	
	@Override
	public void execute(Input input, Tracker tracker) {
		System.out.println("------------ Find item by name --------------");
        String name = input.ask("Please, Input item`s name : ");
        Item[] foundItems = tracker.findByName(name);
        if (foundItems.length > 0) {
            for (Item element : foundItems) {
                System.out.println("------------ Found Item:" + element);
            }
        } else {
            System.out.println("------------ Not Found item with same name " + name);
        }
    }
	
	@Override
	public String info() {
		return String.format("%s. %s", this.key(), "Find By Name");
	}
}