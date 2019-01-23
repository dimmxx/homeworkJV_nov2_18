package homework.homework13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DimaCollectionLinkedList implements List {

    private class Node {
        private DogClass element;
        protected Node nextN;
        private Node previousN;

        public Node(DogClass element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }

    private Node firstNode;
    private Node lastNode;
    private int currentSize = 0;

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    public boolean add(DogClass element) {
        if (firstNode == null) {
            Node node = new Node(element);
            firstNode = node;
            lastNode = node;
            node.previousN = null;
            currentSize++;
            return true;
        } else if (firstNode != null) {
            Node node = new Node(element);
            lastNode.nextN = node;
            node.previousN = lastNode;
            lastNode = node;
            currentSize++;
            return true;
        }
        return false;
    }

    @Override
    public void add(int index, Object element) {
        Node node = new Node((DogClass) element);
        Node current;
        if (index >= currentSize) {
            current = lastNode;
            node.previousN = current;
            current.nextN = node;
            lastNode = node;
            currentSize++;
        } else if (index == 0) {
            firstNode.previousN = node;
            node.nextN = firstNode;
            node.previousN = null;
            firstNode = node;
            currentSize++;
        } else {
            current = firstNode;
            for (int i = 0; i < index; i++) {
                current = current.nextN;
            }
            node.previousN = current.previousN;
            node.nextN = current;
            node.previousN.nextN = node;
            current.previousN = node;
            currentSize++;
        }
    }

    @Override
    public Object remove(int index) {
        Node current = firstNode;
        if (index == 0) {
            firstNode = firstNode.nextN;
            firstNode.previousN = null;
            currentSize--;
            return current;
        } else if (index == currentSize - 1) {
            current = lastNode;
            lastNode = lastNode.previousN;
            lastNode.nextN = null;
            currentSize--;
            return current;
        } else if (index >= currentSize) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.nextN;
            }
            current.previousN.nextN = current.nextN;
            current.nextN.previousN = current.previousN;
            currentSize--;
            return current;
        }
    }

    public StringBuilder printOut() {
        StringBuilder sb = new StringBuilder();
        Node current = firstNode;
        for (int i = 0; i < currentSize; i++) {
            sb.append(current.element);
            sb.append(" Node#" + i);
            current = current.nextN;
        }
        return sb;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        if (currentSize == 0)
            return true;
        else return false;
    }

    @Override
    public void clear() {
        lastNode = null;
        firstNode = null;
        currentSize = 0;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Object[] toArray() {
        DogClass[] array = new DogClass[currentSize];
        Node current = firstNode;
        for(int i = 0; i < currentSize; i++){
            array[i] = current.element;
            current = current.nextN;
        }
        return array;
    }




    @Override
    public Object get(int index) {
        return null;
    }


//    public Iterator iterator(){
//        return new Iterator() {
//            private int currentIndex = 0;
//            @Override
//            public boolean hasNext() {
//                return currentIndex < currentSize && array[currentIndex] != null;
//            }
//            @Override
//            public DogClass next() {
//                return ;
//            }
//        };
//    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }


}


