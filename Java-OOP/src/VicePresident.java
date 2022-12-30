class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    // Method Overriding
    void isHello(String name) {
        System.out.println("Hello " + name + ", My Name is Vice President " + this.name);
    }

}
