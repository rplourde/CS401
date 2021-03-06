/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */ 

import java.text.DecimalFormat;


public class TipCalculator extends javax.swing.JFrame {

    private DecimalFormat df = new DecimalFormat("0.00");
    /**
     * Creates new form TipCalculator
     */
    public TipCalculator() {
        initComponents();
        setButtons();
        jLabel2.setVisible(false);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        billOne = new javax.swing.JRadioButton();
        billTwo = new javax.swing.JRadioButton();
        billThree = new javax.swing.JRadioButton();
        tenPercent = new javax.swing.JRadioButton();
        fifteenPercent = new javax.swing.JRadioButton();
        eighteenPercent = new javax.swing.JRadioButton();
        twentyPercent = new javax.swing.JRadioButton();
        twentyFivePercent = new javax.swing.JRadioButton();
        thirtyPercent = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculate Tip");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 34, 786, 64));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("This tip for bill is $");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 820, 64));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 468, 133, 41));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 468, 133, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tip Percentage");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 152, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose Bill");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 143, 150, 34));

        buttonGroup1.add(billOne);
        billOne.setForeground(new java.awt.Color(240, 240, 240));
        billOne.setText("Bill 1");
        jPanel1.add(billOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 180, -1, -1));

        buttonGroup1.add(billTwo);
        billTwo.setForeground(new java.awt.Color(240, 240, 240));
        billTwo.setText("Bill 2");
        jPanel1.add(billTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 210, -1, -1));

        buttonGroup1.add(billThree);
        billThree.setForeground(new java.awt.Color(240, 240, 240));
        billThree.setText("Bill 3");
        jPanel1.add(billThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 240, -1, -1));

        buttonGroup2.add(tenPercent);
        tenPercent.setForeground(new java.awt.Color(240, 240, 240));
        tenPercent.setText("10%");
        jPanel1.add(tenPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 180, -1, -1));

        buttonGroup2.add(fifteenPercent);
        fifteenPercent.setForeground(new java.awt.Color(240, 240, 240));
        fifteenPercent.setText("15%");
        jPanel1.add(fifteenPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 210, -1, -1));

        buttonGroup2.add(eighteenPercent);
        eighteenPercent.setForeground(new java.awt.Color(240, 240, 240));
        eighteenPercent.setText("18%");
        jPanel1.add(eighteenPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 240, -1, -1));

        buttonGroup2.add(twentyPercent);
        twentyPercent.setForeground(new java.awt.Color(240, 240, 240));
        twentyPercent.setText("20%");
        jPanel1.add(twentyPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 180, -1, -1));

        buttonGroup2.add(twentyFivePercent);
        twentyFivePercent.setForeground(new java.awt.Color(240, 240, 240));
        twentyFivePercent.setText("25%");
        jPanel1.add(twentyFivePercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 210, -1, -1));

        buttonGroup2.add(thirtyPercent);
        thirtyPercent.setForeground(new java.awt.Color(240, 240, 240));
        thirtyPercent.setText("30%");
        jPanel1.add(thirtyPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Goes back to customer mode.
    */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new Home().setVisible(true); 
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        calculate();
        jLabel2.setVisible(true);
    }//GEN-LAST:event_submitActionPerformed


    /**
    * Set buttons invisible if the bill is empty because you cannot calculate a 
    * tip for an empty bill. 
    */
    public void setButtons(){
    
        if(menu.bill1.isEmpty())
            billOne.setVisible(false);
        else
            billOne.setVisible(true);
        
        if(menu.bill2.isEmpty())
            billTwo.setVisible(false);
        else
            billTwo.setVisible(true);
        
        if(menu.bill3.isEmpty())
            billThree.setVisible(false);
        else
            billThree.setVisible(true);
        
        if(menu.bill1.isEmpty() && menu.bill2.isEmpty() && menu.bill3.isEmpty()){
            jLabel1.setText("No Bills Available");
            jLabel4.setVisible(false);
            jLabel3.setVisible(false);
            tenPercent.setVisible(false);
            fifteenPercent.setVisible(false);
            eighteenPercent.setVisible(false);
            twentyPercent.setVisible(false);
            twentyFivePercent.setVisible(false);
            thirtyPercent.setVisible(false);
            submit.setVisible(false);
             
        }else{
            jLabel1.setText("Calculate Tip");
            submit.setVisible(true);
            jLabel3.setVisible(true);
            tenPercent.setVisible(true);
            fifteenPercent.setVisible(true);
            eighteenPercent.setVisible(true);
            twentyPercent.setVisible(true);
            twentyFivePercent.setVisible(true);
            thirtyPercent.setVisible(true);
            jLabel4.setText("Choose Bill");
        }
    
    }
    
    /**
     * Calculates the tip based on which bill is selected and which tip
     * percentage is selected
     */
    public void calculate(){
            
        if(billOne.isSelected()){
            if(tenPercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.10, menu.bill1.subTotal())));
            else if(fifteenPercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.15, menu.bill1.subTotal())));
            else if(eighteenPercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.18, menu.bill1.subTotal())));
            else if(twentyPercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.20, menu.bill1.subTotal())));
            else if(twentyFivePercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.25, menu.bill1.subTotal())));
            else if(thirtyPercent.isSelected())
                jLabel2.setText("The tip for bill one is $" +df.format(menu.bill1.calcTip(.30, menu.bill1.subTotal())));
            else
                jLabel2.setText("Please make sure you select a tip percentage and"
                    + " the bill you wish the calculate the tip for.");
        }else if(billTwo.isSelected()){
            if(tenPercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.10, menu.bill2.subTotal())));
            else if(fifteenPercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.15, menu.bill2.subTotal())));
            else if(eighteenPercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.18, menu.bill2.subTotal())));
            else if(twentyPercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.20, menu.bill2.subTotal())));
            else if(twentyFivePercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.25, menu.bill2.subTotal())));
            else if(thirtyPercent.isSelected())
                jLabel2.setText("The tip for bill two is $" +df.format(menu.bill2.calcTip(.30, menu.bill2.subTotal())));
            else
                jLabel2.setText("Please make sure you select a tip percentage and"
                    + " the bill you wish the calculate the tip for.");
        }else if(billThree.isSelected()){
            if(tenPercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.10, menu.bill3.subTotal())));
            else if(fifteenPercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.15, menu.bill3.subTotal())));
            else if(eighteenPercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.18, menu.bill3.subTotal())));
            else if(twentyPercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.20, menu.bill3.subTotal())));
            else if(twentyFivePercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.25, menu.bill3.subTotal())));
            else if(thirtyPercent.isSelected())
                jLabel2.setText("The tip for bill three is $" +df.format(menu.bill3.calcTip(.30, menu.bill3.subTotal())));
            else
                jLabel2.setText("Please make sure you select a tip percentage and"
                    + " the bill you wish the calculate the tip for.");
        }else
            jLabel2.setText("Please make sure you select a tip percentage and"
                    + " the bill you wish the calculate the tip for.");
    
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
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JRadioButton billOne;
    private javax.swing.JRadioButton billThree;
    private javax.swing.JRadioButton billTwo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton eighteenPercent;
    private javax.swing.JRadioButton fifteenPercent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton tenPercent;
    private javax.swing.JRadioButton thirtyPercent;
    private javax.swing.JRadioButton twentyFivePercent;
    private javax.swing.JRadioButton twentyPercent;
    // End of variables declaration//GEN-END:variables
}
