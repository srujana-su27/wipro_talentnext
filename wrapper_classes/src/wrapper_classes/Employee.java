package wrapper_classes;
class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

class MyMain {
    public static void main(String[] args) {
        try {
           
            Employee emp1 = new Employee(101, "Alice", 50000.0);
            Employee emp2 = emp1.clone();

            emp1.name = "Bob";
            emp1.salary = 60000.0;

            System.out.println("Original Employee:");
            emp1.display();

            System.out.println("Cloned Employee:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}

