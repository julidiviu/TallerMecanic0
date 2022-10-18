
package login;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class login extends javax.swing.JFrame {

//Julian :D
    
    public login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Iniciar Sesión");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        lbliniciarsesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        SepUsuario = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        SepContraseña = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliniciarsesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbliniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        lbliniciarsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliniciarsesion.setText("INICIAR SESIÓN");
        lbliniciarsesion.setAlignmentX(2.0F);
        Background.add(lbliniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");
        Background.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(237, 11, 31));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        Background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 330, -1));

        SepUsuario.setBackground(new java.awt.Color(0, 0, 0));
        SepUsuario.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(SepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 250, 10));

        lblContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");
        Background.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(237, 11, 31));
        txtContraseña.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setText("*********");
        txtContraseña.setToolTipText("");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        Background.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, 250, -1));

        SepContraseña.setBackground(new java.awt.Color(0, 0, 0));
        SepContraseña.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(SepContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 250, 10));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntrarMousePressed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setText("ENTRAR");

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblLogin)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogin)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Background.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 180, 50));

        lblBackGround.setBackground(new java.awt.Color(0, 0, 0));
        lblBackGround.setForeground(new java.awt.Color(0, 0, 0));
        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Fondo3_1.jpg"))); // NOI18N
        lblBackGround.setText("jLabel2");
        lblBackGround.setPreferredSize(new java.awt.Dimension(1280, 720));
        Background.add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
       
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")){
        txtUsuario.setText("");
        }
        if (String.valueOf(txtContraseña.getPassword()).isEmpty()){
            txtContraseña.setText("*********");
        }
        
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (String.valueOf(txtContraseña.getPassword()).equals("*********")){
           txtContraseña.setText(""); 
        }
        if(txtUsuario.getText().isEmpty()){
             txtUsuario.setText("Ingrese su nombre de usuario");
        }
       
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        sistema();
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMousePressed
       
    }//GEN-LAST:event_btnEntrarMousePressed

    
    public void sistema(){
        
        String usuario = txtUsuario.getText();
        String contraseña = String.valueOf(txtContraseña.getPassword());
        
        if (usuario.equals("Admin") && contraseña.compareTo("123")==0) {
            
            Sistema form= new Sistema();
            form.setVisible(true);
            this.dispose();
        }else{
            
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos. \nIntente nuevamente ");
            
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtContraseña.setText("********");
            
        }     
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JSeparator SepContraseña;
    private javax.swing.JSeparator SepUsuario;
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbliniciarsesion;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
