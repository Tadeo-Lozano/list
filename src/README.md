```@startuml

title LinkedList - Class Diagram


+class uaslp.objetos.list.linkedlist.LinkedList {
-Node head;
-Node tail;
-int size;

+addTail(String data)
+addFront(String data)
+remove(index)
+removeall()
+setAt(index, data)
+getAt(index):String
+removeAllWithValue(String data)
+getSize();
+getIterator(): LinkedListIterator
}

~class uaslp.objetos.list.linkedlist.Node{
~String data;
~Node next;
~Node previous;
}

+class uaslp.objetos.list.linkedlist.LinkedListIterator{
+hasNext(): boolean;
+next(): String;
}

@enduml```