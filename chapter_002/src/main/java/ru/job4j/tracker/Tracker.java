package ru.job4j.tracker;

import java.util.*;
/**
* Реализация класса Tracker.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Tracker {
	/**
	 * Массив для хранение заявок.
	 */
	private final Item[] items = new Item[100];

	/**
	 * Указатель ячейки для новой заявки.
	 */
	private int position = 0;

	/**
	 * Случайное число. Используется для генерации уникального ключа.
	 */
	private static final Random RN = new Random();

	/**
	 * Генерация уникального ключа для заявки.
	 * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
	 * String.valueOf() - конвертация числовых значений в Стринг.
	 *
	 * @return - unic key.
	 */
	private String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	/**
	 * Метод реализации добавления заявки в хранилище
	 *
	 * @param item - запись новой заявки.
	 */
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}

	/**
	 * Метод реализации перезаписи заявки.
	 *
	 * @param item - запись новой заявки.
	 * String.valueOf() - конвертация числовых значений в Стринг.
	 */
	public boolean replace(String id, Item item) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (this.items[i].getId().equals(id)) {
				this.items[i] = item;
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Метод реализации удаления заявки.
	 * @param id - поиск заявки по id.
	 */
	public boolean delete(String id) {
		boolean result = false;
		for (int index = 0; index < position; index++) {
			if (this.items[index].getId().equals(id)) {
				System.arraycopy(items, index + 1, items, index, items.length - 1 - index);
				position--;
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Метод получения всех заявок.
	 * @return - возврат массива this.items без null элементов.
	 */
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		int resultPosition = 0;
		for (Item item : items) {
			if (item != null) {
				result[resultPosition++] = item;
			}
		}
		return result;
	}

	/**
	 * Метод получения списка заявок, у которых совпадает имя.
	 * @param name - имя заявки
	 * @return - возврат массива item без null элементов.
	 */
	public Item[] findByName(String name) {
		Item[] result = new Item[this.position];
		int resultPosition = 0;
		for (Item item :items) {
			if (item != null && item.getName().equals(name)) {
				result[resultPosition++] = item;
			}
		}
		return Arrays.copyOf(result, resultPosition);
	}
	
	/**
	 * Метод поиска по ID
	 * @param id - поиск по данному id
	 * @return result - возвращаем найденную заявку, если заявки не существует - возвращаем - null; 
	 */
	public Item findById(String id) {
		Item result = null;
	    for (Item item : items) {
			if (item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
}
	

