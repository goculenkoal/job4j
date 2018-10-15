package ru.job4j.array;
/**
* TurnArray.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Turn {
	/**
     * @param array - input array
     * @return array - turn over array
     */
	public int[] turn(int[] array) {
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[array.length - 1 - i];
		    array[array.length - 1 - i] = array[i];
			array[i] = temp;
		}
		return array;
	}
}