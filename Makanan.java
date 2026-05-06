public class Makanan extends Produk {
    private int expired;
    public Makanan(String nama,double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok);
        this.expired = expired;

    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Masa expired : " + expired + " Hari");
    }

    public void setExpired(int expired) {
        if(expired <= 0) {
            System.out.println("Masa expired tidak boleh negatif");
        }else{
            this.expired = expired;
        }
    }

    public void setExpired(int expired, String type) {
        if(type.equals("nasi")) {
                if(expired > 4) {
                    System.out.println("Masa expired lebih dari 4 hari");
                }else{
                    this.expired = expired;
                }
        } else {
            if(expired < 2) {
                System.out.println("Masa expired kurang dari 2 hari");
            }else{
                this.expired = expired;
            }
        }
    }

    public double hitungPajak(double harga) {
        return harga * 0.10;
    }
}

