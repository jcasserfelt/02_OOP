package Enums_ETC;

public class EnumIKlass {
    public enum RomSif {
        I(1), V(5), X(10), L(50), C(10), D(500), M(1000);
        int numericValue;

        RomSif(int i) {
            numericValue = i;
        }
    }


}
