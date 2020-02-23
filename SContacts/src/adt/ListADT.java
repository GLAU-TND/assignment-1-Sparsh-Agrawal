package adt;

public interface ListADT<E>
{
    void add(E item);
    E getData(int index);
    E remove();
}
