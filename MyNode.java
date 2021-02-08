package bridgelabz;

public class MyNode<K> {

    private MyNode next;
    private K key;

    public MyNode(K key){
        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
