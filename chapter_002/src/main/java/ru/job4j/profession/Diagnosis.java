package ru.job4j.profession;

/**
* Реализация класса Diagnosis.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Diagnosis {
 	private String name;
	
	public Diagnosis() {
	}
	
	public Diagnosis(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
