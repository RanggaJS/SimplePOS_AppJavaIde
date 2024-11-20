import javax.swing.*;

public class cariBarang extends javax.swing.JFrame {

    public cariBarang() {
        initComponents();
    }

    private void initComponents() {

        JScrollPane jScrollPane1 = new JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JLabel jLabel1 = new JLabel();
        JButton jButton2 = new JButton();
        // Variables declaration
        JButton jButton1 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("Kode Barang");

        jButton2.setText("Kembali");
        jButton2.addActionListener(this::jButton2ActionPerformed); // Handle "Kembali" button click

        jButton1.setText("Cari");
        jButton1.addActionListener(this::jButton1ActionPerformed); // Handle "Cari" button click

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addGap(30, 30, 30))
        );

        pack();
    }

    // Action for "Cari" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Retrieve input from the Kode Barang field
        String kodeBarang = jTextPane1.getText();

        if (kodeBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan Kode Barang untuk mencari.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Search for the item in ItemDatabase
        Item item = ItemDatabase.getItem(kodeBarang);

        if (item != null) {
            // Display item details if found
            JOptionPane.showMessageDialog(this, "Hasil Pencarian:\nKode: " + item.getKode() +
                    "\nNama: " + item.getNama() +
                    "\nHarga Beli: " + item.getHargaBeli() +
                    "\nHarga Jual: " + item.getHargaJual(), "Hasil Pencarian", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Display an error message if the item is not found
            JOptionPane.showMessageDialog(this, "Barang dengan Kode: " + kodeBarang + " tidak ditemukan.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Action for "Kembali" button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new Kasir().setVisible(true); // Return to the main menu
        this.dispose(); // Close the current frame
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new cariBarang().setVisible(true));
    }

    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration
}
