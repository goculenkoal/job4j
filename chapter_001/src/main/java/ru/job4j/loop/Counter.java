package ru.job4j.loop;
/**
* Package for point task.
*
* @author Goculenko Alexandr (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Counter {
	/**
	 * Сумма четных чисел.
	 * @param start, @param second.
	 * @return even sum
	 */
	public int add(int start, int second) {
		int sum = 0;
		for (int i = start; i <= second; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
