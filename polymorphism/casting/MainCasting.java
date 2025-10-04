public class MainCasting {
    public static void main(String[] args) {
        // Upcasting
        Pegawai p1 = new Manajer();
        Pegawai p2 = new Staf();
        Pegawai p3 = new Hrd();

        p1.tampilInfo();
        p2.tampilInfo();
        p3.tampilInfo();

        System.out.println("------ Downcasting ------");

        // Downcasting untuk akses method khusus subclass
        if (p1 instanceof Manajer) {
            Manajer m = (Manajer) p1;
            m.rapat();
        }

        if (p2 instanceof Staf) {
            Staf s = (Staf) p2;
            s.bekerja();
        }

        if (p3 instanceof Hrd) {
            Hrd h = (Hrd) p3;
            h.rekrut();
        }
    }
}
