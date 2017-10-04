package Common;


import Stud.*;
import Teacher.*;
import Teacher.detailsqs;
import Teacher.qsenter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abhay Goyal
 */
public class Log extends javax.swing.JFrame {

    public static String LoginName,email;
    public static String type=null;  
        public static void setLoginName(String Login)//this method is needed to get the login name of the user
        {
            LoginName =Login ;
        }

        public static String getLoginName()
        {
            return LoginName;
        }
        
        public static void getBranch(String ch)//this method as been used to get the branch entered
        {
            type=ch;
        }
        public static String setBranch()
        {
            return type;
        }
        public static void getEmail(String em)//this method gives the emailid of the user 
        {
            email=em;
        }
    
         public String setEmail()
        {
            return email;
        }
    /**
     * Creates new form Log
     */
    public Log() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student-Teacher portal");

        jLabel2.setText("Name*:-");

        jLabel3.setText("Department:-");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Student");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Teacher");

        jButton1.setText("Register Me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Already Registered");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "Mecahnical", "Electrical", " " }));

        jLabel5.setText("Year");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", " " }));

        jLabel7.setText("Type*:-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(341, 341, 341))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, 0, 80, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        logged l=new logged();
        l.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

   Statement stmt;
    public void connect()
    {
        try {
             Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/portal","root","abhay");
            stmt=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String s=(String)jTextField1.getText();
        setLoginName(s);
        int l=s.length();boolean b=false;
        connect();char c=' ';
        //Select name from login where name like 'Abhay';
        String s1=s.concat(s.substring(l-2));int x=0;
        int i=0;
        if(jTextField1.getText().isEmpty() || !(jRadioButton1.isSelected() || jRadioButton2.isSelected()))
        {
            jLabel6.setText("Enter the details marked with *");
            return;
        }
        int count=0;
        if(jRadioButton1.isSelected())
            c='s';
        if(jRadioButton2.isSelected())
            c='t';
        s1=s1+Character.toString(c);
        int last1=0;
        //while(b==false)
        
            String q="Select count(name='"+s+"')from login";
            //Select count(name='Abhay') as count from login;
        //SELECT CASE WHEN name='Abhay' THEN "TRUE" ELSE "FALSE" END as Saleable FROM login;
           //JOptionPane.showMessageDialog(this,q);
           String come=" "; 
           try
            {
              ResultSet rs=stmt.executeQuery(q);
              while(rs.next())
              {
                x=rs.getInt(1);
              }
              s1=s1+Integer.toString(x++);
              //System.out.println(s1);
            }
           catch(Exception e)
             {
                //System.out.println("Error is here");
                 JOptionPane.showMessageDialog(this, e.getMessage());
                
              }
                /*if(come.equals(s1))
                {
                    int l1=come.length();
                    char last=come.charAt(l1-1);
                    if(last>=48 && last<=57)
                     {
                        last1=last;
                        last1++;
                        s1=s1+Integer.toString(last1);
                        last1++;
                        count++;
                System.out.println(count);
                     }
                    else
                    {
                        s1=s1+Integer.toString(last1);
                        last1++;
                    }
                count++;
                System.out.println(count);
                } */   
                /*else
                {
                     System.out.println("This area is finished"+s1);
                     
                    break;
                   
                }*/
                    
             
            
             
            //if(!(come.equals(s1)))
              //  break;
            /*else
            {
                //s1=s1.concat(Integer.toString(i++)); 
                int l1=come.length();
                char last=come.charAt(l1-1);;
                if(last>=48 || last<=57)
                {
                   last1=last;
                   last1++;
                   s1=s1+Integer.toString(last1);
                }
                else
                {
                   s1=s1+Integer.toString(last1);
                }
                //s1=s1+Character.toString(c);
                
            }*/
        
        int t=(int)jComboBox1.getSelectedIndex();
        //if()
        String ch=(String)jComboBox1.getSelectedItem();
        getBranch(ch);
        String pass=Integer.toString(t)+s1+(i+1);
        String q1="Insert into login values('"+s+"','"+s1+"',"+(x-1)+",'"+ch+"','"+c+"','"+pass+"');";
        //JOptionPane.showMessageDialog(this,q1);
        try
        {
             stmt.executeUpdate(q1);
             JOptionPane.showMessageDialog(this,"You login id is:-"+s1);
             getEmail(s1);
             JOptionPane.showMessageDialog(this,"Your password is:-"+pass);
             int choice=JOptionPane.showConfirmDialog(this, "Do you want to continue??");
             if(choice==JOptionPane.YES_OPTION)
             {
                if(jRadioButton2.isSelected())
                {
                    detailsqs qp1=new detailsqs();
                    qp1.setVisible(true);
                    this.setVisible(false);
                }
                if(jRadioButton1.isSelected())
                {
                     Detailsqs qp2=new Detailsqs();
                    qp2.setVisible(true);
                    this.setVisible(false);
                }
             }
             
             if(choice==JOptionPane.NO_OPTION)
             {
                 this.setVisible(false);
                 System.exit(0);
             }
             /*if(choice==JOptionPane.YES_OPTION)
             {
                 Detailsqs qp=new Detailsqs(); 
                 qp.setVisible(true);
                 
                  this.setVisible(false);
             }
             else
             {
                  System.exit(0);
             }*/
                 
        }
        catch(Exception e)
        {
            System.out.println("The error has happened here");
            JOptionPane.showMessageDialog(this, e.getMessage());
            JOptionPane.showMessageDialog(this,"Something went with your details");
            System.exit(0);
            //this.setVisible(false);
        }
        int qsentered=0;
        if(jRadioButton2.isSelected())
        {
            String we="Insert into qsteacher values('"+s1+"','"+ch+"',"+qsentered+");";
            try
            {
                stmt.executeUpdate(we);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            JOptionPane.showMessageDialog(this, we);
        }

        if(jRadioButton1.isSelected())
        {
            String we="Insert into qsstudent values('"+ch+"','"+s1+"',"+qsentered+","+qsentered+","+qsentered+","+qsentered+");";
            try
            {
                stmt.executeUpdate(we);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            JOptionPane.showMessageDialog(this, we);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
