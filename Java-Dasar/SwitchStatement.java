public class SwitchStatement {
    public static void main(String[] args) {
        // • Kadang kita hanya butuh menggunakan kondisi sederhana di if statement,
        // seperti hanya menggunakan perbandingan ==
        // • Switch adalah statement percabangan yang sama dengan if, namun lebih
        // sederhana cara pembuatannya
        // • Kondisi di switch statement hanya untuk perbandingan ==

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Lambda
        // • Di Java versi 14, diperkenalkan switch expression dengan lambda
        // • Ini lebih mempermudah saat penggunaan switch expression karena kita tidak
        // perlu lagi menggunakan kata kunci break

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Kata Kunci yield
        // • Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata
        // kunci yield untuk mengembalikan nilai pada switch statement
        // • Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi
        // switch statement

        // Switch tanpa yield

        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // Switch dengan yield

        ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);

    }
}
