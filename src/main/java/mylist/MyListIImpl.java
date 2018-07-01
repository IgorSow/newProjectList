package mylist;

public class MyListIImpl implements MyList {

    private MyElement firstElement;
    private MyElement lastElement;
    int i = 0;

    public MyListIImpl() {
        this.firstElement = null;
    }

    @Override
    public void add(String myElementString) {
        MyElement myElementToAdd = new MyElement(myElementString);

        if (listIsEmpty()) {
            this.firstElement = myElementToAdd;
            this.lastElement = myElementToAdd;
        } else {
            MyElement temporatyElement = this.lastElement;
            temporatyElement.setNextElement(myElementToAdd);
            this.lastElement = myElementToAdd;
        }
        i++;
    }

    public String returnListAsString() {
        String wynik = "";
        MyElement temporary = this.firstElement;
        while (temporary != null) {
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElement();
        }
        return wynik;

    }

    @Override
    public int getSize() {
        return i;
    }

    @Override
    public void remove(String element) {

        // 3 warianty
        // usuwanie pierwszego elementu

        //przestawic firstElement na "drugi" obiekt listy

        // ustawic element next na null

        MyElement temporaty;
        if (this.firstElement.getMyString().equals(element)){
            temporaty = this.firstElement;
            this.firstElement = this.firstElement.getNextElement();
            temporaty.setNextElement(null);

        }else {
            MyElement temporatyPrev = firstElement;
            MyElement temporatyCurrent = firstElement.getNextElement();
            MyElement temporatyNext = temporatyCurrent.getNextElement();


            while (!temporatyCurrent.getMyString().equals(element)) {
                temporatyPrev = temporatyCurrent;
                temporatyCurrent = temporatyCurrent.getNextElement();
                temporatyNext = temporatyCurrent.getNextElement();
            }
            temporatyPrev.setNextElement(temporatyNext);

            if (lastElement.equals(temporatyCurrent)) {
                lastElement = temporatyPrev;
            }

        }

        // usuwanie srodkowego elementu


        // usuwanie ostatniego elementu

    }
    public String showFirstandLast(){
        return firstElement.getMyString() + " "+ lastElement.getMyString();

    }


    private boolean listIsEmpty() {
        return this.lastElement == null;
    }
}
