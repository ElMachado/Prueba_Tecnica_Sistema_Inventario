package facturacion;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Interfaz_principal extends javax.swing.JFrame {
control_existencias ctrl = new control_existencias();

    public Interfaz_principal() {
        initComponents();
    }

    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Buscararticulos = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        item_venta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(java.awt.Color.lightGray);

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem1.setText("Buscar clientes");
        jMenuItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem4.setText("Registrar");
        jMenuItem4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setText("Artículos");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24));
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem3.setText("Registar");
        jMenuItem3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        Buscararticulos.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Buscararticulos.setText("Lista de articulos");
        Buscararticulos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscararticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscararticulosActionPerformed(evt);
            }
        });
        jMenu2.add(Buscararticulos);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem6.setText("Actualizar stock");
        jMenuItem6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jMenuItem8.setText("Devoluciones");
        jMenuItem8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setText("Facturación");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); 
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 50));

        item_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        item_venta.setText("Nueva venta");
        item_venta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ventaActionPerformed(evt);
            }
        });
        jMenu3.add(item_venta);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24));
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem7.setText("Consulta facturas clientes");
        jMenuItem7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu5.setText("Proveedores");
        jMenu5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); 
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem2.setText("Registrar proveedor");
        jMenuItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jMenuItem5.setText("Lista proveedores");
        jMenuItem5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
       Interfaz_buscarclientes buscar = new Interfaz_buscarclientes();
        jDesktopPane1.add(buscar);
        buscar.show(); 
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
    
           Interfaz_Proveedor prov = new Interfaz_Proveedor();
       
        jDesktopPane1.add(prov);
        prov.show();
       

    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
       
        Interfaz_articulo art = new Interfaz_articulo();
        jDesktopPane1.add(art);
        art.show();       
            
        
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
            
               
          Interfaz_Clientes cli = new Interfaz_Clientes();       
          jDesktopPane1.add(cli);
          cli.show();          
            
    
    }

    private void BuscararticulosActionPerformed(java.awt.event.ActionEvent evt) {
        interfaz_buscararticulos bus = new interfaz_buscararticulos();
        jDesktopPane1.add(bus);
        bus.show(); 
    }

    private void item_ventaActionPerformed(java.awt.event.ActionEvent evt) {
     String venta = JOptionPane.showInputDialog(this,"Ingrese el documento del cliente: ",JOptionPane.OK_OPTION);
       if(ctrl.existe_cliente(venta))
       {
        Interfaz_factura fact = new Interfaz_factura(ctrl);
        jDesktopPane1.add(fact);
        fact.show(); 
       }
       else
       {
              
          JOptionPane.showMessageDialog(null,"El cliente no existe, debe registrarlo","Mensaje",JOptionPane.QUESTION_MESSAGE);  
       }
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
     Interfaz_buscarproveedor proveedor = new Interfaz_buscarproveedor();
        jDesktopPane1.add(proveedor);
        proveedor.show(); 
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
    Interfaz_actualizarstock stock = new Interfaz_actualizarstock();
    jDesktopPane1.add(stock);
    stock.show();
    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    interfaz_consultas consulta = new interfaz_consultas();
    jDesktopPane1.add(consulta);
    consulta.show();
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
    Interfaz_devoluciones dev = new Interfaz_devoluciones();
    jDesktopPane1.add(dev);
    dev.show();
    }


    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_principal().setVisible(true);
            }
        });
    }

    private javax.swing.JMenuItem Buscararticulos;
    private javax.swing.JMenuItem item_venta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;

}
