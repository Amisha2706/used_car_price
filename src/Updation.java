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
public class Updation extends javax.swing.JFrame {

    String surl = "jdbc:mysql://localhost:3306/data";
    String suser = "root";
    String spassword = "@root123@";
    public Updation() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        Model1 = new javax.swing.JTextField();
        Years1 = new javax.swing.JTextField();
        Mileage1 = new javax.swing.JTextField();
        Price1 = new javax.swing.JTextField();
        Color1 = new javax.swing.JTextField();
        Conditions1 = new javax.swing.JTextField();
        Powers1 = new javax.swing.JTextField();
        SUV1 = new javax.swing.JTextField();
        nb = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        zx = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        xz = new javax.swing.JLabel();
        vhnb = new javax.swing.JLabel();
        gvhjbmn = new javax.swing.JLabel();
        dsfs = new javax.swing.JLabel();
        Update = new com.k33ptoo.components.KButton();
        search = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Details");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 330, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 90));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel2.add(Model1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 30));
        kGradientPanel2.add(Years1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, 30));
        kGradientPanel2.add(Mileage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, 30));
        kGradientPanel2.add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 40));
        kGradientPanel2.add(Color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 160, 40));
        kGradientPanel2.add(Conditions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 160, 40));
        kGradientPanel2.add(Powers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 160, 40));
        kGradientPanel2.add(SUV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 252, 160, 40));

        nb.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        nb.setForeground(new java.awt.Color(0, 153, 153));
        nb.setText("Model");
        kGradientPanel2.add(nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 24, 150, 36));

        x.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        x.setForeground(new java.awt.Color(0, 153, 153));
        x.setText("Year");
        kGradientPanel2.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 100, 94, 42));

        zx.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        zx.setForeground(new java.awt.Color(0, 153, 153));
        zx.setText("Mileage");
        kGradientPanel2.add(zx, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 94, 27));

        z.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        z.setForeground(new java.awt.Color(0, 153, 153));
        z.setText("Price");
        kGradientPanel2.add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 102, 30));

        xz.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        xz.setForeground(new java.awt.Color(0, 153, 153));
        xz.setText("Color");
        kGradientPanel2.add(xz, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 34, 98, 36));

        vhnb.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        vhnb.setForeground(new java.awt.Color(0, 153, 153));
        vhnb.setText("Condition");
        kGradientPanel2.add(vhnb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 42));

        gvhjbmn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        gvhjbmn.setForeground(new java.awt.Color(0, 153, 153));
        gvhjbmn.setText("Power");
        kGradientPanel2.add(gvhjbmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 174, 98, 39));

        dsfs.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        dsfs.setForeground(new java.awt.Color(0, 153, 153));
        dsfs.setText("SUV");
        kGradientPanel2.add(dsfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 98, 40));

        Update.setBorder(null);
        Update.setText("Update");
        Update.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Update.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        Update.setkEndColor(new java.awt.Color(0, 153, 153));
        Update.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        Update.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        Update.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        Update.setkStartColor(new java.awt.Color(0, 255, 204));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 164, -1));

        search.setBorder(null);
        search.setText("Search");
        search.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        search.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        search.setkEndColor(new java.awt.Color(0, 153, 153));
        search.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        search.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        search.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        search.setkStartColor(new java.awt.Color(0, 255, 204));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        kGradientPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 174, -1));

        kButton2.setBorder(null);
        kButton2.setText("BACK");
        kButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton2.setkEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 255, 204));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 174, -1));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 780, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
 try
        {
            Connection con1 = DriverManager.getConnection(surl,suser,spassword);
            Statement statement = con1.createStatement();
       String query="update Adding set Years='"+Years1.getText()+"',Model='"+Model1.getText()+"',Mileage='"+Mileage1.getText()+"',Price='"+Price1.getText()+"',Color='"+Color1.getText()+"',Conditions='"+Conditions1.getText()+"',Powers='"+Powers1.getText()+"' ,SUV='"+SUV1.getText()+"';";
          JOptionPane.showMessageDialog(null, "Record is updated...");  
       int res=statement.executeUpdate(query);
          
        }
        catch(Exception e)
        {
            System.err.println("MESSAGE"+e.toString());
        }       
    }//GEN-LAST:event_UpdateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        try{
            String query="select * from Adding where Model='"+(Model1.getText()) + "'";;
            Connection con1 = DriverManager.getConnection(surl,suser,spassword);
            Statement statement = con1.createStatement();
            ResultSet res=statement.executeQuery(query);
            if(res.next())
            {
               Years1.setText(res.getString(2));
                Mileage1.setText(res.getString(3));
                Price1.setText(res.getString(4));
                Color1.setText(res.getString(5));
                Conditions1.setText(res.getString(6));
                Powers1.setText(res.getString(7));
                SUV1.setText(res.getString(8));

            }

        }
        catch(Exception ex)
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        NewJFrame wu=new   NewJFrame();
        wu.show();
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Color1;
    private javax.swing.JTextField Conditions1;
    private javax.swing.JTextField Mileage1;
    private javax.swing.JTextField Model1;
    private javax.swing.JTextField Powers1;
    private javax.swing.JTextField Price1;
    private javax.swing.JTextField SUV1;
    private com.k33ptoo.components.KButton Update;
    private javax.swing.JTextField Years1;
    private javax.swing.JLabel dsfs;
    private javax.swing.JLabel gvhjbmn;
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel nb;
    private com.k33ptoo.components.KButton search;
    private javax.swing.JLabel vhnb;
    private javax.swing.JLabel x;
    private javax.swing.JLabel xz;
    private javax.swing.JLabel z;
    private javax.swing.JLabel zx;
    // End of variables declaration//GEN-END:variables
}
