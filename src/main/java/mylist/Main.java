package mylist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {


    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {


        MyList myList = new MyListIImpl();
        myList.add("poniedzialek");
        myList.add("wtorek");
        myList.add("sroda");
        myList.add("czwartek");
        myList.add("piatek");
        myList.add("sobota");
        myList.add("niedziela");

        // chcemy utworzyc wlasna liste
        //1.dodac do niej wartosci kolejno dni tygodnia
        //2. wyswietlenie wszystkich elementow
        //3 zwrocenie rozmiaru listy
        //4.usuniecie elementu z listy

//        logger.info("Lista po dodaniu: " + myList.returnListAsString());
//        logger.info(String.valueOf(myList.getSize()));
//        logger.info("Ilosc elementow {}", myList.getSize());
//
//       myList.remove("niedziela");
//
//
//        logger.info("Pokaz pierwszy i ostatni element : " + ((MyListIImpl) myList).showFirstandLast());
//
//       logger.info(myList.returnListAsString());
//
//       myList.add("EXTRA DZIEN");
//
//       logger.info(myList.returnListAsString());
//        logger.info("Pokaz pierwszy i ostatni element " + ((MyListIImpl) myList).showFirstandLast());



        logger.info(myList.getElementAt(213));

        logger.info("TUTAJ PROGRAM DZIALA DALEJ");

    }

}

