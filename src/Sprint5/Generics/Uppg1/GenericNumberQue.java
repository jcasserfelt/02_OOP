package Sprint5.Generics.Uppg1;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberQue<T extends Number> implements IGenericQue<T> {

    //T t;
    List<T> lista = new ArrayList<>();

    public T sum() {
        Double sum = 0.0;
        for (T temp : lista) {
            sum += temp.doubleValue();
        }
        return (T) sum;
    }

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
