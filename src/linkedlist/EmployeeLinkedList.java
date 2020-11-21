package linkedlist;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(EmployeeLL employeeLL) {
        EmployeeNode node = new EmployeeNode(employeeLL);
        node.setNext(head);
        head = node;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
