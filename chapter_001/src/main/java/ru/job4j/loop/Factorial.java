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
		int result = 1;
		if (n == 0) {
			break; 
			} else {
			for (int i = 1; i <= n; i++) {
				result = result * i;
				}
			}
			return result;
	}
}