package linkedlist;

public class LinkedList<T> {

    private LinkedListNode<T> first;

    public void add(T item) {
        LinkedListNode<T> node = new LinkedListNode<>(item);
        node.setNextObject(first);
        first = node;
    }

    public void deleteLastItem() {
        first = first.getNextNode();
    }

    public void deleteByComparator(T comparableCriteria, LinkedListComparator<T> comparator) {
        LinkedListNode<T> current = first;
        LinkedListNode<T> prevItem = null;


        while (current != null) {

            if (comparator.compare(comparableCriteria, current.getObject()) < 0) {
                if (prevItem != null) {
                    prevItem.setNextObject(current.getNextNode());
                    current = current.getNextNode();
                }else{
                    first = first.getNextNode();
                }

            }

            current = current.getNextNode();
        }
    }

    public boolean hasNext() {
        return first != null;
    }

    public T getNext() {
        LinkedListNode<T> temp = first;
        first = first.getNextNode();
        return temp.getObject();
    }

    public interface LinkedListComparator<T> {
        int compare(T comparableFirs, T comparableLast);
    }
}
