package customArrayList;

public class MyArrayList<T> implements MyList<T> {

    private int size;
    private T[] data;
    private int index;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int size) {
        this.size = size;
        this.data =(T[])new Object[size];
        this.index = 0;
    }

    @Override
    public void add(T value) {
        if(size >= index + loadfactor) {
            resize();
        }
        data[index] = value;
        index++;
    }

    @Override
    public T remove() {
        T value = null;
        if(!isEmpty()) {
            value = data[index-1];
            index--;
        }
        return value;
    }

    private boolean isEmpty() {
        return index == 0 ? true : false;
    }

    private void resize() {
        size = size * 2;
        T[] newdata =(T[]) new Object[size];
        for(int i  = 0; i < index; i++) {
            newdata[i] = data[i];
        }
        data = newdata;
    }
}
