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
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || (data[0][0] != data[data.length - 1 - i][i])) {
                if ((data[data.length - 1 - i][i] != data[data.length - i][i - 1])) {

                        result = false;
                        break;
                }

            }
        }
        return result;
    }
}

