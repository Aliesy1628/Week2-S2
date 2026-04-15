package toko;

import base.Produk;
import java.util.Scanner;

public class Pemasukan extends Produk {
    //extends digunakan untuk mewarisi kelas induk agar atribut pada kelas induk dapat digunakan
    private double totalPemasukan;

    public Pemasukan(String nama,double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        // super digunakan untuk konstruktor kelas induk (Produk) agar atributnya bisa digunakan di kelas ini (Pemasukan)
        this.totalPemasukan = 0;
    }

    public void tambahPemasukan() {
        int jumlah;
        Scanner ns = new Scanner(System.in);
        System.out.print("Masukkan jumlah produk yang terjual: ");
        jumlah = ns.nextInt();
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga;
            stok -= jumlah;
            System.out.println("Total pemasukan : " + totalPemasukan);
        }else {
            System.out.println("Stok tidak cukup!!");
        }
        ns.close();
    }
}