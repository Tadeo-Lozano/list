package uaslp.objetos.list;

public interface List <T>{

    void addAtTail(String data);

    void addAtFront(String data);

    void remove(int index);

    void removeAll();

    void setAt(int index, String data);

    String getAt(int index);

    Iterator getIterator();

    int getSize();
}
