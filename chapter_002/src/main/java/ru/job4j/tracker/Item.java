package ru.job4j.tracker;
/**
* Реализация класса Item.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Item {
		/**
	* Имя заявки.
	*/
	private String name;
	/**
	* Описание заявки.
	*/
	private String desc;
	/**
	* Время создания заявки.
	*/
	private long create;
	/**
	* Комментарий к заявке.
	*/
	private String[] comment;
	/**
	* Уникальный ключ заявки.
	*/
	private String id;
	/**
	* Конструктор без параметров.
	*/
	public Item() {
	}
	
	/**
	* Конструктор с параметрами:
	* @param name - name
	* @param desc - description
	* @param create - time of create
	*/
	public Item(String name, String desc, long create) {
		this.name = name;
		this.desc = desc;
		this.create = create;
	}
	
	/**
	* Геттеры и сеттеры для полей класса.
	*/
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public long getCreate() {
		return this.create;
	}
	
	public void setCreate(long create) {
		this.create = create;
	}
	
	public String[] getComment() {
		return this.comment;
	}
	
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}