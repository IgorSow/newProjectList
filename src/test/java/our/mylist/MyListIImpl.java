package our.mylist;

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

    public  String returnListAsString () {
        String wynik = "";
        MyElement temporary = this.firstElement;
        while( temporary != null){
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElement();
        }
        return wynik;

    }

    @Override
    public int getSize() {
        return i;
    }


    private boolean listIsEmpty() {
        return this.lastElement == null;
    }
}
