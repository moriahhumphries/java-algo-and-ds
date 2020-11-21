package linkedlist;

public class EmployeeNode {
    private EmployeeLL employeeLL;
    private EmployeeNode next;

    public EmployeeLL getEmployee() {
        return employeeLL;
    }

    public void setEmployee(EmployeeLL employeeLL) {
        this.employeeLL = employeeLL;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode(EmployeeLL employeeLL) {
        this.employeeLL = employeeLL;
    }

    public String toString() {
        return employeeLL.toString();
    }
}
