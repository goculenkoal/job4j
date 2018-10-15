package ru.job4j.array;
/**
* CheckArray.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Check {
	/**
     * @param data - input array
     * @return result - true or false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
	        if (data[0] != data[i]) {
			result = false;
			break;
			}
       }
        return result;
    }

}