package ru.job4j.array;
/**
 * MatrixCheck.
 *
 * @author Goculenko Alexander (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Проверяет. что слово начинается с префикса.
     * @param data - input array with 1 or 0
     * @return result - check diagonal elements - true or false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || (data[data.length - 1][0] != data[i][data.length - i - 1])) {
                        result = false;
                        break;
                }
            }
        return result;
        }
    }


