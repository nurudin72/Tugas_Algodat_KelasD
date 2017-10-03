package Algodatkelas;

public interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object theElement);
    public Object remove(int index);
    public void add(int index, Object theElement);
    @Override
    public String toString();
    public void trimToSize();
    public Object setSize(int no);
    public Object clear();  
    public void removeRange(int fromIndex, int toIndex);
    public Object clone (Object [] a);
}
