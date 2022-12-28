public class KonversiTipeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Akan Terjadi Number Overflow
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

    }
}
