package homework.homework13;

//implementation of ArrayList

import java.util.*;
import java.util.function.UnaryOperator;

public class DimaCollectionArrayList  {

    private DogClass[] array;
    private int counter = 0;

    public DimaCollectionArrayList(){
        array = new DogClass[3];
    }

    public int getCounter() {
        return counter;
    }

    public int size(){
        return array.length;
    }

    public void ensureCapacity(){
        if(counter == array.length){
            DogClass temp[] = new DogClass[(array.length*3/2) + 1];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
            temp = null;
        }
    }

    public void remove(int index){
        for (int i = index; i < counter - 1; i++){
            array[i] = array[i + 1];
        }
        array[counter - 1] = null;
        counter--;
    }

    public void add(DogClass item){
        ensureCapacity();
        array[counter] = item;
        counter++;
    }

    public void add(int index, DogClass dog){
        ensureCapacity();
        if(index > counter){
            index = counter;
        }
        for(int i = counter - 1; i >= index; i--){
            array[i + 1] = array[i];
        }
        array[index] = dog;
        counter++;
    }

    public DogClass get(int pos){
        return array[pos];
    }


    public void printOut(){
        for(int i = 0; i < counter; i++){
            System.out.println("Cell# " + i + " " + array[i].toString());
        }
    }


    public Object set(int i, Object o) {
        return null;
    }

    public void sort(Comparator comparator){
        for(int i = 0; i < counter - 1; i++){
            for (int k = 0; k < counter - 1 - i ; k++){
                if(comparator.compare(array[k], array[k + 1]) == 1){
                    DogClass temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }

    }

    public void clear() {

    }

    public Iterator iterator() {
        return new Iterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < counter && array[currentIndex] != null;
            }
            @Override
            public DogClass next() {
                return array[currentIndex++];
            }
        };
    }

    public boolean isEmpty() {
        return false;
    }


    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }


    public boolean addAll(Collection collection) {
        return false;
    }


    public boolean addAll(int i, Collection collection) {
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }



}
