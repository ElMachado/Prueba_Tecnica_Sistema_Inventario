package facturacion;
import javax.swing.JOptionPane;

public class Interfaz_Proveedor extends javax.swing.JInternalFrame {
control_existencias cc = new control_existencias();

    public Interfaz_Proveedor() {
        initComponents();
        limpiar();
        bloquear_cajas();
        
        Object[] tipo_doc = cc.combox("tipo_de_documento","id_tipo_documento");
        combo_tipo.removeAllItems();
        for(int i=0;i<tipo_doc.length;i++){
        combo_tipo.addItem(tipo_doc[i]);
        }
        
        Object[] ciudad = cc.combox("ciudad","codigo_ciudad");
        ciudad_combo.removeAllItems();
        for(int i=0;i<ciudad.length;i++){
        ciudad_combo.addItem(ciudad[i]);
        }
    }

   
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        documentoproveedorjTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        nomcomercialjTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nomproveedorjTextField9 = new javax.swing.JTextField();
        apellproveedorjTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        salirprovjButton7 = new javax.swing.JButton();
        cancelprovjButton8 = new javax.swing.JButton();
        regproveedorjButton9 = new javax.swing.JButton();
        dirproveedorjTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nuevoregjButton7 = new javax.swing.JButton();
        telefonoprovjTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox();
        ciudad_combo = new javax.swing.JComboBox();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar proveedor");

        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Registrar clientes");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Documento");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Tipo de documento");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Ciudad");

        jLabel6.setText("Direccion");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(295, 295, 295)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(82, 82, 82)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Registrar clientes");

        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Documento");

        jLabel8.setText("Nombres");

        jLabel9.setText("Apellidos");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Tipo de documento");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Ciudad");

        jLabel12.setText("Direccion");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addGap(295, 295, 295)
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(82, 82, 82)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(20, 20, 20))
        );

        jLabel13.setText("Documento");

        documentoproveedorjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoproveedorjTextField9ActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre comercial");

        nomcomercialjTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomcomercialjTextField10ActionPerformed(evt);
            }
        });

        jLabel15.setText("Nombres");

        nomproveedorjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomproveedorjTextField9ActionPerformed(evt);
            }
        });

        apellproveedorjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellproveedorjTextField9ActionPerformed(evt);
            }
        });

        jLabel16.setText("Apellidos");

        jLabel17.setText("Tipo de documento");

        jLabel18.setText("Ciudad");

        salirprovjButton7.setText("Salir");
        salirprovjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirprovjButton7ActionPerformed(evt);
            }
        });

        cancelprovjButton8.setText("Cancelar");
        cancelprovjButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelprovjButton8ActionPerformed(evt);
            }
        });

        regproveedorjButton9.setText("Registrar");
        regproveedorjButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regproveedorjButton9ActionPerformed(evt);
            }
        });

        dirproveedorjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirproveedorjTextField9ActionPerformed(evt);
            }
        });

        jLabel19.setText("Direccion");

        nuevoregjButton7.setText("Nuevo registro");
        nuevoregjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregjButton7ActionPerformed(evt);
            }
        });

        telefonoprovjTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoprovjTextField9ActionPerformed(evt);
            }
        });

        jLabel20.setText("Telefono");

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ciudad_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(documentoproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(nuevoregjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(regproveedorjButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelprovjButton8)
                        .addGap(27, 27, 27)
                        .addComponent(salirprovjButton7)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(apellproveedorjTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(nomproveedorjTextField9)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomcomercialjTextField10))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(dirproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoprovjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 235, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 235, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 235, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentoproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomcomercialjTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dirproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellproveedorjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoprovjTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirprovjButton7)
                    .addComponent(cancelprovjButton8)
                    .addComponent(regproveedorjButton9)
                    .addComponent(nuevoregjButton7))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 195, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 195, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 195, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 195, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar()
    {
       documentoproveedorjTextField9.setText("");
       nomcomercialjTextField10.setText("");
       nomproveedorjTextField9.setText("");
       apellproveedorjTextField9.setText("");
       dirproveedorjTextField9.setText("");    
       telefonoprovjTextField9.setText("");
    }
    
    public void  bloquear_cajas()
    {
       documentoproveedorjTextField9.setEnabled(false);
       combo_tipo.setEnabled(false);
       nomcomercialjTextField10.setEnabled(false);
       nomproveedorjTextField9.setEnabled(false);
       apellproveedorjTextField9.setEnabled(false);       
       dirproveedorjTextField9.setEnabled(false); 
       ciudad_combo.setEnabled(false);
       telefonoprovjTextField9.setEnabled(false);
       nuevoregjButton7.setEnabled(true);
       regproveedorjButton9.setEnabled(false);
       cancelprovjButton8.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       documentoproveedorjTextField9.setEnabled(true);
       combo_tipo.setEnabled(true);
       nomcomercialjTextField10.setEnabled(true);
       nomproveedorjTextField9.setEnabled(true);
       apellproveedorjTextField9.setEnabled(true);       
       dirproveedorjTextField9.setEnabled(true); 
       ciudad_combo.setEnabled(true);
       telefonoprovjTextField9.setEnabled(true);
       nuevoregjButton7.setEnabled(false);
       regproveedorjButton9.setEnabled(true);
       cancelprovjButton8.setEnabled(true);
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(null, "Quires registrar el cliente?", "Mensaje", JOptionPane.INFORMATION_MESSAGE); 
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showConfirmDialog(null, "Quires registrar el cliente?", "Mensaje", JOptionPane.INFORMATION_MESSAGE);       
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    	this.dispose();
    }

    private void documentoproveedorjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
     documentoproveedorjTextField9.transferFocus();
             
    }

    private void salirprovjButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();
    }
    
    private void regproveedorjButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    String docu,nom,ape, nom_com,dir,ciu,tipo,tel,a; 
        
        docu = documentoproveedorjTextField9.getText();
        tipo = combo_tipo.getSelectedItem().toString();
        nom_com = nomcomercialjTextField10.getText();
        nom = nomproveedorjTextField9.getText();
        ape = apellproveedorjTextField9.getText(); 
        dir = dirproveedorjTextField9.getText();
        ciu = ciudad_combo.getSelectedItem().toString();
        tel = telefonoprovjTextField9.getText();
        
        control_proveedor prov = new control_proveedor(docu, tipo, nom, ape,nom_com, dir, ciu, tel);
        if (!docu.equals("") && !nom_com.equals("") && !nom.equals("") && !ape.equals("") && !dir.equals("") && !tel.equals("") )
        {
        if(prov.ingresar_proveedor())
        {
        JOptionPane.showMessageDialog(null,"El proveedor se registro con exito","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error al registar el proveedor ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Hay campos obligatorios");  
        }
        
       
    }

    private void nuevoregjButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    desbloquear();
    documentoproveedorjTextField9.requestFocus();
    }
    private void cancelprovjButton8ActionPerformed(java.awt.event.ActionEvent evt) {
    bloquear_cajas();  
    limpiar();
    }

    private void nomcomercialjTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
    nomcomercialjTextField10.transferFocus();
    }

    private void dirproveedorjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void nomproveedorjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
    nomproveedorjTextField9.transferFocus();
    }

    private void apellproveedorjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
    apellproveedorjTextField9.transferFocus();
    }

    private void telefonoprovjTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
   telefonoprovjTextField9.transferFocus();
    }
    private javax.swing.JTextField apellproveedorjTextField9;
    private javax.swing.JButton cancelprovjButton8;
    private javax.swing.JComboBox ciudad_combo;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JTextField dirproveedorjTextField9;
    private javax.swing.JTextField documentoproveedorjTextField9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField nomcomercialjTextField10;
    private javax.swing.JTextField nomproveedorjTextField9;
    private javax.swing.JButton nuevoregjButton7;
    private javax.swing.JButton regproveedorjButton9;
    private javax.swing.JButton salirprovjButton7;
    private javax.swing.JTextField telefonoprovjTextField9;

}
