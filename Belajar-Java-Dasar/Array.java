public class Array {
    public static void main(String[] args) {

        // • Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // • Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat

        // Index dimulai dari 0 sampai dengan panjang data dikurangi 1,
        // contoh panjang data 10 - 1 = 9

        // Operasi di Array
        // array[index] : Mengambil data di Array
        // array[index] = value : Mengubah data di Array
        // array.length : Mengambil panjang Array

        // Cara Pertama
        String[] stringArray1;
        stringArray1 = new String[3];

        stringArray1[0] = "Daffa";
        stringArray1[1] = "Naufal";
        stringArray1[2] = "Fajriansyah";

        System.out.println(stringArray1[0]);
        System.out.println(stringArray1[1]);
        System.out.println(stringArray1[2]);

        stringArray1[0] = "Gyan";
        System.out.println(stringArray1[0]);

        // Cara Kedua
        String[] stringArray2 = new String[3];

        String[] namaNama = { "Daffa", "Naufal", "Fajriansyah" };

        // Mengosongkan data Array
        namaNama[0] = null;

        // Array Angka
        int[] arrayInt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        long[] arrayLong = new long[] { 10L, 20L, 30L };

        // Mengosongkan data Array
        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        // Array di dalam Array
        String[][] mahasiswa = {
                { "Gyan", "Akmal", "Heryadi" },
                { "Arif", "Wicaksono" },
                { "Daffa" }
        };

        System.out.println(mahasiswa[0][1]);
        System.out.println(mahasiswa[1][0]);

    }
}
