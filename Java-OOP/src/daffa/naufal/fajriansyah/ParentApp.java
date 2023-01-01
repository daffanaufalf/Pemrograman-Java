package daffa.naufal.fajriansyah;

public class ParentApp {
    public static void main(String[] args) {
        //Variable Hiding
        Child child = new Child();
        child.name = "Daffa";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
