package daffa.naufal.fajriansyah.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Daffa");
        builder.append(" ");
        builder.append("Naufal");
        builder.append(" ");
        builder.append("Fajriansyah");

        String name = builder.toString();

        System.out.println(name);

    }
}
