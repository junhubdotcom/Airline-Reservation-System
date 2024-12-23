/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.main.CustomPlugin;

import Models.Passenger;

/**
 * @author Sakana
 */
public class ConfirmTemplate extends javax.swing.JPanel {
    private String FirstName, LastName, PhoneNumber, CCCD;
    private Passenger passenger;

    /**
     * Creates new form ConfirmTemplate
     */
    public ConfirmTemplate() {
        initComponents();
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isFullFill() {
        FirstName = FirstNameField.getText();
        LastName = LastNameField1.getText();
        PhoneNumber = PhoneNumberField1.getText();
        CCCD = CCCDField.getText();
        if (FirstName.isEmpty() || LastName.isEmpty() || PhoneNumber.isEmpty() || CCCD.isEmpty()) {
            System.out.println("khong du thong tin");
            return false;
        }
        return true;
    }

    public Passenger getData() {
        Passenger p=new Passenger();
        p.setFirstName(FirstName);
        p.setLastName(LastName);
        p.setPhoneNumber(PhoneNumber);
        p.setCitizenID(CCCD);
        return p;
    }

    public ConfirmTemplate(int index) {
        initComponents();
        PassNo.setText("Hành Khách Số " + index);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstNameField = new javax.swing.JTextField();
        CCCDField = new javax.swing.JTextField();
        LastNameField1 = new javax.swing.JTextField();
        PhoneNumberField1 = new javax.swing.JTextField();
        PassNo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(220, 226, 252));

        FirstNameField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        FirstNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Họ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        CCCDField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CCCDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Căn Cước Công Dân", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        LastNameField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LastNameField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        PhoneNumberField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PhoneNumberField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số Điện Thoại ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 14))); // NOI18N

        PassNo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        PassNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassNo.setText("Hành Khách Số 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PhoneNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CCCDField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 125, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(PassNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(PassNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LastNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(PhoneNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(CCCDField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCDField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField1;
    private javax.swing.JLabel PassNo;
    private javax.swing.JTextField PhoneNumberField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
