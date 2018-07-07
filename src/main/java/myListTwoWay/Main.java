package myListTwoWay;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(myListTwoWay.Main.class);

    public static void main(String[] args) {

        logger.error("test2");

        MyListTwoWay myListTwoWay = new MyListTwoWayImpl();

        myListTwoWay.add("Monday");
        myListTwoWay.add("Thursday");
        myListTwoWay.add("Wednesday");
        myListTwoWay.add("Thursday");
        myListTwoWay.add("Friday");
        myListTwoWay.add("Saturday");
        myListTwoWay.add("Sunday");

//        logger.error(myListTwoWay.showFromFirstToLast());
//
//
//        ((MyListTwoWayImpl) myListTwoWay).addLastElement("LAST");
//
//        logger.error(myListTwoWay.showFromFirstToLast());
//        logger.error(myListTwoWay.showFromLastToFirst());


        System.out.println("SUPEasdR");

        myListTwoWay.removeElementAfterNumber(2);

        logger.error(myListTwoWay.showFromFirstToLast());
        logger.error(myListTwoWay.showFromLastToFirst());

    }
}
