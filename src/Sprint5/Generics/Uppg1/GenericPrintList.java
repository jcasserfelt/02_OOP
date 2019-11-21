package Sprint5.Generics.Uppg1;

import java.util.List;

public class GenericPrintList<T> {

    public static <T> void printList(List<T> list) {

        for (T temp : list) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void printListWild(List<?> list) {
        for (Object temp : list) {

        }
    }
}

