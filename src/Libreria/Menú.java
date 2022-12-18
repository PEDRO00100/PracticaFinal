package Libreria;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menú extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public Menú() {
        opcion = new String [2];
        initComponents();
        opcion[0] = "Impreso";
        opcion[1] = "Digital";
        SetImageLabel(lblLogo,"src/Imagenes/Logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        pnlMenu = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnAgregara = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnCosto = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        jmAtajos = new javax.swing.JMenu();
        miAgregarLibro = new javax.swing.JMenuItem();
        miAgregarLibroDigital = new javax.swing.JMenuItem();
        miVerLibro = new javax.swing.JMenuItem();
        miVerLibroDigital = new javax.swing.JMenuItem();
        miTotal = new javax.swing.JMenuItem();
        miRegalias = new javax.swing.JMenuItem();
        jmEdit = new javax.swing.JMenu();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(1200, 700));

        lblTitulo.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        lblTitulo.setText("BIENVENIDO A LIBROS-UPIITA");

        btnAgregara.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        btnAgregara.setText("Agregar Libros");
        btnAgregara.setPreferredSize(new java.awt.Dimension(170, 40));
        btnAgregara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaraActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        btnVer.setText("Ver Libros");
        btnVer.setPreferredSize(new java.awt.Dimension(170, 40));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnCosto.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        btnCosto.setText("Costos");
        btnCosto.setPreferredSize(new java.awt.Dimension(170, 40));
        btnCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnAgregara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(btnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(65, 65, 65)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jmAtajos.setText("Atajos");

        miAgregarLibro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAgregarLibro.setText("Agregar libro impreso");
        miAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAgregarLibro(evt);
            }
        });
        jmAtajos.add(miAgregarLibro);

        miAgregarLibroDigital.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAgregarLibroDigital.setText("Agregar libro digital");
        miAgregarLibroDigital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAgregarLibroDigital(evt);
            }
        });
        jmAtajos.add(miAgregarLibroDigital);

        miVerLibro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miVerLibro.setText("Ver libros impresos");
        miVerLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickVerLibro(evt);
            }
        });
        jmAtajos.add(miVerLibro);

        miVerLibroDigital.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miVerLibroDigital.setText("Ver libros digitales");
        miVerLibroDigital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickVerLibroDigital(evt);
            }
        });
        jmAtajos.add(miVerLibroDigital);

        miTotal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miTotal.setText("Total de costos");
        miTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTotalActionPerformed(evt);
            }
        });
        jmAtajos.add(miTotal);

        miRegalias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miRegalias.setText("Regalias");
        miRegalias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegaliasActionPerformed(evt);
            }
        });
        jmAtajos.add(miRegalias);

        mbMenu.add(jmAtajos);

        jmEdit.setText("Edit");
        mbMenu.add(jmEdit);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaraActionPerformed
        int x = JOptionPane.showInternalOptionDialog(pnlMenu,"Por favor seleccione el tipo de libro","Agregar Libros",0,3,null,opcion,"");
        System.out.println(x);
        switch(x){
            case 0://impreso
                agregarLibro impreso = new agregarLibro();
                impreso.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(impreso);
                pnlMenu.updateUI();
                break;
            case 1://digital
                agregarLibroDigital digital = new agregarLibroDigital();
                digital.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(digital);
                pnlMenu.updateUI();
                break;
            default:
                JOptionPane.showMessageDialog(pnlMenu,"Algo salio mal","Error",3);
                break;
        }
    }//GEN-LAST:event_btnAgregaraActionPerformed

    private void clickAgregarLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAgregarLibro
                agregarLibro impreso = new agregarLibro();
                impreso.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(impreso);
                pnlMenu.updateUI();
    }//GEN-LAST:event_clickAgregarLibro

    private void clickAgregarLibroDigital(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAgregarLibroDigital
                agregarLibroDigital digital = new agregarLibroDigital();
                digital.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(digital);
                pnlMenu.updateUI();
    }//GEN-LAST:event_clickAgregarLibroDigital

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        int x = JOptionPane.showInternalOptionDialog(pnlMenu,"Por favor seleccione el tipo de libro","Agregar Libros",0,3,null,opcion,"");
        System.out.println(x);
        switch(x){
            case 0://impreso
                verLibro impreso = new verLibro();
                impreso.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(impreso);
                pnlMenu.updateUI();
                break;
            case 1://digital
                verLibroDigital digital = new verLibroDigital();
                digital.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(digital);
                pnlMenu.updateUI();
                break;
            default:
                JOptionPane.showMessageDialog(pnlMenu,"Algo salio mal","Error",3);
                break;
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void clickVerLibro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickVerLibro
                verLibro impreso = new verLibro();
                impreso.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(impreso);
                pnlMenu.updateUI();
    }//GEN-LAST:event_clickVerLibro

    private void clickVerLibroDigital(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickVerLibroDigital
                verLibroDigital digital = new verLibroDigital();
                digital.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(digital);
                pnlMenu.updateUI();
    }//GEN-LAST:event_clickVerLibroDigital

    private void btnCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoActionPerformed
                costo precio = new costo();
                precio.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(precio);
                pnlMenu.updateUI();
    }//GEN-LAST:event_btnCostoActionPerformed

    private void miTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTotalActionPerformed
                costo precio = new costo();
                precio.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(precio);
                pnlMenu.updateUI();
    }//GEN-LAST:event_miTotalActionPerformed

    private void miRegaliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegaliasActionPerformed
                regalia creditos = new regalia();
                creditos.setBounds(pnlMenu.getBounds());
                pnlMenu.removeAll();
                pnlMenu.add(creditos);
                pnlMenu.updateUI();
    }//GEN-LAST:event_miRegaliasActionPerformed
                
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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }
public void SetImageLabel(JLabel icon,String ruta){
    ImageIcon img = new ImageIcon(ruta);
    Icon ico = new ImageIcon(img.getImage().getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_DEFAULT));
    icon.setIcon(ico);
    this.repaint();
}
String [] opcion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregara;
    private javax.swing.JButton btnCosto;
    private javax.swing.JButton btnVer;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jmAtajos;
    private javax.swing.JMenu jmEdit;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miAgregarLibro;
    private javax.swing.JMenuItem miAgregarLibroDigital;
    private javax.swing.JMenuItem miRegalias;
    private javax.swing.JMenuItem miTotal;
    private javax.swing.JMenuItem miVerLibro;
    private javax.swing.JMenuItem miVerLibroDigital;
    protected javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
