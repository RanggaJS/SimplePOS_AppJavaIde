import javax.swing.*;

public class hapusBarang extends javax.swing.JFrame {

    public hapusBarang() {
        initComponents();
    }

    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JButton jButton2 = new JButton();
        // Variables declaration
        JButton jButton1 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setText("Kembali");
        jButton2.addActionListener(this::jButton2ActionPerformed); // Handle "Kembali" button click

        jButton1.setText("Hapus");
        jButton1.addActionListener(this::jButton1ActionPerformed); // Handle "Hapus" button click

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(79, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(25, 25, 25))
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

    // Action for "Hapus" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Retrieve input from the Kode Barang field
        String kodeBarang = jTextPane1.getText();

        if (kodeBarang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan Kode Barang untuk menghapus.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the item exists in ItemDatabase and remove it
        Item item = ItemDatabase.getItem(kodeBarang);

        if (item != null) {
            ItemDatabase.removeItem(kodeBarang); // Remove item from database
            JOptionPane.showMessageDialog(this, "Barang dengan Kode: " + kodeBarang +
                    " telah dihapus.", "Konfirmasi Penghapusan", JOptionPane.INFORMATION_MESSAGE);
        } else {
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
        java.awt.EventQueue.invokeLater(() -> new hapusBarang().setVisible(true));
    }

    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration
}
