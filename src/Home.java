
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    //ملف المخزن
    File file = new File("d:\\Mall\\store");
    //ملف العملاء 
    File allcustomers = new File("d:\\Mall\\allcustomers");
    //لائحة المخزن
    ArrayList<item> storeArrayList = new ArrayList<>();
    //لائحة العملاء
    ArrayList<Bill> billArrayList = new ArrayList<>();

    //دالة لافراغ الحقول 
    public void Empty() {
        txtId.setText("");
        txtname1.setText("");
        txtnumber.setText("");
        txtname.setText("");
        txtquantity.setText("");
        txtprice.setText("");
        combsection.setSelectedIndex(-1);
    }

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        combsection = new javax.swing.JComboBox<>();
        btnaddS = new javax.swing.JButton();
        btnaddB = new javax.swing.JButton();
        btnremoveS = new javax.swing.JButton();
        btnremoveB = new javax.swing.JButton();
        btnsearchS = new javax.swing.JButton();
        btnsearchC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btndisplayS = new javax.swing.JButton();
        btndisplayC = new javax.swing.JButton();
        btndisplaycustomer = new javax.swing.JButton();
        btnempty = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Sections");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Price");

        txtnumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtquantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        combsection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combsection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothes", "Shoes", "Toys", "Sports", "Cafeteria", "Something another", " " }));
        combsection.setSelectedIndex(-1);

        btnaddS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnaddS.setText("Add to store");
        btnaddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddSActionPerformed(evt);
            }
        });

        btnaddB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnaddB.setText("Add  bill");
        btnaddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddBActionPerformed(evt);
            }
        });

        btnremoveS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnremoveS.setText("Remove from store");
        btnremoveS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveSActionPerformed(evt);
            }
        });

        btnremoveB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnremoveB.setText("Remove bill");
        btnremoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveBActionPerformed(evt);
            }
        });

        btnsearchS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsearchS.setText("Search in store ");
        btnsearchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchSActionPerformed(evt);
            }
        });

        btnsearchC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsearchC.setText("Search for a bill");
        btnsearchC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Name");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("please enter customer information for bill:");

        btndisplayS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndisplayS.setText("Display the store");
        btndisplayS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisplaySActionPerformed(evt);
            }
        });

        btndisplayC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndisplayC.setText("Display all bills");
        btndisplayC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisplayCActionPerformed(evt);
            }
        });

        btndisplaycustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndisplaycustomer.setText("Display the customer");
        btndisplaycustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisplaycustomerActionPerformed(evt);
            }
        });

        btnempty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnempty.setText("Empty");
        btnempty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemptyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combsection, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtquantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(txtnumber)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnempty, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtname1)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnaddS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnaddB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnremoveB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsearchC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndisplayC, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnremoveS, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsearchS, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndisplayS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btndisplaycustomer, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combsection)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtname1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtquantity))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtprice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndisplaycustomer)
                            .addComponent(btnempty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearchS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnremoveS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddS)
                    .addComponent(btndisplayS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnremoveB)
                    .addComponent(btnsearchC)
                    .addComponent(btndisplayC))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //اضافة صنف الى المخزن حيث يطلب رقم الصنف و اسمه وقسمه وكميته وسعره بالمفرد
    //اذا كان الصنف موجود فقط يكفي وضع الرقم والكمية 
    //عند اضافة صنف موجود سابقا سياخذ الكمية ويضيفها الى الكمية السابقة ولن ينظر الى الاسم والقسم والسعر
    private void btnaddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddSActionPerformed
        try {
            if (txtname.getText().isEmpty() | txtquantity.getText().isEmpty() | txtprice.getText().isEmpty() | combsection.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "enter all data please");
            } else {
                boolean flage = false;
                for (item object : storeArrayList) {
                    if (object.getNumberOfItem() == Integer.parseInt(txtnumber.getText())) {
                        object.setQuantityOfItem(object.getQuantityOfItem() + Integer.parseInt(txtquantity.getText()));
                        JOptionPane.showMessageDialog(null, "this item is already exist so the quantity has been add");
                        flage = true;
                    }
                }
                if (!flage) {
                    item it = new item(Integer.parseInt(txtnumber.getText()), txtname.getText(), combsection.getSelectedItem() + "", Integer.parseInt(txtquantity.getText()), Double.parseDouble(txtprice.getText()));
                    storeArrayList.add(it);
                }
                Empty();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "0");
        }
    }//GEN-LAST:event_btnaddSActionPerformed
    //لاضافة فاتورة حيث يتطلب ادخال رقم الصنف وكميته والسعر المعطى للعميل اضافة الى رقم العميل واسمه
    //اذا كان العميل موجود سابقا سياخذ الفاتورة ويضيفها لهولن ينظر الى الاسم
    //اذا ادخلت رقم عميل موجود واسم عميل اخر سياخذ الرقم ويضيف الفاتورة الى سجل العميل صاحب الرقم
    private void btnaddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddBActionPerformed
        try {
            if (txtId.getText().isEmpty() | txtnumber.getText().isEmpty()
                    | txtquantity.getText().isEmpty()
                    | txtprice.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "enter all data please");
            } else {
                boolean flage = false;
                for (item object : storeArrayList) {
                    if ((object.getNumberOfItem() == Integer.parseInt(txtnumber.getText())) && (object.getQuantityOfItem() > Integer.parseInt(txtquantity.getText()))) {
                        for (Bill bill : billArrayList) {
                            if (Integer.parseInt(txtId.getText()) == bill.getNumberOfCustomer()) {
                                Bill B = new Bill(Integer.parseInt(txtId.getText()), bill.getNameOfCustomer(),
                                        Integer.parseInt(txtnumber.getText()), object.getNameOfItem(),
                                        object.getSectionOfItem() + "", Integer.parseInt(txtquantity.getText()),
                                        Double.parseDouble(txtprice.getText()));
                                object.setQuantityOfItem(object.getQuantityOfItem() - B.getQuantityOfItem());
                                Empty();
                                billArrayList.add(B);
                                flage = true;
                                return;
                            }
                        }
                        if (!txtname1.getText().isEmpty() && (object.getQuantityOfItem() > Integer.parseInt(txtquantity.getText()))) {
                            Bill B = new Bill(Integer.parseInt(txtId.getText()), txtname1.getText(),
                                    Integer.parseInt(txtnumber.getText()), object.getNameOfItem(),
                                    object.getSectionOfItem() + "", Integer.parseInt(txtquantity.getText()),
                                    Double.parseDouble(txtprice.getText()));
                            object.setQuantityOfItem(object.getQuantityOfItem() - B.getQuantityOfItem());
                            Empty();
                            billArrayList.add(B);
                            flage = true;
                            return;
                        }
                    }
                }
                if (!flage) {
                    JOptionPane.showMessageDialog(null, "this item is not found or a few quantity");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "1");
        }
    }//GEN-LAST:event_btnaddBActionPerformed
    //لحذف صنف من المخزن حيث فقط يطلب رقم الصنف
    private void btnremoveSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveSActionPerformed
        try {
            for (item it1 : storeArrayList) {
                if (it1.getNumberOfItem() == Integer.parseInt(txtnumber.getText())) {
                    storeArrayList.remove(it1);
                    JOptionPane.showMessageDialog(null, "remove done");
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "2");
        }
    }//GEN-LAST:event_btnremoveSActionPerformed
    //لحذف فاتورة ويتطلب ادخال رقم العميل ورقم الصنف
    //عند حذف فاتورة فان الكمية ستعاد الى المخزن بحسب رقم الصنف
    private void btnremoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveBActionPerformed
        try {
          
             boolean flage = false;
             for (Bill bill : billArrayList) {
                if (bill.getNumberOfItem() ==Integer.parseInt(txtnumber.getText()) && bill.getNumberOfCustomer() == Integer.parseInt(txtId.getText())) {
                    btnsearchCActionPerformed(evt);
                    btnaddSActionPerformed(evt);
                    billArrayList.remove(bill);
                    JOptionPane.showMessageDialog(null, "remove done");
                    Empty();
                    return; 
                }
                 flage = true;
                if (!flage) {
                    JOptionPane.showMessageDialog(null, "this bill is not found");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "3");
        }
    }//GEN-LAST:event_btnremoveBActionPerformed
