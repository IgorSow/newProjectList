package myListTwoWay;

public class MyElement {
    private String myString;
    private MyElement nextElement;
    private MyElement previousElement;

    public MyElement(String myElementString) {
        this.myString = myElementString;
        this.nextElement = null;
        this.previousElement = null;

    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(MyElement nextElement) {
        this.nextElement = nextElement;
    }

    public MyElement getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(MyElement previousElement) {
        this.previousElement = previousElement;
    }
}
