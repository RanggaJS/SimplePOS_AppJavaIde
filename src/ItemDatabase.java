import java.util.HashMap;

public class ItemDatabase {
    // HashMap to store item details (key: Kode Barang, value: Item object)
    private static final HashMap<String, Item> items = new HashMap<>();

    /**
     * Adds an item to the database.
     *
     * @param kode      the unique code of the item
     * @param nama      the name of the item
     * @param hargaBeli the purchase price of the item
     * @param hargaJual the selling price of the item
     */
    public static void addItem(String kode, String nama, double hargaBeli, double hargaJual) {
        items.put(kode, new Item(kode, nama, hargaBeli, hargaJual));
    }

    /**
     * Retrieves an item by its code.
     *
     * @param kode the unique code of the item
     * @return the item object, or null if not found
     */
    public static Item getItem(String kode) {
        return items.get(kode);
    }

    /**
     * Removes an item by its code.
     *
     * @param kode the unique code of the item
     */
    public static void removeItem(String kode) {
        items.remove(kode);
    }

}
