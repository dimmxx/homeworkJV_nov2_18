package homework.homework13;

//implementation of ArrayList

import java.util.ArrayList;
import java.util.Comparator;

public class DimaCollectionArrayList {

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



}
