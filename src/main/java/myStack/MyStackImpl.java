package myStack;

public class MyStackImpl implements MyStack {

    private int size = 0;
    MyStackElem first;



    @Override
    public void push(MyStackElem stackElem) {
        this.size++;

        MyStackElem oldFirst = this.first;
        this.first = stackElem;
        stackElem.setNext(oldFirst);

    }

    @Override
    public MyStackElem pop() throws Exception {

        if (!isEmpty()) {
            MyStackElem temp = this.first;

            this.first = this.first.getNext();

            this.size--;
            return temp;
        }
          throw  new Exception();

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String getAllElementsOfStack() {

        MyStackElem temp = first;
        String result = "";
        while (temp != null) {
            result += temp.getContent() + " ";
            temp = temp.getNext();
        }

        return result;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
