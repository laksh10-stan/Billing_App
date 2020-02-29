

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;


public class mainform extends javax.swing.JFrame {

     Statement st;
   Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
 
    
    public mainform() {
        
         con =  re.getCon();
        initComponents();
        
       // initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(1030, 370, 280, 240);

        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(30, 70, 280, 240);

        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(370, 70, 280, 240);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton6);
        jButton6.setBounds(30, 370, 270, 240);

        jButton7.setName("jButton7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton7);
        jButton7.setBounds(370, 370, 280, 240);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lakshmendra Singh\\Desktop\\Billing_System\\images\\change password.jpg")); // NOI18N
        jButton8.setName("jButton8"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton8);
        jButton8.setBounds(700, 370, 280, 240);

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lakshmendra Singh\\Desktop\\Billing_System\\capture(15).png")); // NOI18N
        jButton9.setName("jButton9"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton9);
        jButton9.setBounds(690, 70, 290, 240);

        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton10);
        jButton10.setBounds(1030, 70, 280, 240);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ADD ITEMS");
        jLabel1.setName("jLabel1"); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(430, 310, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("VIEW BILL");
        jLabel2.setName("jLabel2"); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(1090, 310, 140, 30);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ABOUT");
        jLabel3.setName("jLabel3"); // NOI18N
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(1130, 610, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("GENERATE BILL");
        jLabel4.setName("jLabel4"); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(740, 310, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ADD CUSTOMER");
        jLabel5.setName("jLabel5"); // NOI18N
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(70, 310, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("EDIT CUSTOMERS");
        jLabel6.setName("jLabel6"); // NOI18N
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(60, 610, 220, 30);

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("EDIT ITEMS");
        jLabel7.setName("jLabel7"); // NOI18N
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(440, 610, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CHANGE PASSWORD");
        jLabel8.setName("jLabel8"); // NOI18N
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(720, 610, 250, 30);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setLabel("Add");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Add Customer");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Add Items");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("Billing");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.setLabel("View");
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("Customers");
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setText("Items");
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setText("Search Customer");
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setText("Search Item");
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setText("Edit Customers");
        jMenuItem8.setName("jMenuItem8"); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem9.setText("Edit Items");
        jMenuItem9.setName("jMenuItem9"); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tools");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu4.setName("jMenu4"); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("Calculator");
        jMenuItem10.setName("jMenuItem10"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setText("Notepad");
        jMenuItem11.setName("jMenuItem11"); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Setting");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.setName("jMenu5"); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem13.setText("Change Username");
        jMenuItem13.setName("jMenuItem13"); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem14.setText("Change Password");
        jMenuItem14.setName("jMenuItem14"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Help");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu6.setName("jMenu6"); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setText("About");
        jMenuItem15.setName("jMenuItem15"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
AddCustomer ac=new AddCustomer();
jDesktopPane1.add(ac);
ac.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
AddItem ai=new AddItem();
jDesktopPane1.add(ai);
ai.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 
        try {
           Details_Customer  dc = new Details_Customer();
            jDesktopPane1.add(dc);
            dc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
Details_Items di;
        try {
            di = new Details_Items();
            jDesktopPane1.add(di);
          di.setVisible(true);//
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
Search_customer sc;
        try {
           sc = new Search_customer();
           jDesktopPane1.add(sc);
            sc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
SearchItem si;
        try {
            si = new SearchItem();
            jDesktopPane1.add(si);
            si.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
   JDesktopPane getDesktopPane()
   {
       return jDesktopPane1;
   }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
EditCustomer ec;
        try {
            ec = new EditCustomer();
            jDesktopPane1.add(ec);
            ec.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
EditItem ei;
        try {
            ei = new EditItem();
            jDesktopPane1.add(ei);
            ei.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
ChangeUsername cu=new ChangeUsername();
jDesktopPane1.add(cu);
cu.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
ChangePassword cp=new ChangePassword();
jDesktopPane1.add(cp);
cp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    ABOUT a=new ABOUT();
    jDesktopPane1.add(a);
a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
 
   
       Runtime rt=Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/calc.exe");
           
        } catch (IOException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

 Runtime rt=Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/notepad.exe");
           
        } catch (IOException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
  
}//GEN-LAST:event_jMenu4ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
BILLING zz=new BILLING();
jDesktopPane1.add(zz);
zz.setVisible(true);
    
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
ChangePassword cp=new ChangePassword();
jDesktopPane1.add(cp);
cp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
EditItem ei;
        try {
            ei = new EditItem();
            jDesktopPane1.add(ei);
            ei.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
EditCustomer ec;
        try {
            ec = new EditCustomer();
            jDesktopPane1.add(ec);
            ec.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
AddItem ai=new AddItem();
jDesktopPane1.add(ai);
ai.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
AddCustomer ac=new AddCustomer();
jDesktopPane1.add(ac);
ac.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ABOUT a=new ABOUT();
    jDesktopPane1.add(a);
a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
BILLING zz=new BILLING();
jDesktopPane1.add(zz);
zz.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
ViewBill qc=new ViewBill();
//jDesktopPane1.add(qc);
qc.setVisible(true);
qc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}
