package Sprint5.Generics.Skoj;

import java.util.ArrayList;
import java.util.List;

public class GenericQue<T> implements IGenericQue {

    T t;
    List<T> lista = new ArrayList<>();

    @Override
    public void put() {

        lista.add(t);
    }

    @Override
    public T take() {
        T temp = lista.get(0);
        lista.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return lista.size();
    }
}