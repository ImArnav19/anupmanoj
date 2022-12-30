/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank;

/**
 *
 * @author ARNAV
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
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

        bg = new javax.swing.JLabel();
        bgimage = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1377, 0, -1, 768));

        bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/BLOOD BANK FOUNDATION.png"))); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 640));
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1380, 10));

        LoadingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(51, 51, 0));
        LoadingLabel.setText(" LOADING.....");
        getContentPane().add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 380, 30));

        LoadingValue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LoadingValue.setText("0%");
        getContentPane().add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 640, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
      NewJFrame2 sp= new NewJFrame2();
      sp.setVisible(true);
      
      try{
          for(int i=0;i<=100;i++){
              Thread.sleep(100);
              sp.LoadingValue.setText(i+"%");
              
              if(i==10){
                  sp.LoadingLabel.setText("Turning On Modules ");
              }
              if(i==20){
                  sp.LoadingLabel.setText("Loading Modules..");
              }
              
              if(i==50){
                  sp.LoadingLabel.setText("Conencting To Database .");
              }
              if(i==50){
                  sp.LoadingLabel.setText("Connection Successfull.");
              }
              if(i==80){
                  sp.LoadingLabel.setText("Launching Application .");
              }
              sp.jProgressBar2.setValue(i);
          }
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bgimage;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
