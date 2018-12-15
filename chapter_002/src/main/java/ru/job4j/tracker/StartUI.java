package ru.job4j.tracker;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для отображения всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа меню для отображения всех заявок.
     */
    private static final String EDIT = "2";

    /**
     * Константа меню для отображения всех заявок.
     */
    private static final String DEL = "3";

    /**
     * Константа меню для поиска по id.
     */
    private static final String FINDID = "4";

    /**
     * Константа меню для поиска по имени.
     */
    private static final String FINDNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showItems();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DEL.equals(answer)) {
                this.del();
            } else if (FINDID.equals(answer)) {
                this.findID();
            } else if (FINDNAME.equals(answer)) {
                this.findName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с Id : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует добавление новый заявки в хранилище.
     */
    private void showItems() {
        System.out.println("------------ Вывод всех заявок --------------");
        Item[] allItems = this.tracker.findAll();
        for (Item element : allItems) {
            System.out.println(element);
        }
    }

    /**
     * Метод реализует редактирование заявки в хранилище.
     */
    private void edit() {
        System.out.println("------------ Редактирование заявки ------------");
        String id = this.input.ask("Введите ID редактируемой заявки: ");
        String name = this.input.ask("Введите новое имя заявки: ");
        String desc = this.input.ask("Введите новое описание заявки: ");
        Item item = new Item(name, desc);
        if (this.tracker.replace(id, item)) {
          System.out.println("--------------- Заявка заменена ---------------");
         } else {
          System.out.println("--------- Заявка с таким ID не найдена --------");
      }
  }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    private void del() {
        System.out.println("------------ Удаление заявки ------------");
        System.out.println("------------ Введите id заявки для удаления ------------");
        String id = this.input.ask("Ввести id заявки: ");
        if (this.tracker.delete(id)) {
            System.out.println("-------Удалена--------");
        } else {
            System.out.println("----------- Не найдена--------");
        }
    }


    /**
     * Метод реализует поиск заявки по Id.
     */
    private void findID() {
        System.out.println("------------ Поиск по id заявки ------------");
        System.out.println("------------ Введите id заявки для поиска ------------");
        String id = this.input.ask("Ввести id заявки: ");
        Item foundItm = this.tracker.findById(id);
        if (foundItm != null) {
            System.out.println("-------Найдена заявка: " + foundItm + " ");
        } else {
            System.out.println("----------- Не найдена--------");
        }
    }

    public void findName() {
        System.out.println("------------ Найти заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки : ");
        Item[] foundItems = this.tracker.findByName(name);
        if (foundItems.length > 0) {
            for (Item element : foundItems) {
                System.out.println("------------ Найдена заявка с " + element + " --------------");
            }
        } else {
            System.out.println("------------ В системе не найдена заявка с именем " + name);
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - Добавить заявку");
        System.out.println("1 - Вывести список всех заявок");
        System.out.println("2 - Редактирование заявки.");
        System.out.println("3 - Удаление заявки.");
        System.out.println("4 - Поиск заявки по ID");
        System.out.println("5 - Поиск заявки по имени");
        System.out.println("6 - Выход");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}