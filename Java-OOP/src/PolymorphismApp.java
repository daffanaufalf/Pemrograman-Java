public class PolymorphismApp {
    public static void main(String[] args) {

        // Polymorphism
        Employee employee = new Employee("Daffa");
        employee.isHello("Gyan");

        employee = new Manager("Daffa");
        employee.isHello("Gyan");

        employee = new VicePresident("Daffa");
        employee.isHello("Gyan");

        // Method Polymorphism
        isHello(new Employee("Daffa"));
        isHello(new Manager("Gyan"));
        isHello(new VicePresident("Akmal"));

    }

    // Type Check & Casts
    static void isHello(Employee employee){
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
