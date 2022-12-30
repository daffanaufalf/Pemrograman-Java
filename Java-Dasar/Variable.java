public class Variable {
    public static void main(String[] args) {

        // • Variable adalah tempat untuk menyimpan data
        // • Java adalah bahasa static type, sehingga sebuah variable hanya bisa
        // digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe
        // data seperti di bahasa pemrograman PHP atau JavaScript
        // • Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu
        // diikuti dengan nama variable nya
        // • Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan
        // tidak boleh seluruhnya number

        String name;
        name = "Daffa Naufal Fajriansyah";

        int age = 18;
        String country = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(country);

        name = "Gyan Akmal Heryadi";

        System.out.println(name);

    }
}
