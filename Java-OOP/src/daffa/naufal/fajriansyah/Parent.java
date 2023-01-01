package daffa.naufal.fajriansyah;

// Variable Hiding
class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in daffa.naufal.fajriansyah.Parent");
    }
}

class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("Do it in daffa.naufal.fajriansyah.Child");
        System.out.println("daffa.naufal.fajriansyah.Parent name is " + super.name);
    }
}
