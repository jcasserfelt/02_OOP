package Sprint5.Generics.Skoj;

import Husdjurshotellet.Djur;

import java.util.ArrayList;
import java.util.List;


public class GenericThingy<T> { // man får skriva <T> det är okey
    T t;
    List<T> listan = new ArrayList<>();

    public void set(T typ) {
        this.t = typ;
    }

    public T get() {
        return this.t;
    }

}
