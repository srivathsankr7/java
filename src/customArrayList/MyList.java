package customArrayList;

public interface MyList<T> {

    int loadfactor = 3;
    void add(T data);
    T remove();
}
