package Sprint5.Generics.Uppg1;

public interface IGenericQue<T> {

    void put(T t);

    T get();

    int size();

}