//للبحث عن معلومات عنصر في المخزن و يتطلب ادخال رقم الصنف
    private void btnsearchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchSActionPerformed
        try {
            for (item it : storeArrayList) {
                if (it.getNumberOfItem() == Integer.parseInt(txtnumber.getText())) {
                    txtnumber.setText(it.getNumberOfItem() + "");
                    txtname.setText(it.getNameOfItem());
                    combsection.setSelectedItem(it.getSectionOfItem());
                    txtquantity.setText(it.getQuantityOfItem() + "");
                    txtprice.setText(it.getPriceOfItem() + "");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "4");
        }
    }//GEN-LAST:event_btnsearchSActionPerformed
    //للبحث عن فاتورة ويتطلب ادخال رقم العميل ورقم الصنف
    private void btnsearchCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchCActionPerformed
        try {
            File files = new File("d:\\Mall\\customer" + txtId.getText());
            if (file.exists()) {
                for (Bill b : billArrayList) {
                    if (b.getNumberOfItem() == Integer.valueOf(txtnumber.getText())) {
                        txtname1.setText(b.getNameOfCustomer());
                        txtnumber.setText(b.getNumberOfItem() + "");
                        txtname.setText(b.getNameOfItem());
                        combsection.setSelectedItem(b.getSectionOfItem());
                        txtquantity.setText(b.getQuantityOfItem() + "");
                        txtprice.setText(b.getPriceOfItem() + "");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "5");
        }
    }//GEN-LAST:event_btnsearchCActionPerformed
    //لطباعة جميع الاصناف الموجودة في المخزن في واجهة اخرى
    private void btndisplaySActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisplaySActionPerformed
        String s = "STORE\n";

        for (item it1 : storeArrayList) {
            s += "{" + it1 + "\n******************************************\n";
        }
        new Display(s).setVisible(true);

    }//GEN-LAST:event_btndisplaySActionPerformed
    //لطباعة جميع الفواتير في واجهة اخرى
    private void btndisplayCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisplayCActionPerformed
        String s = "CUSTOMERS\n";
        for (Bill bill : billArrayList) {
            s += bill + "\n**************************************\n";
        }
        new Display(s).setVisible(true);
    }//GEN-LAST:event_btndisplayCActionPerformed
    //هذا الحدث لكي يتم تعبئة اللوائح في كل مرة تفتح الواجهة الاساسية
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                storeArrayList = (ArrayList<item>) ois.readObject();
                ois.close();
            }
            if (allcustomers.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://Mall//allcustomers"));
                billArrayList = (ArrayList<Bill>) ois.readObject();
                ois.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "7");
        }
    }//GEN-LAST:event_formWindowOpened
    //لحفظ بيانات اللوائح في مستندات في كل مرة يتم اغلاق الواجهة الاسايسة
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(storeArrayList);
            oos.close();
            //
            ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(allcustomers));
            oos1.writeObject(billArrayList);
            oos1.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "8");
        }
    }//GEN-LAST:event_formWindowClosing
    //لعرض جميع الفواتير التي تم بيعها لعميل يتطلبلا ادخال رقمه في واجهةاخرى
    private void btndisplaycustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisplaycustomerActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please enter ID");
        } else {
            StringBuilder str = new StringBuilder();
            for (Bill bill : billArrayList) {
                if (Integer.valueOf(txtId.getText()) == bill.getNumberOfCustomer()) {
                    str.append(bill.toString() + "\n**********************************\n");
                }

            }
            new Display(str.toString()).setVisible(true);
    }//GEN-LAST:event_btndisplaycustomerActionPerformed
    }

    //فقط لافراغ حقول الواجهة 
    private void btnemptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemptyActionPerformed
        Empty();
    }//GEN-LAST:event_btnemptyActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddB;
    private javax.swing.JButton btnaddS;
    private javax.swing.JButton btndisplayC;
    private javax.swing.JButton btndisplayS;
    private javax.swing.JButton btndisplaycustomer;
    private javax.swing.JButton btnempty;
    private javax.swing.JButton btnremoveB;
    private javax.swing.JButton btnremoveS;
    private javax.swing.JButton btnsearchC;
    private javax.swing.JButton btnsearchS;
    private javax.swing.JComboBox<String> combsection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
