package queue;

public interface MyCollection {

    public void enqueue(MyNode myElement);
    public MyNode dequeue();

    public int getSize();
    public String returnListAsString();

    public String returnCollectionAsString();
}
