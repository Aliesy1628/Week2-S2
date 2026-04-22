
import base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", 3500, 100,  "Makanan");

        

        System.out.println(p.getStok());
        System.out.println(p.getHarga());
        System.out.println(p.getKategori());
        System.out.println(p.getNama());

        p.setHarga(100000);
        
        p.tampilInfo();
    }
}
