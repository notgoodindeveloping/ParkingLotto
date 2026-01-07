package proyekbesar;

import proyekbesar.backend.VehicleDao;

public class VehicleOut extends javax.swing.JFrame {
    VehicleDao vehManager = new VehicleDao();
    
    public VehicleOut() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plateInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(575, 433));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Kendaraan Keluar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(166, 51, 261, 33);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Plat Nomor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(84, 118, 103, 26);
        getContentPane().add(plateInput);
        plateInput.setBounds(199, 120, 303, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil", "Motor" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(226, 195, 72, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jenis Kendaraan:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(79, 196, 141, 26);

        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn);
        saveBtn.setBounds(214, 265, 147, 47);

        returnBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        returnBtn.setText("Kembali");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(207, 330, 160, 51);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        Dashboard dash = new Dashboard();
        dash.setLocationRelativeTo(null);
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String plate = plateInput.getText();
        
        if (plate.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Harap masukkan plat nomor terlebih dahulu!");
            return;
        }
        
        vehManager.vehicleOut(plate);
        javax.swing.JOptionPane.showMessageDialog(this, "Kendaraan dengan plat " + plate + " keluar dari parkiran");
        
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField plateInput;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
