package doublylinkedlist;


public class EmployeeNode {
    private Employee Employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public Employee getEmployee() {
        return Employee;
    }

    public void setEmployee(Employee Employee) {
        this.Employee = Employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode(Employee Employee) {
        this.Employee = Employee;
    }

    public String toString() {
        return Employee.toString();
    }
}
