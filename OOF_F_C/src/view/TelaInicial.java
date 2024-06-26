/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entidades.*;
import java.util.*;
import persistencia.*;

/**
 *
 * @author 08050520
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textoTomEDani = new javax.swing.JLabel();
        textoOFFFC = new javax.swing.JLabel();
        botaoNovoJogo = new javax.swing.JButton();
        botaoCarregar = new javax.swing.JButton();
        botaoClassificacao = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        imagemFundo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        textoTomEDani.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        textoTomEDani.setForeground(new java.awt.Color(255, 215, 0));
        textoTomEDani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTomEDani.setText("Tom & Dani");
        jPanel1.add(textoTomEDani);
        textoTomEDani.setBounds(170, 20, 90, 30);

        textoOFFFC.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        textoOFFFC.setForeground(new java.awt.Color(255, 215, 0));
        textoOFFFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoOFFFC.setText("OOF.F.C.");
        jPanel1.add(textoOFFFC);
        textoOFFFC.setBounds(40, 20, 80, 30);

        botaoNovoJogo.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoNovoJogo.setText("Novo Jogo");
        botaoNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoJogoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoNovoJogo);
        botaoNovoJogo.setBounds(40, 60, 220, 29);

        botaoCarregar.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoCarregar.setText("Carregar Jogo");
        botaoCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarregarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoCarregar);
        botaoCarregar.setBounds(40, 100, 220, 29);

        botaoClassificacao.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoClassificacao.setText("Classificacao");
        botaoClassificacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClassificacaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoClassificacao);
        botaoClassificacao.setBounds(40, 140, 220, 29);

        botaoSair.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSair);
        botaoSair.setBounds(40, 180, 220, 29);

        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/inicial.jpg"))); // NOI18N
        jPanel1.add(imagemFundo);
        imagemFundo.setBounds(0, 0, 300, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoJogoActionPerformed
        new TelaCriarPersonagem().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoNovoJogoActionPerformed

    private void botaoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarregarActionPerformed
        new TelaCarregar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoCarregarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClassificacaoActionPerformed
        ClassificacaoDAO c = ClassificacaoDAO.getInstance();
        TreeSet<Classificado> tree = new TreeSet(c.pesquisarTudo());
        new TelaClassificacao(tree).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoClassificacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCarregar;
    private javax.swing.JButton botaoClassificacao;
    private javax.swing.JButton botaoNovoJogo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoOFFFC;
    private javax.swing.JLabel textoTomEDani;
    // End of variables declaration//GEN-END:variables
}
