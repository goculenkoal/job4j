package ru.job4j.tracker;

public class EditItem extends BaseAction {

    public EditItem(int key, String name) {
        super(key, name);
    }
 
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Editing item------------");
        String id = input.ask("Please, Input ID item: ");
        String name = input.ask("Please, Input new item`s name: ");
        String desc = input.ask("Please, Input new item`s description: ");
        Item item = new Item(name, desc);
        if (tracker.replace(id, item)) {
          System.out.println("--------------- Item replace ---------------");
         } else {
          System.out.println("--------- Item not found with same ID --------");
      }
    }
}