public class MainOverriding {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        Hewan h2 = new Kucing();
        Hewan h3 = new Anjing();

        h1.suara(); // dari Hewan
        h2.suara(); // overriding di Kucing
        h3.suara(); // overriding di Anjing
    }
}
