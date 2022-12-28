public class OperasiBoolean {
    public static void main(String[] args) {

        // && Dan
        // || Atau
        // ! Kebalikan

        var absen = 75;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

    }
}
