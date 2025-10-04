// Laptop.java
class Laptop extends PerangkatElektronik implements Konektivitas {

    Laptop(String merek, int daya) {
        super(merek, daya);
    }

    void hidupkan() {
        System.out.println("Laptop menyala dengan menekan tombol power.");
    }

    public void sambungInternet() {
        System.out.println("Laptop terhubung ke WiFi.");
    }
}
