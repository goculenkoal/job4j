package ru.job4j.figures;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Goculenko Alexandr (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    @Test
    /**
     * получаем ссылку на стандартный вывод в консоль.
     * создаем буфер для хранения вывода.
     * заменяем стандартный вывод на вывод в пямять для тестирования.
     * выполняем действия пишущие в консоль.
     * проверяем результат вычисления.
     */
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append("+     +")
                                .append("+     +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
	
	@Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("   *  ")
                                .append("  * * +")
                                .append(" *   * +")
                                .append("*******")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}