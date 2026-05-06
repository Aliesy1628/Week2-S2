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
        System.out.println("Masa Garansi : " + garansi + " Tahun");

    }

    public void setGaransi(int garansi) {
        if(garansi <= 0) {
            System.out.println("Masa garansi tidak boleh negatif");
        }else{
            this.garansi = garansi;
        }
    }
}
