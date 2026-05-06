class Elektronik extends Produk {
    private int garansi;
    private String merek;
    private static final double PPN = 0.11;
    public Elektronik(String nama,String merek, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok);
        this.garansi = garansi;
        this.merek = merek;

    }

    public String getMerek() {
        return merek;
    }

    public int getGaransi(){
        return garansi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Elektronik");
        System.out.println("Nama : " + getNama());
        System.out.println("Merek : " + merek);
        System.out.println("Masa Garansi : " + garansi + " Tahun");

    }

    public double hitungDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    public double hitungDiskon(int jumlahBeli, double persenPajak) {
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }

     public double hitungHargaSetelahPajak(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) - hitungPajak(jumlahBeli);
    }
    
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.20;
    }
}
