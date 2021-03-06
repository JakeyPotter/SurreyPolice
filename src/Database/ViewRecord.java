/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Array;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jack
 */
public class ViewRecord extends javax.swing.JFrame {

    /**
     * Creates new form ViewRecord
     */
    public ViewRecord() {
        initComponents();
        show_call();
        show_search();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchOption = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        saveOption = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        saveField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tableCombo = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonSearch = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        tableContainer = new javax.swing.JTabbedPane();
        tabCrime = new javax.swing.JScrollPane();
        crimeTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        opTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idView = new javax.swing.JTextField();
        firstNameView = new javax.swing.JTextField();
        surnameView = new javax.swing.JTextField();
        countryView = new javax.swing.JTextField();
        incidentView = new javax.swing.JTextField();
        dobView = new javax.swing.JTextField();
        ethnicView = new javax.swing.JTextField();
        arrestView = new javax.swing.JTextField();
        reportView = new javax.swing.JTextField();
        locationView = new javax.swing.JTextField();
        outcomeView = new javax.swing.JTextField();
        opBox = new javax.swing.JCheckBox();
        convictionBox = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        officerTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        rankTable = new javax.swing.JTable();

        searchOption.setResizable(false);
        searchOption.setSize(new java.awt.Dimension(750, 500));
        searchOption.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Search For...");
        searchOption.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 187, -1));

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crime ID", "Date", "Reported From", "Location", "Outcomes"
            }
        ));
        jScrollPane2.setViewportView(searchTable);

        searchOption.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 703, 310));

        txtSearch.setOpaque(false);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        searchOption.getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 703, -1));

        saveOption.setSize(new java.awt.Dimension(600, 400));
        saveOption.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Enter name to save as");
        saveOption.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 225, 20));

        saveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFieldActionPerformed(evt);
            }
        });
        saveOption.getContentPane().add(saveField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 353, -1));

        saveButton.setText("Submit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        saveOption.getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 353, -1));

        jLabel3.setText("Where to?");
        saveOption.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 20));

        tableCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crimes", "Operations", "Persons" }));
        tableCombo.setToolTipText("");
        tableCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableComboActionPerformed(evt);
            }
        });
        saveOption.getContentPane().add(tableCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonSearch.setText("Search Records");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonSave.setText("Save to file");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        crimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crime ID", "Date", "Reported From", "Location", "Outcome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        crimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crimeTableMouseClicked(evt);
            }
        });
        tabCrime.setViewportView(crimeTable);

        tableContainer.addTab("Crimes", tabCrime);

        opTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crime ID", "Person ID", "Reported For", "Operation?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        opTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(opTable);

        tableContainer.addTab("Operation", jScrollPane3);

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person ID", "First Name", "Last Name", "Date of Birth", "Ethnic Makeup", "Country of Origin", "Previous Convictions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personTable);

        tableContainer.addTab("Persons", jScrollPane1);

        jLabel5.setText("ID");

        jLabel6.setText("Name");

        jLabel7.setText("Surname");

        jLabel8.setText("Country of Origin");

        jLabel9.setText("Date of Incident");

        jLabel10.setText("D.O.B");

        jLabel11.setText("Ethnicity");

        jLabel12.setText("Arrested For");

        jLabel13.setText("Reported For");

        jLabel14.setText("Location");

        jLabel15.setText("Outcome");

        jLabel16.setText("Operation?");

        jLabel17.setText("Previous conviction?");

        idView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idViewActionPerformed(evt);
            }
        });

        surnameView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameViewActionPerformed(evt);
            }
        });

        countryView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryViewActionPerformed(evt);
            }
        });

        opBox.setText("Yes");

        convictionBox.setText("Yes");

        officerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Officer ID", "First Name", "Last Name", "Catagory ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(officerTable);

        rankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rank", "Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(rankTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outcomeView))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(idView, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dobView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(firstNameView, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(ethnicView))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surnameView, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrestView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reportView, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(countryView)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 395, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opBox)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(incidentView, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(locationView)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(convictionBox)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableContainer)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(firstNameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(surnameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(countryView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(incidentView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(dobView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethnicView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrestView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(outcomeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(opBox)
                            .addComponent(convictionBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        saveOption.setVisible(true);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        searchOption.setVisible(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int selection = tableCombo.getSelectedIndex();
        String table = null;
        switch (selection) { //selection for which table
            case 0:
                table = "TBLCRIMES";
                break;
            case 1:
                table = "TBLOPERATIONS";
                break;
            case 2:
                table = "TBLPERSONS";
                break;
            default:
                break;
        }
        try {
            String file = saveField.getText();
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(host, name, pass);
            PreparedStatement ps = conn.prepareStatement("CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE (?,?,?,?,?,?)"); //statement for exporting the contents of a table into a .del file
            Functions.saveFile(ps, file, table);
            JOptionPane.showMessageDialog(saveButton, "Records sucessfully exported!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void tableComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableComboActionPerformed

    private void filter(String query) {
        TableRowSorter<TableModel> rowSorter
                = new TableRowSorter<>(searchTable.getModel());
        searchTable.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(query));
    }
    private void idViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idViewActionPerformed

    }//GEN-LAST:event_idViewActionPerformed

    private void surnameViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameViewActionPerformed

    }//GEN-LAST:event_surnameViewActionPerformed

    private void countryViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryViewActionPerformed

    }//GEN-LAST:event_countryViewActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String query = txtSearch.getText();
        filter(query);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void saveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFieldActionPerformed

    private void personTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTableMouseClicked
        //gets the text in the columns, nd displays them into the relevant text fields
        int y = personTable.getSelectedRow();
        TableModel personModel = personTable.getModel();
        idView.setText(personModel.getValueAt(y, 0).toString());
        firstNameView.setText(personModel.getValueAt(y, 1).toString());
        surnameView.setText(personModel.getValueAt(y, 2).toString());
        dobView.setText(personModel.getValueAt(y, 3).toString());
        ethnicView.setText(personModel.getValueAt(y, 4).toString());
        countryView.setText(personModel.getValueAt(y, 5).toString());
        String conviction = personModel.getValueAt(y, 6).toString();
        if (conviction.equals("true")) {
            convictionBox.setSelected(true);
        } else {
            convictionBox.setSelected(false);
        }

        incidentView.setText("");
        reportView.setText("");
        locationView.setText("");
        outcomeView.setText("");

        opBox.setSelected(false);
        arrestView.setText("");
    }//GEN-LAST:event_personTableMouseClicked

    private void opTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opTableMouseClicked

        firstNameView.setText("");
        surnameView.setText("");
        dobView.setText("");
        ethnicView.setText("");
        countryView.setText("");
        convictionBox.setSelected(false);

        incidentView.setText("");
        reportView.setText("");
        locationView.setText("");
        outcomeView.setText("");

        int x = opTable.getSelectedRow();
        TableModel opModel = opTable.getModel();
        idView.setText(opModel.getValueAt(x, 0).toString());
        arrestView.setText(opModel.getValueAt(x, 2).toString());
        String operation = opModel.getValueAt(x, 3).toString();
        if (operation.equals("true")) {
            opBox.setSelected(true);
        } else {
            opBox.setSelected(false);
        }
    }//GEN-LAST:event_opTableMouseClicked

    private void crimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crimeTableMouseClicked


        int i = crimeTable.getSelectedRow();
        i = crimeTable.convertRowIndexToModel(i);
        TableModel crimeModel = crimeTable.getModel();
        idView.setText(crimeModel.getValueAt(i, 0).toString());
        incidentView.setText(crimeModel.getValueAt(i, 1).toString());
        reportView.setText(crimeModel.getValueAt(i, 2).toString());
        locationView.setText(crimeModel.getValueAt(i, 3).toString());
        outcomeView.setText(crimeModel.getValueAt(i, 4).toString());

        firstNameView.setText("");
        surnameView.setText("");
        dobView.setText("");
        ethnicView.setText("");
        countryView.setText("");
        convictionBox.setSelected(false);



    }//GEN-LAST:event_crimeTableMouseClicked

    /**
     * @param args the command line arguments
     * @return
     */
    //...and displays them
    public void show_call() {
        ArrayList<CallCrime> crimelist = CreateList.crimeList(); //creates the list
        DefaultTableModel crimemodel = (DefaultTableModel) crimeTable.getModel(); //this gets the table (which is tblcrimes)
        Object[] rowcrime = new Object[6]; //creating an array to display the rows in order. row lines up to the amount of rows in tblcrimes
        for (int i = 0; i < crimelist.size(); i++) {
            rowcrime[0] = crimelist.get(i).getCrimeID();
            rowcrime[1] = crimelist.get(i).getDate();
            rowcrime[2] = crimelist.get(i).getreportedFrom();
            rowcrime[3] = crimelist.get(i).getLocation();
            rowcrime[4] = crimelist.get(i).getOutcomes();
            crimemodel.addRow(rowcrime);
        }
        ArrayList<CallPersons> personlist = CreateList.personList(); //creates the list
        DefaultTableModel personmodel = (DefaultTableModel) personTable.getModel(); //this gets the table (which is tblpersons)
        Object[] row = new Object[7]; //creating an array to display the rows in order. row lines up to the amount of rows in tblpersons
        for (int i = 0; i < personlist.size(); i++) {
            row[0] = personlist.get(i).getPersonID();
            row[1] = personlist.get(i).getFirstName();
            row[2] = personlist.get(i).getLastName();
            row[3] = personlist.get(i).getDateOfBirth();
            row[4] = personlist.get(i).getEthnicMakeup();
            row[5] = personlist.get(i).getCountyOfOrigin();
            row[6] = personlist.get(i).getPrevConvictions();
            personmodel.addRow(row);
        }
        ArrayList<CallOperations> operationlist = CreateList.operationList(); //creates the list
        DefaultTableModel opmodel = (DefaultTableModel) opTable.getModel(); //this gets the table (which is tbloperations)
        Object[] oprow = new Object[4]; //creating an array to display the rows in order. row lines up to the amount of rows in tbloperations
        for (int i = 0; i < operationlist.size(); i++) {
            oprow[0] = operationlist.get(i).getCrimeID();
            oprow[1] = operationlist.get(i).getPersonID();
            oprow[2] = operationlist.get(i).getreportedFor();
            oprow[3] = operationlist.get(i).getOperation();
            opmodel.addRow(oprow);
        }
        ArrayList<CallOfficers> officerlist = CreateList.officerList(); //creates the list
        DefaultTableModel officermodel = (DefaultTableModel) officerTable.getModel(); //this gets the table (which is tblofficers)
        Object[] offrow = new Object[4]; //creating an array to display the rows in order. row lines up to the amount of rows in tblofficers
        for (int i = 0; i < officerlist.size(); i++) {
            offrow[0] = officerlist.get(i).getOfficerID();
            offrow[1] = officerlist.get(i).getFirstName();
            offrow[2] = officerlist.get(i).getLastName();
            offrow[3] = officerlist.get(i).getCatagoryID();
            officermodel.addRow(offrow);
        }

        ArrayList<CallRanks> ranklist = CreateList.rankList();
        DefaultTableModel rankmodel = (DefaultTableModel) rankTable.getModel();
        Object[] rankrow = new Object[3];
        for (int i = 0; i < ranklist.size(); i++) {
            row[0] = ranklist.get(i).getName();
            row[1] = ranklist.get(i).getTwo();
            rankmodel.addRow(row);
        }
        //get firstname from tblofficers and use it in the sorting the list
        try {
            String host = "jdbc:derby://localhost:1527/surreypolice";
            String name = "surreypolice";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(host, name, pass);
            List<String> temp = new ArrayList<String>();
            String statement1 = "SELECT firstname FROM tblOfficers  ";
            PreparedStatement preparedstatement = conn.prepareStatement(statement1);
            try {
                ResultSet res = preparedstatement.executeQuery();
                while (res.next()) {
                    temp.add(res.getString("firstname"));
                }
            } finally {
                preparedstatement.close();
            }
            String[] temp2 = temp.toArray(new String[0]);
            functstr.q(temp2);
            System.out.println(Arrays.toString(temp2));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void show_search() {
        ArrayList<CallCrime> list = CreateList.crimeList(); //creates the list
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel(); //this gets the table (which is tblcrimes)
        Object[] row = new Object[6]; //creating an array to display the rows in order. row lines up to the amount of rows in tblcrimes
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCrimeID();
            row[1] = list.get(i).getDate();
            row[2] = list.get(i).getreportedFrom();
            row[3] = list.get(i).getLocation();
            row[4] = list.get(i).getOutcomes();
            model.addRow(row);

        }

    }

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
            java.util.logging.Logger.getLogger(ViewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrestView;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JCheckBox convictionBox;
    private javax.swing.JTextField countryView;
    private javax.swing.JTable crimeTable;
    private javax.swing.JTextField dobView;
    private javax.swing.JTextField ethnicView;
    private javax.swing.JTextField firstNameView;
    private javax.swing.JTextField idView;
    private javax.swing.JTextField incidentView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField locationView;
    private javax.swing.JTable officerTable;
    private javax.swing.JCheckBox opBox;
    private javax.swing.JTable opTable;
    private javax.swing.JTextField outcomeView;
    private javax.swing.JTable personTable;
    private javax.swing.JTable rankTable;
    private javax.swing.JTextField reportView;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField saveField;
    private javax.swing.JFrame saveOption;
    private javax.swing.JFrame searchOption;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField surnameView;
    private javax.swing.JScrollPane tabCrime;
    private javax.swing.JComboBox<String> tableCombo;
    private javax.swing.JTabbedPane tableContainer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
