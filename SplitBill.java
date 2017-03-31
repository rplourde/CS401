/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */

import javax.swing.JCheckBox;


public class SplitBill extends javax.swing.JFrame {

    private JCheckBox[] p1 = new JCheckBox[15];
    private JCheckBox[] p2 = new JCheckBox[15];
    private JCheckBox[] p3 = new JCheckBox[15];
    /**
     * Creates new form SplitBill
     */
    public SplitBill() {
        initComponents();
        loadCheckBoxArrays();
        setPersonOne();
        setPersonTwo();
        setPersonThree();
        billCheck();
    }
    
    /**
    * Checks if there are any bills and if there aren't any, notifies the user.
    */
    public void billCheck(){
    
        if(!personOne.isVisible() && !personTwo.isVisible() && !personThree.isVisible())
            jLabel2.setText("No Bills available to display.");
        
    }
    
    /**
    * This checks to see if an item is supposed to be moved to bill two.
    * If the first item is moved, all following items are shifted down one
    * so that the items will later be displayed or processed properly.
    */
    public void moveToBillTwo(){
        int x = 0;
        
        if(p1[0].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[1].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[2].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[3].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[4].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[5].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[6].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[7].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[8].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[9].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[10].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[11].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[12].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[13].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        if(p1[14].isSelected()){
            if(menu.bill2.getCurrSize() < 15){
                menu.bill2.addItem(menu.bill1.getItem(x));
                menu.bill1.remove(x);
            }else
                moveToPersonTwo.setText("Sorry, Person 2 full.");
        }else
            x++;
        
    
    }

    /**
    * This checks to see if an item is supposed to be moved to bill two.
    * If the first item is moved, all following items are shifted down one
    * so that the items will later be displayed or processed properly.
    */
    public void moveToBillThree(){
        int x = 0;
        
        if(p2[0].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[1].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[2].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[3].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[4].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[5].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[6].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[7].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[8].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[9].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[10].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[11].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[12].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[13].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        if(p2[14].isSelected()){
            if(menu.bill3.getCurrSize() < 15){
                menu.bill3.addItem(menu.bill2.getItem(x));
                menu.bill2.remove(x);
            }else
                moveToPersonThree.setText("Sorry, Person 3 full.");
        }else
            x++;
        
    
    }
    
    /**
    * This checks to see if an item is supposed to be moved to bill two.
    * If the first item is moved, all following items are shifted down one
    * so that the items will later be displayed or processed properly.
    */
    public void moveToBillOne(){
        int x = 0;
        
        if(p3[0].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[1].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[2].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[3].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[4].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[5].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[6].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[7].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[8].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[9].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[10].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[11].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[12].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[13].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        if(p3[14].isSelected()){
            if(menu.bill1.getCurrSize() < 15){
                menu.bill1.addItem(menu.bill3.getItem(x));
                menu.bill3.remove(x);
            }else
                moveToPersonOne.setText("Sorry, Person 1 full.");
        }else
            x++;
        
    
    }
    
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setPersonOne(){
        if(0 < menu.bill1.getCurrSize()){
            p1[0].setVisible(true);
            p1[0].setSelected(false);
            moveToPersonTwo.setVisible(true);
            personOne.setVisible(true);
            p1[0].setText(menu.bill1.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill1.getCurrSize()){
                    p1[i].setVisible(true);
                    p1[i].setSelected(false);
                    p1[i].setText(menu.bill1.getItemName(i)); 
                }else{
                    p1[i].setVisible(false);
                    p1[i].setSelected(false);
                }
            }
        }else{
            for(int i = 0; i < 15; i++){
                p1[i].setVisible(false);
                p1[i].setSelected(false);
            }
            moveToPersonTwo.setVisible(false);
            personOne.setVisible(false);
        }
        
    }
    
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setPersonTwo(){
        if(0 < menu.bill2.getCurrSize()){
            p2[0].setVisible(true);
            p2[0].setSelected(false);
            moveToPersonThree.setVisible(true);
            personTwo.setVisible(true);
            p2[0].setText(menu.bill2.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill2.getCurrSize()){
                    p2[i].setVisible(true);
                    p2[i].setSelected(false);
                    p2[i].setText(menu.bill2.getItemName(i)); 
                }else{
                    p2[i].setVisible(false);
                    p2[i].setSelected(false);
                }
            }
        }else{
            for(int i = 0; i < 15; i++){
                p2[i].setVisible(false);
                p2[i].setSelected(false);
            }
            moveToPersonThree.setVisible(false);
            personTwo.setVisible(false);
        }
        
    }
    
        
    /**
    * Displays only enough check boxes to correspond to the number of bill items
    * and enters the name of each item on each check box.
    */
    public void setPersonThree(){
        if(0 < menu.bill3.getCurrSize()){
            p3[0].setVisible(true);
            p3[0].setSelected(false);
            moveToPersonOne.setVisible(true);
            personThree.setVisible(true);
            p3[0].setText(menu.bill3.getItemName(0));
            for(int i = 1; i < 15; i++){
                if(i < menu.bill3.getCurrSize()){
                    p3[i].setVisible(true);
                    p3[i].setSelected(false);
                    p3[i].setText(menu.bill3.getItemName(i)); 
                }else{
                    p3[i].setVisible(false);
                    p3[i].setSelected(false);
                }
            }
        }else{
            for(int i = 0; i < 15; i++){
                p3[i].setVisible(false);
                p3[i].setSelected(false);
            }
            moveToPersonOne.setVisible(false);
            personThree.setVisible(false);
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

        jButton2 = new javax.swing.JButton();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        personOne = new javax.swing.JLabel();
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
        moveToPersonTwo = new javax.swing.JButton();
        p3i14 = new javax.swing.JCheckBox();
        p2i14 = new javax.swing.JCheckBox();
        p2i13 = new javax.swing.JCheckBox();
        p3i12 = new javax.swing.JCheckBox();
        p3i13 = new javax.swing.JCheckBox();
        p2i15 = new javax.swing.JCheckBox();
        p3i15 = new javax.swing.JCheckBox();
        moveToPersonThree = new javax.swing.JButton();
        moveToPersonOne = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        personThree = new javax.swing.JLabel();
        personTwo = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jCheckBox21.setText("jCheckBox21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        personOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personOne.setForeground(new java.awt.Color(240, 240, 240));
        personOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personOne.setText("Person 1");

        p1i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i1.setForeground(new java.awt.Color(240, 240, 240));
        p1i1.setText("Menu Item");
        p1i1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i3.setForeground(new java.awt.Color(240, 240, 240));
        p3i3.setText("Menu Item");
        p3i3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i2.setForeground(new java.awt.Color(240, 240, 240));
        p3i2.setText("Menu Item");
        p3i2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i2.setForeground(new java.awt.Color(240, 240, 240));
        p2i2.setText("Menu Item");
        p2i2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i3.setForeground(new java.awt.Color(240, 240, 240));
        p2i3.setText("Menu Item");
        p2i3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i4.setForeground(new java.awt.Color(240, 240, 240));
        p2i4.setText("Menu Item");
        p2i4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i1.setForeground(new java.awt.Color(240, 240, 240));
        p3i1.setText("Menu Item");
        p3i1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i2.setForeground(new java.awt.Color(240, 240, 240));
        p1i2.setText("Menu Item");
        p1i2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i4.setForeground(new java.awt.Color(240, 240, 240));
        p1i4.setText("Menu Item");
        p1i4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i5.setForeground(new java.awt.Color(240, 240, 240));
        p2i5.setText("Menu Item");
        p2i5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i3.setForeground(new java.awt.Color(240, 240, 240));
        p1i3.setText("Menu Item");
        p1i3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i6.setForeground(new java.awt.Color(240, 240, 240));
        p3i6.setText("Menu Item");
        p3i6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i6.setForeground(new java.awt.Color(240, 240, 240));
        p1i6.setText("Menu Item");
        p1i6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i5.setForeground(new java.awt.Color(240, 240, 240));
        p1i5.setText("Menu Item");
        p1i5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i1.setForeground(new java.awt.Color(240, 240, 240));
        p2i1.setText("Menu Item");
        p2i1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i8.setForeground(new java.awt.Color(240, 240, 240));
        p1i8.setText("Menu Item");
        p1i8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i7.setForeground(new java.awt.Color(240, 240, 240));
        p1i7.setText("Menu Item");
        p1i7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i8.setForeground(new java.awt.Color(240, 240, 240));
        p3i8.setText("Menu Item");
        p3i8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i7.setForeground(new java.awt.Color(240, 240, 240));
        p3i7.setText("Menu Item");
        p3i7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i5.setForeground(new java.awt.Color(240, 240, 240));
        p3i5.setText("Menu Item");
        p3i5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i8.setForeground(new java.awt.Color(240, 240, 240));
        p2i8.setText("Menu Item");
        p2i8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i7.setForeground(new java.awt.Color(240, 240, 240));
        p2i7.setText("Menu Item");
        p2i7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i9.setForeground(new java.awt.Color(240, 240, 240));
        p3i9.setText("Menu Item");
        p3i9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i9.setForeground(new java.awt.Color(240, 240, 240));
        p1i9.setText("Menu Item");
        p1i9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i6.setForeground(new java.awt.Color(240, 240, 240));
        p2i6.setText("Menu Item");
        p2i6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i4.setForeground(new java.awt.Color(240, 240, 240));
        p3i4.setText("Menu Item");
        p3i4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i10.setForeground(new java.awt.Color(240, 240, 240));
        p1i10.setText("Menu Item");
        p1i10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i12.setForeground(new java.awt.Color(240, 240, 240));
        p2i12.setText("Menu Item");
        p2i12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i11.setForeground(new java.awt.Color(240, 240, 240));
        p1i11.setText("Menu Item");
        p1i11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i11.setForeground(new java.awt.Color(240, 240, 240));
        p2i11.setText("Menu Item");
        p2i11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i10.setForeground(new java.awt.Color(240, 240, 240));
        p3i10.setText("Menu Item");
        p3i10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i11.setForeground(new java.awt.Color(240, 240, 240));
        p3i11.setText("Menu Item");
        p3i11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i10.setForeground(new java.awt.Color(240, 240, 240));
        p2i10.setText("Menu Item");
        p2i10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i9.setForeground(new java.awt.Color(240, 240, 240));
        p2i9.setText("Menu Item");
        p2i9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i14.setForeground(new java.awt.Color(240, 240, 240));
        p1i14.setText("Menu Item");
        p1i14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i13.setForeground(new java.awt.Color(240, 240, 240));
        p1i13.setText("Menu Item");
        p1i13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i15.setForeground(new java.awt.Color(240, 240, 240));
        p1i15.setText("Menu Item");
        p1i15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p1i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1i12.setForeground(new java.awt.Color(240, 240, 240));
        p1i12.setText("Menu Item");
        p1i12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p1i12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        moveToPersonTwo.setText("Move to Person 2");
        moveToPersonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToPersonTwoActionPerformed(evt);
            }
        });

        p3i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i14.setForeground(new java.awt.Color(240, 240, 240));
        p3i14.setText("Menu Item");
        p3i14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i14.setForeground(new java.awt.Color(240, 240, 240));
        p2i14.setText("Menu Item");
        p2i14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i13.setForeground(new java.awt.Color(240, 240, 240));
        p2i13.setText("Menu Item");
        p2i13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i12.setForeground(new java.awt.Color(240, 240, 240));
        p3i12.setText("Menu Item");
        p3i12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i13.setForeground(new java.awt.Color(240, 240, 240));
        p3i13.setText("Menu Item");
        p3i13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p2i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2i15.setForeground(new java.awt.Color(240, 240, 240));
        p2i15.setText("Menu Item");
        p2i15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p2i15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        p3i15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3i15.setForeground(new java.awt.Color(240, 240, 240));
        p3i15.setText("Menu Item");
        p3i15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        p3i15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        moveToPersonThree.setText("Move to Person 3");
        moveToPersonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToPersonThreeActionPerformed(evt);
            }
        });

        moveToPersonOne.setText("Move to Person 1");
        moveToPersonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToPersonOneActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Split Bill");

        personThree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personThree.setForeground(new java.awt.Color(240, 240, 240));
        personThree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personThree.setText("Person 3");

        personTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        personTwo.setForeground(new java.awt.Color(240, 240, 240));
        personTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personTwo.setText("Person 2");

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moveToPersonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(personOne, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveToPersonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p2i15)
                                    .addComponent(p2i13)
                                    .addComponent(p2i11)
                                    .addComponent(p2i6)
                                    .addComponent(p2i5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p2i1)
                                    .addComponent(p2i2)
                                    .addComponent(p2i3)
                                    .addComponent(p2i4)
                                    .addComponent(p2i9)
                                    .addComponent(p2i10)
                                    .addComponent(p2i12)
                                    .addComponent(p2i8)
                                    .addComponent(p2i7)
                                    .addComponent(p2i14)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1i10)
                            .addComponent(p1i11)
                            .addComponent(p1i12)
                            .addComponent(p1i13)
                            .addComponent(p1i15)
                            .addComponent(p1i14)
                            .addComponent(p1i7)
                            .addComponent(p1i8)
                            .addComponent(p1i1)
                            .addComponent(p1i2)
                            .addComponent(p1i3)
                            .addComponent(p1i4)
                            .addComponent(p1i5)
                            .addComponent(p1i9)
                            .addComponent(p1i6))))
                .addGap(177, 177, 177)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moveToPersonOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personThree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3i8)
                            .addComponent(p3i7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(p3i14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p3i3)
                                    .addComponent(p3i1)
                                    .addComponent(p3i2))
                                .addComponent(p3i5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p3i13, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personOne, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personThree, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p1i1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i4)
                        .addGap(5, 5, 5)
                        .addComponent(p1i5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1i15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(p3i1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i4)
                            .addGap(3, 3, 3)
                            .addComponent(p3i5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p3i13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(p3i15))
                                .addComponent(p3i14)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(p2i1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(p2i15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moveToPersonTwo)
                    .addComponent(moveToPersonThree)
                    .addComponent(moveToPersonOne))
                .addContainerGap())
        );

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

    /**
    * Goes to choose user.
    */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * Moves items to bill two and resets the display
    */
    private void moveToPersonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToPersonTwoActionPerformed
        moveToBillTwo();
        setPersonOne();
        setPersonTwo();
        setPersonThree();
    }//GEN-LAST:event_moveToPersonTwoActionPerformed

    /**
    * Moves items to bill three and resets the display
    */
    private void moveToPersonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToPersonThreeActionPerformed
        moveToBillThree();
        setPersonOne();
        setPersonTwo();
        setPersonThree();
    }//GEN-LAST:event_moveToPersonThreeActionPerformed

    /**
    * Moves items to bill one and resets the display
    */
    private void moveToPersonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToPersonOneActionPerformed
        moveToBillOne();
        setPersonOne();
        setPersonTwo();
        setPersonThree();
    }//GEN-LAST:event_moveToPersonOneActionPerformed

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
            java.util.logging.Logger.getLogger(SplitBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplitBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplitBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplitBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplitBill().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton moveToPersonOne;
    private javax.swing.JButton moveToPersonThree;
    private javax.swing.JButton moveToPersonTwo;
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
    private javax.swing.JLabel personOne;
    private javax.swing.JLabel personThree;
    private javax.swing.JLabel personTwo;
    // End of variables declaration//GEN-END:variables
}
