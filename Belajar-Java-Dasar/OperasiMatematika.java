public class OperasiMatematika {
    public static void main(String[] args) {

        // Operasi Matematika
        // + Penjumlahan
        // - Pengurangan
        // * Perkalian
        // / Pembagian
        // % Sisa Pembagian

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        // a = a + 10 | a += 10
        // a = a - 10 | a -= 10
        // a = a * 10 | a *= 10
        // a = a / 10 | a /= 10
        // a = a % 10 | a %= 10

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        // Unary Operator
        // ++ a = a + 1
        // -- a = a - 1
        // - Negative
        // + Positive
        // ! Boolean kebalikan

        int d = 100;

        d++; // atau ++d
        System.out.println(d);

        d--; // atau --d
        System.out.println(d);

    }
}
