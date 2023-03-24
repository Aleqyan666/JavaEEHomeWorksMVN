package org.javaEEhomeworks.listImplementations;

import java.util.*;

public class HaykArrayList<E> implements List<E> {
    public static final int INITIAL_CAPACITY = 16;
    private int size;
    public E[] data = (E[])new Object[INITIAL_CAPACITY];

    public HaykArrayList(int size, E[] data) {
        this.size = size;
        this.data = data;
    }

    public HaykArrayList(E[] myObjects){
        for (int i = 0; i < myObjects.length; i++){
            add(myObjects[i]);
        }
    }

    /**
     * checks if the arraylist is empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    /**
     * converts the arraylist to array
     * @return Array
     */
    @Override
    public Object[] toArray() {
        return Arrays.stream(data).toArray();
    }



    /**
     * @param index index at which the specified element is to be inserted
     * @param e element to be inserted
     */
    @Override
    public void add(int index, E e) {
        if (index < 0  || index > size - 1){
            throw new IndexOutOfBoundsException
                    ("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
    }

    /**
     * ensure the capacity of given arraylist
     */
    public void ensureCapacity(){
        if (size >= data.length){
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data,0,newData,0,size);
            data = newData;
        }
    }

    /**
     * clears the arraylist
     */
    @Override
    public void clear() {
      data =  (E[])new Object[INITIAL_CAPACITY];
      size = 0;
    }

    /**
     * returns the size of arraylist
     * @return size
     */
    @Override
    public int size() {
       return size;
    }

    /**
     * @param o element whose presence in this list is to be tested
     * @return true/false
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++){
           if ( o.equals(data[i])) {
               return true;
           }
        }
        return false;
    }

    /**
     * checks the validity of the given index
     * @param index
     */
    private void checkIndex(int index){
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException
                    ("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * @param index index of the element to return
     * @return index
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    /**
     * @param o element to search for
     * @return index of found onject
     */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(data[i])){
                return i;
            }
        return -1;
    }

    /**
     * @param e element to search for
     * @return the last index of the occurrence
     */
    @Override
    public int lastIndexOf(Object e) {
        for (int i = size - 1; i >= 0; i--){
            if (e.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return value of the changed element
     */
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E old = data[index];
        data[index] = element;
        return old;
    }

    /**
     *
     * @param index the index of the element to be removed
     * @return removes the element by using its index
     */
    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int j = index; j < size - 1; j++){
            data[j] = data[j+1];
            data[size - 1] = null;
            size--;
        }
        return e;
    }

    /**
     *
     * @return string of arraylist
     */
    @Override
    public String toString() {
              StringBuilder result = new StringBuilder("[");

              for (int i = 0; i < size; i++) {
                    result.append(data[i]);
                    if (i < size - 1) result.append(", ");
                  }

              return result.toString() + "]";
            }

    /**
     * Trims the capacity of this ArrayList instance to be the list's current size.
     * An application can use this operation to minimize the storage of an ArrayList instance
     */
    public void trimToSize() {
      if (size != data.length) {
        E[] newData = (E[])(new Object[size]);
                   System.arraycopy(data, 0, newData, 0, size);
                    data = newData;
                  }
            }

     @Override
    public java.util.Iterator<E> iterator() {
              return new ArrayListIterator();
            }

           private class ArrayListIterator
        implements java.util.Iterator<E> {
              private int current = 0;

               /**
                * if the given object is the last in arraylist
                * @return true/false
                */
              @Override
              public boolean hasNext() {
                    return current < size;
                  }

              @Override
             public E next() {
                  return data[current++];
              }


               /**
                * removes an element
                */
               @Override
              public void remove() {
                  if (current == 0)
                         throw new IllegalStateException();
                    HaykArrayList.this.remove(--current);
                  }
            }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

}
