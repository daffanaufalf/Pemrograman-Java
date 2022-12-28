public class TipeDataNumber {
    public static void main(String[] args) {

        // Konversi Tipe Data Number
        // • Widening Casting (Otomatis) : byte -> short -> int -> long -> float ->
        // double
        // • Narrowing Casting (Manual) : double -> float -> long -> int -> char ->
        // short
        // -> byte

        // Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Floating Point Number
        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        // Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Underscore
        int amount = 1_000_000_000;

    }
}