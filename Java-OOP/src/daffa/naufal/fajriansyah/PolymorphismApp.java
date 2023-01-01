package daffa.naufal.fajriansyah;

public class PolymorphismApp {
    public static void main(String[] args) {

        // Polymorphism
        Employee employee = new Employee("Daffa");
        employee.sayHello("Gyan");

        employee = new Manager("Daffa");
        employee.sayHello("Gyan");

        employee = new VicePresident("Daffa");
        employee.sayHello("Gyan");

        // Method Polymorphism
        sayHello(new Employee("Daffa"));
        sayHello(new Manager("Gyan"));
        sayHello(new VicePresident("Akmal"));

    }

    // Type Check & Casts
    static void sayHello(Employee employee){
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

    }
}
