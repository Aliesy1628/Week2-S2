
import base.Produk;
import toko.Pemasukan;

public class Main {
    public static void main(String[] args) {
        Pemasukan produk = new Pemasukan("Indomie Goreng", 3500, 100, "Makanan");
        Produk p = new Produk("Indomie Goreng", 3500, 100,  "Makanan");

        System.out.println(p.stok);
        System.out.println(p.harga);
        System.out.println(p.kategori);
        System.out.println(p.nama);

        p.tampilInfo();
        produk.tambahPemasukan(100);
    }
}
