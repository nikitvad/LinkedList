package linkedlist;

public class LinkedList<T> {

    private LinkedListNode<T> first;
    private LinkedListNode<T> last;
    private LinkedListNode<T> current;

    public void add(T item) {
        if (first == null) {
            first = new LinkedListNode<>(item);
            current = first;
            last = first;
        } else {

            LinkedListNode<T> temp = new LinkedListNode<>(item);
            temp.setPrevObject(last);
            last.setNextObject(temp);
            last = temp;
        }
    }

    public void deleteLastItem() {
        last = last.getPrevObject();
        last.setNextObject(null);
    }

    public void deleteByComparator(T compareTo, LinkedListComparator<T> comparator) {
        LinkedListNode<T> current = first;

        while (current != null) {
            last = current;
            if (comparator.compare(compareTo, current.getObject()) < 0) {
                if (current.getPrevObject() == null) {
                    current = current.getNextNode();
                    setFirst(current);
                    continue;

                } else {
                    LinkedListNode<T> temp = current.getPrevObject();
                    temp.setNextObject(current.getNextObject());
                    current = temp;
                    continue;
                }

            }

            current = current.getNextNode();
        }
    }

    public boolean hasNext() {
        return current != null;
    }

    private void setFirst(LinkedListNode<T> listNode){
        first = listNode;
        current = first;
    }

    public void resetPointer() {
        current = first;
    }

    public T getNext() {
        LinkedListNode<T> temp = current;
        current = current.getNextNode();
        return temp.getObject();
    }

    public interface LinkedListComparator<T> {
        int compare(T compareTo, T comparableValue);
    }
}
