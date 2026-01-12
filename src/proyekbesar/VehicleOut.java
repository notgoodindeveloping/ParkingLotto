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
        saveBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(436, 343));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Kendaraan Keluar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 300, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Plat Nomor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 130, 25);
        getContentPane().add(plateInput);
        plateInput.setBounds(198, 120, 190, 30);

        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn);
        saveBtn.setBounds(140, 180, 147, 47);

        returnBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnBtn.setText("Kembali");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(160, 239, 100, 40);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField plateInput;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
