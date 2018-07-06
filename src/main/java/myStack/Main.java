package myStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Logger logger = LoggerFactory.getLogger(myStack.Main.class);

    public static void main(String[] args) {

        logger.info("Poczatek");

        MyStackElem<String> jan = new MyStackElem("January");
        MyStackElem<String> feb = new MyStackElem("February");
        MyStackElem<String> mar = new MyStackElem("March");

        MyStackImpl myStack = new MyStackImpl();

        myStack.push(jan);
        myStack.push(feb);
        myStack.push(mar);
        logger.error(myStack.getAllElementsOfStack());
        try {
            logger.info("My Stack {}", myStack.pop().getContent());
            logger.info("My Stack {}", myStack.pop().getContent());
            logger.info("My Stack {}", myStack.pop().getContent());
            logger.info("My Stack {}", myStack.pop().getContent());
        } catch (Exception e) {
            logger.debug("LISTA JEST PUSTA");
        }

        logger.error(myStack.getAllElementsOfStack());
        logger.info("koniec");
    }
}
