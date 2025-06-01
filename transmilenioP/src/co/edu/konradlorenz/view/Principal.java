package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controlador;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    private Controlador ctrl;

    public Principal(Controlador ctrl) {
        this.ctrl = ctrl;
        initComponents();
    }

    //Specific methods 
    public void switchCard(int cardNum, int num) {
        JPanel card = (cardNum == 1) ? pnlCardLayout1 : pnlCardLayout2;
        java.awt.CardLayout cl = (java.awt.CardLayout) (card.getLayout());
        cl.show(card, "card" + String.valueOf(num));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlMenuLateral = new javax.swing.JPanel();
        imgTMLogo128x128 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnMonitoreo = new javax.swing.JButton();
        btnGestionEstacion = new javax.swing.JButton();
        btnGestionFlota = new javax.swing.JButton();
        btnGestionRutas = new javax.swing.JButton();
        btnCalcularRutas = new javax.swing.JButton();
        btnValidarAcceso = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlCardLayout1 = new javax.swing.JPanel();
        pnlBlank10 = new javax.swing.JPanel();
        pnlCard1 = new javax.swing.JPanel();
        pnlBotones1 = new javax.swing.JPanel();
        btnRegistrarPersonas = new javax.swing.JButton();
        btnVerAlertas = new javax.swing.JButton();
        btnVerListaEstaciones = new javax.swing.JButton();
        btnVerRutasPorEstacion = new javax.swing.JButton();
        btnVerEstadoDeEstaciones = new javax.swing.JButton();
        pnlCard2 = new javax.swing.JPanel();
        pnlBotones2 = new javax.swing.JPanel();
        btnAgregarEstacion = new javax.swing.JButton();
        btnModificarEstacion = new javax.swing.JButton();
        btnEliminarEstacion = new javax.swing.JButton();
        btnAsignarParada = new javax.swing.JButton();
        pnlCard3 = new javax.swing.JPanel();
        pnlBotones3 = new javax.swing.JPanel();
        btnMostrarListaBuses = new javax.swing.JButton();
        btnAgregarBus = new javax.swing.JButton();
        btnAccederBus = new javax.swing.JButton();
        btnModificarBus = new javax.swing.JButton();
        btnRetirarBus = new javax.swing.JButton();
        btnAsignarRutaGestionFlota = new javax.swing.JButton();
        pnlCard4 = new javax.swing.JPanel();
        pnlBotones4 = new javax.swing.JPanel();
        btnMostrarListaRutas = new javax.swing.JButton();
        btnAgregarRuta = new javax.swing.JButton();
        btnModificarRuta = new javax.swing.JButton();
        btnEliminarRuta = new javax.swing.JButton();
        btnAsignarRutaGestionRuta = new javax.swing.JButton();
        pnlCard5 = new javax.swing.JPanel();
        pnlBotones5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        btnCalcularRutaYDistancia = new javax.swing.JButton();
        txtPuntoInicio = new javax.swing.JTextField();
        pnlCard6 = new javax.swing.JPanel();
        pnlBotones6 = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        pnlCardLayout2 = new javax.swing.JPanel();
        pnlBlank20 = new javax.swing.JPanel();
        pnlCard11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaEstaciones1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        btnRegistrarNumeroPersonas = new javax.swing.JButton();
        pnlCard12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstListAlertas = new javax.swing.JList<>();
        pnlCard13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstListaEstaciones2 = new javax.swing.JList<>();
        pnlCard14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstListaDeParadasPorEstacion = new javax.swing.JList<>();
        pnlCard15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstListaDeEstadoDeLasEstaciones = new javax.swing.JList<>();
        pnlCard21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtAddNameStation = new javax.swing.JTextField();
        txtAddMaxCapacity = new javax.swing.JTextField();
        txtAddFlowOfPeople = new javax.swing.JTextField();
        cmbAddSaturation = new javax.swing.JComboBox<>();
        cmbAddOperation = new javax.swing.JComboBox<>();
        btnAddStation = new javax.swing.JButton();
        pnlCard22 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstListaEstaciones3 = new javax.swing.JList<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtModifyNameStation = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtModifyMaxCapacity = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtModifyFlowOfPeople = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cmbModifySaturation = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        cmbModifyOperation = new javax.swing.JComboBox<>();
        btnModifyStation = new javax.swing.JButton();
        pnlCard23 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstListaEstaciones4 = new javax.swing.JList<>();
        btnDeleteStation = new javax.swing.JButton();
        pnlCard24 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstListaEstaciones5 = new javax.swing.JList<>();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstListaDeParadas = new javax.swing.JList<>();
        jLabel37 = new javax.swing.JLabel();
        cmbSelectStops = new javax.swing.JComboBox<>();
        btnAssignStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGeneral.setBackground(new java.awt.Color(213, 0, 0));
        pnlGeneral.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuLateral.setBackground(new java.awt.Color(180, 0, 0));
        pnlMenuLateral.setLayout(new java.awt.BorderLayout());

        imgTMLogo128x128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTMLogo128x128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/tm-logo-128x128.png"))); // NOI18N
        imgTMLogo128x128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTMLogo128x128MouseClicked(evt);
            }
        });
        pnlMenuLateral.add(imgTMLogo128x128, java.awt.BorderLayout.CENTER);

        pnlBotones.setBackground(new java.awt.Color(180, 0, 0));
        pnlBotones.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMonitoreo.setBackground(new java.awt.Color(200, 0, 0));
        btnMonitoreo.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnMonitoreo.setForeground(new java.awt.Color(255, 255, 255));
        btnMonitoreo.setText("Monitoreo");
        btnMonitoreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnMonitoreo.setContentAreaFilled(false);
        btnMonitoreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMonitoreo.setFocusPainted(false);
        btnMonitoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitoreoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnMonitoreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 30));

        btnGestionEstacion.setBackground(new java.awt.Color(200, 0, 0));
        btnGestionEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnGestionEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionEstacion.setText("Gestión Estación");
        btnGestionEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnGestionEstacion.setContentAreaFilled(false);
        btnGestionEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionEstacion.setFocusPainted(false);
        btnGestionEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEstacionActionPerformed(evt);
            }
        });
        pnlBotones.add(btnGestionEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 30));

        btnGestionFlota.setBackground(new java.awt.Color(200, 0, 0));
        btnGestionFlota.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnGestionFlota.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionFlota.setText("Gestión de Flota");
        btnGestionFlota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnGestionFlota.setContentAreaFilled(false);
        btnGestionFlota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionFlota.setFocusPainted(false);
        btnGestionFlota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionFlotaActionPerformed(evt);
            }
        });
        pnlBotones.add(btnGestionFlota, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 30));

        btnGestionRutas.setBackground(new java.awt.Color(200, 0, 0));
        btnGestionRutas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnGestionRutas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionRutas.setText("Gestión de Rutas");
        btnGestionRutas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnGestionRutas.setContentAreaFilled(false);
        btnGestionRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionRutas.setFocusPainted(false);
        btnGestionRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionRutasActionPerformed(evt);
            }
        });
        pnlBotones.add(btnGestionRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 140, 30));

        btnCalcularRutas.setBackground(new java.awt.Color(200, 0, 0));
        btnCalcularRutas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnCalcularRutas.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularRutas.setText("Calcular Rutas");
        btnCalcularRutas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnCalcularRutas.setContentAreaFilled(false);
        btnCalcularRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularRutas.setFocusPainted(false);
        btnCalcularRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRutasActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCalcularRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 140, 30));

        btnValidarAcceso.setBackground(new java.awt.Color(200, 0, 0));
        btnValidarAcceso.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnValidarAcceso.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarAcceso.setText("Validar Acceso");
        btnValidarAcceso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnValidarAcceso.setContentAreaFilled(false);
        btnValidarAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidarAcceso.setFocusPainted(false);
        btnValidarAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarAccesoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnValidarAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 140, 30));

        btnSalir.setBackground(new java.awt.Color(200, 0, 0));
        btnSalir.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlBotones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 140, 30));

        pnlMenuLateral.add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlGeneral.add(pnlMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        pnlCardLayout1.setToolTipText("");
        pnlCardLayout1.setLayout(new java.awt.CardLayout());

        pnlBlank10.setBackground(new java.awt.Color(200, 0, 0));
        pnlBlank10.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlBlank10.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlBlank10.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCardLayout1.add(pnlBlank10, "card0");

        pnlCard1.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones1.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones1.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones1.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones1.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersonas.setBackground(new java.awt.Color(180, 0, 0));
        btnRegistrarPersonas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnRegistrarPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonas.setText("Registrar # Personas");
        btnRegistrarPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnRegistrarPersonas.setContentAreaFilled(false);
        btnRegistrarPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPersonas.setFocusPainted(false);
        btnRegistrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonasActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnRegistrarPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 230, 30));

        btnVerAlertas.setBackground(new java.awt.Color(180, 0, 0));
        btnVerAlertas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnVerAlertas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAlertas.setText("Ver Alertas");
        btnVerAlertas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnVerAlertas.setContentAreaFilled(false);
        btnVerAlertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerAlertas.setFocusPainted(false);
        btnVerAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlertasActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnVerAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 90, 230, 30));

        btnVerListaEstaciones.setBackground(new java.awt.Color(180, 0, 0));
        btnVerListaEstaciones.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnVerListaEstaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnVerListaEstaciones.setText("Ver Lista de Estaciones");
        btnVerListaEstaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnVerListaEstaciones.setContentAreaFilled(false);
        btnVerListaEstaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerListaEstaciones.setFocusPainted(false);
        btnVerListaEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListaEstacionesActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnVerListaEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, 230, 30));

        btnVerRutasPorEstacion.setBackground(new java.awt.Color(180, 0, 0));
        btnVerRutasPorEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnVerRutasPorEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRutasPorEstacion.setText("Ver Rutas por Estación");
        btnVerRutasPorEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnVerRutasPorEstacion.setContentAreaFilled(false);
        btnVerRutasPorEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerRutasPorEstacion.setFocusPainted(false);
        btnVerRutasPorEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRutasPorEstacionActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnVerRutasPorEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, 230, 30));

        btnVerEstadoDeEstaciones.setBackground(new java.awt.Color(180, 0, 0));
        btnVerEstadoDeEstaciones.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnVerEstadoDeEstaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnVerEstadoDeEstaciones.setText("Ver Estado de las Estaciones");
        btnVerEstadoDeEstaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnVerEstadoDeEstaciones.setContentAreaFilled(false);
        btnVerEstadoDeEstaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerEstadoDeEstaciones.setFocusPainted(false);
        btnVerEstadoDeEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadoDeEstacionesActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnVerEstadoDeEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 270, 230, 30));

        pnlCard1.add(pnlBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 520));

        pnlCardLayout1.add(pnlCard1, "card1");

        pnlCard2.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard2.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones2.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones2.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones2.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones2.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarEstacion.setBackground(new java.awt.Color(180, 0, 0));
        btnAgregarEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAgregarEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEstacion.setText("Agregar Estación");
        btnAgregarEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAgregarEstacion.setContentAreaFilled(false);
        btnAgregarEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEstacion.setFocusPainted(false);
        btnAgregarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstacionActionPerformed(evt);
            }
        });
        pnlBotones2.add(btnAgregarEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 30));

        btnModificarEstacion.setBackground(new java.awt.Color(180, 0, 0));
        btnModificarEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnModificarEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarEstacion.setText("Modificar Estación");
        btnModificarEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnModificarEstacion.setContentAreaFilled(false);
        btnModificarEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarEstacion.setFocusPainted(false);
        btnModificarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEstacionActionPerformed(evt);
            }
        });
        pnlBotones2.add(btnModificarEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 30));

        btnEliminarEstacion.setBackground(new java.awt.Color(180, 0, 0));
        btnEliminarEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnEliminarEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEstacion.setText("Eliminar Estación");
        btnEliminarEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnEliminarEstacion.setContentAreaFilled(false);
        btnEliminarEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEstacion.setFocusPainted(false);
        btnEliminarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEstacionActionPerformed(evt);
            }
        });
        pnlBotones2.add(btnEliminarEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 160, 30));

        btnAsignarParada.setBackground(new java.awt.Color(180, 0, 0));
        btnAsignarParada.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAsignarParada.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarParada.setText("Asignar Parada");
        btnAsignarParada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAsignarParada.setContentAreaFilled(false);
        btnAsignarParada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarParada.setFocusPainted(false);
        btnAsignarParada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarParadaActionPerformed(evt);
            }
        });
        pnlBotones2.add(btnAsignarParada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, 30));

        pnlCard2.add(pnlBotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pnlCardLayout1.add(pnlCard2, "card2");

        pnlCard3.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard3.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard3.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard3.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones3.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones3.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones3.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones3.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarListaBuses.setBackground(new java.awt.Color(180, 0, 0));
        btnMostrarListaBuses.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnMostrarListaBuses.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarListaBuses.setText("Mostrar Lista de Buses");
        btnMostrarListaBuses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnMostrarListaBuses.setContentAreaFilled(false);
        btnMostrarListaBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarListaBuses.setFocusPainted(false);
        btnMostrarListaBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaBusesActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnMostrarListaBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 30));

        btnAgregarBus.setBackground(new java.awt.Color(180, 0, 0));
        btnAgregarBus.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAgregarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarBus.setText("Agregar Bus");
        btnAgregarBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAgregarBus.setContentAreaFilled(false);
        btnAgregarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarBus.setFocusPainted(false);
        btnAgregarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBusActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnAgregarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 30));

        btnAccederBus.setBackground(new java.awt.Color(180, 0, 0));
        btnAccederBus.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAccederBus.setForeground(new java.awt.Color(255, 255, 255));
        btnAccederBus.setText("Acceder a Bus");
        btnAccederBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAccederBus.setContentAreaFilled(false);
        btnAccederBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccederBus.setFocusPainted(false);
        btnAccederBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederBusActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnAccederBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 30));

        btnModificarBus.setBackground(new java.awt.Color(180, 0, 0));
        btnModificarBus.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnModificarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarBus.setText("Modificar Bus");
        btnModificarBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnModificarBus.setContentAreaFilled(false);
        btnModificarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarBus.setFocusPainted(false);
        btnModificarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBusActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnModificarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        btnRetirarBus.setBackground(new java.awt.Color(180, 0, 0));
        btnRetirarBus.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnRetirarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarBus.setText("Retirar Bus");
        btnRetirarBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnRetirarBus.setContentAreaFilled(false);
        btnRetirarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarBus.setFocusPainted(false);
        btnRetirarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarBusActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnRetirarBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 30));

        btnAsignarRutaGestionFlota.setBackground(new java.awt.Color(180, 0, 0));
        btnAsignarRutaGestionFlota.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAsignarRutaGestionFlota.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarRutaGestionFlota.setText("Asignar Ruta");
        btnAsignarRutaGestionFlota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAsignarRutaGestionFlota.setContentAreaFilled(false);
        btnAsignarRutaGestionFlota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarRutaGestionFlota.setFocusPainted(false);
        btnAsignarRutaGestionFlota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRutaGestionFlotaActionPerformed(evt);
            }
        });
        pnlBotones3.add(btnAsignarRutaGestionFlota, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 30));

        pnlCard3.add(pnlBotones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pnlCardLayout1.add(pnlCard3, "card3");

        pnlCard4.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard4.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard4.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard4.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones4.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones4.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones4.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones4.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarListaRutas.setBackground(new java.awt.Color(180, 0, 0));
        btnMostrarListaRutas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnMostrarListaRutas.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarListaRutas.setText("Mostrar Lista de Rutas");
        btnMostrarListaRutas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnMostrarListaRutas.setContentAreaFilled(false);
        btnMostrarListaRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarListaRutas.setFocusPainted(false);
        btnMostrarListaRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaRutasActionPerformed(evt);
            }
        });
        pnlBotones4.add(btnMostrarListaRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 30));

        btnAgregarRuta.setBackground(new java.awt.Color(180, 0, 0));
        btnAgregarRuta.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAgregarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarRuta.setText("Agregar Ruta");
        btnAgregarRuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAgregarRuta.setContentAreaFilled(false);
        btnAgregarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarRuta.setFocusPainted(false);
        btnAgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRutaActionPerformed(evt);
            }
        });
        pnlBotones4.add(btnAgregarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 30));

        btnModificarRuta.setBackground(new java.awt.Color(180, 0, 0));
        btnModificarRuta.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnModificarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarRuta.setText("Modificar Ruta");
        btnModificarRuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnModificarRuta.setContentAreaFilled(false);
        btnModificarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarRuta.setFocusPainted(false);
        btnModificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRutaActionPerformed(evt);
            }
        });
        pnlBotones4.add(btnModificarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 30));

        btnEliminarRuta.setBackground(new java.awt.Color(180, 0, 0));
        btnEliminarRuta.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnEliminarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRuta.setText("Eliminar Ruta");
        btnEliminarRuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnEliminarRuta.setContentAreaFilled(false);
        btnEliminarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRuta.setFocusPainted(false);
        btnEliminarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutaActionPerformed(evt);
            }
        });
        pnlBotones4.add(btnEliminarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        btnAsignarRutaGestionRuta.setBackground(new java.awt.Color(180, 0, 0));
        btnAsignarRutaGestionRuta.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAsignarRutaGestionRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarRutaGestionRuta.setText("Asignar Ruta");
        btnAsignarRutaGestionRuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAsignarRutaGestionRuta.setContentAreaFilled(false);
        btnAsignarRutaGestionRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarRutaGestionRuta.setFocusPainted(false);
        btnAsignarRutaGestionRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRutaGestionRutaActionPerformed(evt);
            }
        });
        pnlBotones4.add(btnAsignarRutaGestionRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 30));

        pnlCard4.add(pnlBotones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pnlCardLayout1.add(pnlCard4, "card4");

        pnlCard5.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard5.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard5.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard5.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones5.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones5.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones5.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones5.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Punto de Inicio");
        pnlBotones5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Destino");
        pnlBotones5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese su");
        pnlBotones5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 140, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese su");
        pnlBotones5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, -1));

        txtDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtDestino.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(0, 0, 0));
        txtDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });
        pnlBotones5.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 140, -1));

        btnCalcularRutaYDistancia.setBackground(new java.awt.Color(180, 0, 0));
        btnCalcularRutaYDistancia.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnCalcularRutaYDistancia.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularRutaYDistancia.setText("Calcular");
        btnCalcularRutaYDistancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnCalcularRutaYDistancia.setContentAreaFilled(false);
        btnCalcularRutaYDistancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcularRutaYDistancia.setFocusPainted(false);
        btnCalcularRutaYDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRutaYDistanciaActionPerformed(evt);
            }
        });
        pnlBotones5.add(btnCalcularRutaYDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 140, 30));

        txtPuntoInicio.setBackground(new java.awt.Color(255, 255, 255));
        txtPuntoInicio.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtPuntoInicio.setForeground(new java.awt.Color(0, 0, 0));
        txtPuntoInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntoInicioActionPerformed(evt);
            }
        });
        pnlBotones5.add(txtPuntoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, -1));

        pnlCard5.add(pnlBotones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pnlCardLayout1.add(pnlCard5, "card5");

        pnlCard6.setBackground(new java.awt.Color(200, 0, 0));
        pnlCard6.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard6.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard6.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones6.setBackground(new java.awt.Color(200, 0, 0));
        pnlBotones6.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones6.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones6.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarse.setBackground(new java.awt.Color(180, 0, 0));
        btnRegistrarse.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        pnlBotones6.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(180, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlBotones6.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 30));

        pnlCard6.add(pnlBotones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pnlCardLayout1.add(pnlCard6, "card6");

        pnlGeneral.add(pnlCardLayout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 720));

        pnlCardLayout2.setLayout(new java.awt.CardLayout());

        pnlBlank20.setBackground(new java.awt.Color(213, 0, 0));
        pnlBlank20.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlBlank20.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlBlank20.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCardLayout2.add(pnlBlank20, "card0");

        pnlCard11.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard11.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard11.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard11.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de Estaciones");
        pnlCard11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 270, 50));

        jScrollPane1.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaEstaciones1.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones1.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstListaEstaciones1.setFocusable(false);
        lstListaEstaciones1.setRequestFocusEnabled(false);
        lstListaEstaciones1.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstListaEstaciones1);

        pnlCard11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 270, 520));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Ingrese número de personas");
        pnlCard11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 280, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("actualmente en la estación");
        pnlCard11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 280, 50));

        txtNumeroPersonas.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroPersonas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtNumeroPersonas.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPersonasActionPerformed(evt);
            }
        });
        pnlCard11.add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, -1));

        btnRegistrarNumeroPersonas.setBackground(new java.awt.Color(180, 0, 0));
        btnRegistrarNumeroPersonas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnRegistrarNumeroPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarNumeroPersonas.setText("Registrar");
        btnRegistrarNumeroPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnRegistrarNumeroPersonas.setContentAreaFilled(false);
        btnRegistrarNumeroPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarNumeroPersonas.setFocusPainted(false);
        btnRegistrarNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNumeroPersonasActionPerformed(evt);
            }
        });
        pnlCard11.add(btnRegistrarNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 160, 30));

        pnlCardLayout2.add(pnlCard11, "card11");

        pnlCard12.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard12.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard12.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard12.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lista de Alertas");
        pnlCard12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 480, 50));

        lstListAlertas.setBackground(new java.awt.Color(180, 0, 0));
        lstListAlertas.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListAlertas.setForeground(new java.awt.Color(255, 255, 255));
        lstListAlertas.setFocusable(false);
        lstListAlertas.setRequestFocusEnabled(false);
        lstListAlertas.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListAlertas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(lstListAlertas);

        pnlCard12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        pnlCardLayout2.add(pnlCard12, "card12");

        pnlCard13.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard13.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard13.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard13.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lista de Estaciones");
        pnlCard13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

        jScrollPane3.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setAlignmentX(0.0F);
        jScrollPane3.setAlignmentY(0.0F);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaEstaciones2.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones2.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaEstaciones2.setFocusable(false);
        lstListaEstaciones2.setRequestFocusEnabled(false);
        lstListaEstaciones2.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(lstListaEstaciones2);

        pnlCard13.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        pnlCardLayout2.add(pnlCard13, "card13");

        pnlCard14.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard14.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard14.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard14.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lista de Paradas por Estación");
        pnlCard14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

        jScrollPane4.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setAlignmentX(0.0F);
        jScrollPane4.setAlignmentY(0.0F);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaDeParadasPorEstacion.setBackground(new java.awt.Color(180, 0, 0));
        lstListaDeParadasPorEstacion.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaDeParadasPorEstacion.setForeground(new java.awt.Color(255, 255, 255));
        lstListaDeParadasPorEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaDeParadasPorEstacion.setFocusable(false);
        lstListaDeParadasPorEstacion.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaDeParadasPorEstacion.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(lstListaDeParadasPorEstacion);

        pnlCard14.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        pnlCardLayout2.add(pnlCard14, "card14");

        pnlCard15.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard15.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard15.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard15.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lista de Estado de las Estaciones");
        pnlCard15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

        jScrollPane5.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setAlignmentX(0.0F);
        jScrollPane5.setAlignmentY(0.0F);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaDeEstadoDeLasEstaciones.setBackground(new java.awt.Color(180, 0, 0));
        lstListaDeEstadoDeLasEstaciones.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaDeEstadoDeLasEstaciones.setForeground(new java.awt.Color(255, 255, 255));
        lstListaDeEstadoDeLasEstaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaDeEstadoDeLasEstaciones.setFocusable(false);
        lstListaDeEstadoDeLasEstaciones.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaDeEstadoDeLasEstaciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(lstListaDeEstadoDeLasEstaciones);

        pnlCard15.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        pnlCardLayout2.add(pnlCard15, "card15");

        pnlCard21.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard21.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard21.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard21.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Agregar Estación");
        pnlCard21.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 50));

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre");
        pnlCard21.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 360, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Capacidad máxima");
        pnlCard21.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 210, 30));

        jLabel24.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Flujo de personas");
        pnlCard21.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 210, 30));

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Saturación");
        pnlCard21.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 210, 30));

        jLabel26.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Funcionamiento");
        pnlCard21.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 210, 30));

        txtAddNameStation.setBackground(new java.awt.Color(255, 255, 255));
        txtAddNameStation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtAddNameStation.setForeground(new java.awt.Color(0, 0, 0));
        txtAddNameStation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddNameStation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddNameStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddNameStationActionPerformed(evt);
            }
        });
        pnlCard21.add(txtAddNameStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 360, 30));

        txtAddMaxCapacity.setBackground(new java.awt.Color(255, 255, 255));
        txtAddMaxCapacity.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtAddMaxCapacity.setForeground(new java.awt.Color(0, 0, 0));
        txtAddMaxCapacity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddMaxCapacity.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddMaxCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMaxCapacityActionPerformed(evt);
            }
        });
        pnlCard21.add(txtAddMaxCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 210, -1));

        txtAddFlowOfPeople.setBackground(new java.awt.Color(255, 255, 255));
        txtAddFlowOfPeople.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtAddFlowOfPeople.setForeground(new java.awt.Color(0, 0, 0));
        txtAddFlowOfPeople.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddFlowOfPeople.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddFlowOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddFlowOfPeopleActionPerformed(evt);
            }
        });
        pnlCard21.add(txtAddFlowOfPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 210, -1));

        cmbAddSaturation.setBackground(new java.awt.Color(200, 0, 0));
        cmbAddSaturation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        cmbAddSaturation.setForeground(new java.awt.Color(255, 255, 255));
        cmbAddSaturation.setBorder(null);
        cmbAddSaturation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCard21.add(cmbAddSaturation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 210, -1));

        cmbAddOperation.setBackground(new java.awt.Color(200, 0, 0));
        cmbAddOperation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        cmbAddOperation.setForeground(new java.awt.Color(255, 255, 255));
        cmbAddOperation.setBorder(null);
        cmbAddOperation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCard21.add(cmbAddOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 210, -1));

        btnAddStation.setBackground(new java.awt.Color(200, 0, 0));
        btnAddStation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAddStation.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStation.setText("Agregar");
        btnAddStation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAddStation.setContentAreaFilled(false);
        btnAddStation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddStation.setFocusPainted(false);
        btnAddStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStationActionPerformed(evt);
            }
        });
        pnlCard21.add(btnAddStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 160, 30));

        pnlCardLayout2.add(pnlCard21, "card21");

        pnlCard22.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard22.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard22.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard22.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane6.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setAlignmentX(0.0F);
        jScrollPane6.setAlignmentY(0.0F);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaEstaciones3.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones3.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones3.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstListaEstaciones3.setFocusable(false);
        lstListaEstaciones3.setRequestFocusEnabled(false);
        lstListaEstaciones3.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListaEstaciones3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lstListaEstaciones3);

        pnlCard22.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 470));

        jLabel27.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Modificar Estación");
        pnlCard22.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 50));

        jLabel28.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Nombre");
        pnlCard22.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 350, 30));

        txtModifyNameStation.setBackground(new java.awt.Color(255, 255, 255));
        txtModifyNameStation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtModifyNameStation.setForeground(new java.awt.Color(0, 0, 0));
        txtModifyNameStation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModifyNameStation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModifyNameStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyNameStationActionPerformed(evt);
            }
        });
        pnlCard22.add(txtModifyNameStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 350, 30));

        jLabel29.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Capacidad máxima");
        pnlCard22.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, 30));

        txtModifyMaxCapacity.setBackground(new java.awt.Color(255, 255, 255));
        txtModifyMaxCapacity.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtModifyMaxCapacity.setForeground(new java.awt.Color(0, 0, 0));
        txtModifyMaxCapacity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModifyMaxCapacity.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModifyMaxCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyMaxCapacityActionPerformed(evt);
            }
        });
        pnlCard22.add(txtModifyMaxCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 180, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Flujo de personas");
        pnlCard22.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 30));

        txtModifyFlowOfPeople.setBackground(new java.awt.Color(255, 255, 255));
        txtModifyFlowOfPeople.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtModifyFlowOfPeople.setForeground(new java.awt.Color(0, 0, 0));
        txtModifyFlowOfPeople.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModifyFlowOfPeople.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModifyFlowOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyFlowOfPeopleActionPerformed(evt);
            }
        });
        pnlCard22.add(txtModifyFlowOfPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 180, -1));

        jLabel31.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Saturación");
        pnlCard22.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 180, 30));

        cmbModifySaturation.setBackground(new java.awt.Color(200, 0, 0));
        cmbModifySaturation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        cmbModifySaturation.setForeground(new java.awt.Color(255, 255, 255));
        cmbModifySaturation.setBorder(null);
        cmbModifySaturation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCard22.add(cmbModifySaturation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 180, -1));

        jLabel32.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Funcionamiento");
        pnlCard22.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 180, 30));

        cmbModifyOperation.setBackground(new java.awt.Color(200, 0, 0));
        cmbModifyOperation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        cmbModifyOperation.setForeground(new java.awt.Color(255, 255, 255));
        cmbModifyOperation.setBorder(null);
        cmbModifyOperation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCard22.add(cmbModifyOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 180, -1));

        btnModifyStation.setBackground(new java.awt.Color(200, 0, 0));
        btnModifyStation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnModifyStation.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyStation.setText("Modificar");
        btnModifyStation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnModifyStation.setContentAreaFilled(false);
        btnModifyStation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifyStation.setFocusPainted(false);
        btnModifyStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyStationActionPerformed(evt);
            }
        });
        pnlCard22.add(btnModifyStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 30));

        pnlCardLayout2.add(pnlCard22, "card22");

        pnlCard23.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard23.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard23.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard23.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Eliminar Estación");
        pnlCard23.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 50));

        jScrollPane7.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane7.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setAlignmentX(0.0F);
        jScrollPane7.setAlignmentY(0.0F);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaEstaciones4.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones4.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones4.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaEstaciones4.setFocusable(false);
        lstListaEstaciones4.setRequestFocusEnabled(false);
        lstListaEstaciones4.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones4.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(lstListaEstaciones4);

        pnlCard23.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 480, 330));

        btnDeleteStation.setBackground(new java.awt.Color(200, 0, 0));
        btnDeleteStation.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnDeleteStation.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteStation.setText("Eliminar");
        btnDeleteStation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnDeleteStation.setContentAreaFilled(false);
        btnDeleteStation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteStation.setFocusPainted(false);
        btnDeleteStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStationActionPerformed(evt);
            }
        });
        pnlCard23.add(btnDeleteStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 160, 30));

        pnlCardLayout2.add(pnlCard23, "card23");

        pnlCard24.setBackground(new java.awt.Color(213, 0, 0));
        pnlCard24.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCard24.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCard24.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCard24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Asignar Parada");
        pnlCard24.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 680, 50));

        jLabel35.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Estaciones");
        pnlCard24.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        jScrollPane8.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane8.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setAlignmentX(0.0F);
        jScrollPane8.setAlignmentY(0.0F);
        jScrollPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaEstaciones5.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones5.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones5.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstListaEstaciones5.setFocusable(false);
        lstListaEstaciones5.setRequestFocusEnabled(false);
        lstListaEstaciones5.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones5.setSelectionForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListaEstaciones5MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(lstListaEstaciones5);

        pnlCard24.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 470));

        jLabel36.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Lista de Paradas");
        pnlCard24.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 270, 30));

        jScrollPane10.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane10.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setAlignmentX(0.0F);
        jScrollPane10.setAlignmentY(0.0F);
        jScrollPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListaDeParadas.setBackground(new java.awt.Color(180, 0, 0));
        lstListaDeParadas.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
        lstListaDeParadas.setForeground(new java.awt.Color(255, 255, 255));
        lstListaDeParadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstListaDeParadas.setFocusable(false);
        lstListaDeParadas.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaDeParadas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(lstListaDeParadas);

        pnlCard24.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 270, 470));

        jLabel37.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Parada");
        pnlCard24.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 130, 30));

        cmbSelectStops.setBackground(new java.awt.Color(200, 0, 0));
        cmbSelectStops.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        cmbSelectStops.setForeground(new java.awt.Color(255, 255, 255));
        cmbSelectStops.setBorder(null);
        cmbSelectStops.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCard24.add(cmbSelectStops, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 130, -1));

        btnAssignStop.setBackground(new java.awt.Color(200, 0, 0));
        btnAssignStop.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnAssignStop.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignStop.setText("Asignar");
        btnAssignStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnAssignStop.setContentAreaFilled(false);
        btnAssignStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAssignStop.setFocusPainted(false);
        btnAssignStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignStopActionPerformed(evt);
            }
        });
        pnlCard24.add(btnAssignStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 130, 30));

        pnlCardLayout2.add(pnlCard24, "card24");

        pnlGeneral.add(pnlCardLayout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 680, 720));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitoreoActionPerformed
        switchCard(1, 1);
        switchCard(2, 0);
    }//GEN-LAST:event_btnMonitoreoActionPerformed

    private void btnGestionEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEstacionActionPerformed
        switchCard(1, 2);
        switchCard(2, 0);
    }//GEN-LAST:event_btnGestionEstacionActionPerformed

    private void btnGestionFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionFlotaActionPerformed
        switchCard(1, 3);
        switchCard(2, 0);
    }//GEN-LAST:event_btnGestionFlotaActionPerformed

    private void btnGestionRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionRutasActionPerformed
        switchCard(1, 4);
        switchCard(2, 0);
    }//GEN-LAST:event_btnGestionRutasActionPerformed

    private void btnCalcularRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRutasActionPerformed
        switchCard(1, 5);
        switchCard(2, 0);
    }//GEN-LAST:event_btnCalcularRutasActionPerformed

    private void btnValidarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarAccesoActionPerformed
        switchCard(1, 6);
        switchCard(2, 0);
    }//GEN-LAST:event_btnValidarAccesoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ctrl.salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        switchCard(2, 11);
        ctrl.showStationsList();
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed

    private void btnVerAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlertasActionPerformed
        switchCard(2, 12);
        ctrl.showAlertsList();
    }//GEN-LAST:event_btnVerAlertasActionPerformed

    private void btnVerListaEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaEstacionesActionPerformed
        switchCard(2, 13);
        ctrl.showStationsList();
    }//GEN-LAST:event_btnVerListaEstacionesActionPerformed

    private void btnVerRutasPorEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRutasPorEstacionActionPerformed
        switchCard(2, 14);
        ctrl.showRoutesPerStation();
    }//GEN-LAST:event_btnVerRutasPorEstacionActionPerformed

    private void btnVerEstadoDeEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoDeEstacionesActionPerformed
        switchCard(2, 15);
        ctrl.showStationsStatus();
    }//GEN-LAST:event_btnVerEstadoDeEstacionesActionPerformed

    private void btnAgregarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstacionActionPerformed
        switchCard(2, 21);
        ctrl.loadCombosAddStation();
    }//GEN-LAST:event_btnAgregarEstacionActionPerformed

    private void btnModificarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstacionActionPerformed
        switchCard(2, 22);
        ctrl.showStationsList();
    }//GEN-LAST:event_btnModificarEstacionActionPerformed

    private void btnEliminarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstacionActionPerformed
        switchCard(2, 23);
        ctrl.showStationsList();
    }//GEN-LAST:event_btnEliminarEstacionActionPerformed

    private void btnAsignarParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarParadaActionPerformed
        switchCard(2, 24);
        ctrl.showStationsList();
        ctrl.showRoutesList();
        ctrl.loadCombosAddStop();
    }//GEN-LAST:event_btnAsignarParadaActionPerformed

    private void btnMostrarListaBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaBusesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarListaBusesActionPerformed

    private void btnAgregarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarBusActionPerformed

    private void btnAccederBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccederBusActionPerformed

    private void btnModificarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarBusActionPerformed

    private void btnRetirarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetirarBusActionPerformed

    private void btnAsignarRutaGestionFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRutaGestionFlotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarRutaGestionFlotaActionPerformed

    private void btnMostrarListaRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarListaRutasActionPerformed

    private void btnAgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarRutaActionPerformed

    private void btnModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarRutaActionPerformed

    private void btnEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarRutaActionPerformed

    private void btnAsignarRutaGestionRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRutaGestionRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarRutaGestionRutaActionPerformed

    private void btnCalcularRutaYDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRutaYDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularRutaYDistanciaActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtPuntoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntoInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntoInicioActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void txtNumeroPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPersonasActionPerformed

    private void btnRegistrarNumeroPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNumeroPersonasActionPerformed
        ctrl.recordNumberOfPeople();
    }//GEN-LAST:event_btnRegistrarNumeroPersonasActionPerformed

    private void imgTMLogo128x128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTMLogo128x128MouseClicked
        System.out.println("Loading blank cards");
        switchCard(1, 0);
        switchCard(2, 0);
    }//GEN-LAST:event_imgTMLogo128x128MouseClicked

    private void btnAddStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStationActionPerformed
        ctrl.addStation();
    }//GEN-LAST:event_btnAddStationActionPerformed

    private void txtAddNameStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddNameStationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddNameStationActionPerformed

    private void txtAddMaxCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMaxCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddMaxCapacityActionPerformed

    private void txtAddFlowOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddFlowOfPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddFlowOfPeopleActionPerformed

    private void txtModifyNameStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyNameStationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyNameStationActionPerformed

    private void txtModifyMaxCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyMaxCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyMaxCapacityActionPerformed

    private void txtModifyFlowOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyFlowOfPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModifyFlowOfPeopleActionPerformed

    private void btnModifyStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyStationActionPerformed
        ctrl.modifyStation();
    }//GEN-LAST:event_btnModifyStationActionPerformed

    private void lstListaEstaciones3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListaEstaciones3MouseClicked
        ctrl.loadDataModifyStation();
    }//GEN-LAST:event_lstListaEstaciones3MouseClicked

    private void btnDeleteStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStationActionPerformed
        ctrl.deleteStation();
    }//GEN-LAST:event_btnDeleteStationActionPerformed

    private void lstListaEstaciones5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListaEstaciones5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lstListaEstaciones5MouseClicked

    private void btnAssignStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignStopActionPerformed
        ctrl.assignStop();
    }//GEN-LAST:event_btnAssignStopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccederBus;
    private javax.swing.JButton btnAddStation;
    private javax.swing.JButton btnAgregarBus;
    private javax.swing.JButton btnAgregarEstacion;
    private javax.swing.JButton btnAgregarRuta;
    private javax.swing.JButton btnAsignarParada;
    private javax.swing.JButton btnAsignarRutaGestionFlota;
    private javax.swing.JButton btnAsignarRutaGestionRuta;
    private javax.swing.JButton btnAssignStop;
    private javax.swing.JButton btnCalcularRutaYDistancia;
    private javax.swing.JButton btnCalcularRutas;
    private javax.swing.JButton btnDeleteStation;
    private javax.swing.JButton btnEliminarEstacion;
    private javax.swing.JButton btnEliminarRuta;
    private javax.swing.JButton btnGestionEstacion;
    private javax.swing.JButton btnGestionFlota;
    private javax.swing.JButton btnGestionRutas;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnModificarBus;
    private javax.swing.JButton btnModificarEstacion;
    private javax.swing.JButton btnModificarRuta;
    private javax.swing.JButton btnModifyStation;
    private javax.swing.JButton btnMonitoreo;
    private javax.swing.JButton btnMostrarListaBuses;
    private javax.swing.JButton btnMostrarListaRutas;
    private javax.swing.JButton btnRegistrarNumeroPersonas;
    private javax.swing.JButton btnRegistrarPersonas;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRetirarBus;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidarAcceso;
    private javax.swing.JButton btnVerAlertas;
    private javax.swing.JButton btnVerEstadoDeEstaciones;
    private javax.swing.JButton btnVerListaEstaciones;
    private javax.swing.JButton btnVerRutasPorEstacion;
    private javax.swing.JComboBox<String> cmbAddOperation;
    private javax.swing.JComboBox<String> cmbAddSaturation;
    private javax.swing.JComboBox<String> cmbModifyOperation;
    private javax.swing.JComboBox<String> cmbModifySaturation;
    private javax.swing.JComboBox<String> cmbSelectStops;
    private javax.swing.JLabel imgTMLogo128x128;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JList<String> lstListAlertas;
    private javax.swing.JList<String> lstListaDeEstadoDeLasEstaciones;
    private javax.swing.JList<String> lstListaDeParadas;
    private javax.swing.JList<String> lstListaDeParadasPorEstacion;
    private javax.swing.JList<String> lstListaEstaciones1;
    private javax.swing.JList<String> lstListaEstaciones2;
    private javax.swing.JList<String> lstListaEstaciones3;
    private javax.swing.JList<String> lstListaEstaciones4;
    private javax.swing.JList<String> lstListaEstaciones5;
    private javax.swing.JPanel pnlBlank10;
    private javax.swing.JPanel pnlBlank20;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotones1;
    private javax.swing.JPanel pnlBotones2;
    private javax.swing.JPanel pnlBotones3;
    private javax.swing.JPanel pnlBotones4;
    private javax.swing.JPanel pnlBotones5;
    private javax.swing.JPanel pnlBotones6;
    private javax.swing.JPanel pnlCard1;
    private javax.swing.JPanel pnlCard11;
    private javax.swing.JPanel pnlCard12;
    private javax.swing.JPanel pnlCard13;
    private javax.swing.JPanel pnlCard14;
    private javax.swing.JPanel pnlCard15;
    private javax.swing.JPanel pnlCard2;
    private javax.swing.JPanel pnlCard21;
    private javax.swing.JPanel pnlCard22;
    private javax.swing.JPanel pnlCard23;
    private javax.swing.JPanel pnlCard24;
    private javax.swing.JPanel pnlCard3;
    private javax.swing.JPanel pnlCard4;
    private javax.swing.JPanel pnlCard5;
    private javax.swing.JPanel pnlCard6;
    private javax.swing.JPanel pnlCardLayout1;
    private javax.swing.JPanel pnlCardLayout2;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlMenuLateral;
    private javax.swing.JTextField txtAddFlowOfPeople;
    private javax.swing.JTextField txtAddMaxCapacity;
    private javax.swing.JTextField txtAddNameStation;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtModifyFlowOfPeople;
    private javax.swing.JTextField txtModifyMaxCapacity;
    private javax.swing.JTextField txtModifyNameStation;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtPuntoInicio;
    // End of variables declaration//GEN-END:variables

    public Controlador getCtrl() {
        return ctrl;
    }

    public void setCtrl(Controlador ctrl) {
        this.ctrl = ctrl;
    }

    public javax.swing.JButton getBtnAccederBus() {
        return btnAccederBus;
    }

    public void setBtnAccederBus(javax.swing.JButton btnAccederBus) {
        this.btnAccederBus = btnAccederBus;
    }

    public javax.swing.JButton getBtnAddStation() {
        return btnAddStation;
    }

    public void setBtnAddStation(javax.swing.JButton btnAddStation) {
        this.btnAddStation = btnAddStation;
    }

    public javax.swing.JButton getBtnAgregarBus() {
        return btnAgregarBus;
    }

    public void setBtnAgregarBus(javax.swing.JButton btnAgregarBus) {
        this.btnAgregarBus = btnAgregarBus;
    }

    public javax.swing.JButton getBtnAgregarEstacion() {
        return btnAgregarEstacion;
    }

    public void setBtnAgregarEstacion(javax.swing.JButton btnAgregarEstacion) {
        this.btnAgregarEstacion = btnAgregarEstacion;
    }

    public javax.swing.JButton getBtnAgregarRuta() {
        return btnAgregarRuta;
    }

    public void setBtnAgregarRuta(javax.swing.JButton btnAgregarRuta) {
        this.btnAgregarRuta = btnAgregarRuta;
    }

    public javax.swing.JButton getBtnAsignarParada() {
        return btnAsignarParada;
    }

    public void setBtnAsignarParada(javax.swing.JButton btnAsignarParada) {
        this.btnAsignarParada = btnAsignarParada;
    }

    public javax.swing.JButton getBtnAsignarRutaGestionFlota() {
        return btnAsignarRutaGestionFlota;
    }

    public void setBtnAsignarRutaGestionFlota(javax.swing.JButton btnAsignarRutaGestionFlota) {
        this.btnAsignarRutaGestionFlota = btnAsignarRutaGestionFlota;
    }

    public javax.swing.JButton getBtnAsignarRutaGestionRuta() {
        return btnAsignarRutaGestionRuta;
    }

    public void setBtnAsignarRutaGestionRuta(javax.swing.JButton btnAsignarRutaGestionRuta) {
        this.btnAsignarRutaGestionRuta = btnAsignarRutaGestionRuta;
    }

    public javax.swing.JButton getBtnAssignStop() {
        return btnAssignStop;
    }

    public void setBtnAssignStop(javax.swing.JButton btnAssignStop) {
        this.btnAssignStop = btnAssignStop;
    }

    public javax.swing.JButton getBtnCalcularRutaYDistancia() {
        return btnCalcularRutaYDistancia;
    }

    public void setBtnCalcularRutaYDistancia(javax.swing.JButton btnCalcularRutaYDistancia) {
        this.btnCalcularRutaYDistancia = btnCalcularRutaYDistancia;
    }

    public javax.swing.JButton getBtnCalcularRutas() {
        return btnCalcularRutas;
    }

    public void setBtnCalcularRutas(javax.swing.JButton btnCalcularRutas) {
        this.btnCalcularRutas = btnCalcularRutas;
    }

    public javax.swing.JButton getBtnDeleteStation() {
        return btnDeleteStation;
    }

    public void setBtnDeleteStation(javax.swing.JButton btnDeleteStation) {
        this.btnDeleteStation = btnDeleteStation;
    }

    public javax.swing.JButton getBtnEliminarEstacion() {
        return btnEliminarEstacion;
    }

    public void setBtnEliminarEstacion(javax.swing.JButton btnEliminarEstacion) {
        this.btnEliminarEstacion = btnEliminarEstacion;
    }

    public javax.swing.JButton getBtnEliminarRuta() {
        return btnEliminarRuta;
    }

    public void setBtnEliminarRuta(javax.swing.JButton btnEliminarRuta) {
        this.btnEliminarRuta = btnEliminarRuta;
    }

    public javax.swing.JButton getBtnGestionEstacion() {
        return btnGestionEstacion;
    }

    public void setBtnGestionEstacion(javax.swing.JButton btnGestionEstacion) {
        this.btnGestionEstacion = btnGestionEstacion;
    }

    public javax.swing.JButton getBtnGestionFlota() {
        return btnGestionFlota;
    }

    public void setBtnGestionFlota(javax.swing.JButton btnGestionFlota) {
        this.btnGestionFlota = btnGestionFlota;
    }

    public javax.swing.JButton getBtnGestionRutas() {
        return btnGestionRutas;
    }

    public void setBtnGestionRutas(javax.swing.JButton btnGestionRutas) {
        this.btnGestionRutas = btnGestionRutas;
    }

    public javax.swing.JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(javax.swing.JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public javax.swing.JButton getBtnModificarBus() {
        return btnModificarBus;
    }

    public void setBtnModificarBus(javax.swing.JButton btnModificarBus) {
        this.btnModificarBus = btnModificarBus;
    }

    public javax.swing.JButton getBtnModificarEstacion() {
        return btnModificarEstacion;
    }

    public void setBtnModificarEstacion(javax.swing.JButton btnModificarEstacion) {
        this.btnModificarEstacion = btnModificarEstacion;
    }

    public javax.swing.JButton getBtnModificarRuta() {
        return btnModificarRuta;
    }

    public void setBtnModificarRuta(javax.swing.JButton btnModificarRuta) {
        this.btnModificarRuta = btnModificarRuta;
    }

    public javax.swing.JButton getBtnModifyStation() {
        return btnModifyStation;
    }

    public void setBtnModifyStation(javax.swing.JButton btnModifyStation) {
        this.btnModifyStation = btnModifyStation;
    }

    public javax.swing.JButton getBtnMonitoreo() {
        return btnMonitoreo;
    }

    public void setBtnMonitoreo(javax.swing.JButton btnMonitoreo) {
        this.btnMonitoreo = btnMonitoreo;
    }

    public javax.swing.JButton getBtnMostrarListaBuses() {
        return btnMostrarListaBuses;
    }

    public void setBtnMostrarListaBuses(javax.swing.JButton btnMostrarListaBuses) {
        this.btnMostrarListaBuses = btnMostrarListaBuses;
    }

    public javax.swing.JButton getBtnMostrarListaRutas() {
        return btnMostrarListaRutas;
    }

    public void setBtnMostrarListaRutas(javax.swing.JButton btnMostrarListaRutas) {
        this.btnMostrarListaRutas = btnMostrarListaRutas;
    }

    public javax.swing.JButton getBtnRegistrarNumeroPersonas() {
        return btnRegistrarNumeroPersonas;
    }

    public void setBtnRegistrarNumeroPersonas(javax.swing.JButton btnRegistrarNumeroPersonas) {
        this.btnRegistrarNumeroPersonas = btnRegistrarNumeroPersonas;
    }

    public javax.swing.JButton getBtnRegistrarPersonas() {
        return btnRegistrarPersonas;
    }

    public void setBtnRegistrarPersonas(javax.swing.JButton btnRegistrarPersonas) {
        this.btnRegistrarPersonas = btnRegistrarPersonas;
    }

    public javax.swing.JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(javax.swing.JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public javax.swing.JButton getBtnRetirarBus() {
        return btnRetirarBus;
    }

    public void setBtnRetirarBus(javax.swing.JButton btnRetirarBus) {
        this.btnRetirarBus = btnRetirarBus;
    }

    public javax.swing.JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(javax.swing.JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public javax.swing.JButton getBtnValidarAcceso() {
        return btnValidarAcceso;
    }

    public void setBtnValidarAcceso(javax.swing.JButton btnValidarAcceso) {
        this.btnValidarAcceso = btnValidarAcceso;
    }

    public javax.swing.JButton getBtnVerAlertas() {
        return btnVerAlertas;
    }

    public void setBtnVerAlertas(javax.swing.JButton btnVerAlertas) {
        this.btnVerAlertas = btnVerAlertas;
    }

    public javax.swing.JButton getBtnVerEstadoDeEstaciones() {
        return btnVerEstadoDeEstaciones;
    }

    public void setBtnVerEstadoDeEstaciones(javax.swing.JButton btnVerEstadoDeEstaciones) {
        this.btnVerEstadoDeEstaciones = btnVerEstadoDeEstaciones;
    }

    public javax.swing.JButton getBtnVerListaEstaciones() {
        return btnVerListaEstaciones;
    }

    public void setBtnVerListaEstaciones(javax.swing.JButton btnVerListaEstaciones) {
        this.btnVerListaEstaciones = btnVerListaEstaciones;
    }

    public javax.swing.JButton getBtnVerRutasPorEstacion() {
        return btnVerRutasPorEstacion;
    }

    public void setBtnVerRutasPorEstacion(javax.swing.JButton btnVerRutasPorEstacion) {
        this.btnVerRutasPorEstacion = btnVerRutasPorEstacion;
    }

    public javax.swing.JComboBox<String> getCmbAddOperation() {
        return cmbAddOperation;
    }

    public void setCmbAddOperation(javax.swing.JComboBox<String> cmbAddOperation) {
        this.cmbAddOperation = cmbAddOperation;
    }

    public javax.swing.JComboBox<String> getCmbAddSaturation() {
        return cmbAddSaturation;
    }

    public void setCmbAddSaturation(javax.swing.JComboBox<String> cmbAddSaturation) {
        this.cmbAddSaturation = cmbAddSaturation;
    }

    public javax.swing.JComboBox<String> getCmbModifyOperation() {
        return cmbModifyOperation;
    }

    public void setCmbModifyOperation(javax.swing.JComboBox<String> cmbModifyOperation) {
        this.cmbModifyOperation = cmbModifyOperation;
    }

    public javax.swing.JComboBox<String> getCmbModifySaturation() {
        return cmbModifySaturation;
    }

    public void setCmbModifySaturation(javax.swing.JComboBox<String> cmbModifySaturation) {
        this.cmbModifySaturation = cmbModifySaturation;
    }

    public javax.swing.JComboBox<String> getCmbSelectStops() {
        return cmbSelectStops;
    }

    public void setCmbSelectStops(javax.swing.JComboBox<String> cmbSelectStops) {
        this.cmbSelectStops = cmbSelectStops;
    }

    public javax.swing.JLabel getImgTMLogo128x128() {
        return imgTMLogo128x128;
    }

    public void setImgTMLogo128x128(javax.swing.JLabel imgTMLogo128x128) {
        this.imgTMLogo128x128 = imgTMLogo128x128;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public javax.swing.JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(javax.swing.JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(javax.swing.JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public javax.swing.JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(javax.swing.JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public javax.swing.JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(javax.swing.JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public javax.swing.JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(javax.swing.JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public javax.swing.JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(javax.swing.JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public javax.swing.JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(javax.swing.JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(javax.swing.JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public javax.swing.JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(javax.swing.JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public javax.swing.JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(javax.swing.JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public javax.swing.JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(javax.swing.JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public javax.swing.JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(javax.swing.JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public javax.swing.JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(javax.swing.JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public javax.swing.JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(javax.swing.JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public javax.swing.JLabel getjLabel37() {
        return jLabel37;
    }

    public void setjLabel37(javax.swing.JLabel jLabel37) {
        this.jLabel37 = jLabel37;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JScrollPane getjScrollPane10() {
        return jScrollPane10;
    }

    public void setjScrollPane10(javax.swing.JScrollPane jScrollPane10) {
        this.jScrollPane10 = jScrollPane10;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public javax.swing.JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(javax.swing.JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public javax.swing.JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(javax.swing.JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public javax.swing.JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(javax.swing.JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public javax.swing.JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(javax.swing.JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public javax.swing.JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    public void setjScrollPane8(javax.swing.JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    public javax.swing.JList<String> getLstListAlertas() {
        return lstListAlertas;
    }

    public void setLstListAlertas(javax.swing.JList<String> lstListAlertas) {
        this.lstListAlertas = lstListAlertas;
    }

    public javax.swing.JList<String> getLstListaDeEstadoDeLasEstaciones() {
        return lstListaDeEstadoDeLasEstaciones;
    }

    public void setLstListaDeEstadoDeLasEstaciones(javax.swing.JList<String> lstListaDeEstadoDeLasEstaciones) {
        this.lstListaDeEstadoDeLasEstaciones = lstListaDeEstadoDeLasEstaciones;
    }

    public javax.swing.JList<String> getLstListaDeParadas() {
        return lstListaDeParadas;
    }

    public void setLstListaDeParadas(javax.swing.JList<String> lstListaDeParadas) {
        this.lstListaDeParadas = lstListaDeParadas;
    }

    public javax.swing.JList<String> getLstListaDeParadasPorEstacion() {
        return lstListaDeParadasPorEstacion;
    }

    public void setLstListaDeParadasPorEstacion(javax.swing.JList<String> lstListaDeParadasPorEstacion) {
        this.lstListaDeParadasPorEstacion = lstListaDeParadasPorEstacion;
    }

    public javax.swing.JList<String> getLstListaEstaciones1() {
        return lstListaEstaciones1;
    }

    public void setLstListaEstaciones1(javax.swing.JList<String> lstListaEstaciones1) {
        this.lstListaEstaciones1 = lstListaEstaciones1;
    }

    public javax.swing.JList<String> getLstListaEstaciones2() {
        return lstListaEstaciones2;
    }

    public void setLstListaEstaciones2(javax.swing.JList<String> lstListaEstaciones2) {
        this.lstListaEstaciones2 = lstListaEstaciones2;
    }

    public javax.swing.JList<String> getLstListaEstaciones3() {
        return lstListaEstaciones3;
    }

    public void setLstListaEstaciones3(javax.swing.JList<String> lstListaEstaciones3) {
        this.lstListaEstaciones3 = lstListaEstaciones3;
    }

    public javax.swing.JList<String> getLstListaEstaciones4() {
        return lstListaEstaciones4;
    }

    public void setLstListaEstaciones4(javax.swing.JList<String> lstListaEstaciones4) {
        this.lstListaEstaciones4 = lstListaEstaciones4;
    }

    public javax.swing.JList<String> getLstListaEstaciones5() {
        return lstListaEstaciones5;
    }

    public void setLstListaEstaciones5(javax.swing.JList<String> lstListaEstaciones5) {
        this.lstListaEstaciones5 = lstListaEstaciones5;
    }

    public javax.swing.JPanel getPnlBlank10() {
        return pnlBlank10;
    }

    public void setPnlBlank10(javax.swing.JPanel pnlBlank10) {
        this.pnlBlank10 = pnlBlank10;
    }

    public javax.swing.JPanel getPnlBlank20() {
        return pnlBlank20;
    }

    public void setPnlBlank20(javax.swing.JPanel pnlBlank20) {
        this.pnlBlank20 = pnlBlank20;
    }

    public javax.swing.JPanel getPnlBotones() {
        return pnlBotones;
    }

    public void setPnlBotones(javax.swing.JPanel pnlBotones) {
        this.pnlBotones = pnlBotones;
    }

    public javax.swing.JPanel getPnlBotones1() {
        return pnlBotones1;
    }

    public void setPnlBotones1(javax.swing.JPanel pnlBotones1) {
        this.pnlBotones1 = pnlBotones1;
    }

    public javax.swing.JPanel getPnlBotones2() {
        return pnlBotones2;
    }

    public void setPnlBotones2(javax.swing.JPanel pnlBotones2) {
        this.pnlBotones2 = pnlBotones2;
    }

    public javax.swing.JPanel getPnlBotones3() {
        return pnlBotones3;
    }

    public void setPnlBotones3(javax.swing.JPanel pnlBotones3) {
        this.pnlBotones3 = pnlBotones3;
    }

    public javax.swing.JPanel getPnlBotones4() {
        return pnlBotones4;
    }

    public void setPnlBotones4(javax.swing.JPanel pnlBotones4) {
        this.pnlBotones4 = pnlBotones4;
    }

    public javax.swing.JPanel getPnlBotones5() {
        return pnlBotones5;
    }

    public void setPnlBotones5(javax.swing.JPanel pnlBotones5) {
        this.pnlBotones5 = pnlBotones5;
    }

    public javax.swing.JPanel getPnlBotones6() {
        return pnlBotones6;
    }

    public void setPnlBotones6(javax.swing.JPanel pnlBotones6) {
        this.pnlBotones6 = pnlBotones6;
    }

    public javax.swing.JPanel getPnlCard1() {
        return pnlCard1;
    }

    public void setPnlCard1(javax.swing.JPanel pnlCard1) {
        this.pnlCard1 = pnlCard1;
    }

    public javax.swing.JPanel getPnlCard11() {
        return pnlCard11;
    }

    public void setPnlCard11(javax.swing.JPanel pnlCard11) {
        this.pnlCard11 = pnlCard11;
    }

    public javax.swing.JPanel getPnlCard12() {
        return pnlCard12;
    }

    public void setPnlCard12(javax.swing.JPanel pnlCard12) {
        this.pnlCard12 = pnlCard12;
    }

    public javax.swing.JPanel getPnlCard13() {
        return pnlCard13;
    }

    public void setPnlCard13(javax.swing.JPanel pnlCard13) {
        this.pnlCard13 = pnlCard13;
    }

    public javax.swing.JPanel getPnlCard14() {
        return pnlCard14;
    }

    public void setPnlCard14(javax.swing.JPanel pnlCard14) {
        this.pnlCard14 = pnlCard14;
    }

    public javax.swing.JPanel getPnlCard15() {
        return pnlCard15;
    }

    public void setPnlCard15(javax.swing.JPanel pnlCard15) {
        this.pnlCard15 = pnlCard15;
    }

    public javax.swing.JPanel getPnlCard2() {
        return pnlCard2;
    }

    public void setPnlCard2(javax.swing.JPanel pnlCard2) {
        this.pnlCard2 = pnlCard2;
    }

    public javax.swing.JPanel getPnlCard21() {
        return pnlCard21;
    }

    public void setPnlCard21(javax.swing.JPanel pnlCard21) {
        this.pnlCard21 = pnlCard21;
    }

    public javax.swing.JPanel getPnlCard22() {
        return pnlCard22;
    }

    public void setPnlCard22(javax.swing.JPanel pnlCard22) {
        this.pnlCard22 = pnlCard22;
    }

    public javax.swing.JPanel getPnlCard23() {
        return pnlCard23;
    }

    public void setPnlCard23(javax.swing.JPanel pnlCard23) {
        this.pnlCard23 = pnlCard23;
    }

    public javax.swing.JPanel getPnlCard24() {
        return pnlCard24;
    }

    public void setPnlCard24(javax.swing.JPanel pnlCard24) {
        this.pnlCard24 = pnlCard24;
    }

    public javax.swing.JPanel getPnlCard3() {
        return pnlCard3;
    }

    public void setPnlCard3(javax.swing.JPanel pnlCard3) {
        this.pnlCard3 = pnlCard3;
    }

    public javax.swing.JPanel getPnlCard4() {
        return pnlCard4;
    }

    public void setPnlCard4(javax.swing.JPanel pnlCard4) {
        this.pnlCard4 = pnlCard4;
    }

    public javax.swing.JPanel getPnlCard5() {
        return pnlCard5;
    }

    public void setPnlCard5(javax.swing.JPanel pnlCard5) {
        this.pnlCard5 = pnlCard5;
    }

    public javax.swing.JPanel getPnlCard6() {
        return pnlCard6;
    }

    public void setPnlCard6(javax.swing.JPanel pnlCard6) {
        this.pnlCard6 = pnlCard6;
    }

    public javax.swing.JPanel getPnlCardLayout1() {
        return pnlCardLayout1;
    }

    public void setPnlCardLayout1(javax.swing.JPanel pnlCardLayout1) {
        this.pnlCardLayout1 = pnlCardLayout1;
    }

    public javax.swing.JPanel getPnlCardLayout2() {
        return pnlCardLayout2;
    }

    public void setPnlCardLayout2(javax.swing.JPanel pnlCardLayout2) {
        this.pnlCardLayout2 = pnlCardLayout2;
    }

    public javax.swing.JPanel getPnlGeneral() {
        return pnlGeneral;
    }

    public void setPnlGeneral(javax.swing.JPanel pnlGeneral) {
        this.pnlGeneral = pnlGeneral;
    }

    public javax.swing.JPanel getPnlMenuLateral() {
        return pnlMenuLateral;
    }

    public void setPnlMenuLateral(javax.swing.JPanel pnlMenuLateral) {
        this.pnlMenuLateral = pnlMenuLateral;
    }

    public javax.swing.JTextField getTxtAddFlowOfPeople() {
        return txtAddFlowOfPeople;
    }

    public void setTxtAddFlowOfPeople(javax.swing.JTextField txtAddFlowOfPeople) {
        this.txtAddFlowOfPeople = txtAddFlowOfPeople;
    }

    public javax.swing.JTextField getTxtAddMaxCapacity() {
        return txtAddMaxCapacity;
    }

    public void setTxtAddMaxCapacity(javax.swing.JTextField txtAddMaxCapacity) {
        this.txtAddMaxCapacity = txtAddMaxCapacity;
    }

    public javax.swing.JTextField getTxtAddNameStation() {
        return txtAddNameStation;
    }

    public void setTxtAddNameStation(javax.swing.JTextField txtAddNameStation) {
        this.txtAddNameStation = txtAddNameStation;
    }

    public javax.swing.JTextField getTxtDestino() {
        return txtDestino;
    }

    public void setTxtDestino(javax.swing.JTextField txtDestino) {
        this.txtDestino = txtDestino;
    }

    public javax.swing.JTextField getTxtModifyFlowOfPeople() {
        return txtModifyFlowOfPeople;
    }

    public void setTxtModifyFlowOfPeople(javax.swing.JTextField txtModifyFlowOfPeople) {
        this.txtModifyFlowOfPeople = txtModifyFlowOfPeople;
    }

    public javax.swing.JTextField getTxtModifyMaxCapacity() {
        return txtModifyMaxCapacity;
    }

    public void setTxtModifyMaxCapacity(javax.swing.JTextField txtModifyMaxCapacity) {
        this.txtModifyMaxCapacity = txtModifyMaxCapacity;
    }

    public javax.swing.JTextField getTxtModifyNameStation() {
        return txtModifyNameStation;
    }

    public void setTxtModifyNameStation(javax.swing.JTextField txtModifyNameStation) {
        this.txtModifyNameStation = txtModifyNameStation;
    }

    public javax.swing.JTextField getTxtNumeroPersonas() {
        return txtNumeroPersonas;
    }

    public void setTxtNumeroPersonas(javax.swing.JTextField txtNumeroPersonas) {
        this.txtNumeroPersonas = txtNumeroPersonas;
    }

    public javax.swing.JTextField getTxtPuntoInicio() {
        return txtPuntoInicio;
    }

    public void setTxtPuntoInicio(javax.swing.JTextField txtPuntoInicio) {
        this.txtPuntoInicio = txtPuntoInicio;
    }

}
