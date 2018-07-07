package queue;

public class MyCollectionImpl implements MyCollection {

    private MyNode firstElement;
    private MyNode lastElement;
    private int size = 0;


    @Override
    public void enqueue(MyNode myNode) {
        //TODO: JESLI KOLEJKA JEST PUSTA
        // FIRST I LAS WSKAZUJA
        // NA TEN SAM ELEMENT

        //TODO: WIECEJ ELEMENTOW
        //PIERWSZY ZOSTAJE TEN SAM DRUGI JEST OSTATNI

        if (this.firstElement == null) {

            this.firstElement = myNode;
            this.lastElement = myNode;

        }else{
            myNode.setNextElement(this.lastElement);
            lastElement = myNode;
        }
        size++;
    }

    @Override
    public MyNode dequeue() {

        MyNode temporatryElement = lastElement;

        while (temporatryElement.getNextElement() != firstElement){

            temporatryElement = temporatryElement.getNextElement();
        }
        MyNode temp = firstElement;
        firstElement  = temporatryElement;

        temporatryElement.setNextElement(null);

        return temp;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String returnListAsString() {
            MyNode temporaryElement = this.lastElement;
            String result = "";

            while (temporaryElement != null) {


                result = temporaryElement.getMyString() + " " + result;
                temporaryElement = temporaryElement.getNextElement();

            }
            return result;
        }



    @Override
    public String returnCollectionAsString() {
        return null;
    }

}
