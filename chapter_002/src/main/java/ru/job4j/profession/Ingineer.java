package ru.job4j.profession;

/**
* Реализация класса Ingineer.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Ingineer extends Profession {
    public House builtHouse(House house) {
		return new House();
	}
}
