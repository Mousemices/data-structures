package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SetIterator<T> implements Iterator<T> {
    private final ArrayList<T> elements;
    private int index = 0;

    public SetIterator(ArrayList<T> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return this.index < elements.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are NO more elements to iterate over.");
        }

        return elements.get(index++);
    }
}
