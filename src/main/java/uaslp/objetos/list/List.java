package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public interface List <T>{

    void addAtTail(T data) throws NotNullValuesAllowedException;

    void addAtFront(T data) throws NotNullValuesAllowedException;

    void remove(int index) throws NotValidIndexException;

    void removeAll();

    /**
     * @param index
     * @param data
     */

    void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException;

    /**
     *
     * @param index
     * @return
     * @throws NotValidIndexException
     */

    T getAt(int index) throws NotValidIndexException;

    Iterator<T> getIterator();

    int getSize();
}
