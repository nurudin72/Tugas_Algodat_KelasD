package Algodatkelas;

public class ArrayLinearList implements LinearList {

    protected Object[] element, element2;
    protected int size;
    protected int capacity;
    int index;

    public ArrayLinearList(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];
        element = ChangeArrayLength1D.changeLength1D(element, 2 * capacity);
        index = 0;
    }

    public ArrayLinearList() {
        this(5);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {

        return size;
    }

    public void add(int index, Object theElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }
        if (size == element.length) {
            ArrayLinearList tam = new ArrayLinearList(size);
        }
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = theElement;
        size++;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        }
    }

    @Override
    public void trimToSize() {
        element2 = new Object[size];
        if (size < element.length) {
            System.arraycopy(element, 0, element2, 0, size);

            element = element2;
        }
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removeElement = element[index];
        for (int i = index + 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        element[--size] = null;
        return removeElement;
    }

    @Override
    public Object setSize(int newArray) {
        if (size > newArray) {
            int index = size - newArray;
            Object removedElement = element[index];
            for (int i = 0; i < index; i++) {
                for (int j = index + 1; j < size; j++) {
                    element[j - 1] = element[j];
                }

                element[--size] = null;
            }
            return removedElement;
        } else {
            element2 = new Object[newArray];
            System.arraycopy(element, 0, element2, 0, size);

            element = element2;
        }
        return size;
    }

    public Object set(int index, Object theElement) {
        return null;
    }

    @Override
    public Object clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        return size;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index];
    }

    @Override
    public int indexOf(Object theElement) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(theElement)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        
        for(int i=0; i<size; i++)
            if(element[i] == null)
                s.append("null, ");
            else
                s.append(element[i].toString() + ", ");
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        s.append("]");
        
        return new String(s);
    }
        @Override
    public void removeRange(int fromIndex, int toIndex) {
//        count++;
        int pindah = size - toIndex;
        System.arraycopy(element, toIndex, element, fromIndex, pindah);
        int newSize = size - (toIndex - fromIndex);
        while (size != newSize) {
            element[--size] = null;

        }
    }
    @Override
     public Object clone(Object [] a){  
        a = new Object[size];
        a = element.clone();
        return toString();
        }
}
