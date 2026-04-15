package toko;

import base.Produk;

public class Pemasukan extends Produk {

    public double totalPemasukan;

    public Pemasukan(String nama,double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }

    public void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga;
            stok -= jumlah;
            System.out.println("Total pemasukan : " + totalPemasukan);
        }else {
            System.out.println("Stok tidak cukup!!");
        }
    }
}