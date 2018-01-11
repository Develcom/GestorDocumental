package com.develcom.login;

import com.develcom.cliente.sesion.IniciaSesion;
import com.develcom.enlaces.Usuario;
import com.develcom.herramientas.Autocompletar;
import com.develcom.enlaces.DW4JSesion;
import com.develcom.enlaces.Sesion;
import com.develcom.herramientas.CentraVentanas;
import com.develcom.herramientas.ToolsFiles;
import com.develcom.herramientas.gui.PanelImagen;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.*;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Permite iniciar sesion en la aplicacion gestor documental
 *
 * @author develcom
 */
//@Component
public class Login extends javax.swing.JDialog {

    private static final Logger LOG = LoggerFactory.getLogger(Autocompletar.class);

    private static final long serialVersionUID = 8069007928587758439L;
//public class Login extends javax.swing.JFrame {
    /**
     * Escribe trazas en el log
     */
    private List<Usuario> autocompletarusuarios;
    private Autocompletar autocompletar = new Autocompletar();

    /**
     * Constructor, inicia los componentes
     */
    public Login() {

        List<Usuario> lstUsuarios;
        try {
            setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

            IniciaSesion sesion = new IniciaSesion();

            lstUsuarios = sesion.autocomplete();
            autocompletarusuarios = new ArrayList<>();

            for (Usuario usuario : lstUsuarios) {
                LOG.trace("usuario " + usuario.getIdUsuario() + " su estatus " + usuario.getEstatus());
                if (usuario.getEstatus().getIdEstatus() == 1) {
                    autocompletarusuarios.add(usuario);
                }
            }

            initComponents();
            setAlwaysOnTop(true);
            //setModal(true);
            //setModalityType(DEFAULT_MODALITY_TYPE);
            this.setResizable(false);
            //CentraVentanas.centerMaxFrame(this);
            CentraVentanas.centerDialog(this);

//        } catch (ClientTransportException e){
//            traza.trace("Error al iniciar la aplicacion", e);
//            JOptionPane.showMessageDialog(new JFrame(), "Problemas al iniciar el DW4J (ClientTransportException)\n" + e.getMessage() + "\nComuniquese con el administrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
//            System.exit(1);            
        } catch (SecurityException e) {
            LOG.trace("Error al iniciar la aplicacion", e);
            JOptionPane.showMessageDialog(new JFrame(), "Problemas al iniciar el DW4J (SecurityException)\n" + e.getMessage() + "\nComuniquese con el administrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (SOAPFaultException e) {
            LOG.trace("Error al iniciar la aplicacion", e);
            JOptionPane.showMessageDialog(new JFrame(), "Problemas al iniciar el DW4J (SOAPFaultException)\n" + e.getMessage() + "\nComuniquese con el administrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (WebServiceException e) {
            LOG.trace("Error al iniciar la aplicacion", e);
            JOptionPane.showMessageDialog(new JFrame(), "Problemas al iniciar el DW4J (WebServiceException)\n" + e.getMessage() + "\nComuniquese con el administrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (Exception e) {
            LOG.trace("Error general al iniciar la aplicacion", e);
            JOptionPane.showMessageDialog(new JFrame(), "Problemas al iniciar el DW4J\n" + e.getMessage() + "\nComuniquese con el administrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

    }

    public void mostrar() {
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        panelLogo = new com.develcom.herramientas.gui.PanelImagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gestión Documental");
        setBackground(new java.awt.Color(224, 239, 255));
        setIconImage(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jbSalir.setMnemonic('s');
        jbSalir.setText("Salir");
        jbSalir.setToolTipText("Salir de DW4J");
        jbSalir.setPreferredSize(new java.awt.Dimension(120, 40));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbAceptar.setMnemonic('e');
        jbAceptar.setText("Entrar");
        jbAceptar.setToolTipText("Autenticar con el Servidor");
        jbAceptar.setMaximumSize(new java.awt.Dimension(120, 40));
        jbAceptar.setPreferredSize(new java.awt.Dimension(120, 40));
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        jbAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAceptarKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestión Documental");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("USUARIO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CONTRASEÑA");

        txtUsuario.setPreferredSize(new java.awt.Dimension(150, 20));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        txtClave.setPreferredSize(new java.awt.Dimension(150, 20));
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtClave, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .add(txtUsuario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtClave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtUsuario.getAccessibleContext().setAccessibleName("lblUsuario");

        org.jdesktop.layout.GroupLayout panelLogoLayout = new org.jdesktop.layout.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 326, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jbAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jbSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(646, 189));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Aceptar valida usuario y contraseña
     *
     * @param evt
     *
     *
     */
    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

        loggin(txtUsuario.getText(), String.valueOf(txtClave.getPassword()));

    }//GEN-LAST:event_jbAceptarActionPerformed

    /**
     * Inicia sesion del usuario
     *
     * @param user Usuario
     * @param password Contraseña
     */
    public void loggin(String user, String password) {

        Sesion sesion;
        List<Sesion> sesiones;
        Properties prop = new Properties();
        String pass;
        char[] pas;
        Usuario usuario = new Usuario();

        try {

            pas = txtClave.getPassword();
            pass = String.valueOf(pas);

            if (!pass.equalsIgnoreCase("") && !txtUsuario.getText().equalsIgnoreCase("")) {

                LOG.trace("ingresando el usuario " + txtUsuario.getText());
                LOG.trace("validando el usuario");
                usuario.setIdUsuario(user);
                usuario.setPassword(password);
                sesion = new IniciaSesion().iniciarSesion(usuario);

                if (!sesion.getVerificar().equalsIgnoreCase("ldap")) {
                    if (!sesion.getVerificar().equalsIgnoreCase("basedato")) {
                        if (!sesion.getVerificar().equalsIgnoreCase("inactivo")) {

                            if (sesion.getVerificar().equalsIgnoreCase("exito")) {

                                DW4JSesion.setConfiguracion(sesion.getConfiguracion());
//                                LOG.trace("Calidad activo " + DW4JSesion.getConfiguracion().isCalidadActivo());
//                                LOG.trace("foliatura activo " + DW4JSesion.getConfiguracion().isFoliaturaActivo());

                                LOG.trace("creando la sesion del usuario");
                                sesiones = new IniciaSesion().armarSesion(usuario);
                                DW4JSesion.setSesion(sesiones);
                                LOG.trace("sesion " + sesiones);

                                ToolsFiles toolsFile = new ToolsFiles();
                                if (toolsFile.getDirTemporal().exists()) {
                                    File[] files = toolsFile.getDirTemporal().listFiles();
                                    for (File f : files) {
                                        if (f.delete()) {
                                            LOG.trace("eliminado archivo " + f.getName());
                                        } else {
                                            LOG.trace("problemas al eliminar el archivo " + f.getName());
                                        }
                                    }
                                }

                                if ((sesiones != null) && (sesiones.size() >= 1)) {
                                    DW4JSesion.setLogin(sesiones.get(0).getUsuario().getIdUsuario());
                                    LOG.trace("id de la sesion " + sesiones.get(0).getIdSession());
                                    LOG.trace("fecha y hora de inicio de la sesion " + sesiones.get(0).getFechaHora());

//                                    if (sesiones.get(0).getUsuario().getEstatus().getEstatus().equalsIgnoreCase(Constantes.ACTIVO)) {
//
//                                        this.dispose();
//                                        Principal principal = new Principal();
//
//                                        if (!sesion.getConfiguracion().isFicha()) {
//                                            principal.getMnFotoFicha().setVisible(false);
//                                        }
//
//                                        for (Sesion session : sesiones) {
//
//                                            if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.CONFIGURADOR)) {
//
//                                                principal.getMnAdministrar().setVisible(true);
//                                                principal.getMnLibreria().setVisible(true);
//                                                principal.getMnCategoria().setVisible(true);
//                                                principal.getMnSubCategoria().setVisible(true);
//                                                principal.getMnTiposDocumentos().setVisible(true);
//                                                principal.getMnIndices().setVisible(true);
//                                                principal.getMnListaDesplegable().setVisible(true);
//
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.DIGITALIZADOR)) {
//
//                                                principal.getMnExpediente().setVisible(true);
//                                                principal.getMnDigitalizar().setVisible(true);
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.CONSULTAR_CATEGORIA)) {
//
//                                                principal.getMnExpediente().setVisible(true);
//                                                principal.getMnConsultar().setVisible(true);
//                                                principal.getMnBuscar().setVisible(true);
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.CONSULTAR_EXPEDIENTE)) {
//
//                                                principal.getMnExpediente().setVisible(true);
//                                                principal.getMnConsultar().setVisible(true);
//                                                principal.getMnConsultarTodos().setVisible(true);
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.APROBADOR)) {
//
//                                                principal.getMnExpediente().setVisible(true);
//
//                                                if (sesion.getConfiguracion().isCalidad()) {
//                                                    principal.getMnCalidad().setVisible(true);
//                                                } else {
//                                                    principal.getMnCalidad().setVisible(false);
//                                                }
//
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.ADMINISTRADOR)) {
//
//                                                principal.getMnAdministrar().setVisible(true);
//                                                principal.getMnLibreria().setVisible(true);
//                                                principal.getMnCategoria().setVisible(true);
//                                                principal.getMnSubCategoria().setVisible(true);
//                                                principal.getMnTiposDocumentos().setVisible(true);
//                                                principal.getMnIndices().setVisible(true);
//                                                principal.getMnListaDesplegable().setVisible(true);
//
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                                principal.getMnUpdateIndices().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.IMPRIMIR)) {
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.REPORTES)) {
//
//                                                principal.getMnReportes().setVisible(true);
//
//                                                if (DW4JSesion.getConfiguracion().isCalidad()) {
//                                                    principal.menuesCalidad();
//                                                }
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.MANTENIMIENTO)) {
//
//                                                principal.getMnMantenimiento().setVisible(true);
//                                                principal.getMnBaseDatos().setVisible(true);
//
//                                            } else if (session.getUsuario().getRol().getRol().equalsIgnoreCase(Constantes.ELIMINAR)) {
//
//                                                principal.getMnElimnaDoc().setVisible(true);
//                                                principal.getMnLibreria().setVisible(true);
//                                                principal.getMnCategoria().setVisible(true);
//                                                principal.getMnSubCategoria().setVisible(true);
//                                                principal.getMnTiposDocumentos().setVisible(true);
//                                                principal.getMnIndices().setVisible(true);
//                                                principal.getMnListaDesplegable().setVisible(true);
//
//                                                principal.getMnSesion().setVisible(true);
//                                                principal.getMnSalir().setVisible(true);
//                                                principal.getMnCambioUser().setVisible(true);
//
//                                            }
//                                        }
//                                    } else {
//                                        JOptionPane.showMessageDialog(this, "Usuario Inactivo", "Alerta", JOptionPane.WARNING_MESSAGE);
//                                        limpiar();
//                                        LOG.warn("Usuario Inactivo");
//                                        //Runtime.getRuntime().gc();
//                                        System.gc();
//                                        System.exit(1);
//                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Problemas para crear la sesion \ncomuniquese con el administrador del sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                    limpiar();
                                    LOG.warn("Problemas para crear la sesion \ncomuniquese con el administrador del sistema (arreglo sesion vacio) ");
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, sesion.getVerificar() + "\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                                limpiar();
                                LOG.warn(sesion.getVerificar() + "\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta());
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Usuario esta inactivo para el Sistema Gestion Documental\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                            limpiar();
                            LOG.warn("Usuario esta inactivo para el Sistema Gestion Documental\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta());
                        }

                    } else {
                        if (txtUsuario.getText().equalsIgnoreCase("dw4jconf")) {
                            JOptionPane.showMessageDialog(this, "Problemas con el usuario de configuración\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Usuario no registrado en el Sistema Gestion Documental\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                        limpiar();
                        LOG.warn("Usuario no registrado en el Sistema Gestion Documental\ncomuniquese con el administrador del sistema\n" + sesion.getRespuesta());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, sesion.getRespuesta() + "\nComuniquese con el administrador del sistema\n", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    limpiar();
                    LOG.warn(sesion.getRespuesta() + "\ncomuniquese con el administrador del sistema");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe INGRESAR USUARIO y CONTRASEÑA", "Información", JOptionPane.WARNING_MESSAGE);
                limpiar();
                LOG.warn("Debe INGRESAR USUARIO y CONTRASEÑA");
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error en el inicio de sesion\ncomuniquese con el administrador del sistema\n" + ex.getMessage(), "ERROR...!!!", JOptionPane.ERROR_MESSAGE);
            LOG.trace("Error en el inicio de sesion comuniquese con el administrador del sistema", ex);
        }
    }

    /**
     * Termina la aplicacion
     *
     * @param evt
     */
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    /**
     * Termina la aplicacion
     *
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Llama al metodo loggin cuando de presiona enter
     *
     * @param evt
     */
    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loggin(txtUsuario.getText(), String.valueOf(txtClave.getPassword()));
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    /**
     * Llama al metodo loggin cuando de presiona enter
     *
     * @param evt
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loggin(txtUsuario.getText(), String.valueOf(txtClave.getPassword()));
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * Llama al metodo loggin cuando de presiona enter
     *
     * @param evt
     */
    private void jbAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAceptarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loggin(txtUsuario.getText(), String.valueOf(txtClave.getPassword()));
        }
    }//GEN-LAST:event_jbAceptarKeyPressed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased

        if (!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90
                || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105
                || evt.getKeyCode() == KeyEvent.VK_ENTER)) {
            return;
        }

        if (txtUsuario.getText().isEmpty()) {
            return;
        }

        if (autocompletarusuarios.isEmpty()) {
            return;
        }

        autocompletar.addTexto(txtUsuario, autocompletar.getTextoListaUsuario(txtUsuario.getText(), autocompletarusuarios));

    }//GEN-LAST:event_txtUsuarioKeyReleased
    /**
     * void main de la aplicacion al final este deberia ser el unico void main
     * te todas la clases
     *
     * @param args the command line arguments
     */
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbSalir;
    private com.develcom.herramientas.gui.PanelImagen panelLogo;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Limpia las caja de texto
     */
    private void limpiar() {
        txtUsuario.setText("");
        txtClave.setText("");
        if (txtUsuario.getText().equals("")) {
            txtUsuario.requestFocus();
        } else {
            txtClave.requestFocus();
        }
    }

    public PanelImagen getPanelLogo() {
        return panelLogo;
    }
}
