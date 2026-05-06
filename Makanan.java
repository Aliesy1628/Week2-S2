public class Makanan extends Produk {
    private String kadaluarsa;
    private String kategori;
    public Makanan(String nama,double harga, int stok, String kategori, String kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
        this.kategori = kategori;

    }

    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Kategori : " + kategori);
        System.out.println("Masa kadaluarsa : " + kadaluarsa);
    }

    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10)
            return hitungTotalHarga(jumlahBeli) * 0.05;
        return 0;
    }

    public double hitungDiskon(int jumlahBeli, double persenDiskon) {
            return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(intjumlahBeli) {
        return hitungTotalHarga(jumlahBeli) - hitunfDiskon(jumlahBeli);
    }

    public double hitungPajak(double harga) {
        return harga * 0.10;
    }
}

