package linkedlist;

public class MainSinglyLinkedList {
    public static void main(String[] args) {
        EmployeeLL janeJones = new EmployeeLL("Jane", "Jones", 123);
        EmployeeLL johnDoe = new EmployeeLL("John", "Doe", 4567);
        EmployeeLL marySmith = new EmployeeLL("Mary", "Smith", 22);
        EmployeeLL mikeWilson = new EmployeeLL("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("Size: " + list.getSize());

        System.out.println(list.isEmpty());

        list.printList();

        list.removeFromFront();

        System.out.println("Size: " + list.getSize());
        list.printList();

    }
}
