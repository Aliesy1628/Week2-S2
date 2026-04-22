public class Main {
    public static void main(String[] args) {
        Produk p = new Produk( "Baju", 10000.0 , 10, "YNTKTS");
        System.out.println(p.getNama());
        System.out.println(p.getHarga());
        p.setHarga(15000.0);
        System.out.println(p.getHarga());
    }
}
