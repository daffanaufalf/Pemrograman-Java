public class MethodReturnValue {

    // • Secara default, method itu tidak menghasilkan value apapun, namun jika kita
    // ingin, kita bisa membuat sebuah method mengembalikan nilai
    // • Agar method bisa menghasilkan value, kita harus mengubah kata kunci void
    // dengan tipe data yang dihasilkan
    // • Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus
    // menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan
    // tipe data yang sudah kita deklarasikan di method
    // • Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa
    // lebih dari satu

    public static void main(String[] args) {

        var hasil = sum(100, 100);
        System.out.println(hasil);

        System.out.println(sum(200, 200));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "404", 100));

    }

    static int sum(int nilai1, int nilai2) {
        var total = nilai1 + nilai2;
        return total;
    }

    static int hitung(int nilai1, String operasi, int nilai2) {
        switch (operasi) {
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            default:
                return 0;
        }
    }

}
