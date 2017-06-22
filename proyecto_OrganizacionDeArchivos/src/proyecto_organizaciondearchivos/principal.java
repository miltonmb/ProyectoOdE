package proyecto_organizaciondearchivos;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    private TDA_ARLF archivo;

    public principal() {
        initComponents();
        try {
            archivo = new TDA_ARLF(new File("./Archivo.dat"));
        } catch (IOException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jtab_tabMenu = new javax.swing.JTabbedPane();
        jp_Add = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_addId = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_addName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_addSalary = new javax.swing.JTextField();
        txt_AddBirthdate = new javax.swing.JFormattedTextField();
        bt_add = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jp_modify = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_idModify = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_nameModify = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_salaryModify = new javax.swing.JTextField();
        txt_birthdateModify = new javax.swing.JFormattedTextField();
        bt_modify = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_idSearchModify = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jp_delete = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_idDelete = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        bt_delete = new javax.swing.JLabel();
        jp_search = new javax.swing.JPanel();
        bt_search = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_idSearch = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txt_nameSearch = new javax.swing.JTextField();
        txt_birthdateSeach = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_salarySearch = new javax.swing.JTextField();
        jp_list = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_listRecord = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Person information system");
        setResizable(false);

        jtab_tabMenu.setBackground(new java.awt.Color(12, 190, 4));
        jtab_tabMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtab_tabMenu.setForeground(new java.awt.Color(55, 229, 253));
        jtab_tabMenu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtab_tabMenu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jtab_tabMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtab_tabMenu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtab_tabMenuStateChanged(evt);
            }
        });

        jp_Add.setBackground(new java.awt.Color(5, 247, 119));
        jp_Add.setForeground(new java.awt.Color(55, 229, 253));

        jLabel17.setText("ID:");

        jLabel18.setText("Name:");

        jLabel19.setText("Birthdate:");

        jLabel20.setText("Salary:");

        try {
            txt_AddBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png"))); // NOI18N
        bt_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bt_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_addMouseReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(12, 190, 4));
        jPanel5.setForeground(new java.awt.Color(0, 142, 255));

        jLabel21.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel21.setText("Person information System");

        jLabel22.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel22.setText("> Add");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_AddLayout = new javax.swing.GroupLayout(jp_Add);
        jp_Add.setLayout(jp_AddLayout);
        jp_AddLayout.setHorizontalGroup(
            jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_AddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_AddLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_addSalary))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_AddLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_AddBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_AddLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_addName))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_AddLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_addId)))
                .addGap(18, 18, 18)
                .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_AddLayout.setVerticalGroup(
            jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AddLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AddLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_addId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(15, 15, 15)
                        .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_addName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_AddBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_addSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_AddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jtab_tabMenu.addTab("Add       ", new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/index.png")), jp_Add); // NOI18N

        jp_modify.setBackground(new java.awt.Color(5, 247, 119));
        jp_modify.setForeground(new java.awt.Color(55, 229, 253));

        jLabel23.setText("ID:");

        jLabel24.setText("Name:");

        jLabel25.setText("Birthdate:");

        jLabel26.setText("Salary:");

        try {
            txt_birthdateModify.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bt_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png"))); // NOI18N
        bt_modify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bt_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_modifyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_modifyMouseReleased(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(12, 190, 4));

        jLabel27.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel27.setText("Person information System");

        jLabel28.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel28.setText("> Modify");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel29.setText("ID to modify:");

        javax.swing.GroupLayout jp_modifyLayout = new javax.swing.GroupLayout(jp_modify);
        jp_modify.setLayout(jp_modifyLayout);
        jp_modifyLayout.setHorizontalGroup(
            jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_modifyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idSearchModify))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salaryModify))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_birthdateModify, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nameModify))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idModify)))
                .addGap(18, 18, 18)
                .addComponent(bt_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_modifyLayout.setVerticalGroup(
            jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_modifyLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idSearchModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(15, 15, 15)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txt_nameModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_birthdateModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txt_salaryModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_modifyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jtab_tabMenu.addTab("Modify", new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/index.png")), jp_modify); // NOI18N

        jp_delete.setBackground(new java.awt.Color(5, 247, 119));

        jPanel7.setBackground(new java.awt.Color(12, 190, 4));
        jPanel7.setForeground(new java.awt.Color(0, 142, 255));

        jLabel30.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel30.setText("Person information System");

        jLabel31.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel31.setText("> Delete");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel40.setText("ID:");

        bt_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png"))); // NOI18N
        bt_delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bt_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_deleteMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jp_deleteLayout = new javax.swing.GroupLayout(jp_delete);
        jp_delete.setLayout(jp_deleteLayout);
        jp_deleteLayout.setHorizontalGroup(
            jp_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_deleteLayout.setVerticalGroup(
            jp_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_deleteLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_deleteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jp_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addGroup(jp_deleteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jtab_tabMenu.addTab("Delete ", new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/erase.png")), jp_delete); // NOI18N

        jp_search.setBackground(new java.awt.Color(5, 247, 119));

        bt_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/find-iconNotPressed.png"))); // NOI18N
        bt_search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_searchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_searchMouseReleased(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(12, 190, 4));
        jPanel12.setForeground(new java.awt.Color(0, 142, 255));

        jLabel34.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel34.setText("Person information System");

        jLabel35.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel35.setText("> Search");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel36.setText("ID:");

        jLabel37.setText("Name:");

        txt_nameSearch.setEditable(false);

        txt_birthdateSeach.setEditable(false);
        try {
            txt_birthdateSeach.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel38.setText("Birthdate:");

        jLabel39.setText("Salary:");

        txt_salarySearch.setEditable(false);

        javax.swing.GroupLayout jp_searchLayout = new javax.swing.GroupLayout(jp_search);
        jp_search.setLayout(jp_searchLayout);
        jp_searchLayout.setHorizontalGroup(
            jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_searchLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salarySearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_searchLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_birthdateSeach))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_searchLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nameSearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_searchLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bt_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_searchLayout.setVerticalGroup(
            jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_searchLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_searchLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(15, 15, 15)
                        .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txt_nameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txt_birthdateSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txt_salarySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_searchLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_search)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jtab_tabMenu.addTab("Search", new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/nav_search.png")), jp_search); // NOI18N

        jPanel11.setBackground(new java.awt.Color(12, 190, 4));
        jPanel11.setForeground(new java.awt.Color(0, 142, 255));

        jLabel32.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel32.setText("Person information System");

        jLabel33.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel33.setText("> List");

        jtable_listRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Birthdate", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_listRecord);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addContainerGap(325, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jp_listLayout = new javax.swing.GroupLayout(jp_list);
        jp_list.setLayout(jp_listLayout);
        jp_listLayout.setHorizontalGroup(
            jp_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_listLayout.setVerticalGroup(
            jp_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_listLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtab_tabMenu.addTab("List      ", new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/list.png")), jp_list); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtab_tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtab_tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_searchMousePressed
        // TODO add your handling code here:
        bt_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/find-icon.png")));
    }//GEN-LAST:event_bt_searchMousePressed

    private void bt_searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_searchMouseReleased
        int idBuscar;
        idBuscar = Integer.parseInt(this.txt_idSearch.getText());
        try {
            if (idBuscar == 0) {
                JOptionPane.showMessageDialog(this, "Success!");
            }
        } catch (Exception e) {
        }
        this.txt_idSearch.setText("");
        this.txt_nameSearch.setText("");
        this.txt_birthdateSeach.setText("");
        this.txt_salarySearch.setText("");
        bt_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/find-iconNotPressed.png")));
    }//GEN-LAST:event_bt_searchMouseReleased

    private void bt_addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMouseReleased
        int id;
        String name;
        String birthdate;
        float salary;
        id = Integer.parseInt(this.txt_addId.getText());
        name = this.txt_addName.getText();
        birthdate = this.txt_AddBirthdate.getText();
        salary = Float.parseFloat(this.txt_addSalary.getText());
        if (archivo.insert(new Record(id, name, birthdate, salary))) {
            JOptionPane.showMessageDialog(this, "Success!");
        }
        this.txt_addId.setText("");
        this.txt_AddBirthdate.setText("");
        this.txt_addSalary.setText("");
        this.txt_addName.setText("");
        bt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png")));

    }//GEN-LAST:event_bt_addMouseReleased

    private void bt_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addMousePressed
        bt_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/person.png")));
    }//GEN-LAST:event_bt_addMousePressed

    private void bt_modifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifyMousePressed
        bt_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/person.png")));
    }//GEN-LAST:event_bt_modifyMousePressed

    private void bt_modifyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifyMouseReleased
        int idBuscar;
        int id;
        String name;
        String birthdate;
        float salary;
        idBuscar = Integer.parseInt(this.txt_idSearchModify.getText());
        id = Integer.parseInt(txt_idModify.getText());
        name = txt_nameModify.getText();
        birthdate = txt_birthdateModify.getText();
        salary = Float.parseFloat(this.txt_salaryModify.getText());
        try {
            if (true) {
                JOptionPane.showMessageDialog(this, "Success!");
            }
        } catch (Exception e) {

        }
        this.txt_idSearchModify.setText("");
        this.txt_idModify.setText("");
        this.txt_nameModify.setText("");
        this.txt_birthdateModify.setText("");
        this.txt_salaryModify.setText("");
        bt_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png")));
    }//GEN-LAST:event_bt_modifyMouseReleased

    private void bt_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMousePressed
        bt_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/person.png")));
    }//GEN-LAST:event_bt_deleteMousePressed

    private void bt_deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMouseReleased
        int id;
        id = Integer.parseInt(this.txt_idDelete.getText());
        try {
            if (archivo.delete(id)) {
                JOptionPane.showMessageDialog(this, "Success!");
            }
        } catch (IOException ex) {
        }
        this.txt_idDelete.setText("");
        bt_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_organizaciondearchivos/Images/personButtonNotPressed.png")));
    }//GEN-LAST:event_bt_deleteMouseReleased

    private void jtab_tabMenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtab_tabMenuStateChanged
        if (jtab_tabMenu.getSelectedIndex() == 4) {
            archivo.listar((DefaultTableModel) this.jtable_listRecord.getModel());
        }
        if (jtab_tabMenu.getSelectedIndex() == 3) {
            this.txt_nameSearch.setText("");
            this.txt_birthdateSeach.setText("");
            this.txt_salarySearch.setText("");
        }
    }//GEN-LAST:event_jtab_tabMenuStateChanged

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_add;
    private javax.swing.JLabel bt_delete;
    private javax.swing.JLabel bt_modify;
    private javax.swing.JLabel bt_search;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_Add;
    private javax.swing.JPanel jp_delete;
    private javax.swing.JPanel jp_list;
    private javax.swing.JPanel jp_modify;
    private javax.swing.JPanel jp_search;
    private javax.swing.JTabbedPane jtab_tabMenu;
    private javax.swing.JTable jtable_listRecord;
    private javax.swing.JFormattedTextField txt_AddBirthdate;
    private javax.swing.JTextField txt_addId;
    private javax.swing.JTextField txt_addName;
    private javax.swing.JTextField txt_addSalary;
    private javax.swing.JFormattedTextField txt_birthdateModify;
    private javax.swing.JFormattedTextField txt_birthdateSeach;
    private javax.swing.JTextField txt_idDelete;
    private javax.swing.JTextField txt_idModify;
    private javax.swing.JTextField txt_idSearch;
    private javax.swing.JTextField txt_idSearchModify;
    private javax.swing.JTextField txt_nameModify;
    private javax.swing.JTextField txt_nameSearch;
    private javax.swing.JTextField txt_salaryModify;
    private javax.swing.JTextField txt_salarySearch;
    // End of variables declaration//GEN-END:variables
}
