package uaslp.objetos.list.arraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class ArrayListTest {
    @Test
    public void givenANewList_whenGetName_ThenResultIsArrayList(){
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When

        //Then
        Assertions.assertEquals("ArrayList", list.getName());
    }

    @Test
    public void givenANewList_whenGetSize_ThenResultIsTwo() throws NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>(2);
        list.addAtTail("Hundo");

        //When
        list.addAtTail("Hundo");

        //Then
        Assertions.assertEquals(2, list.getSize());
    }

    @Test
    public void givenANewList_whenArrayList_ThenResultIsArrayList(){
        //Given
        ArrayList<String> list = new ArrayList<>(2);

        //When

        //Then
        Assertions.assertEquals(list.getAt(0), null);
    }

    @Test
    public void givenListWithASingleElement_whenAddAtTailAnElement_thenResultIsOne()throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtTail("Hola");

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }


    @Test
    public void givenListWithATwoElements_whenAddAtFront_thenNewElementIsIn0Pos()throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        //When:
        list.addAtFront("Hola");
        list.addAtFront("Adios");

        //Then:
        Assertions.assertEquals(list.getAt(0), "Adios");
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero()throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        list.removeAll();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAListWithTwoElements_whereSetAt_thenSetElementAtindex()throws NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>();
        list.addAtTail("Hundo");
        list.addAtTail("Bye");
        list.addAtTail("Adios");

        //When
        list.setAt(1, "World");

        //Then
        Assertions.assertEquals(list.getAt(1), "World");
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException{
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void givenANewListWithOneElement_whenRemove_ThenResultIsTheSame()throws NotValidIndexException, NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Adios");

        //When
        list.remove(-1);

        //Then
        Assertions.assertEquals("Adios", list.getAt(0));
    }

    @Test
    public void givenANewListWith4Elements_whenRemove_ThenResultIsThree()throws NotValidIndexException, NotNullValuesAllowedException{
        //Given
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("Bye");
        list.addAtFront("Mundo");
        list.addAtFront("Cruel");
        list.addAtFront("Adios");

        //When
        list.remove(1);

        //Then
        Assertions.assertEquals(list.getAt(1), "Mundo");
        Assertions.assertEquals(list.getAt(2), "Bye");
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenSizeIsThrown() throws NotNullValuesAllowedException {
        //Given:
        ArrayList<String> array=new ArrayList<>(); //Crea un objeto de la lista
        array.addAtFront("Hola");
        array.addAtTail("Mundo");
        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtTail(null));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> array = new ArrayList<>();
        array.addAtFront("Mundo");
        array.addAtFront("Cruel");
        array.addAtFront("Adios");

        //When:
        array.remove(1);
        //Then:

        int sizeOfList = array.getSize();
        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Adios",array.getAt(0));
        Assertions.assertEquals("Mundo",array.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndexAddAtTail_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        ArrayList<String> array = new ArrayList<>();
        array.addAtTail("Mundo");
        array.addAtTail("Cruel");
        array.addAtTail("Adios");

        //When:
        array.remove(1);
        //Then:

        int sizeOfList = array.getSize();
        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Mundo",array.getAt(0));
        Assertions.assertEquals("Adios",array.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtFrontNullValue_thenThrowNotNullValue(){
        //Given
        ArrayList<String> array = new ArrayList<>();

        //When
        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->array.addAtFront(null));

    }
}
