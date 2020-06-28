public class main {
    public static void main(String[] args) {

        //memanggil costruktor
        tanaman Tanaman1 = new tanaman("Tomat","Sayuran dan Buah");
        tanaman Tanaman2 = new tanaman("perdu");
        tanaman Tanaman3 = new tanaman(2.0,"merah tua");
        System.out.println("=====================================================================================================================================");

        tanaman Tanaman = new tanaman();
        Tanaman.nama = "Tomat";
        Tanaman.jenis = "Sayuran dan Buah";
        Tanaman.ukuran = 2.0;
        Tanaman.warna = "Merah Tua";
        Tanaman.bentuk = "Perdu";

        //memanggil method
        Tanaman.menanam();
        Tanaman.tumbuh();
        Tanaman.berbuah();
        Tanaman.akar();
        Tanaman.bunga();
        System.out.println("=====================================================================================================================================");


        //memanggil method overloading
        Tanaman.bibit("Lombok");
        Tanaman.bibit("Lombok", 3.0);
        Tanaman.bibit("lombok", 3.0, "Merah");
        System.out.println("=====================================================================================================================================");

        //override
        sayur Sayur = new sayur();
        Tanaman.bunga();
        Sayur.bunga();

        Tanaman.bibit("Lombok");
        Sayur.bibit("Lombok");

        Tanaman.bibit("Lombok", 3.0);
        Sayur.bibit("Lombok", 3.0);

    }
}
