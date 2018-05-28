/**
* ConverterTest.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/
package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест Корвертора валюты.
 */
public class ConverterTest {
	/**
    * Тест метода rubleToDollar().
    */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60); // выполнение метода rubbleToDollar и запись в переменную result
        assertThat(result, is(1)); 
    }
    /**
    * Тест метода rubleToEuro().
    */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70); // выполнение метода rubbleToEuro и запись в переменную result
        assertThat(result, is(1));
    }
	/**
    * Тест метода rubleToDollar().
    */
    @Test
    public void when3DollarToRubleThen180() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(3); // выполнение метода dollarToRuble и запись в переменную result
        assertThat(result, is(180)); 
    }
	/**
    * Тест метода rubleToEuro().
    */
    @Test
    public void when3EuroToRubleThen210() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(3); // выполнение метода euroToRuble и запись в переменную result
        assertThat(result, is(210)); 
    }
}
