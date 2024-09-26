public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Oppo", "A12");
        daftarHandphone[1] = new FeaturePhone("Samsung", "Galaxy Z Flip6");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("085825272911",  " Jangan diganggu sedang bahagia");
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
                ((Smartphone)hp).kirimPesan("Bedinaje@gmail.com", "Berkabar", "Gimana hasil seleksinya?");
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
}
