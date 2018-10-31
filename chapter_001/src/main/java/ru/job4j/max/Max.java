package ru.job4j.max;
/**
* Max of two values.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Max {
	/**
	 * @param first
	 * @param second
	 * @return max of two value
	 */
	public int max(int first, int second) {
        return (first > second) ? first : second;
	}

	/**
	 * @param first
	 * @param second
	 * @param third
	 * @return - max of three value
	 */
	public int max(int first, int second, int third) {
		return this.max(max(first, second), third);
	}	
}