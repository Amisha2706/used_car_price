import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Deletion extends javax.swing.JFrame {

    String surl = "jdbc:mysql://localhost:3306/data";
    String suser = "root";
    String spassword = "@root123@";
    public Deletion() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        nb = new javax.swing.JLabel();
        Model = new javax.swing.JTextField();
        x = new javax.swing.JLabel();
        zx = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        Years1 = new javax.swing.JTextField();
        Mileage1 = new javax.swing.JTextField();
        Price1 = new javax.swing.JTextField();
        xz = new javax.swing.JLabel();
        Color1 = new javax.swing.JTextField();
        vhnb = new javax.swing.JLabel();
        Conditions1 = new javax.swing.JTextField();
        gvhjbmn = new javax.swing.JLabel();
        Powers1 = new javax.swing.JTextField();
        dsfs = new javax.swing.JLabel();
        SUV1 = new javax.swing.JTextField();
        Delete = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        search = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Delete Details");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nb.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        nb.setForeground(new java.awt.Color(0, 153, 153));
        nb.setText("Model");
        kGradientPanel2.add(nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 24, 150, 36));
        kGradientPanel2.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 28, 149, 36));

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
        kGradientPanel2.add(Years1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 104, 149, 42));
        kGradientPanel2.add(Mileage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, 39));
        kGradientPanel2.add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 260, 149, 40));

        xz.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        xz.setForeground(new java.awt.Color(0, 153, 153));
        xz.setText("Color");
        kGradientPanel2.add(xz, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 34, 98, 36));

        Color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Color1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 38, 166, 36));

        vhnb.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        vhnb.setForeground(new java.awt.Color(0, 153, 153));
        vhnb.setText("Condition");
        kGradientPanel2.add(vhnb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 42));
        kGradientPanel2.add(Conditions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 104, 166, 42));

        gvhjbmn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        gvhjbmn.setForeground(new java.awt.Color(0, 153, 153));
        gvhjbmn.setText("Power");
        kGradientPanel2.add(gvhjbmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 174, 98, 39));

        Powers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Powers1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Powers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 178, 166, 39));

        dsfs.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        dsfs.setForeground(new java.awt.Color(0, 153, 153));
        dsfs.setText("SUV");
        kGradientPanel2.add(dsfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 98, 40));
        kGradientPanel2.add(SUV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 166, 40));

        Delete.setBorder(null);
        Delete.setText("Delete");
        Delete.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Delete.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        Delete.setkEndColor(new java.awt.Color(0, 153, 153));
        Delete.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        Delete.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        Delete.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        Delete.setkStartColor(new java.awt.Color(0, 255, 204));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 164, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Color1ActionPerformed
        
    }//GEN-LAST:event_Color1ActionPerformed

    private void Powers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Powers1ActionPerformed
      
    }//GEN-LAST:event_Powers1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       try{
       
      Connection con1 = DriverManager.getConnection(surl,suser,spassword);
            Statement statement = con1.createStatement();
        String query="delete from Adding where Years="+(Years1.getText());
        JOptionPane.showMessageDialog(null, "Record deleted...");  
        int res=statement.executeUpdate(query);
       
          }
          catch(Exception ex)
          {
              System.err.println("Message"+ex.toString());
          }
    }//GEN-LAST:event_DeleteActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        NewJFrame wu=new   NewJFrame();
        wu.show();
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
  
                try{
        String query="select * from Adding where Model='"+(Model.getText()+"';");
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

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Color1;
    private javax.swing.JTextField Conditions1;
    private com.k33ptoo.components.KButton Delete;
    private javax.swing.JTextField Mileage1;
    private javax.swing.JTextField Model;
    private javax.swing.JTextField Powers1;
    private javax.swing.JTextField Price1;
    private javax.swing.JTextField SUV1;
    private javax.swing.JTextField Years1;
    private javax.swing.JLabel dsfs;
    private javax.swing.JLabel gvhjbmn;
    private javax.swing.JLabel jLabel9;
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
