import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Findcar extends javax.swing.JFrame {

   
    String surl = "jdbc:mysql://localhost:3306/data";
    String suser = "root";
    String spassword = "@root123@";
    public Findcar() {
        initComponents();
        image.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        details = new javax.swing.JScrollPane();
        details1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(132, 210, 226));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Cars");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 174, 60));
        kGradientPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 22, 330, 40));

        kButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kButton1.setText("Search");
        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(132, 210, 226));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(132, 210, 226));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(132, 210, 226));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 112, -1));

        kButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kButton2.setText("Back");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(132, 210, 226));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(132, 210, 226));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(132, 210, 226));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 112, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 840, 92));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\collage (1).jpg")); // NOI18N
        image.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 330, 380));

        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 330, 400));

        details1.setColumns(20);
        details1.setRows(5);
        details.setViewportView(details1);

        jPanel2.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 820, 470));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 840, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
           try{
            String query="select * from Adding where Model='"+(name.getText()) + "'";
            Connection con1 = DriverManager.getConnection(surl,suser,spassword);
            Statement statement = con1.createStatement();
            ResultSet res=statement.executeQuery(query);
            while(res.next())
                
            {
                 details1.setFont(new Font("NSimSun",Font.BOLD,18));
               
               details1.setText("**** Car Details ****"+"\n"+"\n"+"\n");
              
               details1.setText(details1.getText()+"     Model = "+res.getString(1)+"\n"+"\n");
               details1.setText(details1.getText()+"     Years = "+res.getString(2)+"\n"+"\n");
               details1.setText(details1.getText()+"     Mileage = "+res.getString(3)+"\n"+"\n");
               details1.setText(details1.getText()+"     Price = "+res.getString(4)+"\n"+"\n");
               details1.setText(details1.getText()+"     Color = "+res.getString(5)+"\n"+"\n");
               details1.setText(details1.getText()+"     Conditions = "+res.getString(6)+"\n"+"\n");
               details1.setText(details1.getText()+"     Powers = "+res.getString(7)+"\n"+"\n");
               details1.setText(details1.getText()+"     SUV = "+res.getString(8)+"\n"+"\n");
image.setVisible(true);              

            }

        }
        catch(Exception ex)
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
       NewJFrame nj=new NewJFrame();
       nj.show();
       dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Findcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Findcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Findcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Findcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Findcar().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane details;
    private javax.swing.JTextArea details1;
    private javax.swing.JPanel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
