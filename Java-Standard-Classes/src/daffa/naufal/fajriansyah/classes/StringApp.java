package daffa.naufal.fajriansyah.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Daffa Naufal Fajriansyah";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Daffa"));
        System.out.println(name.endsWith("Fajriansyah"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

        System.out.println(chars);

    }
}
