package queue;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        logger.error("TEST");

        MyCollection myCollection = new MyCollectionImpl();
        myCollection.enqueue(new MyNode("poniedzialek"));
        myCollection.enqueue(new MyNode("wtorek"));
        myCollection.enqueue(new MyNode("sroda"));
        myCollection.enqueue(new MyNode("czwartek"));
        myCollection.enqueue(new MyNode("piatek"));



        logger.error(myCollection.returnListAsString());
//        logger.error("sisze of list {}", myCollection.getSize());
//
//        logger.error("element of colelction {}", myCollection.dequeue());


        logger.error("{}",myCollection.dequeue().getMyString());


        logger.error(myCollection.returnListAsString());


        logger.error("sisze of list {}", myCollection.getSize());

        logger.error("{}",myCollection.dequeue().getMyString());

        logger.error("sisze of list {}", myCollection.getSize());


    }
}