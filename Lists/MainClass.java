package Lists;

public class MainClass {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.printList();
        list.addAtBegin(10);
        list.addAtIndex(15, 1);
        list.printList();
    }
}