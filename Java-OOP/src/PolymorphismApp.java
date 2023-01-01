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

    static void isHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
