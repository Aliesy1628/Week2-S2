public class Main {
    public static void main(String[] args) {
        Elektronik mesinCuci = new Elektronik("Miyako", 5000.0 , 20, "Alat rumah", 5);

        mesinCuci.setGaransi(0);
        mesinCuci.tampilkanData();
    }
}
