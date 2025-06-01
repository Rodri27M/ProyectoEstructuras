package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controlador;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {

    Controlador ctrl;

    public Principal(Controlador ctrl) {
        this.ctrl = ctrl;
        initComponents();
    }
    
    //Specific methods
    
    public void switchCard(int cardNum, int num){
        JPanel card = (cardNum==1) ? HomeCardLayout1 : HomeCardLayout2;
        
        java.awt.CardLayout cl = (java.awt.CardLayout) (card.getLayout());
        cl.show(card, "card" + String.valueOf(num));
    }

    public void setListaEstaciones(String[] nombres) {
        lstListaEstaciones1.setListData(nombres);
        lstListaEstaciones2.setListData(nombres);
    }
    
    public void setListaAlertas(String[] alertas) {
        lstListAlertas.setListData(alertas);
    }
    
    public void setListaDeParadasPorEstacion(String[] rutas) {
        lstListaDeParadasPorEstacion.setListData(rutas);
    }
    
    public void setListaDeEstadoDeEstaciones(String[] rutas) {
        lstListaDeEstadoDeLasEstaciones.setListData(rutas);
    }
    
    //Gett & Sett
    
    public Controlador getCtrl() {

        return ctrl;
    }

    public void setCtrl(Controlador ctrl) {
        this.ctrl = ctrl;
    }

    public JPanel getHomeCardLayout1() {
        return HomeCardLayout1;
    }

    public void setHomeCardLayout1(JPanel HomeCardLayout1) {
        this.HomeCardLayout1 = HomeCardLayout1;
    }

    public JPanel getHomeCardLayout2() {
        return HomeCardLayout2;
    }

    public void setHomeCardLayout2(JPanel HomeCardLayout2) {
        this.HomeCardLayout2 = HomeCardLayout2;
    }

    public JButton getBtnAccederBus() {
        return btnAccederBus;
    }

    public void setBtnAccederBus(JButton btnAccederBus) {
        this.btnAccederBus = btnAccederBus;
    }

    public JButton getBtnAgregarBus() {
        return btnAgregarBus;
    }

    public void setBtnAgregarBus(JButton btnAgregarBus) {
        this.btnAgregarBus = btnAgregarBus;
    }

    public JButton getBtnAgregarEstacion() {
        return btnAgregarEstacion;
    }

    public void setBtnAgregarEstacion(JButton btnAgregarEstacion) {
        this.btnAgregarEstacion = btnAgregarEstacion;
    }

    public JButton getBtnAgregarRuta() {
        return btnAgregarRuta;
    }

    public void setBtnAgregarRuta(JButton btnAgregarRuta) {
        this.btnAgregarRuta = btnAgregarRuta;
    }

    public JButton getBtnAsignarParada() {
        return btnAsignarParada;
    }

    public void setBtnAsignarParada(JButton btnAsignarParada) {
        this.btnAsignarParada = btnAsignarParada;
    }

    public JButton getBtnAsignarRutaGestionFlota() {
        return btnAsignarRutaGestionFlota;
    }

    public void setBtnAsignarRutaGestionFlota(JButton btnAsignarRutaGestionFlota) {
        this.btnAsignarRutaGestionFlota = btnAsignarRutaGestionFlota;
    }

    public JButton getBtnAsignarRutaGestionRuta() {
        return btnAsignarRutaGestionRuta;
    }

    public void setBtnAsignarRutaGestionRuta(JButton btnAsignarRutaGestionRuta) {
        this.btnAsignarRutaGestionRuta = btnAsignarRutaGestionRuta;
    }

    public JButton getBtnCalcularRutaYDistancia() {
        return btnCalcularRutaYDistancia;
    }

    public void setBtnCalcularRutaYDistancia(JButton btnCalcularRutaYDistancia) {
        this.btnCalcularRutaYDistancia = btnCalcularRutaYDistancia;
    }

    public JButton getBtnCalcularRutas() {
        return btnCalcularRutas;
    }

    public void setBtnCalcularRutas(JButton btnCalcularRutas) {
        this.btnCalcularRutas = btnCalcularRutas;
    }

    public JButton getBtnEliminarEstacion() {
        return btnEliminarEstacion;
    }

    public void setBtnEliminarEstacion(JButton btnEliminarEstacion) {
        this.btnEliminarEstacion = btnEliminarEstacion;
    }

    public JButton getBtnEliminarRuta() {
        return btnEliminarRuta;
    }

    public void setBtnEliminarRuta(JButton btnEliminarRuta) {
        this.btnEliminarRuta = btnEliminarRuta;
    }

    public JButton getBtnGestionEstacion() {
        return btnGestionEstacion;
    }

    public void setBtnGestionEstacion(JButton btnGestionEstacion) {
        this.btnGestionEstacion = btnGestionEstacion;
    }

    public JButton getBtnGestionFlota() {
        return btnGestionFlota;
    }

    public void setBtnGestionFlota(JButton btnGestionFlota) {
        this.btnGestionFlota = btnGestionFlota;
    }

    public JButton getBtnGestionRutas() {
        return btnGestionRutas;
    }

    public void setBtnGestionRutas(JButton btnGestionRutas) {
        this.btnGestionRutas = btnGestionRutas;
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JButton getBtnModificarBus() {
        return btnModificarBus;
    }

    public void setBtnModificarBus(JButton btnModificarBus) {
        this.btnModificarBus = btnModificarBus;
    }

    public JButton getBtnModificarEstacion() {
        return btnModificarEstacion;
    }

    public void setBtnModificarEstacion(JButton btnModificarEstacion) {
        this.btnModificarEstacion = btnModificarEstacion;
    }

    public JButton getBtnModificarRuta() {
        return btnModificarRuta;
    }

    public void setBtnModificarRuta(JButton btnModificarRuta) {
        this.btnModificarRuta = btnModificarRuta;
    }

    public JButton getBtnMonitoreo() {
        return btnMonitoreo;
    }

    public void setBtnMonitoreo(JButton btnMonitoreo) {
        this.btnMonitoreo = btnMonitoreo;
    }

    public JButton getBtnMostrarListaBuses() {
        return btnMostrarListaBuses;
    }

    public void setBtnMostrarListaBuses(JButton btnMostrarListaBuses) {
        this.btnMostrarListaBuses = btnMostrarListaBuses;
    }

    public JButton getBtnMostrarListaRutas() {
        return btnMostrarListaRutas;
    }

    public void setBtnMostrarListaRutas(JButton btnMostrarListaRutas) {
        this.btnMostrarListaRutas = btnMostrarListaRutas;
    }

    public JButton getBtnRegistrarNumeroPersonas() {
        return btnRegistrarNumeroPersonas;
    }

    public void setBtnRegistrarNumeroPersonas(JButton btnRegistrarNumeroPersonas) {
        this.btnRegistrarNumeroPersonas = btnRegistrarNumeroPersonas;
    }

    public JButton getBtnRegistrarPersonas() {
        return btnRegistrarPersonas;
    }

    public void setBtnRegistrarPersonas(JButton btnRegistrarPersonas) {
        this.btnRegistrarPersonas = btnRegistrarPersonas;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public JButton getBtnRetirarBus() {
        return btnRetirarBus;
    }

    public void setBtnRetirarBus(JButton btnRetirarBus) {
        this.btnRetirarBus = btnRetirarBus;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnValidarAcceso() {
        return btnValidarAcceso;
    }

    public void setBtnValidarAcceso(JButton btnValidarAcceso) {
        this.btnValidarAcceso = btnValidarAcceso;
    }

    public JButton getBtnVerAlertas() {
        return btnVerAlertas;
    }

    public void setBtnVerAlertas(JButton btnVerAlertas) {
        this.btnVerAlertas = btnVerAlertas;
    }

    public JButton getBtnVerEstadoDeEstaciones() {
        return btnVerEstadoDeEstaciones;
    }

    public void setBtnVerEstadoDeEstaciones(JButton btnVerEstadoDeEstaciones) {
        this.btnVerEstadoDeEstaciones = btnVerEstadoDeEstaciones;
    }

    public JButton getBtnVerListaEstaciones() {
        return btnVerListaEstaciones;
    }

    public void setBtnVerListaEstaciones(JButton btnVerListaEstaciones) {
        this.btnVerListaEstaciones = btnVerListaEstaciones;
    }

    public JButton getBtnVerParadasPorEstacion() {
        return btnVerParadasPorEstacion;
    }

    public void setBtnVerParadasPorEstacion(JButton btnVerParadasPorEstacion) {
        this.btnVerParadasPorEstacion = btnVerParadasPorEstacion;
    }

    public JLabel getImgTM128() {
        return imgTM128;
    }

    public void setImgTM128(JLabel imgTM128) {
        this.imgTM128 = imgTM128;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JList<String> getLstListAlertas() {
        return lstListAlertas;
    }

    public void setLstListAlertas(JList<String> lstListAlertas) {
        this.lstListAlertas = lstListAlertas;
    }

    public JList<String> getLstListaDeEstadoDeLasEstaciones() {
        return lstListaDeEstadoDeLasEstaciones;
    }

    public void setLstListaDeEstadoDeLasEstaciones(JList<String> lstListaDeEstadoDeLasEstaciones) {
        this.lstListaDeEstadoDeLasEstaciones = lstListaDeEstadoDeLasEstaciones;
    }

    public JList<String> getLstListaDeParadasPorEstacion() {
        return lstListaDeParadasPorEstacion;
    }

    public void setLstListaDeParadasPorEstacion(JList<String> lstListaDeParadasPorEstacion) {
        this.lstListaDeParadasPorEstacion = lstListaDeParadasPorEstacion;
    }

    public JList<String> getLstListaEstaciones1() {
        return lstListaEstaciones1;
    }

    public void setLstListaEstaciones1(JList<String> lstListaEstaciones1) {
        this.lstListaEstaciones1 = lstListaEstaciones1;
    }

    public JList<String> getLstListaEstaciones2() {
        return lstListaEstaciones2;
    }

    public void setLstListaEstaciones2(JList<String> lstListaEstaciones2) {
        this.lstListaEstaciones2 = lstListaEstaciones2;
    }

    public JPanel getPnlBlank1() {
        return pnlBlank1;
    }

    public void setPnlBlank1(JPanel pnlBlank1) {
        this.pnlBlank1 = pnlBlank1;
    }

    public JPanel getPnlBlank2() {
        return pnlBlank2;
    }

    public void setPnlBlank2(JPanel pnlBlank2) {
        this.pnlBlank2 = pnlBlank2;
    }

    public JPanel getPnlBotones() {
        return pnlBotones;
    }

    public void setPnlBotones(JPanel pnlBotones) {
        this.pnlBotones = pnlBotones;
    }

    public JPanel getPnlBotones1() {
        return pnlBotones1;
    }

    public void setPnlBotones1(JPanel pnlBotones1) {
        this.pnlBotones1 = pnlBotones1;
    }

    public JPanel getPnlBotones2() {
        return pnlBotones2;
    }

    public void setPnlBotones2(JPanel pnlBotones2) {
        this.pnlBotones2 = pnlBotones2;
    }

    public JPanel getPnlBotones3() {
        return pnlBotones3;
    }

    public void setPnlBotones3(JPanel pnlBotones3) {
        this.pnlBotones3 = pnlBotones3;
    }

    public JPanel getPnlBotones4() {
        return pnlBotones4;
    }

    public void setPnlBotones4(JPanel pnlBotones4) {
        this.pnlBotones4 = pnlBotones4;
    }

    public JPanel getPnlBotones5() {
        return pnlBotones5;
    }

    public void setPnlBotones5(JPanel pnlBotones5) {
        this.pnlBotones5 = pnlBotones5;
    }

    public JPanel getPnlBotones6() {
        return pnlBotones6;
    }

    public void setPnlBotones6(JPanel pnlBotones6) {
        this.pnlBotones6 = pnlBotones6;
    }

    public JPanel getPnlCalcularRutas1() {
        return pnlCalcularRutas1;
    }

    public void setPnlCalcularRutas1(JPanel pnlCalcularRutas1) {
        this.pnlCalcularRutas1 = pnlCalcularRutas1;
    }

    public JPanel getPnlGeneral() {
        return pnlGeneral;
    }

    public void setPnlGeneral(JPanel pnlGeneral) {
        this.pnlGeneral = pnlGeneral;
    }

    public JPanel getPnlGestionEstacion1() {
        return pnlGestionEstacion1;
    }

    public void setPnlGestionEstacion1(JPanel pnlGestionEstacion1) {
        this.pnlGestionEstacion1 = pnlGestionEstacion1;
    }

    public JPanel getPnlGestionFlota1() {
        return pnlGestionFlota1;
    }

    public void setPnlGestionFlota1(JPanel pnlGestionFlota1) {
        this.pnlGestionFlota1 = pnlGestionFlota1;
    }

    public JPanel getPnlGestionRutas1() {
        return pnlGestionRutas1;
    }

    public void setPnlGestionRutas1(JPanel pnlGestionRutas1) {
        this.pnlGestionRutas1 = pnlGestionRutas1;
    }

    public JPanel getPnlMenuIzquierda() {
        return pnlMenuIzquierda;
    }

    public void setPnlMenuIzquierda(JPanel pnlMenuIzquierda) {
        this.pnlMenuIzquierda = pnlMenuIzquierda;
    }

    public JPanel getPnlMonitoreo1() {
        return pnlMonitoreo1;
    }

    public void setPnlMonitoreo1(JPanel pnlMonitoreo1) {
        this.pnlMonitoreo1 = pnlMonitoreo1;
    }

    public JPanel getPnlRegistrarNumPersonas() {
        return pnlRegistrarNumPersonas;
    }

    public void setPnlRegistrarNumPersonas(JPanel pnlRegistrarNumPersonas) {
        this.pnlRegistrarNumPersonas = pnlRegistrarNumPersonas;
    }

    public JPanel getPnlValidarAcceso1() {
        return pnlValidarAcceso1;
    }

    public void setPnlValidarAcceso1(JPanel pnlValidarAcceso1) {
        this.pnlValidarAcceso1 = pnlValidarAcceso1;
    }

    public JPanel getPnlVerAlertas() {
        return pnlVerAlertas;
    }

    public void setPnlVerAlertas(JPanel pnlVerAlertas) {
        this.pnlVerAlertas = pnlVerAlertas;
    }

    public JPanel getPnlVerEstadoDeLasEstaciones() {
        return pnlVerEstadoDeLasEstaciones;
    }

    public void setPnlVerEstadoDeLasEstaciones(JPanel pnlVerEstadoDeLasEstaciones) {
        this.pnlVerEstadoDeLasEstaciones = pnlVerEstadoDeLasEstaciones;
    }

    public JPanel getPnlVerListaDeEstaciones() {
        return pnlVerListaDeEstaciones;
    }

    public void setPnlVerListaDeEstaciones(JPanel pnlVerListaDeEstaciones) {
        this.pnlVerListaDeEstaciones = pnlVerListaDeEstaciones;
    }

    public JPanel getPnlVerParadasPorEstacion() {
        return pnlVerParadasPorEstacion;
    }

    public void setPnlVerParadasPorEstacion(JPanel pnlVerParadasPorEstacion) {
        this.pnlVerParadasPorEstacion = pnlVerParadasPorEstacion;
    }

    public JTextField getTxtDestino() {
        return txtDestino;
    }

    public void setTxtDestino(JTextField txtDestino) {
        this.txtDestino = txtDestino;
    }

    public JTextField getTxtNumeroPersonas() {
        return txtNumeroPersonas;
    }

    public void setTxtNumeroPersonas(JTextField txtNumeroPersonas) {
        this.txtNumeroPersonas = txtNumeroPersonas;
    }

    public JTextField getTxtPuntoInicio() {
        return txtPuntoInicio;
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
        lstListaEstaciones1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        btnRegistrarNumeroPersonas = new javax.swing.JButton();
        pnlVerAlertas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstListAlertas = new javax.swing.JList<>();
        pnlVerListaDeEstaciones = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstListaEstaciones2 = new javax.swing.JList<>();
        pnlVerParadasPorEstacion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstListaDeParadasPorEstacion = new javax.swing.JList<>();
        pnlVerEstadoDeLasEstaciones = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstListaDeEstadoDeLasEstaciones = new javax.swing.JList<>();

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
        imgTM128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTM128MouseClicked(evt);
            }
        });
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

        HomeCardLayout1.setToolTipText("");
        HomeCardLayout1.setLayout(new java.awt.CardLayout());

        pnlBlank1.setBackground(new java.awt.Color(200, 0, 0));
        pnlBlank1.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlBlank1.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlBlank1.setPreferredSize(new java.awt.Dimension(680, 720));
        HomeCardLayout1.add(pnlBlank1, "card1");

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
        HomeCardLayout2.add(pnlBlank2, "card1");

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

        lstListaEstaciones1.setBackground(new java.awt.Color(180, 0, 0));
        lstListaEstaciones1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListaEstaciones1.setForeground(new java.awt.Color(255, 255, 255));
        lstListaEstaciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstListaEstaciones1.setFocusable(false);
        lstListaEstaciones1.setRequestFocusEnabled(false);
        lstListaEstaciones1.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListaEstaciones1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstListaEstaciones1);

        pnlRegistrarNumPersonas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 270, 520));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Ingrese número de personas");
        pnlRegistrarNumPersonas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 280, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("actualmente en la estación");
        pnlRegistrarNumPersonas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 280, 50));

        txtNumeroPersonas.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroPersonas.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txtNumeroPersonas.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPersonasActionPerformed(evt);
            }
        });
        pnlRegistrarNumPersonas.add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, -1));

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
        pnlRegistrarNumPersonas.add(btnRegistrarNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 160, 30));

        HomeCardLayout2.add(pnlRegistrarNumPersonas, "card2");

        pnlVerAlertas.setBackground(new java.awt.Color(213, 0, 0));
        pnlVerAlertas.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlVerAlertas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lista de Alertas");
        pnlVerAlertas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 480, 50));

        lstListAlertas.setBackground(new java.awt.Color(180, 0, 0));
        lstListAlertas.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lstListAlertas.setForeground(new java.awt.Color(255, 255, 255));
        lstListAlertas.setFocusable(false);
        lstListAlertas.setRequestFocusEnabled(false);
        lstListAlertas.setSelectionBackground(new java.awt.Color(240, 0, 0));
        lstListAlertas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(lstListAlertas);

        pnlVerAlertas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        HomeCardLayout2.add(pnlVerAlertas, "card3");

        pnlVerListaDeEstaciones.setBackground(new java.awt.Color(213, 0, 0));
        pnlVerListaDeEstaciones.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlVerListaDeEstaciones.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlVerListaDeEstaciones.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlVerListaDeEstaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lista de Estaciones");
        pnlVerListaDeEstaciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

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

        pnlVerListaDeEstaciones.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        HomeCardLayout2.add(pnlVerListaDeEstaciones, "card4");

        pnlVerParadasPorEstacion.setBackground(new java.awt.Color(213, 0, 0));
        pnlVerParadasPorEstacion.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlVerParadasPorEstacion.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlVerParadasPorEstacion.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlVerParadasPorEstacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lista de Paradas por Estación");
        pnlVerParadasPorEstacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

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

        pnlVerParadasPorEstacion.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        HomeCardLayout2.add(pnlVerParadasPorEstacion, "card5");

        pnlVerEstadoDeLasEstaciones.setBackground(new java.awt.Color(213, 0, 0));
        pnlVerEstadoDeLasEstaciones.setMaximumSize(new java.awt.Dimension(680, 720));
        pnlVerEstadoDeLasEstaciones.setMinimumSize(new java.awt.Dimension(680, 720));
        pnlVerEstadoDeLasEstaciones.setPreferredSize(new java.awt.Dimension(680, 720));
        pnlVerEstadoDeLasEstaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lista de Estado de las Estaciones");
        pnlVerEstadoDeLasEstaciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 580, 50));

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

        pnlVerEstadoDeLasEstaciones.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 480, 520));

        HomeCardLayout2.add(pnlVerEstadoDeLasEstaciones, "card6");

        pnlGeneral.add(HomeCardLayout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 680, 720));

        getContentPane().add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitoreoActionPerformed
        switchCard(1,2);
        switchCard(2,1);
    }//GEN-LAST:event_btnMonitoreoActionPerformed

    private void btnGestionEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEstacionActionPerformed
        switchCard(1,3);
        switchCard(2,1);
    }//GEN-LAST:event_btnGestionEstacionActionPerformed

    private void btnGestionFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionFlotaActionPerformed
        switchCard(1,4);
        switchCard(2,1);
    }//GEN-LAST:event_btnGestionFlotaActionPerformed

    private void btnGestionRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionRutasActionPerformed
        switchCard(1,5);
        switchCard(2,1);
    }//GEN-LAST:event_btnGestionRutasActionPerformed

    private void btnCalcularRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRutasActionPerformed
        switchCard(1,6);
        switchCard(2,1);
    }//GEN-LAST:event_btnCalcularRutasActionPerformed

    private void btnValidarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarAccesoActionPerformed
        switchCard(1,7);
        switchCard(2,1);
    }//GEN-LAST:event_btnValidarAccesoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO: Agregar guardado de datos.
        System.exit(0);// Que esto vaya en el controlador.
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        switchCard(2,2);
        ctrl.mostrarListaDeEstaciones();
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed

    private void btnVerAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlertasActionPerformed
        switchCard(2,3);
        ctrl.mostrarListaDeAlertas();
    }//GEN-LAST:event_btnVerAlertasActionPerformed

    private void btnVerListaEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaEstacionesActionPerformed
        switchCard(2,4);
        ctrl.mostrarListaDeEstaciones();
    }//GEN-LAST:event_btnVerListaEstacionesActionPerformed

    private void btnVerParadasPorEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerParadasPorEstacionActionPerformed
        switchCard(2,5);
        ctrl.mostrarParadasPorEstacion();
    }//GEN-LAST:event_btnVerParadasPorEstacionActionPerformed

    private void btnVerEstadoDeEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoDeEstacionesActionPerformed
        switchCard(2,6);
        ctrl.mostrarEstadoDeEstaciones();
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
        ctrl.registrarCantidadDePersonas();
    }//GEN-LAST:event_btnRegistrarNumeroPersonasActionPerformed

    private void imgTM128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTM128MouseClicked
        System.out.println("Loading blank cards");
        switchCard(1,1);
        switchCard(2,1);
    }//GEN-LAST:event_imgTM128MouseClicked

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JList<String> lstListAlertas;
    private javax.swing.JList<String> lstListaDeEstadoDeLasEstaciones;
    private javax.swing.JList<String> lstListaDeParadasPorEstacion;
    private javax.swing.JList<String> lstListaEstaciones1;
    private javax.swing.JList<String> lstListaEstaciones2;
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
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlGestionEstacion1;
    private javax.swing.JPanel pnlGestionFlota1;
    private javax.swing.JPanel pnlGestionRutas1;
    private javax.swing.JPanel pnlMenuIzquierda;
    private javax.swing.JPanel pnlMonitoreo1;
    private javax.swing.JPanel pnlRegistrarNumPersonas;
    private javax.swing.JPanel pnlValidarAcceso1;
    private javax.swing.JPanel pnlVerAlertas;
    private javax.swing.JPanel pnlVerEstadoDeLasEstaciones;
    private javax.swing.JPanel pnlVerListaDeEstaciones;
    private javax.swing.JPanel pnlVerParadasPorEstacion;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtPuntoInicio;
    // End of variables declaration//GEN-END:variables
}
