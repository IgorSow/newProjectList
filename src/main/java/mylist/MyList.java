package mylist;

public interface MyList {
    public void add(String myElement);
    public String returnListAsString();
    public int getSize();
    public void remove(String element);
    public String getElementAt(int numberOfElement) throws Exception;


}
