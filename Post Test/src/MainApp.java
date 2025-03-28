class Person { 
    public String name; 
    public int age; 

    public Person(String n, int a) { 
        this.name = n; 
        this.age = a; 
    } 

    public void display() { 
        System.out.println("Name: " + name + ", Age: " + age); 
    } 
} 

// Child class
class Employee extends Person { 
    private double salary; 

    public Employee(String n, int a, double s) { 
        super(n, a); 
        this.salary = s;  
    } 

    public void displayEmp() { 
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Salary: " + salary); 
    } 
}

public class MainApp { 
    public static void main(String[] args) { 
        Employee emp = new Employee("Alice", 25, 5000.0); 
        emp.displayEmp();  
    } 
}
