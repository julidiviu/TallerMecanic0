/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package login;

import sql.crudsql;

/**
 *
 * @author julia
 */
public class Sistema extends javax.swing.JFrame {

    public Sistema() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TabbedPaneMain = new javax.swing.JTabbedPane();
        PanelCarros = new javax.swing.JPanel();
        lblregistrarcoches = new javax.swing.JLabel();
        lblcoche = new javax.swing.JLabel();
        txtplavehiculo = new javax.swing.JTextField();
        lblcoche1 = new javax.swing.JLabel();
        txttipvehiculo = new javax.swing.JTextField();
        lblcoche2 = new javax.swing.JLabel();
        txtmodvehiculo = new javax.swing.JTextField();
        lblcoche3 = new javax.swing.JLabel();
        txtcolvehiculo = new javax.swing.JTextField();
        lblcoche4 = new javax.swing.JLabel();
        txtmarvehiculo = new javax.swing.JTextField();
        lblcoche6 = new javax.swing.JLabel();
        txtcedcliente = new javax.swing.JTextField();
        lblcoche5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobsvehiculo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        fondopiratacoche = new javax.swing.JLabel();
        PanelEmpleados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelClientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelPlanilla = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelProducto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelFactura = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PanelSorteo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        IconCarro = new javax.swing.JLabel();
        btnCarro = new javax.swing.JPanel();
        IconTrabajador = new javax.swing.JLabel();
        btntrabajador = new javax.swing.JPanel();
        IconCliente = new javax.swing.JLabel();
        btncliente = new javax.swing.JPanel();
        IconPlantilla = new javax.swing.JLabel();
        btnPlantilla = new javax.swing.JPanel();
        iconproducto = new javax.swing.JLabel();
        btnproducto = new javax.swing.JPanel();
        Iconfactura = new javax.swing.JLabel();
        btnfactura = new javax.swing.JPanel();
        btncerrarsesion = new javax.swing.JPanel();
        txtcerrarsesion = new javax.swing.JLabel();
        BackGr0undlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCarros.setBackground(new java.awt.Color(255, 255, 255));
        PanelCarros.setForeground(new java.awt.Color(255, 0, 0));
        PanelCarros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregistrarcoches.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblregistrarcoches.setForeground(new java.awt.Color(102, 102, 102));
        lblregistrarcoches.setText("REGISTRAR VEHICULOS");
        PanelCarros.add(lblregistrarcoches, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        lblcoche.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche.setText("Placa del Vehículo:");
        PanelCarros.add(lblcoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        txtplavehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtplavehiculo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtplavehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txtplavehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtplavehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplavehiculoActionPerformed(evt);
            }
        });
        PanelCarros.add(txtplavehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, -1));

        lblcoche1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche1.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche1.setText("Tipo de Vehículo:");
        PanelCarros.add(lblcoche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txttipvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txttipvehiculo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txttipvehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txttipvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCarros.add(txttipvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, -1));

        lblcoche2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche2.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche2.setText("Modelo de Vehículo:");
        PanelCarros.add(lblcoche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txtmodvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtmodvehiculo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtmodvehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txtmodvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtmodvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodvehiculoActionPerformed(evt);
            }
        });
        PanelCarros.add(txtmodvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, -1));

        lblcoche3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche3.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche3.setText("Color del Vehículo:");
        PanelCarros.add(lblcoche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txtcolvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtcolvehiculo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtcolvehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txtcolvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCarros.add(txtcolvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 200, -1));

        lblcoche4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche4.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche4.setText("Marca del Vehículo:");
        PanelCarros.add(lblcoche4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txtmarvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtmarvehiculo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtmarvehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txtmarvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCarros.add(txtmarvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 200, -1));

        lblcoche6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche6.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche6.setText("Cedula del propietario:");
        PanelCarros.add(lblcoche6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        txtcedcliente.setBackground(new java.awt.Color(255, 255, 255));
        txtcedcliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtcedcliente.setForeground(new java.awt.Color(51, 51, 51));
        txtcedcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCarros.add(txtcedcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 200, -1));

        lblcoche5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcoche5.setForeground(new java.awt.Color(0, 0, 0));
        lblcoche5.setText("Observaciónes:");
        PanelCarros.add(lblcoche5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        txtobsvehiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtobsvehiculo.setColumns(20);
        txtobsvehiculo.setForeground(new java.awt.Color(51, 51, 51));
        txtobsvehiculo.setRows(5);
        txtobsvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtobsvehiculo);

        PanelCarros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(154, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR VEHICULO");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 0, 0), 0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        PanelCarros.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 160, 40));

        fondopiratacoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/FondoPirata.jpg"))); // NOI18N
        PanelCarros.add(fondopiratacoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        TabbedPaneMain.addTab("tab1", PanelCarros);

        PanelEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("EMPLEADOS");
        PanelEmpleados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 280, 80));

        TabbedPaneMain.addTab("tab2", PanelEmpleados);

        PanelClientes.setBackground(new java.awt.Color(255, 255, 255));
        PanelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CLIENTES");
        PanelClientes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 230, 80));

        TabbedPaneMain.addTab("tab3", PanelClientes);

        PanelPlanilla.setBackground(new java.awt.Color(255, 255, 255));
        PanelPlanilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("PLANILLA");
        PanelPlanilla.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, 80));

        TabbedPaneMain.addTab("tab4", PanelPlanilla);

        PanelProducto.setBackground(new java.awt.Color(255, 255, 255));
        PanelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelProductoMouseClicked(evt);
            }
        });
        PanelProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PRODUCTO");
        PanelProducto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 270, 80));

        TabbedPaneMain.addTab("tab5", PanelProducto);

        PanelFactura.setBackground(new java.awt.Color(255, 255, 255));
        PanelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("FACTURA");
        PanelFactura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, 80));

        TabbedPaneMain.addTab("tab6", PanelFactura);

        PanelSorteo.setBackground(new java.awt.Color(255, 255, 255));
        PanelSorteo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("SORTEO");
        PanelSorteo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, 80));

        TabbedPaneMain.addTab("tab7", PanelSorteo);

        Background.add(TabbedPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1120, 720));

        IconCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/CarroIcon.png"))); // NOI18N
        IconCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCarroMouseClicked(evt);
            }
        });
        Background.add(IconCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnCarro.setBackground(new java.awt.Color(153, 0, 0));
        btnCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCarroLayout = new javax.swing.GroupLayout(btnCarro);
        btnCarro.setLayout(btnCarroLayout);
        btnCarroLayout.setHorizontalGroup(
            btnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btnCarroLayout.setVerticalGroup(
            btnCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Background.add(btnCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 70));

        IconTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/TrabajadorIcon.png"))); // NOI18N
        IconTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconTrabajadorMouseClicked(evt);
            }
        });
        Background.add(IconTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        btntrabajador.setBackground(new java.awt.Color(153, 0, 0));
        btntrabajador.setForeground(new java.awt.Color(153, 0, 0));
        btntrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntrabajadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btntrabajadorLayout = new javax.swing.GroupLayout(btntrabajador);
        btntrabajador.setLayout(btntrabajadorLayout);
        btntrabajadorLayout.setHorizontalGroup(
            btntrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btntrabajadorLayout.setVerticalGroup(
            btntrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Background.add(btntrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 70));

        IconCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Cliente2Icon.png"))); // NOI18N
        IconCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconClienteMouseClicked(evt);
            }
        });
        Background.add(IconCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, 80));

        btncliente.setBackground(new java.awt.Color(153, 0, 0));
        btncliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnclienteLayout = new javax.swing.GroupLayout(btncliente);
        btncliente.setLayout(btnclienteLayout);
        btnclienteLayout.setHorizontalGroup(
            btnclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btnclienteLayout.setVerticalGroup(
            btnclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Background.add(btncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 70));

        IconPlantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/PlantillaIcon.png"))); // NOI18N
        IconPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconPlantillaMouseClicked(evt);
            }
        });
        Background.add(IconPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 60, 80));

        btnPlantilla.setBackground(new java.awt.Color(153, 0, 0));
        btnPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlantillaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPlantillaLayout = new javax.swing.GroupLayout(btnPlantilla);
        btnPlantilla.setLayout(btnPlantillaLayout);
        btnPlantillaLayout.setHorizontalGroup(
            btnPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btnPlantillaLayout.setVerticalGroup(
            btnPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Background.add(btnPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 80));

        iconproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ProductoIcon.png"))); // NOI18N
        Background.add(iconproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 60, 80));

        btnproducto.setBackground(new java.awt.Color(153, 0, 0));
        btnproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnproductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnproductoLayout = new javax.swing.GroupLayout(btnproducto);
        btnproducto.setLayout(btnproductoLayout);
        btnproductoLayout.setHorizontalGroup(
            btnproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btnproductoLayout.setVerticalGroup(
            btnproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Background.add(btnproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 80));

        Iconfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/FacturaIcon.png"))); // NOI18N
        Background.add(Iconfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 50, 60));

        btnfactura.setBackground(new java.awt.Color(153, 0, 0));
        btnfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfacturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnfacturaLayout = new javax.swing.GroupLayout(btnfactura);
        btnfactura.setLayout(btnfacturaLayout);
        btnfacturaLayout.setHorizontalGroup(
            btnfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        btnfacturaLayout.setVerticalGroup(
            btnfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Background.add(btnfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 80));

        btncerrarsesion.setBackground(new java.awt.Color(255, 255, 255));
        btncerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarsesionMouseClicked(evt);
            }
        });

        txtcerrarsesion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtcerrarsesion.setForeground(new java.awt.Color(0, 0, 0));
        txtcerrarsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcerrarsesion.setText("CERRAR SESIÓN");
        txtcerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcerrarsesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncerrarsesionLayout = new javax.swing.GroupLayout(btncerrarsesion);
        btncerrarsesion.setLayout(btncerrarsesionLayout);
        btncerrarsesionLayout.setHorizontalGroup(
            btncerrarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcerrarsesion, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btncerrarsesionLayout.setVerticalGroup(
            btncerrarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncerrarsesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(btncerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 110, 40));

        BackGr0undlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Sistema.jpg"))); // NOI18N
        BackGr0undlbl.setText("jLabel1");
        Background.add(BackGr0undlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    crudsql objcrud=new crudsql();
    private void IconCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCarroMouseClicked
      TabbedPaneMain.setSelectedIndex(0);
    }//GEN-LAST:event_IconCarroMouseClicked

    private void IconTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconTrabajadorMouseClicked
        TabbedPaneMain.setSelectedIndex(1);
    }//GEN-LAST:event_IconTrabajadorMouseClicked

    private void IconClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconClienteMouseClicked
        TabbedPaneMain.setSelectedIndex(2);
    }//GEN-LAST:event_IconClienteMouseClicked

    private void txtcerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcerrarsesionMouseClicked
        login form= new login();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_txtcerrarsesionMouseClicked

    private void btnCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarroMouseClicked
        TabbedPaneMain.setSelectedIndex(0);
    }//GEN-LAST:event_btnCarroMouseClicked

    private void btntrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntrabajadorMouseClicked
        TabbedPaneMain.setSelectedIndex(1);        
    }//GEN-LAST:event_btntrabajadorMouseClicked

    private void btnclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclienteMouseClicked
        TabbedPaneMain.setSelectedIndex(2);
    }//GEN-LAST:event_btnclienteMouseClicked
        
    private void btnfacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfacturaMouseClicked
        TabbedPaneMain.setSelectedIndex(5);
    }//GEN-LAST:event_btnfacturaMouseClicked

    private void IconPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconPlantillaMouseClicked
        TabbedPaneMain.setSelectedIndex(3);
    }//GEN-LAST:event_IconPlantillaMouseClicked

    private void btnPlantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlantillaMouseClicked
        TabbedPaneMain.setSelectedIndex(3);
    }//GEN-LAST:event_btnPlantillaMouseClicked

    
    private void btnproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproductoMouseClicked
        TabbedPaneMain.setSelectedIndex(4);
    }//GEN-LAST:event_btnproductoMouseClicked

    private void PanelProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelProductoMouseClicked
        
    }//GEN-LAST:event_PanelProductoMouseClicked

    private void btncerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarsesionMouseClicked
        login form= new login();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarsesionMouseClicked

    private void txtplavehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplavehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplavehiculoActionPerformed

    private void txtmodvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodvehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodvehiculoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        objcrud.insertarVehiculos(txtplavehiculo.getText(), txttipvehiculo.getText(), txtmodvehiculo.getText(), txtcolvehiculo.getText(), txtcedcliente.getText(),
                txtobsvehiculo.getText(), txtcedcliente.getText());
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGr0undlbl;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel IconCarro;
    private javax.swing.JLabel IconCliente;
    private javax.swing.JLabel IconPlantilla;
    private javax.swing.JLabel IconTrabajador;
    private javax.swing.JLabel Iconfactura;
    private javax.swing.JPanel PanelCarros;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PanelFactura;
    private javax.swing.JPanel PanelPlanilla;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JPanel PanelSorteo;
    private javax.swing.JTabbedPane TabbedPaneMain;
    private javax.swing.JPanel btnCarro;
    private javax.swing.JPanel btnPlantilla;
    private javax.swing.JPanel btncerrarsesion;
    private javax.swing.JPanel btncliente;
    private javax.swing.JPanel btnfactura;
    private javax.swing.JPanel btnproducto;
    private javax.swing.JPanel btntrabajador;
    private javax.swing.JLabel fondopiratacoche;
    private javax.swing.JLabel iconproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcoche;
    private javax.swing.JLabel lblcoche1;
    private javax.swing.JLabel lblcoche2;
    private javax.swing.JLabel lblcoche3;
    private javax.swing.JLabel lblcoche4;
    private javax.swing.JLabel lblcoche5;
    private javax.swing.JLabel lblcoche6;
    private javax.swing.JLabel lblregistrarcoches;
    private javax.swing.JTextField txtcedcliente;
    private javax.swing.JLabel txtcerrarsesion;
    private javax.swing.JTextField txtcolvehiculo;
    private javax.swing.JTextField txtmarvehiculo;
    private javax.swing.JTextField txtmodvehiculo;
    private javax.swing.JTextArea txtobsvehiculo;
    private javax.swing.JTextField txtplavehiculo;
    private javax.swing.JTextField txttipvehiculo;
    // End of variables declaration//GEN-END:variables

}
