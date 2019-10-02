package Enums_ETC;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //int test = RomerskaSiffror.C.ordinal();

        for (RomerskaSiffror temp : RomerskaSiffror.values()) {
            System.out.printf("%s\t%d\n", temp.name(), temp.numericValue);
        }
    }
}