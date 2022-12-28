public class ForLoop {
    public static void main(String[] args) {

        // for(init statement; kondisi; post statement){
        // block perulangan
        // }
        // • Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        // • Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true
        // perulangan akan dilakukan, jika false perulangan akan berhenti
        // • Post statement akan dieksekusi setiap kali diakhir perulangan
        // • Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi
        // tidak diisi, berarti kondisi

        // Perulangan Tanpa Henti
        // for(;;){
        // System.out.println("Perulangan Tanpa Henti");
        // }

        // Perulangan Dengan Kondisi
        // var counter = 1;

        // for (; counter <= 10;) {
        // System.out.println("Perulangan ke-" + counter);
        // counter++;
        // }

        // Perulangan Dengan Init Statement
        // for (var counter = 1; counter <= 10;) {
        // System.out.println("Perulangan ke-" + counter);
        // counter++;
        // }

        // Perulangan Dengan Post Statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan ke-" + counter);
        }

    }
}
