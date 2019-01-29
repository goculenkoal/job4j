package ru.job4j.tracker;

public class DeleteItem implements UserAction {
	@Override
	public int key() {
		return 3;
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
	
	@Override
    public String info() {
        return String.format("%s. %s", this.key(), "Delete Item");
    }
}

	