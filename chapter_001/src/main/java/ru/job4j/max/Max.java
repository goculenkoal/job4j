/**
* Max of two values.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/
package ru.job4j.max;

public class Max {
	
	public int max(int first, int second) {
        return (first > second) ? first : second;
	}
	
	public int max(int first, int second, int third) {
	    return this.max(max(first, second), third);
	}	
}