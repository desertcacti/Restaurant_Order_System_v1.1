package Functional_Interfaces;

import java.util.Collection;

public interface Printer<T> {

    static <T> void productListPrinter(Collection<T> array) {
        int i = 1;
        for(T element : array) {
            System.out.println("" + i + "." + element);
            i++;
                }
            }




    }


