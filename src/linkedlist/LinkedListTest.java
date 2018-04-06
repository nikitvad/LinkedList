package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            linkedList.add(i);
        }

        linkedList.deleteByComparator(7, new LinkedList.LinkedListComparator<Integer>() {
            @Override
            public int compare(Integer comparableFirs, Integer comparableLast) {
                if (comparableFirs > comparableLast) {
                    return 1;
                } else if (comparableFirs < comparableLast) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        while (linkedList.hasNext()) {
            System.out.println(linkedList.getNext());
        }
    }
}
