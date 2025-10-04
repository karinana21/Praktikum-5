// Smartphone.java
class Smartphone extends PerangkatElektronik implements Konektivitas {

    Smartphone(String merek, int daya) {
        super(merek, daya);
    }

    void hidupkan() {
        System.out.println("Smartphone menyala dengan menekan tombol power lama.");
    }

    public void sambungInternet() {
        System.out.println("Smartphone terhubung ke jaringan seluler.");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("ASUS", 65);
        Smartphone hp = new Smartphone("Samsung", 25);

        laptop.info();
        laptop.hidupkan();
        laptop.sambungInternet();

        System.out.println();

        hp.info();
        hp.hidupkan();
        hp.sambungInternet();
    }
}
