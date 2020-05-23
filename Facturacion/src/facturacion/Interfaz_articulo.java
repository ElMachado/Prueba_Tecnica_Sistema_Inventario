package facturacion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Interfaz_articulo extends javax.swing.JInternalFrame {
control_existencias con = new control_existencias();

    public Interfaz_articulo() {
        initComponents();
        limpiar();
        bloquear_cajas();
        this.calendario.setEnabled(false);
        
        Object[] desArticulo = con.combox("tipo_articulo","descripcion_articulo");
        Object[] idTipoArticulo = con.combox("tipo_articulo","id_tipoarticulo");
        combotipo.removeAllItems();
        for(int i=0;i<desArticulo.length;i++){
        String itemArticulo = idTipoArticulo[i].toString().concat(" "+desArticulo[i].toString());
        combotipo.addItem(itemArticulo);
        
    }
        Object[] prov = con.combox("proveedor","No_documento");
        comboproveedor.removeAllItems();
        for(int i=0;i<prov.length;i++){
        comboproveedor.addItem(prov[i]);
        
    }
    }


    private void initComponents() {

        descripcion_prod = new javax.swing.JTextField();
        pre_venta = new javax.swing.JTextField();
        cant_prod = new javax.swing.JTextField();
        combotipo = new javax.swing.JComboBox();
        comboproveedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevoreg = new javax.swing.JButton();
        pre_costo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JDateChooser();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar articulo");
        setPreferredSize(new java.awt.Dimension(800, 500));

        descripcion_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_prodActionPerformed(evt);
            }
        });

        pre_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_ventaActionPerformed(evt);
            }
        });

        cant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_prodActionPerformed(evt);
            }
        });

        combotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });

        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedorActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio venta");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Tipo");

        jLabel6.setText("Proveedor");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevoreg.setText("Nuevo registro");
        nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregActionPerformed(evt);
            }
        });

        pre_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_costoActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio costo");

        jLabel8.setText("Fecha ingreso");

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        calendario.setDateFormatString("yyyy/MM/d");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(116, 116, 116))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel7)
                                                            .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(54, 54, 54))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(combotipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(160, 160, 160)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(pre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 662, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(registrar)
                        .addGap(35, 35, 35)
                        .addComponent(cancelar)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoreg)
                    .addComponent(cancelar)
                    .addComponent(jButton1)
                    .addComponent(registrar))
                .addGap(40, 40, 40))
        );

        pack();
    }
public void limpiar()
    {
       
       descripcion_prod.setText("");
       pre_venta.setText("");
       pre_costo.setText("");
       cant_prod.setText("");
       combotipo.setName(""); 
       comboproveedor.setName("");
       calendario.setName("");
    }
    
    public void  bloquear_cajas()
    {
       
       descripcion_prod.setEnabled(false);
       pre_venta.setEnabled(false);
       pre_costo.setEnabled(false);
       cant_prod.setEnabled(false);       
       combotipo.setEnabled(false); 
       comboproveedor.setEnabled(false);
       nuevoreg.setEnabled(true);
       registrar.setEnabled(false);
       cancelar.setEnabled(false);
       this.calendario.getCalendarButton().setEnabled(false);
       
       
    }
    public void  desbloquear()
    {
       
       descripcion_prod.setEnabled(true);
       pre_venta.setEnabled(true);
       pre_costo.setEnabled(true);
       cant_prod.setEnabled(true);       
       combotipo.setEnabled(true); 
       comboproveedor.setEnabled(true);
       nuevoreg.setEnabled(false);
       registrar.setEnabled(true);
       cancelar.setEnabled(true);
       this.calendario.getCalendarButton().setEnabled(true);
       
    }
    private void comboproveedorActionPerformed(java.awt.event.ActionEvent evt) {
    
    }

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {
    
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();
    }

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {
    bloquear_cajas();
    limpiar();
    }

    private void nuevoregActionPerformed(java.awt.event.ActionEvent evt) {
    desbloquear();
    descripcion_prod.requestFocus();
    }

    private void descripcion_prodActionPerformed(java.awt.event.ActionEvent evt) {
    descripcion_prod.transferFocus();
    }

    private void pre_ventaActionPerformed(java.awt.event.ActionEvent evt) {
    pre_venta.transferFocus();
    }

    private void pre_costoActionPerformed(java.awt.event.ActionEvent evt) {
    pre_costo.transferFocus();
    }

    private void cant_prodActionPerformed(java.awt.event.ActionEvent evt) {
    cant_prod.transferFocus();
    }
    public static String convertTostring(Date Date)
        {
            DateFormat df;
            String fech = null;
            df = new SimpleDateFormat("yyyy-MM-d");
            fech = df.format(Date);
            return fech;
        }
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {
        String des, tipo,prov,fecha;
        char strTipoProductos[] = combotipo.getSelectedItem().toString().toCharArray();
        int preve, precos,sto;
        des = descripcion_prod.getText();
        tipo = String.copyValueOf(strTipoProductos,0,1);
        fecha = convertTostring(calendario.getDate());
        preve = Integer.parseInt(pre_venta.getText());
        precos = Integer.parseInt(pre_costo.getText());
        sto = Integer.parseInt(cant_prod.getText());
        prov = comboproveedor.getSelectedItem().toString();
        
        control_articulos ctrl = new control_articulos();
        if(!des.equals(""))
         {          
        if(ctrl.ingresar_articulo(null,des,preve,precos,sto,tipo,prov,fecha))
         {            
        JOptionPane.showMessageDialog(null,"El articulo se registro con exito");
        limpiar();
        bloquear_cajas();
         }
        else
         {
            JOptionPane.showMessageDialog(null,"Error al registrar el articulo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
         }
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Hay campos obligatorios");  
         }
       
    }
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cant_prod;
    private javax.swing.JComboBox comboproveedor;
    private javax.swing.JComboBox combotipo;
    private javax.swing.JTextField descripcion_prod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nuevoreg;
    private javax.swing.JTextField pre_costo;
    private javax.swing.JTextField pre_venta;
    private javax.swing.JButton registrar;
}
