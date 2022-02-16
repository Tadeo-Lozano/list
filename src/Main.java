import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList team1 =  new LinkedList();
        LinkedList team2 =  new LinkedList();

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomón");
        team1.addAtTail("YAEL");

        team2.addAtFront("Christian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");
    }
}
