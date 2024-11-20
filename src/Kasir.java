public class Kasir extends javax.swing.JFrame {

    public Kasir() {
        initComponents();
    }

    private void initComponents() {

        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        // Variables declaration
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        // Declare "Perbarui Barang" button
        javax.swing.JButton jButton4 = new javax.swing.JButton(); // Button for "Perbarui Barang"

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Selamat Datang di Aplikasi Kasir Sederhana");
        jLabel4.setText("Silahkan Pilih Tindakan Yang Akan Anda Lakukan");

        jButton1.setText("Cari Barang");
        jButton1.addActionListener(evt -> {
            jButton1ActionPerformed(); // Handle "Cari Barang" button click
        });

        jButton2.setText("Tambah Barang");
        jButton2.addActionListener(evt -> {
            jButton2ActionPerformed(); // Handle "Tambah Barang" button click
        });

        jButton3.setText("Hapus Barang");
        jButton3.addActionListener(evt -> {
            jButton3ActionPerformed(); // Handle "Hapus Barang" button click
        });

        jButton4.setText("Perbarui Barang");
        jButton4.addActionListener(evt -> {
            jButton4ActionPerformed(); // Handle "Perbarui Barang" button click
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton2)
                                .addGap(20, 20, 20)
                                .addComponent(jButton4) // Add "Perbarui Barang" button
                                .addGap(20, 20, 20)
                                .addComponent(jButton3)
                                .addGap(20, 20, 20)
                                .addComponent(jButton1)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton4) // Add "Perbarui Barang" button
                                        .addComponent(jButton3)
                                        .addComponent(jButton1))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed() {
        // Open the "Cari Barang" page
        new cariBarang().setVisible(true);
        this.dispose(); // Close the main frame (optional)
    }

    private void jButton2ActionPerformed() {
        // Open the "Tambah Barang" page
        new tambahBarang().setVisible(true);
        this.dispose(); // Close the main frame (optional)
    }

    private void jButton3ActionPerformed() {
        // Open the "Hapus Barang" page
        new hapusBarang().setVisible(true);
        this.dispose(); // Close the main frame (optional)
    }

    private void jButton4ActionPerformed() {
        // Open the "Perbarui Barang" page
        new perbaruiBarang().setVisible(true);
        this.dispose(); // Close the main frame (optional)
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Kasir().setVisible(true));
    }

    // End of variables declaration
}
