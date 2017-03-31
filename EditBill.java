/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */

import javax.swing.JCheckBox;


public class EditBill extends javax.swing.JFrame {

    private JCheckBox[] p1 = new JCheckBox[15];
    private JCheckBox[] p2 = new JCheckBox[15];
    private JCheckBox[] p3 = new JCheckBox[15];
    /**
     * Creates new form EditBill
     */
    public EditBill() {
        initComponents();
        loadCheckBoxArrays();
        setBillOne();
        setBillTwo();
        setBillThree();
        billCheck();

    }

    /**
    * Checks if there are any bills and if there aren't any, notifies the user.
    */
    public void billCheck(){
    
        if(!billOne.isVisible() && !billTwo.isVisible() && !billThree.isVisible())
            jLabel2.setText("No Bills available to display.");
        
    }
    
    /**
    * Checks to see if an item is supposed to be removed from check one.
    * If the first item is removed, all following items are shifted down one
    * so that the items will later be displayed or processed properly. 
    */
    public void removeFromCheckOne(){
        int x = 0;
        if(p1[0].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[1].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[2].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[3].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[4].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[5].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[6].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[7].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[8].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[9].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[10].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[11].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[12].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[13].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        if(p1[14].isSelected())
            menu.bill1.remove(x);
        else
            x++;
        
        
    }
    
    /**
    * Checks to see if an item is supposed to be removed from check one.
    * If the first item is removed, all following items are shifted down one
    * so that the items will later be displayed or processed properly. 
    */
    public void removeFromCheckTwo(){
        int x = 0;
        if(p2[0].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[1].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[2].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[3].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[4].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[5].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[6].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[7].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[8].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[9].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[10].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[11].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[12].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[13].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        if(p2[14].isSelected())
            menu.bill2.remove(x);
        else
            x++;
        
    }
    
    /**
    * Checks to see if an item is supposed to be removed from check one.
    * If the first item is removed, all following items are shifted down one
    * so that the items will later be displayed or processed properly. 
    */
    public void removeFromCheckThree(){
        int x = 0;
        if(p3[0].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[1].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[2].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[3].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[4].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[5].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[6].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[7].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[8].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[9].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[10].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[11].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[12].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[13].isSelected())
            menu.bill3.remove(x);
        else
            x++;
        if(p3[14].isSelected())
            menu.bill3.remove(x);
        else
            x++;
    }
    
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setBillOne(){

        if(0 < menu.bill1.getCurrSize()){
            p1[0].setSelected(false);
            p1[0].setText(menu.bill1.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill1.getCurrSize()){
                    p1[i].setVisible(true);
                    p1[i].setSelected(false);
                    p1[i].setText(menu.bill1.getItemName(i));
                }else{
                    p1[i].setSelected(false);               
                    p1[i].setVisible(false);
                }
                
            }
        }else{
            for(int i = 0; i < 15; i++){
                p1[i].setSelected(false);
                p1[i].setVisible(false);
            }
            deleteFromBillOne.setVisible(false);
            billOne.setVisible(false);
            jButton1.setVisible(false);
        }
        
    
    }
    
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setBillTwo(){
        if(0 < menu.bill2.getCurrSize()){
            p2[0].setSelected(false);
            p2[0].setText(menu.bill2.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill2.getCurrSize()){
                    p2[i].setVisible(true);
                    p2[i].setSelected(false);
                    p2[i].setText(menu.bill2.getItemName(i));
                }else{
                    p2[i].setSelected(false);
                    p2[i].setVisible(false);
                }
            }
        }else{
            for(int i = 0; i < 15; i++){
                p2[i].setSelected(false);
                p2[i].setVisible(false);
            }
            deleteFromBillTwo.setVisible(false);
            billTwo.setVisible(false);
            jButton2.setVisible(false);
        }
    }
        
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setBillThree(){
        if(0 < menu.bill3.getCurrSize()){
            p3[0].setSelected(false);
            p3[0].setText(menu.bill3.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill3.getCurrSize()){
                    p3[i].setVisible(true);
                    p3[i].setSelected(false);
                    p3[i].setText(menu.bill3.getItemName(i)); 
                }else{
                    p3[i].setSelected(false);
                    p3[i].setVisible(false);
                }
            }
        }else{
            for(int i = 0; i < 15; i++){
                p3[i].setSelected(false);
                p3[i].setVisible(false);
            }
            deleteFromBillThree.setVisible(false);
            billThree.setVisible(false);
            jButton3.setVisible(false);
        }
    
    }

    /**
    * Loads check boxes into 3 separate arrays of check boxes corresponding to
    * each bill to make code elsewhere more compact.
    */
    public void loadCheckBoxArrays(){
    
        p1[0] = p1i1;
        p1[1] = p1i2;
        p1[2] = p1i3;
        p1[3] = p1i4;
        p1[4] = p1i5;
        p1[5] = p1i6;
        p1[6] = p1i7;
        p1[7] = p1i8;
        p1[8] = p1i9;
        p1[9] = p1i10;
        p1[10] = p1i11;
        p1[11] = p1i12;
        p1[12] = p1i13;
        p1[13] = p1i14;
        p1[14] = p1i15;
        p2[0] = p2i1;
        p2[1] = p2i2;
        p2[2] = p2i3;
        p2[3] = p2i4;
        p2[4] = p2i5;
        p2[5] = p2i6;
        p2[6] = p2i7;
        p2[7] = p2i8;
        p2[8] = p2i9;
        p2[9] = p2i10;
        p2[10] = p2i11;
        p2[11] = p2i12;
        p2[12] = p2i13;
        p2[13] = p2i14;
        p2[14] = p2i15;
        p3[0] = p3i1;
        p3[1] = p3i2;
        p3[2] = p3i3;
        p3[3] = p3i4;
        p3[4] = p3i5;
        p3[5] = p3i6;
        p3[6] = p3i7;
        p3[7] = p3i8;
        p3[8] = p3i9;
        p3[9] = p3i10;
        p3[10] = p3i11;
        p3[11] = p3i12;
        p3[12] = p3i13;
        p3[13] = p3i14;
        p3[14] = p3i15;
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        billOne = new javax.swing.JLabel();
        p1i1 = new javax.swing.JCheckBox();
        p3i3 = new javax.swing.JCheckBox();
        p3i2 = new javax.swing.JCheckBox();
        p2i2 = new javax.swing.JCheckBox();
        p2i3 = new javax.swing.JCheckBox();
        p2i4 = new javax.swing.JCheckBox();
        p3i1 = new javax.swing.JCheckBox();
        p1i2 = new javax.swing.JCheckBox();
        p1i4 = new javax.swing.JCheckBox();
        p2i5 = new javax.swing.JCheckBox();
        p1i3 = new javax.swing.JCheckBox();
        p3i6 = new javax.swing.JCheckBox();
        p1i6 = new javax.swing.JCheckBox();
        p1i5 = new javax.swing.JCheckBox();
        p2i1 = new javax.swing.JCheckBox();
        p1i8 = new javax.swing.JCheckBox();
        p1i7 = new javax.swing.JCheckBox();
        p3i8 = new javax.swing.JCheckBox();
        p3i7 = new javax.swing.JCheckBox();
        p3i5 = new javax.swing.JCheckBox();
        p2i8 = new javax.swing.JCheckBox();
        p2i7 = new javax.swing.JCheckBox();
        p3i9 = new javax.swing.JCheckBox();
        p1i9 = new javax.swing.JCheckBox();
        p2i6 = new javax.swing.JCheckBox();
        p3i4 = new javax.swing.JCheckBox();
        p1i10 = new javax.swing.JCheckBox();
        p2i12 = new javax.swing.JCheckBox();
        p1i11 = new javax.swing.JCheckBox();
        p2i11 = new javax.swing.JCheckBox();
        p3i10 = new javax.swing.JCheckBox();
        p3i11 = new javax.swing.JCheckBox();
        p2i10 = new javax.swing.JCheckBox();
        p2i9 = new javax.swing.JCheckBox();
        p1i14 = new javax.swing.JCheckBox();
        p1i13 = new javax.swing.JCheckBox();
        p1i15 = new javax.swing.JCheckBox();
        p1i12 = new javax.swing.JCheckBox();
        deleteFromBillOne = new javax.swing.JButton();
        p3i14 = new javax.swing.JCheckBox();
        p2i14 = new javax.swing.JCheckBox();
        p2i13 = new javax.swing.JCheckBox();
        p3i12 = new javax.swing.JCheckBox();
        p3i13 = new javax.swing.JCheckBox();
        p2i15 = new javax.swing.JCheckBox();
        p3i15 = new javax.swing.JCheckBox();
        deleteFromBillTwo = new javax.swing.JButton();
        deleteFromBillThree = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        billThree = new javax.swing.JLabel();
        billTwo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billOne.setForeground(new java.awt.Color(240, 240, 240));
        billOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billOne.setText("Bill 1");
        jPanel1.add(billOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 41, 137, 18));

        p1i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i1.setForeground(new java.awt.Color(240, 240, 240));
        p1i1.setText("Menu Item");
        jPanel1.add(p1i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 68, 190, -1));

        p3i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i3.setForeground(new java.awt.Color(240, 240, 240));
        p3i3.setText("Menu Item");
        jPanel1.add(p3i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 128, 190, -1));

        p3i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i2.setForeground(new java.awt.Color(240, 240, 240));
        p3i2.setText("Menu Item");
        jPanel1.add(p3i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 98, 190, -1));

        p2i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i2.setForeground(new java.awt.Color(240, 240, 240));
        p2i2.setText("Menu Item");
        jPanel1.add(p2i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 98, 190, -1));

        p2i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i3.setForeground(new java.awt.Color(240, 240, 240));
        p2i3.setText("Menu Item");
        jPanel1.add(p2i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 128, 190, -1));

        p2i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i4.setForeground(new java.awt.Color(240, 240, 240));
        p2i4.setText("Menu Item");
        jPanel1.add(p2i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 158, 190, -1));

        p3i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i1.setForeground(new java.awt.Color(240, 240, 240));
        p3i1.setText("Menu Item");
        jPanel1.add(p3i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 68, 190, -1));

        p1i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i2.setForeground(new java.awt.Color(240, 240, 240));
        p1i2.setText("Menu Item");
        jPanel1.add(p1i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 98, 190, -1));

        p1i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i4.setForeground(new java.awt.Color(240, 240, 240));
        p1i4.setText("Menu Item");
        jPanel1.add(p1i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 158, 190, -1));

        p2i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i5.setForeground(new java.awt.Color(240, 240, 240));
        p2i5.setText("Menu Item");
        jPanel1.add(p2i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 188, 190, -1));

        p1i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i3.setForeground(new java.awt.Color(240, 240, 240));
        p1i3.setText("Menu Item");
        jPanel1.add(p1i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 128, 190, -1));

        p3i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i6.setForeground(new java.awt.Color(240, 240, 240));
        p3i6.setText("Menu Item");
        jPanel1.add(p3i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 218, 190, -1));

        p1i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i6.setForeground(new java.awt.Color(240, 240, 240));
        p1i6.setText("Menu Item");
        jPanel1.add(p1i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 218, 190, -1));

        p1i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i5.setForeground(new java.awt.Color(240, 240, 240));
        p1i5.setText("Menu Item");
        jPanel1.add(p1i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 188, 190, -1));

        p2i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i1.setForeground(new java.awt.Color(240, 240, 240));
        p2i1.setText("Menu Item");
        jPanel1.add(p2i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 68, 190, -1));

        p1i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i8.setForeground(new java.awt.Color(240, 240, 240));
        p1i8.setText("Menu Item");
        jPanel1.add(p1i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 278, 190, -1));

        p1i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i7.setForeground(new java.awt.Color(240, 240, 240));
        p1i7.setText("Menu Item");
        jPanel1.add(p1i7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 248, 190, -1));

        p3i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i8.setForeground(new java.awt.Color(240, 240, 240));
        p3i8.setText("Menu Item");
        jPanel1.add(p3i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 278, 190, -1));

        p3i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i7.setForeground(new java.awt.Color(240, 240, 240));
        p3i7.setText("Menu Item");
        jPanel1.add(p3i7, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 248, 190, -1));

        p3i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i5.setForeground(new java.awt.Color(240, 240, 240));
        p3i5.setText("Menu Item");
        jPanel1.add(p3i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 186, 190, -1));

        p2i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i8.setForeground(new java.awt.Color(240, 240, 240));
        p2i8.setText("Menu Item");
        jPanel1.add(p2i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 278, 190, -1));

        p2i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i7.setForeground(new java.awt.Color(240, 240, 240));
        p2i7.setText("Menu Item");
        jPanel1.add(p2i7, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 248, 190, -1));

        p3i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i9.setForeground(new java.awt.Color(240, 240, 240));
        p3i9.setText("Menu Item");
        jPanel1.add(p3i9, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 308, 190, -1));

        p1i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i9.setForeground(new java.awt.Color(240, 240, 240));
        p1i9.setText("Menu Item");
        jPanel1.add(p1i9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 308, 190, -1));

        p2i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i6.setForeground(new java.awt.Color(240, 240, 240));
        p2i6.setText("Menu Item");
        jPanel1.add(p2i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 218, 190, -1));

        p3i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i4.setForeground(new java.awt.Color(240, 240, 240));
        p3i4.setText("Menu Item");
        jPanel1.add(p3i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 158, 190, -1));

        p1i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i10.setForeground(new java.awt.Color(240, 240, 240));
        p1i10.setText("Menu Item");
        jPanel1.add(p1i10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 338, 190, -1));

        p2i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i12.setForeground(new java.awt.Color(240, 240, 240));
        p2i12.setText("Menu Item");
        jPanel1.add(p2i12, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 398, 190, -1));

        p1i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i11.setForeground(new java.awt.Color(240, 240, 240));
        p1i11.setText("Menu Item");
        jPanel1.add(p1i11, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 368, 190, -1));

        p2i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i11.setForeground(new java.awt.Color(240, 240, 240));
        p2i11.setText("Menu Item");
        jPanel1.add(p2i11, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 368, 190, -1));

        p3i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i10.setForeground(new java.awt.Color(240, 240, 240));
        p3i10.setText("Menu Item");
        jPanel1.add(p3i10, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 338, 190, -1));

        p3i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i11.setForeground(new java.awt.Color(240, 240, 240));
        p3i11.setText("Menu Item");
        jPanel1.add(p3i11, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 368, 190, -1));

        p2i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i10.setForeground(new java.awt.Color(240, 240, 240));
        p2i10.setText("Menu Item");
        jPanel1.add(p2i10, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 338, 190, -1));

        p2i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i9.setForeground(new java.awt.Color(240, 240, 240));
        p2i9.setText("Menu Item");
        jPanel1.add(p2i9, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 308, 190, -1));

        p1i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i14.setForeground(new java.awt.Color(240, 240, 240));
        p1i14.setText("Menu Item");
        jPanel1.add(p1i14, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 458, 190, -1));

        p1i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i13.setForeground(new java.awt.Color(240, 240, 240));
        p1i13.setText("Menu Item");
        jPanel1.add(p1i13, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 428, 190, -1));

        p1i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i15.setForeground(new java.awt.Color(240, 240, 240));
        p1i15.setText("Menu Item");
        jPanel1.add(p1i15, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 488, 190, -1));

        p1i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i12.setForeground(new java.awt.Color(240, 240, 240));
        p1i12.setText("Menu Item");
        jPanel1.add(p1i12, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 398, 190, -1));

        deleteFromBillOne.setText("Delete from Bill 1");
        deleteFromBillOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromBillOneActionPerformed(evt);
            }
        });
        jPanel1.add(deleteFromBillOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 516, -1, -1));

        p3i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i14.setForeground(new java.awt.Color(240, 240, 240));
        p3i14.setText("Menu Item");
        jPanel1.add(p3i14, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 458, 190, -1));

        p2i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i14.setForeground(new java.awt.Color(240, 240, 240));
        p2i14.setText("Menu Item");
        jPanel1.add(p2i14, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 458, 190, -1));

        p2i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i13.setForeground(new java.awt.Color(240, 240, 240));
        p2i13.setText("Menu Item");
        jPanel1.add(p2i13, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 428, 190, -1));

        p3i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i12.setForeground(new java.awt.Color(240, 240, 240));
        p3i12.setText("Menu Item");
        jPanel1.add(p3i12, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 398, 190, -1));

        p3i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i13.setForeground(new java.awt.Color(240, 240, 240));
        p3i13.setText("Menu Item");
        jPanel1.add(p3i13, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 428, 190, -1));

        p2i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i15.setForeground(new java.awt.Color(240, 240, 240));
        p2i15.setText("Menu Item");
        jPanel1.add(p2i15, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 488, 190, -1));

        p3i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i15.setForeground(new java.awt.Color(240, 240, 240));
        p3i15.setText("Menu Item");
        jPanel1.add(p3i15, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 488, 190, -1));

        deleteFromBillTwo.setText("Delete from Bill 2");
        deleteFromBillTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromBillTwoActionPerformed(evt);
            }
        });
        jPanel1.add(deleteFromBillTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 516, -1, -1));

        deleteFromBillThree.setText("Delete from Bill 3");
        deleteFromBillThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromBillThreeActionPerformed(evt);
            }
        });
        jPanel1.add(deleteFromBillThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 522, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Bill");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 5, 600, -1));

        billThree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billThree.setForeground(new java.awt.Color(240, 240, 240));
        billThree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billThree.setText("Bill 3");
        jPanel1.add(billThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 41, 137, 18));

        billTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billTwo.setForeground(new java.awt.Color(240, 240, 240));
        billTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billTwo.setText("Bill 2");
        jPanel1.add(billTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 41, 137, 18));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 5, -1, -1));

        jButton1.setText("Delete All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 516, -1, -1));

        jButton2.setText("Delete All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 516, -1, -1));

        jButton3.setText("Delete All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 522, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new ChooseUser().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void deleteFromBillOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromBillOneActionPerformed
        removeFromCheckOne();
        setBillOne();
    }//GEN-LAST:event_deleteFromBillOneActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void deleteFromBillTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromBillTwoActionPerformed
        removeFromCheckTwo();
        setBillTwo();
    }//GEN-LAST:event_deleteFromBillTwoActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void deleteFromBillThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromBillThreeActionPerformed
        removeFromCheckThree();
        setBillThree();
    }//GEN-LAST:event_deleteFromBillThreeActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu.bill1.payBill();
        setBillOne();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu.bill2.payBill();
        setBillTwo();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * Updates the bill and updates what is displayed.
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu.bill3.payBill();
        setBillThree();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billOne;
    private javax.swing.JLabel billThree;
    private javax.swing.JLabel billTwo;
    private javax.swing.JButton deleteFromBillOne;
    private javax.swing.JButton deleteFromBillThree;
    private javax.swing.JButton deleteFromBillTwo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox p1i1;
    private javax.swing.JCheckBox p1i10;
    private javax.swing.JCheckBox p1i11;
    private javax.swing.JCheckBox p1i12;
    private javax.swing.JCheckBox p1i13;
    private javax.swing.JCheckBox p1i14;
    private javax.swing.JCheckBox p1i15;
    private javax.swing.JCheckBox p1i2;
    private javax.swing.JCheckBox p1i3;
    private javax.swing.JCheckBox p1i4;
    private javax.swing.JCheckBox p1i5;
    private javax.swing.JCheckBox p1i6;
    private javax.swing.JCheckBox p1i7;
    private javax.swing.JCheckBox p1i8;
    private javax.swing.JCheckBox p1i9;
    private javax.swing.JCheckBox p2i1;
    private javax.swing.JCheckBox p2i10;
    private javax.swing.JCheckBox p2i11;
    private javax.swing.JCheckBox p2i12;
    private javax.swing.JCheckBox p2i13;
    private javax.swing.JCheckBox p2i14;
    private javax.swing.JCheckBox p2i15;
    private javax.swing.JCheckBox p2i2;
    private javax.swing.JCheckBox p2i3;
    private javax.swing.JCheckBox p2i4;
    private javax.swing.JCheckBox p2i5;
    private javax.swing.JCheckBox p2i6;
    private javax.swing.JCheckBox p2i7;
    private javax.swing.JCheckBox p2i8;
    private javax.swing.JCheckBox p2i9;
    private javax.swing.JCheckBox p3i1;
    private javax.swing.JCheckBox p3i10;
    private javax.swing.JCheckBox p3i11;
    private javax.swing.JCheckBox p3i12;
    private javax.swing.JCheckBox p3i13;
    private javax.swing.JCheckBox p3i14;
    private javax.swing.JCheckBox p3i15;
    private javax.swing.JCheckBox p3i2;
    private javax.swing.JCheckBox p3i3;
    private javax.swing.JCheckBox p3i4;
    private javax.swing.JCheckBox p3i5;
    private javax.swing.JCheckBox p3i6;
    private javax.swing.JCheckBox p3i7;
    private javax.swing.JCheckBox p3i8;
    private javax.swing.JCheckBox p3i9;
    // End of variables declaration//GEN-END:variables
}
