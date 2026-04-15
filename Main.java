
import base.Kasir;
import base.Produk;
import java.util.Scanner;
import toko.Pemasukan;

public class Main {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int pilihan;

        Kasir cekProduk = new Kasir();
        Pemasukan produk = new Pemasukan("Indomie Goreng", 3500, 100, "Makanan");
        Produk p = new Produk("Indomie Goreng", 3500, 100,  "Makanan");

        // System.out.println(p.stok);
        // System.out.println(p.harga);
        // System.out.println(p.kategori);
        // System.out.println(p.nama);

        System.out.println("Silahkan pilih: ");
        System.out.println("1. Cek Produk");
        System.out.println("2. Tambah Pemasukan");
        System.out.println("3. Lihat Produk");
        System.out.print("Pilih : ");
        pilihan = ns.nextInt();

        switch (pilihan) {
            case 1:
                cekProduk.cekProduk(produk);
                break;
            case 2:
                produk.tambahPemasukan();
                break;
            case 3:
                p.tampilInfo(p);
                break;
            default:
                break;
        }
        ns.close();
        // p.tampilInfo();
        // produk.tambahPemasukan(100);
    }
}
