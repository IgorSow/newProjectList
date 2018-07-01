package myStack;

public interface MyStack {
    public void push(MyStackElem stackElem);
    public MyStackElem pop() throws Exception;
    public int size();
    public String getAllElementsOfStack();
    public boolean isEmpty();



}
