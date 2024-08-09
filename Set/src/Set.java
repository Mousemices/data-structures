import java.util.ArrayList;

public class Set<T> {
    private final ArrayList<T> elements;

    public Set() {
        this.elements = new ArrayList<>();
    }

    public boolean add(T element) {
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
}
