package ru.job4j.collection;

/**
 * @author Goculenko Alexandr (goculenko.al@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import java.util.ArrayList;

public class UsageArrayList {
    /**
     * Класс с реализацией тестового варианта ArrayList и выводом @names чз цикл for each
     */
    public static void main(String[] arg) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("test1");
        names.add("test2");
        names.add("test3");
        for (String prtnames : names) {
            System.out.println(prtnames);

        }
    }
}