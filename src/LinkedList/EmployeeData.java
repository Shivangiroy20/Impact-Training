package LinkedList;

class Employee {
    int id;
    String name;
    String department;
    Employee next;
    Employee prev;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.next = null;
        this.prev = null;
    }
}

public class EmployeeData {
    Employee head;

    
    void addEmployee(int id, String name, String department) {
        Employee newEmp = new Employee(id, name, department);
        if (head == null) {
            head = newEmp;
            return;
        }
        Employee temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newEmp;
        newEmp.prev = temp;
    }

    // Delete employee by ID
    void deleteEmployee(int id) {
        Employee temp = head;

        while (temp != null && temp.id != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Employee ID not found.");
            return;
        }

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        System.out.println("Employee deleted.");
    }

    // Update employee by ID
    void updateEmployee(int id, String newName, String newDept) {
        Employee temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.name = newName;
                temp.department = newDept;
                System.out.println("Employee updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Employee ID not found.");
    }

    // Count employees
    int countEmployees() {
        int count = 0;
        Employee temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

   
    void displayEmployees() {
        Employee temp = head;
        if (temp == null) {
            System.out.println("No employees.");
            return;
        }
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Dept: " + temp.department);
            temp = temp.next;
        }
    }

    
    public static void main(String[] args) {
        EmployeeData list = new EmployeeData();

        list.addEmployee(1, "Ravi", "IT");
        list.addEmployee(2, "Priya", "HR");
        list.addEmployee(3, "Amit", "Finance");

        System.out.println("All Employees:");
        list.displayEmployees();

        list.updateEmployee(2, "Priyanka", "Marketing");
        list.deleteEmployee(1);

        System.out.println("\nAfter Update and Delete:");
        list.displayEmployees();

        System.out.println("\nTotal Employees: " + list.countEmployees());
    }
}
