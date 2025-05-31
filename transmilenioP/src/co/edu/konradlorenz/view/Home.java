/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.konradlorenz.view;

/**
 *
 * @author bsvar
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar15 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(213, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/tm-logo-400x400.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 530));

        jProgressBar15.setBackground(new java.awt.Color(213, 0, 0));
        jProgressBar15.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jProgressBar15.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar15.setValue(0);
        jProgressBar15.setAlignmentX(0.0F);
        jProgressBar15.setAlignmentY(0.0F);
        jProgressBar15.setBorderPainted(false);
        jProgressBar15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar15.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar15.setEnabled(false);
        jProgressBar15.setMaximumSize(new java.awt.Dimension(146, 12));
        jProgressBar15.setMinimumSize(new java.awt.Dimension(146, 12));
        jProgressBar15.setOpaque(false);
        jProgressBar15.setRequestFocusEnabled(false);
        jProgressBar15.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jProgressBar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 612, 1200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar15;
    // End of variables declaration//GEN-END:variables
}
