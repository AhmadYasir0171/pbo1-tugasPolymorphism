public class sayur extends tanaman {
    public void bunga(){
        String Sayur = "setiap Tanaman Memiliki bunga yang berbeda-beda(Override)";
        System.out.println(Sayur);
    }

    @Override
    void bibit(String nama) {
        super.bibit(nama);
    }

    @Override
    void bibit(String nama, double ukuran) {
        super.bibit(nama, ukuran);
    }
}
