package ru.job4j.loop;
/**
* Factorial calculation.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Factorial {
	/**
	 * @param n - input value .
	 * @return factorial of input value
	 */
	public int calcFactorial(int n) {
		int factorial = 1;
		for (int index = 1; index <= n; index++) {
			factorial *= index;
		}
		return factorial;
	}
}