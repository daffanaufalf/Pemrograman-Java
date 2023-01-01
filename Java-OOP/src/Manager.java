class Manager extends Employee{

    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void isHello(String name) {
        System.out.println("Hello " + name + ", My Name is Manager " + this.name);
    }

}
