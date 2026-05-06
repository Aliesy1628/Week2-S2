public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop Asus", "Asus", 8500000, 10,"Elektronik", 2);
        Elektronik hp = new Elektronik("HP Samsung", "Samsung", 3200000, 25,"Elektronik", 1);
        Makanan indomie = new Makanan("Indomie Goreng", 3500, 100, "mie instan", "2026-12-01");
        Makanan roti = new Makanan("Roti tawar", 8000, 50, "roti", "2026-04-30");

        System.out.println("===== daftar produk =====");
        laptop.tampilInfo();
        hp.tampilInfo();
        indomie.tampilInfo();
        roti.tampilInfo();

        System.out.println("===== rincian pajak elektronik =====");

        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN standar 11%");
        System.out.println(" Subtotal : Rp" + laptop.hitungTotalHarga(1));
        System.out.println(" Pajak : Rp" + pajakLaptop);
        System.out.println(" Total : Rp" + totalLaptop);

        double pajakHpCustom = hp.hitungPajak(2);
        System.out.println("\nHP Samsung x2 (pajak custom 5%)");
        System.out.println(" Subtotal : Rp" + hp.hitungTotalHarga(1));
        System.out.println(" Pajak : Rp" + pajakHpCustom);
        System.out.println(" Total : Rp" + (hp.hitungTotalHarga(2) + pajakHpCustom));

        System.out.println("\n===== rincian diskon makanan =====");

        System.out.println("Indomie x10 (diskon otomatis)");
        System.out.println(" Subtotal : Rp" + indomie.hitungTotalHarga(10));
        System.out.println(" Pajak : Rp" + indomie.hitungDiskon(10));
        System.out.println(" Total : Rp" + indomie.hitungHargaSetelahDiskon(10));

        System.out.println("\nRoti x5 x10 (diskon custom 15%)");
        System.out.println(" Subtotal : Rp" + roti.hitungTotalHarga(5));
        System.out.println(" Pajak : Rp" + roti.hitungDiskon(5,15));
        System.out.println(" Total : Rp" + (roti.hitungTotalHarga(5) - roti.hitungDiskon(5,15)));
    
        System.out.println("\n====== TRANSAKSI ======");
        laptop.beli(1);
        hp.beli(2);
        indomie.beli(10);
        roti.beli(5);
    }
}
