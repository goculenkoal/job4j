package ru.job4j.tracker;

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];
	private int position = 0;

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions[position++] = new AddItem(0, "Add Item");
        this.actions[position++] = new ShowItem(1, "Show All Items");
        this.actions[position++] = new EditItem(2, "EditItem");
        this.actions[position++] = new DeleteItem(3, "Delete Item");
        this.actions[position++] = new FindById(4, "Find By ID");
        this.actions[position++] = new FindByName(5, "Find By Name");
    }

    /**
     * Метод для получения массива меню.
     *
     * @return Длина массива.
     */
    public int getActionsLength() {
        return this.actions.length;
}

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Метод реализует вызов меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
