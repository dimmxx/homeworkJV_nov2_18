package homework.homework13;

import java.util.Comparator;

public class DogClassComparator implements Comparator <DogClass> {

    @Override
    public int compare(DogClass o1, DogClass o2) {
        return o1.getAge() > o2.getAge() ? 1 : -1;
    }


}
