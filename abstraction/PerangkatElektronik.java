// Abstract class
abstract class PerangkatElektronik {
    String merek;
    int daya;

    PerangkatElektronik(String merek, int daya) {
        this.merek = merek;
        this.daya = daya;
    }

    // Method abstrak (tanpa isi)
    abstract void hidupkan();

    // Method konkrit
    void info() {
        System.out.println("Merek: " + merek + ", Daya: " + daya + " watt");
    }
}
