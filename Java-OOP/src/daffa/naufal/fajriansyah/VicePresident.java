package daffa.naufal.fajriansyah;

class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is Vice President " + this.name);
    }

}
