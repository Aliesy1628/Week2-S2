package base;

public class Kasir {
    void cekProduk(Produk p) {
        System.out.println(p.stok);
        System.out.println(p.getHarga());
        System.out.println(p.kategori);
        System.out.println(p.getNama());
    }
}
