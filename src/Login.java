
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    String surl = "jdbc:mysql://localhost:3306/data";
    String suser = "root";
    String spassword = "@root123@";
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        pwd = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(690, 468));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Sign In");
        jLabel5.setFocusTraversalPolicyProvider(true);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 158, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\user (2).png")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 128, 47, 55));

        userid.setBorder(null);
        jPanel3.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 118, 244, 45));

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 169, 244, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\hide.jpg")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 259, 47, 48));

        pwd.setBorder(null);
        jPanel3.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 243, 244, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 289, 244, 10));

        kButton1.setText("Sign In");
        kButton1.setBorderPainted(false);
        kButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton1.setkEndColor(new java.awt.Color(0, 255, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 204, 204));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 146, 40));

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Forgot Password?");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 30));

        kButton2.setText("Back");
        kButton2.setBorderPainted(false);
        kButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(0, 255, 204));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 204, 204));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 146, -1));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 14, 380, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\user.png")); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 206, 176));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello, There!");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 270, 219, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Your Personal Deatils");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 323, 219, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("and start journey with us");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 219, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
       
    }//GEN-LAST:event_jLabel8KeyPressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
String uid=userid.getText();
        String pass=pwd.getText();
   
        
        if(userid.getText().isEmpty() || pwd.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Blank Not Allowed");
        }
        else
        {
            try
            {
              Connection con = DriverManager.getConnection(surl,suser,spassword);
           PreparedStatement st= con.prepareStatement("select uid ,pwd from login where uid=? and pwd=?");
           st.setString(1,uid);
            st.setString(2,pass);
            
            ResultSet rs=st.executeQuery();
           
             
             if(rs.next())
             {
                 System.out.println(rs.getString(1));
                 JOptionPane.showMessageDialog(null, "You have successfully login");
               NewJFrame nj=new NewJFrame();
               nj.show();
               dispose();
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"wrong username & password ","oh-oh",JOptionPane.ERROR_MESSAGE);
                 
             }
             
          
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
   mainpage mp=new mainpage();
   mp.show();
    dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      forgot2 fg=new forgot2();
      fg.show();
      dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField pwd;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
