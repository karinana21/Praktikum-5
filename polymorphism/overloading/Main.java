public class Main {
    public static void main(String[] args) {
        OperasiMatematika op = new OperasiMatematika();

        System.out.println("Tambah 2 angka (int): " + op.tambah(5, 10));
        System.out.println("Tambah 3 angka (int): " + op.tambah(2, 4, 6));
        System.out.println("Tambah 2 angka (double): " + op.tambah(2.5, 4.3));
    }
}
