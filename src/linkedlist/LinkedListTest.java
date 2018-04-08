package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 15; i > 0; i--) {
            linkedList.add(i);
        }

        linkedList.deleteByComparator(7, new LinkedList.LinkedListComparator<Integer>() {
            @Override
            public int compare(Integer compareTo, Integer comparableValue) {
                if (compareTo > comparableValue) {
                    return 1;
                } else if (compareTo < comparableValue) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        linkedList.deleteLastItem();

        while (linkedList.hasNext()) {
            System.out.println(linkedList.getNext());
        }
    }
}
