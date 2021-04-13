package Lists;

public class LinkedList {

    public Node head;
    public int size = 0;

    public void addAtBegin(int data) {
        Node n = new Node(data);
        n.next = this.head;
        this.head = n;
        size++;
    }

    public void deleteAtBegin() {
        head = head.next;
        size--;
    }

    public void addAtEnd(int data) {
        if(head == null) {
            addAtBegin(data);
        }else {
            Node n = new Node(data);
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = n;
            size++;
        }
    }
    public void deleteAtEnd() {
        if(head.next == null){
            deleteAtBegin();
        }else {
            Node currentNode = head;
            Node previousNode = head;
            while(currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
            size--;
        }
    }

    public void addAtIndex(int data, int index) {
        if(index == 0){
            addAtBegin(data);
        }
        if(index == this.size) {
            addAtEnd(data);
        }
        else if(index > size || index < 0) {
            System.out.println("Invalid");
        }else {
            Node n = new Node(data);
            Node currentNode = this.head;
            while(index > 0) {
                currentNode = currentNode.next;
                index--;
            }
            n.next = currentNode.next;
            currentNode.next = n;
            size++;
        }
    }
    
    public void printList() {
        if(size == 0) {
            System.out.println("Empty List");
        }else {
            Node currentNode = this.head;
            while(currentNode.next != null) {
                System.out.print(currentNode.data + " ---> ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data);
        }
    }
}