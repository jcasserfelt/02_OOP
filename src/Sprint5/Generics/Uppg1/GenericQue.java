package Sprint5.Generics.Uppg1;

import java.util.ArrayList;
import java.util.List;

public class GenericQue<T> implements IGenericQue<T> {

    T t;
    List lista = new ArrayList<T>();

    @Override
    public void put(T t) {
        lista.add(t);
    }

    @Override
    public T get() {
        T temp = (T) lista.get(0);
        lista.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return lista.size();
    }
}
