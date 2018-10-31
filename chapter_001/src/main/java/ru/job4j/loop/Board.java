package ru.job4j.loop;
/**
* Make psevdo chess board.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Board {
    /**
     * Конвертируем рубли в евро.
     * @param width - ширина доски, @param height - высота доски.
     * @return .
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String line = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == j % 2) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(line);
        }
        return screen.toString();
    }
}