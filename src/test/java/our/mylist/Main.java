package our.mylist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {


    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("TEST");

        MyList myList = new MyListIImpl();
        myList.add("poniedzialek");
        myList.add("wtorek");
        myList.add("sroda");
        myList.add("czwartek");
        myList.add("piatek");
        myList.add("sobota");
        myList.add("niedziela");

        logger.error(myList.returnListAsString());
        logger.error(String.valueOf(myList.getSize()));




        // chcemy utworzyc wlasna liste
        //1.dodac do niej wartosci kolejno dni tygodnia
        //2. wyswietlenie wszystkich elementow
        //3 zwrocenie rozmiaru listy
        //4.usuniecie elementu z listy
    }

}

