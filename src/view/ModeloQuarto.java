/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.LayoutManager;
import javax.swing.JLabel;
/**
 *
 * @author estev
 */
public class ModeloQuarto extends javax.swing.JPanel {

    String result;
    /**
     * Creates new form ModeloQuarto
     */
    public ModeloQuarto() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JLabel();
        tpQuarto = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtMinuto = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        setMaximumSize(new java.awt.Dimension(137, 130));
        setMinimumSize(new java.awt.Dimension(137, 130));
        setPreferredSize(new java.awt.Dimension(137, 130));

        txtNumero.setBackground(new java.awt.Color(0, 255, 0));
        txtNumero.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumero.setText("00");
        txtNumero.setToolTipText("");
        txtNumero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tpQuarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tpQuarto.setText("Nome");
        tpQuarto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStatus.setText("Status");
        txtStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtHora.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHora.setText("00");
        txtHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtMinuto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtMinuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMinuto.setText("00");
        txtMinuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSegundos.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtSegundos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSegundos.setText("00");
        txtSegundos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(":");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(":");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpQuarto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txtNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(tpQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(txtStatus)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel tpQuarto;
    public static javax.swing.JLabel txtHora;
    public static javax.swing.JLabel txtMinuto;
    public static javax.swing.JLabel txtNumero;
    public static javax.swing.JLabel txtSegundos;
    public static javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}