import java.util.ArrayList;
import java.util.Iterator;

import Iterator.SetIterator;


public class Set<T> implements Iterable<T> {
    private final ArrayList<T> elements;

    public Set() {
        this.elements = new ArrayList<>();
    }

    public boolean add(T element) {
        /*if(!this.contains(element)) {
            this.elements.add(element);
        }*/

        boolean duplicated = false;
        int index = 0;

        while (!duplicated && index < this.elements.size()) {
            if (this.elements.get(index).equals(element)) {
                duplicated = true;
            }

            index++;
        }

        if (!duplicated) {
            this.elements.add(element);
            return true;
        }

        return false;
    }

    public void insert(T element) {
        this.add(element);
    }

    public boolean remove(T element) {
        return this.elements.remove(element);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public int size() {
        return this.elements.size();
    }

    public int capacity() {
        return this.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void clear() {
        this.elements.clear();
    }

    public T[] toArray(T[] array) {
        return this.elements.toArray(array);
    }

    public Object[] toArray() {
        return this.elements.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return new SetIterator<>(elements);
    }
}
