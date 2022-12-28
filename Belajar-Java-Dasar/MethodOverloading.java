public class MethodOverloading {
    public static void main(String[] args) {

        // • Method overloading adalah kemampuan membuat method dengan nama yang sama
        // lebih dari sekali.
        // • Namun ada ketentuannya, yaitu data parameter di method tersebut harus
        // berbeda-beda, entah jumlah atau tipe data parameternya
        // • Jika ada yang sama, maka program Java kita akan error

        sayHello();
        sayHello("Daffa");
        sayHello("Daffa", "Naufal");

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
