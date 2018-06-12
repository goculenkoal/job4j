/**
* Factorial calculation.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

package ru.job4j.loop;

public class Factorial {
	public int calcFactorial(int n) {
		int factorial = 1;
		for (int index = 1; index <= n; index++) {
			factorial *= index;
		}
		return factorial;
	}
}