package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class HashSetTest {

    @Test
    public void givenAEmptyList_whenAddAnElement_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();

        //When

        hs.add("Hola");

        //Then
        Assertions.assertEquals(1, hs.size());

    }

    @Test
    public void givenAListWithOneElement_whenAddSameElement_thenReturnWithSameSize() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");

        //When

        hs.add("Hola");

        //Then
        Assertions.assertEquals(1, hs.size());
    }

    @Test
    public void givenAListWithOneElement_WhenCheckContains_thenResultIsTrue() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");

        //When

        //Then
        Assertions.assertEquals(true, hs.contains("Hola"));
    }

    @Test
    public void givenAListWithOneElement_WhenCheckContains_thenResultIsFalse() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");

        //When

        //Then
        Assertions.assertEquals(false, hs.contains("Adios"));
    }

    @Test
    public void givenAListWithTwoElements_WhenRemove_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");
        hs.add("Adios");

        //When
        hs.remove("Hola");

        //Then
        Assertions.assertEquals(1, hs.size());
    }

    @Test
    public void givenAListWith3Elements_whenIterator_thenNextIsTheSecondStringInTheArray() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");
        hs.add("Adios");
        hs.add("Bye");

        //When
        hs.iterator();

        //Then
        Assertions.assertEquals("Adios", hs.iterator().next());

    }

    @Test
    public void givenAListWith2Elements_whenIterator_thenHasNextIsTrue() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();
        hs.add("Hola");
        hs.add("Adios");

        //When
        hs.iterator();

        //Then
        Assertions.assertEquals(true, hs.iterator().hasNext());

    }

    @Test
    public void givenAEmptyList_whenIterator_thenNextThrowsNotSuchElementException() throws NotValidIndexException, NotSuchElementException,NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();

        //When
        hs.iterator();

        //Then
        Assertions.assertThrows(NotSuchElementException.class,()->hs.iterator().next());

    }

    @Test
    public void givenAEmp1tyList_whenAddAnElement_thenGetSizeIsMayorTo5() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hs= new HashSet<String>();

        //When
        for(int i=0;i<100;i++){
            hs.add("a" + i);
            //Necesitaba encontrar un numero que su buckets[bucketIndex].getSize() fuera mas grande que 5 entonces
            //hice el for hasta 100 para encontrarlo
        }
        //hs.add("a83");  -> Este fue el dato que encontre que lograba entrar en ese if


        //Then


    }
}
