package ru.job4j.profession;

/**
* Реализация класса Profession и наследование от него.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Profession {
	private String name;
	private String professionName;
	
	public Profession() {
	}
	
	public Profession(String name, String professionName) {
		this.name = name;
		this.professionName = professionName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProfession() {
		return this.profession;
	}
	
	public void setProfession(String professionName) {
		this.professionName = professionName;
	}
}