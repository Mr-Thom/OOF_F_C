/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controle.Combate;
import entidades.Personagem;
import java.awt.Color;
import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import persistencia.PersonagemDAO;

/**
 *
 * @author danie
 */
public class TelaCombate extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    private static Combate combate;

    public TelaCombate(Combate combate) {
        UIManager.put("nimbusOrange", new Color(0, 180, 0));

        initComponents();

        Objects.requireNonNull(combate, "Personagem não pode ser nulo");

        this.combate = combate;

        this.setLocationRelativeTo(null);

        vidaUsuario.setValue(combate.getVidaUser());
        vidaAdversario.setValue(combate.getVidaAdversario());
        textoNome.setText(combate.getPersonagem().getNome());

        if (combate.isPossivelDefender() == false) {
            BotaoDefesa.setEnabled(false);
        }

        if (combate.getPersonagem().getCod_avatar() == 1) {
            ImageIcon img = new ImageIcon("src/imagem/lutadora_Negra_CabeloBlackPower.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 2) {
            ImageIcon img = new ImageIcon("src/imagem/lutadora_Loira.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 3) {
            ImageIcon img = new ImageIcon("src/imagem/lutadora_CabeloCastanho.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 4) {
            ImageIcon img = new ImageIcon("src/imagem/lutadora_Asiatica.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 5) {
            ImageIcon img = new ImageIcon("src/imagem/lutador_Negro.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 6) {
            ImageIcon img = new ImageIcon("src/imagem/lutador_Loiro.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 7) {
            ImageIcon img = new ImageIcon("src/imagem/lutador_CabeloCastanho.jpeg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }
        if (combate.getPersonagem().getCod_avatar() == 8) {
            ImageIcon img = new ImageIcon("src/imagem/lutador_Asiatico.jpg");
            Image image = img.getImage();
            Image newimg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
            img = new ImageIcon(newimg);
            fotoUsuario.setIcon(img);
        }

        valorEnergia.setText("" + combate.getEnergia() + "");

        ImageIcon img2 = new ImageIcon("src/imagem/Anderson.jpg");
        Image imagem = img2.getImage();
        Image newimg2 = imagem.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
        img2 = new ImageIcon(newimg2);
        fotoAdversario.setIcon(img2);

        ImageIcon img3 = new ImageIcon("src/imagem/bandeira_branca.png");
        Image imagem2 = img3.getImage();
        Image newimg3 = imagem2.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
        img3 = new ImageIcon(newimg3);
        arregar.setIcon(img3);
        regras.setBackground(new Color(0, 0, 0, 0));
        arregar.setBackground(new Color(0, 0, 0, 0));

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
        textoEnergia = new javax.swing.JLabel();
        fotoUsuario = new javax.swing.JLabel();
        fotoAdversario = new javax.swing.JLabel();
        vidaUsuario = new javax.swing.JProgressBar();
        vidaAdversario = new javax.swing.JProgressBar();
        textoNome = new javax.swing.JLabel();
        textoAdversario = new javax.swing.JLabel();
        botaoSocos = new javax.swing.JButton();
        botaoChutes = new javax.swing.JButton();
        botaoEspeciais = new javax.swing.JButton();
        BotaoDefesa = new javax.swing.JButton();
        botaoPularTurno = new javax.swing.JButton();
        valorEnergia = new javax.swing.JLabel();
        textoCombate = new javax.swing.JLabel();
        regras = new javax.swing.JButton();
        arregar = new javax.swing.JButton();
        fotoFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoEnergia.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        textoEnergia.setForeground(new java.awt.Color(255, 215, 0));
        textoEnergia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEnergia.setText("Energia");
        jPanel1.add(textoEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, -1));
        textoEnergia.getAccessibleContext().setAccessibleName("");

        fotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 146, 106));
        fotoUsuario.getAccessibleContext().setAccessibleName("name");

        fotoAdversario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoAdversario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fotoAdversario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 146, 106));

        vidaUsuario.setName(""); // NOI18N
        vidaUsuario.setStringPainted(true);
        jPanel1.add(vidaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 26));

        vidaAdversario.setStringPainted(true);
        jPanel1.add(vidaAdversario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 26));

        textoNome.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoNome.setForeground(new java.awt.Color(255, 255, 255));
        textoNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNome.setText("Usuário");
        jPanel1.add(textoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 146, -1));
        textoNome.getAccessibleContext().setAccessibleName("");

        textoAdversario.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        textoAdversario.setForeground(new java.awt.Color(255, 255, 255));
        textoAdversario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAdversario.setText("Enderson Silvio");
        jPanel1.add(textoAdversario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 146, -1));
        textoAdversario.getAccessibleContext().setAccessibleName("");

        botaoSocos.setText("Socos");
        botaoSocos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSocos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSocosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSocos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 39));
        botaoSocos.getAccessibleContext().setAccessibleName("");

        botaoChutes.setText("Chutes");
        botaoChutes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoChutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChutesActionPerformed(evt);
            }
        });
        jPanel1.add(botaoChutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, 39));
        botaoChutes.getAccessibleContext().setAccessibleName("");

        botaoEspeciais.setText("Especiais");
        botaoEspeciais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEspeciais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEspeciaisActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEspeciais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, 39));
        botaoEspeciais.getAccessibleContext().setAccessibleName("");

        BotaoDefesa.setText("Defesa");
        BotaoDefesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDefesaActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoDefesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 90, 39));
        BotaoDefesa.getAccessibleContext().setAccessibleName("");

        botaoPularTurno.setText("Pular Turno");
        botaoPularTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPularTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPularTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoPularTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, 39));
        botaoPularTurno.getAccessibleContext().setAccessibleName("");

        valorEnergia.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        valorEnergia.setForeground(new java.awt.Color(255, 215, 0));
        valorEnergia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorEnergia.setText("7");
        jPanel1.add(valorEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 90, -1));
        valorEnergia.getAccessibleContext().setAccessibleName("");

        textoCombate.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        textoCombate.setForeground(new java.awt.Color(255, 255, 255));
        textoCombate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCombate.setText("COMBATE");
        jPanel1.add(textoCombate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, -1));
        textoCombate.getAccessibleContext().setAccessibleName("");

        regras.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        regras.setForeground(new java.awt.Color(255, 255, 255));
        regras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/interrogacao.png"))); // NOI18N
        regras.setText("REGRAS DO JOGO");
        regras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        regras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrasActionPerformed(evt);
            }
        });
        jPanel1.add(regras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 150, 40));
        regras.getAccessibleContext().setAccessibleName("");

        arregar.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        arregar.setForeground(new java.awt.Color(255, 255, 255));
        arregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/bandeira_branca.png"))); // NOI18N
        arregar.setText("PEDIR ARREGO");
        arregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arregarActionPerformed(evt);
            }
        });
        jPanel1.add(arregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        fotoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/dentro_ringue.png"))); // NOI18N
        jPanel1.add(fotoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSocosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSocosActionPerformed
        new TelaSoco(combate).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoSocosActionPerformed

    private void botaoChutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChutesActionPerformed
        new TelaChute(combate).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoChutesActionPerformed

    private void botaoEspeciaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEspeciaisActionPerformed
        new TelaEspeciais(combate).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoEspeciaisActionPerformed

    private void BotaoDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDefesaActionPerformed
        String msg = combate.defender();
        this.setVisible(false);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
    }//GEN-LAST:event_BotaoDefesaActionPerformed

    private void botaoPularTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPularTurnoActionPerformed
        String msg = combate.pularTurno();
        this.setVisible(false);
        if (combate.isCombateFinalizado() == true) {
            try {
                PersonagemDAO p = PersonagemDAO.getInstance();
                p.editar(combate.getPersonagem());
                new TelaDeVitoriaOuDerrota(combate).setVisible(true);
                new TelaPopUp(msg).setVisible(true);
            } catch (Exception e) {
                new TelaPopUp(e.getMessage()).setVisible(true);
            }
        } else {
            new TelaCombate(combate).setVisible(true);
            new TelaPopUp(msg).setVisible(true);
        }
    }//GEN-LAST:event_botaoPularTurnoActionPerformed

    private void regrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrasActionPerformed
        new TelaRegras().setVisible(true);
    }//GEN-LAST:event_regrasActionPerformed

    private void arregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arregarActionPerformed
        combate.getPersonagem().getHistorico().partidaPerdida();
        new TelaAcoesDoPersonagem(combate.getPersonagem()).setVisible(true);
        new TelaPopUp("Voce arregou da luta e foi contabilizado uma derrota em sua carreira.").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_arregarActionPerformed

    public Combate getCombate() {
        return combate;
    }

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
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate(combate).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDefesa;
    private javax.swing.JButton arregar;
    private javax.swing.JButton botaoChutes;
    private javax.swing.JButton botaoEspeciais;
    private javax.swing.JButton botaoPularTurno;
    private javax.swing.JButton botaoSocos;
    private javax.swing.JLabel fotoAdversario;
    private javax.swing.JLabel fotoFundo;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regras;
    private javax.swing.JLabel textoAdversario;
    private javax.swing.JLabel textoCombate;
    private javax.swing.JLabel textoEnergia;
    private javax.swing.JLabel textoNome;
    private javax.swing.JLabel valorEnergia;
    private javax.swing.JProgressBar vidaAdversario;
    private javax.swing.JProgressBar vidaUsuario;
    // End of variables declaration//GEN-END:variables
}
