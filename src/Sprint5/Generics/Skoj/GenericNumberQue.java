package Sprint5.Generics.Skoj;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberQue<T extends Number> implements IGenericQue<T> {

    T t;
    List<T> numberList = new ArrayList<>();

    @Override
    public void put() {
        numberList.add(t);
    }

    @Override
    public T take() {
        T temp = numberList.get(0);
        numberList.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return numberList.size();
    }

    public T sumList() {
        Double tot = 0.0;
        for (T t : numberList) {
            tot += t.doubleValue();
        }
        return (T) tot;
    }
}
