/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controle.Combate;
import entidades.*;
import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author 08050520
 */
public class TelaDeVitoriaOuDerrota extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeVitoriaOuDerrota
     */
    private static Combate combate;

    public TelaDeVitoriaOuDerrota(Combate combate) {

        initComponents();
        Objects.requireNonNull(combate, "Combate não pode ser nulo");

        this.combate = combate;

        this.setLocationRelativeTo(null);

        if (combate.getVidaAdversario() == 0) {

            ImageIcon fundo = new ImageIcon("src/imagem/vitoria.jpg");
            Image fund = fundo.getImage();
            Image newimg2 = fund.getScaledInstance(350, 350, java.awt.Image.SCALE_SMOOTH);
            fundo = new ImageIcon(newimg2);
            fotoFundo.setIcon(fundo);

            textoMensagem.setText("GG IZI");
            if (combate.getPersonagem().getCod_avatar() == 1) {
                ImageIcon img = new ImageIcon("src/imagem/lutadora_Negra_CabeloBlackPower.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 2) {
                ImageIcon img = new ImageIcon("src/imagem/lutadora_Loira.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 3) {
                ImageIcon img = new ImageIcon("src/imagem/lutadora_CabeloCastanho.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 4) {
                ImageIcon img = new ImageIcon("src/imagem/lutadora_Asiatica.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 5) {
                ImageIcon img = new ImageIcon("src/imagem/lutador_Negro.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 6) {
                ImageIcon img = new ImageIcon("src/imagem/lutador_Loiro.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 7) {
                ImageIcon img = new ImageIcon("src/imagem/lutador_CabeloCastanho.jpeg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }
            if (combate.getPersonagem().getCod_avatar() == 8) {
                ImageIcon img = new ImageIcon("src/imagem/lutador_Asiatico.jpg");
                Image image = img.getImage();
                Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(newimg);
                fotoAvatar.setIcon(img);
            }

        } else if (combate.getVidaUser() == 0) {
            textoMensagem.setText("RATIOU");
            ImageIcon img = new ImageIcon("src/imagem/Anderson.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoAvatar.setIcon(img);
            
            ImageIcon fundo = new ImageIcon("src/imagem/derrota.png");
            Image fund = fundo.getImage();
            Image newimg2 = fund.getScaledInstance(350, 350, java.awt.Image.SCALE_SMOOTH);
            fundo = new ImageIcon(newimg2);
            fotoFundo.setIcon(fundo);
            
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fotoAvatar = new javax.swing.JLabel();
        textoCampeao = new javax.swing.JLabel();
        textoMensagem = new javax.swing.JLabel();
        botaoOk = new javax.swing.JButton();
        fotoFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(340, 320));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fotoAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 138));

        textoCampeao.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        textoCampeao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampeao.setText("CAMPEÃO");
        jPanel1.add(textoCampeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 268, -1));

        textoMensagem.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        textoMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMensagem.setText("MENSAGEM");
        jPanel1.add(textoMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 268, -1));

        botaoOk.setText("Ok");
        botaoOk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });
        jPanel1.add(botaoOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 107, 37));
        jPanel1.add(fotoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
        this.setVisible(false);
        new TelaAcoesDoPersonagem(combate.getPersonagem()).setVisible(true);
    }//GEN-LAST:event_botaoOkActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeVitoriaOuDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVitoriaOuDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVitoriaOuDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVitoriaOuDerrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOk;
    private javax.swing.JLabel fotoAvatar;
    private javax.swing.JLabel fotoFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoCampeao;
    private javax.swing.JLabel textoMensagem;
    // End of variables declaration//GEN-END:variables
}
