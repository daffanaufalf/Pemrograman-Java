package daffa.naufal.fajriansyah;

public class PersonApp {
    public static void main(String[] args) {

        // Use Constructor & Constructor Overloading
        var person1 = new Person("Emil", "Depok");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Gyan");

        Person person2 = new Person("Gyan");

        Person person3;
        person3 = new Person();
        person3.name = "Akmal";
        person3.sayHello("Heryadi");

    }
}