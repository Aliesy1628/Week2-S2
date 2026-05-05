public class Elektronik extends Produk {
    private int garansi;
    public Elektronik(String nama,double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;

    }

    @Override
    public void tampilInfo() {
        System.out.println("Elektronik");
        super.tampilInfo();
        System.out.println("Masa Garansi : " + garansi + " Tahun");

    }

    public void setGaransi(int garansi) {
        if(garansi <= 0) {
            System.out.println("Masa garansi tidak boleh negatif");
        }else{
            this.garansi = garansi;
        }
    }
}
