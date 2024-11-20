public class Item {
    private final String kode;
    private final String nama;
    private final double hargaBeli;
    private final double hargaJual;

    /**
     * Constructor to initialize an item.
     *
     * @param kode      the unique code of the item
     * @param nama      the name of the item
     * @param hargaBeli the purchase price of the item
     * @param hargaJual the selling price of the item
     */
    public Item(String kode, String nama, double hargaBeli, double hargaJual) {
        this.kode = kode;
        this.nama = nama;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    @Override
    public String toString() {
        return "Item{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                ", hargaBeli=" + hargaBeli +
                ", hargaJual=" + hargaJual +
                '}';
    }
}
