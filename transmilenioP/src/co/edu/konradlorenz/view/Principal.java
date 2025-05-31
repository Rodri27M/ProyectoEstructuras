/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.konradlorenz.view;

/**
 *
 * @author bsvar
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        pnlMenuIzquierda = new javax.swing.JPanel();
        imgTM128 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnMonitoreo = new javax.swing.JButton();
        btnGestionEstacion = new javax.swing.JButton();
        btnGestionFlota = new javax.swing.JButton();
        btnGestionRutas = new javax.swing.JButton();
        btnCalcularRutas = new javax.swing.JButton();
        btnValidarAcceso = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        HomeCardLayout1 = new javax.swing.JPanel();
        pnlBlank1 = new javax.swing.JPanel();
        pnlMonitoreo1 = new javax.swing.JPanel();
        pnlBotones1 = new javax.swing.JPanel();
        btnRegistrarPersonas = new javax.swing.JButton();
        btnVerAlertas = new javax.swing.JButton();
        btnVerListaEstaciones = new javax.swing.JButton();
        btnVerParadasPorEstacion = new javax.swing.JButton();
        btnVerEstadoDeEstaciones = new javax.swing.JButton();
        pnlGestionEstacion1 = new javax.swing.JPanel();
        pnlBotones2 = new javax.swing.JPanel();
        btnAgregarEstacion = new javax.swing.JButton();
        btnModificarEstacion = new javax.swing.JButton();
        btnEliminarEstacion = new javax.swing.JButton();
        btnAsignarParada = new javax.swing.JButton();
        pnlGestionFlota1 = new javax.swing.JPanel();
        pnlBotones3 = new javax.swing.JPanel();
        btnMostrarListaBuses = new javax.swing.JButton();
        btnAgregarBus = new javax.swing.JButton();
        btnAccederBus = new javax.swing.JButton();
        btnModificarBus = new javax.swing.JButton();
        btnRetirarBus = new javax.swing.JButton();
        btnAsignarRutaGestionFlota = new javax.swing.JButton();
        pnlGestionRutas1 = new javax.swing.JPanel();
        pnlBotones4 = new javax.swing.JPanel();
        btnMostrarListaRutas = new javax.swing.JButton();
        btnAgregarRuta = new javax.swing.JButton();
        btnModificarRuta = new javax.swing.JButton();
        btnEliminarRuta = new javax.swing.JButton();
        btnAsignarRutaGestionRuta = new javax.swing.JButton();
        pnlCalcularRutas1 = new javax.swing.JPanel();
        pnlBotones5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        btnCalcularRutaYDistancia = new javax.swing.JButton();
        txtPuntoInicio = new javax.swing.JTextField();
        pnlValidarAcceso1 = new javax.swing.JPanel();
        pnlBotones6 = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        HomeCardLayout2 = new javax.swing.JPanel();
        pnlBlank2 = new javax.swing.JPanel();
        pnlRegistrarNumPersonas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListEstaciones = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        btnRegistrarNumeroPersonas = new javax.swing.JButton();
        pnlVerAlertas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pnlGestionFlota2 = new javax.swing.JPanel();
        pnlGestionRutas2 = new javax.swing.JPanel();
        pnlCalcularRutas2 = new javax.swing.JPanel();
        pnlValidarAcceso2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGeneral.setBackground(new java.awt.Color(213, 0, 0));
        pnlGeneral.setMaximumSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setMinimumSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuIzquierda.setBackground(new java.awt.Color(180, 0, 0));
        pnlMenuIzquierda.setLayout(new java.awt.BorderLayout());

        imgTM128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTM128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/konradlorenz/view/img/tm-logo-128x128.png"))); // NOI18N
        pnlMenuIzquierda.add(imgTM128, java.awt.BorderLayout.CENTER);

        pnlBotones.setBackground(new java.awt.Color(180, 0, 0));
        pnlBotones.setMaximumSize(new java.awt.Dimension(300, 520));
        pnlBotones.setMinimumSize(new java.awt.Dimension(300, 520));
        pnlBotones.setPreferredSize(new java.awt.Dimension(300, 520));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMonitoreo.setBackground(new java.awt.Color(180, 0, 0));
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

        btnGestionEstacion.setBackground(new java.awt.Color(180, 0, 0));
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

        btnGestionFlota.setBackground(new java.awt.Color(180, 0, 0));
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

        btnGestionRutas.setBackground(new java.awt.Color(180, 0, 0));
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

        btnCalcularRutas.setBackground(new java.awt.Color(180, 0, 0));
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

        btnValidarAcceso.setBackground(new java.awt.Color(180, 0, 0));
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

        btnSalir.setBackground(new java.awt.Color(180, 0, 0));
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

        pnlMenuIzquierda.add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlGeneral.add(pnlMenuIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        HomeCardLayout1.setLayout(new java.awt.CardLayout());

        pnlBlank1.setBackground(new java.awt.Color(200, 0, 0));
        pnlBlank1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlBlank1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlBlank1.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout1.add(pnlBlank1, "card8");

        pnlMonitoreo1.setBackground(new java.awt.Color(200, 0, 0));
        pnlMonitoreo1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlMonitoreo1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlMonitoreo1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlMonitoreo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnVerParadasPorEstacion.setBackground(new java.awt.Color(180, 0, 0));
        btnVerParadasPorEstacion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btnVerParadasPorEstacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVerParadasPorEstacion.setText("Ver Paradas por Estación");
        btnVerParadasPorEstacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 0, 0), 2));
        btnVerParadasPorEstacion.setContentAreaFilled(false);
        btnVerParadasPorEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerParadasPorEstacion.setFocusPainted(false);
        btnVerParadasPorEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerParadasPorEstacionActionPerformed(evt);
            }
        });
        pnlBotones1.add(btnVerParadasPorEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, 230, 30));

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

        pnlMonitoreo1.add(pnlBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 520));

        HomeCardLayout1.add(pnlMonitoreo1, "card2");

        pnlGestionEstacion1.setBackground(new java.awt.Color(200, 0, 0));
        pnlGestionEstacion1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlGestionEstacion1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlGestionEstacion1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlGestionEstacion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlGestionEstacion1.add(pnlBotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        HomeCardLayout1.add(pnlGestionEstacion1, "card3");

        pnlGestionFlota1.setBackground(new java.awt.Color(200, 0, 0));
        pnlGestionFlota1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlGestionFlota1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlGestionFlota1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlGestionFlota1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlGestionFlota1.add(pnlBotones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        HomeCardLayout1.add(pnlGestionFlota1, "card4");

        pnlGestionRutas1.setBackground(new java.awt.Color(200, 0, 0));
        pnlGestionRutas1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlGestionRutas1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlGestionRutas1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlGestionRutas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlGestionRutas1.add(pnlBotones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        HomeCardLayout1.add(pnlGestionRutas1, "card5");

        pnlCalcularRutas1.setBackground(new java.awt.Color(200, 0, 0));
        pnlCalcularRutas1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCalcularRutas1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCalcularRutas1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlCalcularRutas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlCalcularRutas1.add(pnlBotones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        HomeCardLayout1.add(pnlCalcularRutas1, "card6");

        pnlValidarAcceso1.setBackground(new java.awt.Color(200, 0, 0));
        pnlValidarAcceso1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlValidarAcceso1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlValidarAcceso1.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlValidarAcceso1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlValidarAcceso1.add(pnlBotones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        HomeCardLayout1.add(pnlValidarAcceso1, "card7");

        pnlGeneral.add(HomeCardLayout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 720));

        HomeCardLayout2.setLayout(new java.awt.CardLayout());

        pnlBlank2.setBackground(new java.awt.Color(213, 0, 0));
        pnlBlank2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlBlank2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlBlank2.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout2.add(pnlBlank2, "card8");

        pnlRegistrarNumPersonas.setBackground(new java.awt.Color(213, 0, 0));
        pnlRegistrarNumPersonas.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlRegistrarNumPersonas.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlRegistrarNumPersonas.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlRegistrarNumPersonas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de Estaciones");
        pnlRegistrarNumPersonas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 270, 50));

        jScrollPane1.setBackground(new java.awt.Color(180, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstListEstaciones.setBackground(new java.awt.Color(180, 0, 0));
        lstListEstaciones.setForeground(new java.awt.Color(0, 0, 0));
        lstListEstaciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "xd1", "xd2", "xd3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstListEstaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstListEstaciones.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListEstaciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstListEstaciones);

        pnlRegistrarNumPersonas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 270, 520));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Ingrese número de personas");
        pnlRegistrarNumPersonas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 290, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("actualmente en la estación");
        pnlRegistrarNumPersonas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 290, 50));

        txtNumeroPersonas.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroPersonas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtNumeroPersonas.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPersonasActionPerformed(evt);
            }
        });
        pnlRegistrarNumPersonas.add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 150, -1));

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
        pnlRegistrarNumPersonas.add(btnRegistrarNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 150, 30));

        HomeCardLayout2.add(pnlRegistrarNumPersonas, "card2");

        pnlVerAlertas.setBackground(new java.awt.Color(213, 0, 0));
        pnlVerAlertas.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        pnlVerAlertas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 480, 570));

        HomeCardLayout2.add(pnlVerAlertas, "card3");

        pnlGestionFlota2.setBackground(new java.awt.Color(213, 0, 0));
        pnlGestionFlota2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlGestionFlota2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlGestionFlota2.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout2.add(pnlGestionFlota2, "card4");

        pnlGestionRutas2.setBackground(new java.awt.Color(213, 0, 0));
        pnlGestionRutas2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlGestionRutas2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlGestionRutas2.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout2.add(pnlGestionRutas2, "card5");

        pnlCalcularRutas2.setBackground(new java.awt.Color(213, 0, 0));
        pnlCalcularRutas2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlCalcularRutas2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlCalcularRutas2.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout2.add(pnlCalcularRutas2, "card6");

        pnlValidarAcceso2.setBackground(new java.awt.Color(213, 0, 0));
        pnlValidarAcceso2.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlValidarAcceso2.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlValidarAcceso2.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout2.add(pnlValidarAcceso2, "card7");

        pnlGeneral.add(HomeCardLayout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 680, 720));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitoreoActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card2");
    }//GEN-LAST:event_btnMonitoreoActionPerformed

    private void btnGestionEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEstacionActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card3");
    }//GEN-LAST:event_btnGestionEstacionActionPerformed

    private void btnGestionFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionFlotaActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card4");
    }//GEN-LAST:event_btnGestionFlotaActionPerformed

    private void btnGestionRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionRutasActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card5");
    }//GEN-LAST:event_btnGestionRutasActionPerformed

    private void btnCalcularRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRutasActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card6");
    }//GEN-LAST:event_btnCalcularRutasActionPerformed

    private void btnValidarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarAccesoActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout1.getLayout());
        cl.show(HomeCardLayout1, "card7");
    }//GEN-LAST:event_btnValidarAccesoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO: Agregar guardado de datos.
        System.exit(0);// Que esto vaya en el controlador.
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout2.getLayout());
        cl.show(HomeCardLayout2, "card2");
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed

    private void btnVerAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlertasActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout)(HomeCardLayout2.getLayout());
        cl.show(HomeCardLayout2, "card3");
    }//GEN-LAST:event_btnVerAlertasActionPerformed

    private void btnVerListaEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaEstacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerListaEstacionesActionPerformed

    private void btnVerParadasPorEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerParadasPorEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerParadasPorEstacionActionPerformed

    private void btnVerEstadoDeEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoDeEstacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerEstadoDeEstacionesActionPerformed

    private void btnAgregarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarEstacionActionPerformed

    private void btnModificarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarEstacionActionPerformed

    private void btnEliminarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEstacionActionPerformed

    private void btnAsignarParadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarParadaActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarNumeroPersonasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeCardLayout1;
    private javax.swing.JPanel HomeCardLayout2;
    private javax.swing.JButton btnAccederBus;
    private javax.swing.JButton btnAgregarBus;
    private javax.swing.JButton btnAgregarEstacion;
    private javax.swing.JButton btnAgregarRuta;
    private javax.swing.JButton btnAsignarParada;
    private javax.swing.JButton btnAsignarRutaGestionFlota;
    private javax.swing.JButton btnAsignarRutaGestionRuta;
    private javax.swing.JButton btnCalcularRutaYDistancia;
    private javax.swing.JButton btnCalcularRutas;
    private javax.swing.JButton btnEliminarEstacion;
    private javax.swing.JButton btnEliminarRuta;
    private javax.swing.JButton btnGestionEstacion;
    private javax.swing.JButton btnGestionFlota;
    private javax.swing.JButton btnGestionRutas;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnModificarBus;
    private javax.swing.JButton btnModificarEstacion;
    private javax.swing.JButton btnModificarRuta;
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
    private javax.swing.JButton btnVerParadasPorEstacion;
    private javax.swing.JLabel imgTM128;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstListEstaciones;
    private javax.swing.JPanel pnlBlank1;
    private javax.swing.JPanel pnlBlank2;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotones1;
    private javax.swing.JPanel pnlBotones2;
    private javax.swing.JPanel pnlBotones3;
    private javax.swing.JPanel pnlBotones4;
    private javax.swing.JPanel pnlBotones5;
    private javax.swing.JPanel pnlBotones6;
    private javax.swing.JPanel pnlCalcularRutas1;
    private javax.swing.JPanel pnlCalcularRutas2;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlGestionEstacion1;
    private javax.swing.JPanel pnlGestionFlota1;
    private javax.swing.JPanel pnlGestionFlota2;
    private javax.swing.JPanel pnlGestionRutas1;
    private javax.swing.JPanel pnlGestionRutas2;
    private javax.swing.JPanel pnlMenuIzquierda;
    private javax.swing.JPanel pnlMonitoreo1;
    private javax.swing.JPanel pnlRegistrarNumPersonas;
    private javax.swing.JPanel pnlValidarAcceso1;
    private javax.swing.JPanel pnlValidarAcceso2;
    private javax.swing.JPanel pnlVerAlertas;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtPuntoInicio;
    // End of variables declaration//GEN-END:variables
}
