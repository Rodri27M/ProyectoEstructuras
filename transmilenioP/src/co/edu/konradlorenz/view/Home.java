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
        lblLogo = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(213, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/tm-logo-400x400.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 530));

        lblMessage.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1280, 80));

        progressBar.setBackground(new java.awt.Color(213, 0, 0));
        progressBar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        progressBar.setForeground(new java.awt.Color(255, 255, 255));
        progressBar.setAlignmentX(0.0F);
        progressBar.setAlignmentY(0.0F);
        progressBar.setBorderPainted(false);
        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        progressBar.setEnabled(false);
        progressBar.setMaximumSize(new java.awt.Dimension(146, 12));
        progressBar.setMinimumSize(new java.awt.Dimension(146, 12));
        progressBar.setOpaque(false);
        progressBar.setRequestFocusEnabled(false);
        progressBar.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 612, 1200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JLabel getLblLogo() {
        return lblLogo;
    }

    public void setLblLogo(javax.swing.JLabel lblLogo) {
        this.lblLogo = lblLogo;
    }

    public javax.swing.JLabel getLblMessage() {
        return lblMessage;
    }

    public void setLblMessage(javax.swing.JLabel lblMessage) {
        this.lblMessage = lblMessage;
    }

    public javax.swing.JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(javax.swing.JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

}
