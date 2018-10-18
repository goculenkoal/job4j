package ru.job4j.array;
/**
 * CheckArray.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i] || (data[1][1] != data[data.length - 1 - i][i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}

