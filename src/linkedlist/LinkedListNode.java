package linkedlist;

public class LinkedListNode<T> {
    private T object;

    private LinkedListNode<T> prevObject;
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

    public LinkedListNode<T> getPrevObject() {
        return prevObject;
    }

    public void setPrevObject(LinkedListNode<T> prevObject) {
        this.prevObject = prevObject;
    }

    public LinkedListNode<T> getNextObject() {
        return nextObject;
    }
}
