package ru.job4j.array;
/**
* Array.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Square {
    /**
     *
     * @param bound - value to initialization array
     * @return rst - array with value x2
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
     	for (int index = 0; index != rst.length; index++) {
			rst[index] = (index + 1) * (index + 1);
		}	
        return rst;
    }
}