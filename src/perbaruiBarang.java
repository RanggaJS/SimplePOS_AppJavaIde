import javax.swing.*;

public class perbaruiBarang extends javax.swing.JFrame {

    public perbaruiBarang() {
        initComponents();
    }

    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JLabel jLabel2 = new JLabel();
        JScrollPane jScrollPane3 = new JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        JButton jButton2 = new JButton();
        // Variables declaration
        JButton jButton1 = new JButton();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JScrollPane jScrollPane4 = new JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        JLabel jLabel5 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel2.setText("Nama Barang");

        jScrollPane3.setViewportView(jTextPane3);

        jButton2.setText("Kembali");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton1.setText("Perbarui");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel3.setText("Masukkan Data Baru");

        jLabel4.setText("Harga Beli");

        jScrollPane4.setViewportView(jTextPane4);

        jLabel5.setText("Harga Jual");

        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(113, 113, 113)
                                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addComponent(jLabel3)))
                                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addGap(29, 29, 29))
        );

        pack();
    }

    // Action for "Perbarui" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String kodeBarang = jTextPane1.getText();
        String namaBarang = jTextPane3.getText();
        double hargaBeli = Double.parseDouble(jTextPane4.getText());
        double hargaJual = Double.parseDouble(jTextPane2.getText());

        // Check if item exists in ItemDatabase
        Item item = ItemDatabase.getItem(kodeBarang);

        if (item != null) {
            // Update item details in ItemDatabase
            ItemDatabase.addItem(kodeBarang, namaBarang, hargaBeli, hargaJual);

            // Display success message
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui:\nKode: " + kodeBarang +
                            "\nNama: " + namaBarang + "\nHarga Beli: " + hargaBeli + "\nHarga Jual: " + hargaJual,
                    "Konfirmasi Perbarui", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Display error message if item not found
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
        java.awt.EventQueue.invokeLater(() -> new perbaruiBarang().setVisible(true));
    }

    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    // End of variables declaration
}
