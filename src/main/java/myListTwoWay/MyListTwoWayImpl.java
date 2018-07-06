package myListTwoWay;

public class MyListTwoWayImpl implements MyListTwoWay {

    private MyElement previousElement;
    private MyElement firstElement;
    private MyElement lastElement;
    private int iterator;


    @Override
    public void add(String myElementString) {
        MyElement myElementToAdd = new MyElement(myElementString);

        if (listIsEmpty()) {
            this.previousElement = null;
            this.firstElement = myElementToAdd;
            this.lastElement = myElementToAdd;

        } else {

            MyElement temporatyElement = this.lastElement;

            temporatyElement.setPreviousElement(previousElement);
            previousElement = lastElement;
            temporatyElement.setNextElement(myElementToAdd);
            this.lastElement = myElementToAdd;

        }
        if (lastElement.getNextElement() == null) {
            lastElement.setPreviousElement(previousElement);

        }
        iterator++;
    }

    public void addLastElement(String MyElementString) {
        MyElement myElementToAdd = new MyElement(MyElementString);
        MyElement temporatyElement = this.lastElement;
        temporatyElement.setNextElement(myElementToAdd);
        this.lastElement = myElementToAdd;

    }

    @Override
    public int getSize() {
        return iterator;
    }

    @Override
    public boolean listIsEmpty() {
        return this.firstElement == null;
    }

    @Override
    public String showFromFirstToLast() {
        MyElement temporaryElement = this.firstElement;
        String result = "";

        while (temporaryElement != null) {


            result += temporaryElement.getMyString() + " ";
            temporaryElement = temporaryElement.getNextElement();

        }
        return result;
    }

    @Override
    public String showFromLastToFirst() {

        MyElement temporaryElement = this.lastElement;
        String result = "";

        while (temporaryElement != null) {
            result += temporaryElement.getMyString() + " ";
            temporaryElement = temporaryElement.getPreviousElement();
        }
        return result;

    }

    @Override
    public void removeElementAfterNumber(int numberToDelete) {

        int temporaryIterator = 1;
        MyElement temporaryElement = firstElement;

        while (temporaryIterator <= numberToDelete) {

            if (temporaryIterator == numberToDelete) {

                MyElement temporaryPrev = temporaryElement.getPreviousElement();
                MyElement temporaryCurrent = temporaryElement;
                MyElement temporaryNext = temporaryCurrent.getNextElement();

                temporaryPrev.setNextElement(temporaryNext);
                temporaryNext.setPreviousElement(temporaryPrev);


                temporaryCurrent.setPreviousElement(null);
                temporaryCurrent.setNextElement(null);
                
            } else {
                temporaryElement = temporaryElement.getNextElement();
            }
            temporaryIterator++;

        }


    }
}
