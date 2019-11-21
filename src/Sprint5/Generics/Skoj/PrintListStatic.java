package Sprint5.Generics.Skoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintListStatic {

    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.print(t.toString() + " ");
        }
        System.out.println();
    }

    public static <T> void printStringList(List<? extends String> list) {
        for (String o : list) {
            System.out.print(o.toString() + " ");
        }
    }


    public static void main(String[] args) {
        List<String> stringlist = Arrays.asList("I", "code", "therefore", "I", "am");
        List<Integer> intlist = Arrays.asList(1, 2, 3);

        PrintListStatic.printList(intlist);
        PrintListStatic.printList(stringlist);
//        printStringList(stringlist);
        //printStringList(intlist);
    }

}

