public class tanaman {

    //atribute
    String nama;
    String jenis;
    Double ukuran;
    String warna;
    String bentuk;


    //constructor

    tanaman(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
        System.out.println("Wow.... Tanaman Apa itu!");
        System.out.println("Nama Tanaman    : " + nama);
        System.out.println("Jenis Tanaman   : " + jenis);
    }
    tanaman(String bentuk){
        this.bentuk = bentuk;
        System.out.println("Bentuk          : Dialam Bebas Pohon Tomat berbentuk Seperti " + bentuk);

    }
    tanaman(Double ukuran, String warna){
        this.ukuran = ukuran;
        this.warna = warna;
        System.out.println("ukuran Pohon    : Kurang Lebih " + ukuran + " meter");
        System.out.println("Warna Buah      : " + warna);
    }

    tanaman(){

    }

    //method

    void menanam(){
        System.out.println("banyak cara menanam tanaman agar hasilya maksimal contohnya seperti " + nama );
        System.out.println("berjenis " + jenis + "  menanamnya Bisa menggunakan pot atau wadah besar dengan lubang drainase di bagian bawahnya");
    }
    void tumbuh(){
        System.out.println("Pertumbuhan Tanaman " + nama + " dipengaruhi oleh beberapa faktor diantaranya adalah suhu, kelembapan dan ketinggian tempat.");

    }
    void berbuah(){
        System.out.println(nama + " yang berwarna " + warna + " sudah bisa dipetik");

    }
    void akar(){
        System.out.println("Tanaman Tomat memiliki akar tunggang yang dapat muncul menembus masuk ketanah dengan ukuran pohon kurang lebih " + ukuran + " meter" + " dengan bentuk seperti " + bentuk);
    }
    void bunga(){
        System.out.println("setiap Tanaman Memiliki bunga yang berbeda-beda");
    }

    //method overloading
    void bibit(String nama){
        System.out.println(nama);
    }
    void bibit(String nama, double ukuran){
        System.out.println("pohon " + nama + " Dengan ukuran " + ukuran + " meter");
    }
    void bibit(String nama, double ukuran, String warna){
        System.out.println("pohon " + nama + " Dengan ukuran " + ukuran + " meter" + " memiliki warna Buah " + warna);
    }
}
