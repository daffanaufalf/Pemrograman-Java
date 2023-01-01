package daffa.naufal.fajriansyah;


public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Daffa");
        manager.sayHello("Gyan");

        var vp = new VicePresident("Akmal");
        vp.sayHello("Gyan");

        // Object Class
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
