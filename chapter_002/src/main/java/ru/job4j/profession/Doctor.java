package ru.job4j.profession;

/**
* Реализация класса Doctor.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Doctor extends Profession {
    public Diagnosis threat(Patient patient) {
		return new Diagnosis();
	}
}
