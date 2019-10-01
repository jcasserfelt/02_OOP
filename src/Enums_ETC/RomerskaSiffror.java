package Enums_ETC;

public enum RomerskaSiffror {
    I(1), V(5), X(10), L(50), C(10), D(500), M(1000);
    int numericValue;

    RomerskaSiffror(int i) {
        numericValue = i;
    }
}
