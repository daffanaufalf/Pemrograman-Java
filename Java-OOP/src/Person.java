public class Person {

    String name;
    String address;
    final String country = "Indonesia";

    // Constructor & Constructor Overloading
    // Person(String paramName, String paramAddress) {
    // name = paramName;
    // address = paramAddress;
    // }

    // Variable Shadowing
    // Person(String name, String address) {
    // name = name;
    // address = address;
    // }

    // Mengatasi Variable Shadowing dengan kata kunci this
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void isHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + this.name);
        // System.out.println("Hello " + paramName + ", My Name is " + name);
    }

}
