package tp5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Santiago Lara
 */
public class FormularioContacto extends javax.swing.JFrame {

    private DirectorioTelefonico directorio;
    DefaultListModel modelo = new DefaultListModel();
    private boolean nuevoDisponible = false; //Para desactivar los eventos de campos de texto así no borra los demás campos cuando se estén ingresando datos nuevos.

    public FormularioContacto(DirectorioTelefonico directorio) {
        this.directorio = directorio;
        initComponents();
        btn_guardar.setEnabled(false);
        btn_borrar.setEnabled(false);
        deshabilitarCamposNoBusqueda();
        lista_resultados.setModel(modelo);
        lista_resultados.setVisible(false);
        btn_descartar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_ciudad = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_buscarTelefono = new javax.swing.JButton();
        btn_buscarContact = new javax.swing.JButton();
        lbl_lista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_resultados = new javax.swing.JList<>();
        btn_descartar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Ciudad:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Formulario de Contacto");

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyReleased(evt);
            }
        });

        txt_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ciudadKeyReleased(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono:");

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyReleased(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_buscarTelefono.setText("Buscar teléfonos");
        btn_buscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarTelefonoActionPerformed(evt);
            }
        });

        btn_buscarContact.setText("Buscar contactos");
        btn_buscarContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarContactActionPerformed(evt);
            }
        });

        lbl_lista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setViewportView(lista_resultados);

        btn_descartar.setText("Descartar");
        btn_descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descartarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(txt_dni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_buscarContact, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(btn_buscarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(14, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_salir)
                                            .addComponent(btn_buscar))
                                        .addGap(36, 36, 36))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_nuevo)
                                .addGap(29, 29, 29)
                                .addComponent(btn_descartar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_borrar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_descartar)
                    .addComponent(btn_guardar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_salir))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_descartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descartarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "Deseas descartar los datos ingresados? No se guardará el contacto");
        if (respuesta == 0) {
            btn_guardar.setEnabled(false);
            btn_borrar.setEnabled(false);
            habilitarBotonesBusqueda();
            deshabilitarCamposNoBusqueda();
            lista_resultados.setVisible(false);
            btn_nuevo.setEnabled(true);
            btn_descartar.setEnabled(false);
            vaciarTodosLosCampos();
            nuevoDisponible = false;
        }
    }//GEN-LAST:event_btn_descartarActionPerformed

    private void btn_buscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarTelefonoActionPerformed
        String apellido = txt_apellido.getText();
        if (!apellido.equals("")) {
            Set<Long> listaTelefonos = directorio.buscarTelefono(apellido);
            modelo.clear();
            if (!listaTelefonos.isEmpty()) {
                lista_resultados.setVisible(true);
                for (Long telefono : listaTelefonos) {
                    modelo.addElement(telefono);
                }
                lbl_lista.setText("Números de teléfonos asociados al apellido " + apellido.toUpperCase() + ":");
            } else {
                lbl_lista.setText("No se encontraron números asociados a " + apellido.toUpperCase());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un apellido.");
        }
    }//GEN-LAST:event_btn_buscarTelefonoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (camposCorrectos()) { //VERIFICA CAMPOS CORRECTOS
            int dni = Integer.parseInt(txt_dni.getText());
            String nombre = txt_nombre.getText();
            String apellido = txt_apellido.getText();
            String ciudad = txt_ciudad.getText();
            String direccion = txt_direccion.getText();
            Long telefono = Long.parseLong(txt_telefono.getText());
            Cliente cliente = new Cliente(dni, nombre, apellido, ciudad, direccion);
            if (directorio.getListaDeContactos().containsKey(telefono)) { //VERIFICA SI UN NÚMERO YA ESTÁ ASOCIADO A UN CLIENTE
                int resp = JOptionPane.showConfirmDialog(rootPane, "El teléfono ya tiene un cliente asociado. ¿Desea reemplazarlo?"); //DECIDE SI REEMPLAZAR EL CLIENTE
                if (resp == 0) {
                    directorio.agregarContacto(telefono, cliente);
                    nuevoDisponible = false;
                    JOptionPane.showMessageDialog(rootPane, "Se agregó al directorio el contacto " + nombre + " " + apellido);
                    vaciarTodosLosCampos();
                    btn_descartar.setEnabled(false);
                    btn_nuevo.setEnabled(true);
                    habilitarBotonesBusqueda();
                    deshabilitarCamposNoBusqueda();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se realizaron cambios");
                }
            } else {
                directorio.agregarContacto(telefono, cliente);
                nuevoDisponible = false;
                JOptionPane.showMessageDialog(rootPane, "Se agregó al directorio el contacto " + nombre + " " + apellido);
                vaciarTodosLosCampos();
                btn_descartar.setEnabled(false);
                btn_nuevo.setEnabled(true);
                habilitarBotonesBusqueda();
                deshabilitarCamposNoBusqueda();
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        btn_guardar.setEnabled(true);
        btn_borrar.setEnabled(false);
        txt_dni.setEnabled(true);
        txt_nombre.setEnabled(true);
        txt_direccion.setEnabled(true);
        btn_buscarContact.setEnabled(false);
        btn_buscarTelefono.setEnabled(false);
        btn_buscar.setEnabled(false);
        btn_descartar.setEnabled(true);
        limpiarOcultarLista();
        btn_nuevo.setEnabled(false);
        vaciarTodosLosCampos();
        nuevoDisponible = true;
    }//GEN-LAST:event_btn_nuevoActionPerformed

    //Los eventos KeyReleased son para borrar los demás campos al modificar estos y así efectuar la búsqueda
    private void txt_telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyReleased
        if (!nuevoDisponible) {
            vaciarCamposNoBusqueda();
            txt_apellido.setText("");
            txt_ciudad.setText("");
            limpiarOcultarLista();
        }
    }//GEN-LAST:event_txt_telefonoKeyReleased

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            Long telefono = Long.parseLong(txt_telefono.getText());
            if (txt_telefono.getText().length() == 10) {
                Cliente cliente = directorio.getListaDeContactos().get(telefono);
                //                System.out.println(directorio.getListaDeContactos()); //Para controlar por consola la lista obtenida
                //                System.out.println(telefono); // Para controlar por consola el número ingresado
                //                System.out.println(cliente);  //Para controlar por consola el cliente obtenido
                txt_dni.setText(String.valueOf(cliente.dni));
                txt_nombre.setText(cliente.getNombre());
                txt_apellido.setText(cliente.getApellido());
                txt_ciudad.setText(cliente.getCiudad());
                txt_direccion.setText(cliente.getDireccion());
                btn_guardar.setEnabled(false);
                btn_borrar.setEnabled(true);
                deshabilitarCamposNoBusqueda();
                lista_resultados.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un número de 10 dígitos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar sólo números");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "No existe un contacto registrado con el número indicado");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_ciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyReleased
        if (!nuevoDisponible) {
            vaciarCamposNoBusqueda();
            txt_apellido.setText("");
            txt_telefono.setText("");
            limpiarOcultarLista();
        }
    }//GEN-LAST:event_txt_ciudadKeyReleased

    private void txt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyReleased
        if (!nuevoDisponible) {
            vaciarCamposNoBusqueda();
            txt_ciudad.setText("");
            txt_telefono.setText("");
            limpiarOcultarLista();
        }
    }//GEN-LAST:event_txt_apellidoKeyReleased

    private void btn_buscarContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarContactActionPerformed
        String ciudad = txt_ciudad.getText();
        if (!ciudad.equals("")) {
            ArrayList<Cliente> listaClientes = directorio.buscarContactos(ciudad);
            modelo.clear();
            if (!listaClientes.isEmpty()) {
                lista_resultados.setVisible(true);
                for (Cliente cliente : listaClientes) {
                    modelo.addElement(cliente);
                }
                lbl_lista.setText("Clientes de la ciudad de " + ciudad + ":");
            } else {
                lbl_lista.setText("No se encontraron clientes de " + ciudad);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una ciudad.");
        }
    }//GEN-LAST:event_btn_buscarContactActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea borrar al contacto " + txt_apellido.getText().toUpperCase() + " " + txt_nombre.getText().toUpperCase() + "?");
        if (respuesta == 0) {
            Long numero = Long.parseLong(txt_telefono.getText());
            directorio.borrarContacto(numero);
            JOptionPane.showMessageDialog(rootPane, "Se borró al contacto correctamente");
            vaciarTodosLosCampos();
            btn_borrar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    public boolean camposCorrectos() {
        boolean dni = true;
        boolean telefono = true;
        boolean hayCamposVacios = false;
        try {
            if (txt_dni.getText().length() != 8) {
                dni = false;
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un DNI de 8 dígitos");
            } else {
                int num = Integer.parseInt(txt_dni.getText());//Para generar una excepción si se ingresan letras
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar sólo números para el DNI");
        }
        try {
            if (txt_telefono.getText().length() != 10) {
                telefono = false;
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un teléfono de 10 dígitos");
            } else {
                Long n = Long.parseLong(txt_telefono.getText());//Para generar una excepción si se ingresan letras
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar sólo números para el teléfono");
        }
        if (!txt_nombre.getText().equals("") && !txt_apellido.getText().equals("") && !txt_ciudad.getText().equals("") && !txt_direccion.getText().equals("")) {
            hayCamposVacios = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe completar todos los campos");
        }
        return hayCamposVacios && dni && telefono;
    }

    public void vaciarTodosLosCampos() {
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_ciudad.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
    }

    public void habilitarBotonesBusqueda() {
        btn_buscarContact.setEnabled(true);
        btn_buscarTelefono.setEnabled(true);
        btn_buscar.setEnabled(true);
    }

    public void deshabilitarCamposNoBusqueda() {
        txt_dni.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_direccion.setEnabled(false);
    }

    public void vaciarCamposNoBusqueda() {
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
    }

    public void limpiarOcultarLista() {
        modelo.clear();
        lista_resultados.setVisible(false);
        lbl_lista.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarContact;
    private javax.swing.JButton btn_buscarTelefono;
    private javax.swing.JButton btn_descartar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_lista;
    private javax.swing.JList<String> lista_resultados;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
