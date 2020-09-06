package com.ksh2.crypt;

/*
 * YesNoDialog.java
 
 */

import java.io.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class YesNoDialog extends javax.swing.JDialog {
    
    private PipedOutputStream out;
    static byte YES=CipherMethods.YES;
    static byte NO=CipherMethods.NO;

    /** Creates new form YesNoDialog */
    public YesNoDialog(java.awt.Frame parent,boolean modal) {
        super (parent, modal);
        out=new PipedOutputStream();
        initComponents ();
        pack ();
    }
    public YesNoDialog() {
        super ((JFrame)null,true);
        out=new PipedOutputStream();
        initComponents ();
        pack ();
    }
    public YesNoDialog(java.awt.Dialog parent,boolean modal) {
        super (parent, modal);
        out=new PipedOutputStream();
        initComponents ();
        pack ();
    }
    
    public void setVisible(boolean b){
        setSize(320,130);
        super.setVisible(b);
    }
    
    public void show(boolean b){
        setSize(320,130);
        super.show(b);
    }
    
    public void show(){
        setSize(320,130);
        super.show();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        YesNoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        YESButton = new javax.swing.JButton();
        NOButton = new javax.swing.JButton();
        getContentPane().setLayout(new java.awt.FlowLayout());
        setModal(true);
        setTitle("WARNING!!!");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        }
        );
        
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 35));
        
        YesNoLabel.setPreferredSize(new java.awt.Dimension(270, 16));
          YesNoLabel.setMinimumSize(new java.awt.Dimension(270, 16));
          YesNoLabel.setText("jLabel1");
          YesNoLabel.setMaximumSize(new java.awt.Dimension(270, 16));
          jPanel1.add(YesNoLabel);
          
          
        getContentPane().add(jPanel1);
        
        
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 35));
        
        YESButton.setLabel("OK");
          YESButton.setText("YES");
          YESButton.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  jButton1ActionPerformed(evt);
              }
          }
          );
          jPanel2.add(YESButton);
          
          
        NOButton.setLabel("NO");
          NOButton.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  NOButtonActionPerformed(evt);
              }
          }
          );
          jPanel2.add(NOButton);
          
          
        getContentPane().add(jPanel2);
        
    }//GEN-END:initComponents

  private void NOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOButtonActionPerformed
// Add your handling code here:
      try{
          out.write(NO);
      }catch(IOException e){}
      closeDialog(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
  }//GEN-LAST:event_NOButtonActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Add your handling code here:
      try{
          out.write(YES);
      }catch(IOException e){}
      closeDialog(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
      
  }//GEN-LAST:event_jButton1ActionPerformed

  public void setDialogLabel(String str){
      YesNoLabel.setText(str);
  }
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        try{
            out.close();
        }catch(IOException e){}
        setVisible (false);
        dispose ();
        
    }//GEN-LAST:event_closeDialog

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        new YesNoDialog (new javax.swing.JFrame (), true).show ();
    }

    /** Getter for property out.
     * @return Value of property out.
     */
    public java.io.PipedOutputStream getOut() {
        return out;
    }    

    /** Setter for property out.
     * @param out New value of property out.
     */
    public void setOut(java.io.PipedOutputStream out) {
        this.out = out;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel YesNoLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton YESButton;
    private javax.swing.JButton NOButton;
    // End of variables declaration//GEN-END:variables

}
