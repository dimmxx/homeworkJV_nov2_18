package homework.homework12;

import java.util.Iterator;
import java.util.LinkedList;

public class Store extends LinkedList<Hero> {

    public boolean addAndSort(Hero hero, Store store){
        if (store.size() == 0) {
            store.add(hero);
            return true;
        } else if(store.get(size() - 1).getIntel() <= hero.getIntel()){
            store.addLast(hero);
            return true;
        } else if (store.get(0).getIntel() >= hero.getIntel()) {
            store.addFirst(hero);
            return true;
        } else {
            for (int i = 0; i < store.size(); i++){
                if(store.get(i).getIntel() < hero.getIntel()){
                    continue;
                } else {
                    store.add(i, hero);
                    return true;
                }
            }
        }
        return false;

    }

    public boolean remove(String name, Store list){
        Iterator<Hero> it = list.iterator();
        while (it.hasNext()){
            //Hero temp = it.next();
            if(it.next().getName().equals(name)){
                it.remove();
                return true;
            }
        }
        return false;
    }




}
