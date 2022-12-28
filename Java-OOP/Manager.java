class Manager {

    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void isHello(String name) {
        System.out.println("Hello " + name + ", My Name is Manager " + this.name);
    }

}
