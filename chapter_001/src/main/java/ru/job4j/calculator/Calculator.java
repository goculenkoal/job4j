/**
* Calculatщк.
*
* @author Goculenko Alexander (goculenko.al@gmail.com)
* @version $Id$
* @since 0.1
*/
package ru.job4j.calculator;

public class Calculator {
    private double result; // объявление переменной для хранения результата
     /**
     * Method add.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

	/**
     * Method div.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
	/**
     * Method multiple.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
	/**
     * Method getResult.
     * @return result operation.
     */
    public double getResult() {
        return this.result;
    }
}