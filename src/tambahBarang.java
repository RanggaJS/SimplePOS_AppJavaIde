import javax.swing.*;

public class tambahBarang extends javax.swing.JFrame {

    public tambahBarang() {
        initComponents();
    }

    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        JScrollPane jScrollPane2 = new JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        JScrollPane jScrollPane3 = new JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        JScrollPane jScrollPane4 = new JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");
        jLabel2.setText("Nama Barang");
        jLabel3.setText("Harga Beli");
        jLabel4.setText("Harga Jual");

        jScrollPane1.setViewportView(jTextPane1);
        jScrollPane2.setViewportView(jTextPane2);
        jScrollPane3.setViewportView(jTextPane3);
        jScrollPane4.setViewportView(jTextPane4);

        jButton1.setText("Masukkan");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        jButton2.setText("Kembali");
        jButton2.addActionListener(evt -> jButton2ActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(jScrollPane2)
                                                        .addComponent(jScrollPane3)
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed() {
        String kodeBarang = jTextPane1.getText();
        String namaBarang = jTextPane3.getText();
        double hargaBeli = Double.parseDouble(jTextPane4.getText());
        double hargaJual = Double.parseDouble(jTextPane2.getText());

        ItemDatabase.addItem(kodeBarang, namaBarang, hargaBeli, hargaJual);

        JOptionPane.showMessageDialog(this, "Data Barang berhasil ditambahkan:\nKode: " + kodeBarang +
                        "\nNama: " + namaBarang + "\nHarga Beli: " + hargaBeli + "\nHarga Jual: " + hargaJual,
                "Konfirmasi", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton2ActionPerformed() {
        new Kasir().setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new tambahBarang().setVisible(true));
    }

    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
}
