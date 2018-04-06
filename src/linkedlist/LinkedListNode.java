package linkedlist;

public class LinkedListNode<T> {
    private T object;

    private LinkedListNode<T> nextObject;

    public LinkedListNode(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public LinkedListNode<T> getNextNode() {
        return nextObject;
    }

    public void setNextObject(LinkedListNode<T> nextObject) {
        this.nextObject = nextObject;
    }

}
