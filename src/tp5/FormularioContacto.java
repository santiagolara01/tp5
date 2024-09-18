package tp5;

import java.util.TreeMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Santiago Lara
 */
public class FormularioContacto extends javax.swing.JFrame {

    private DirectorioTelefonico directorio;
    DefaultListModel modelo = new DefaultListModel();

    public FormularioContacto(DirectorioTelefonico directorio) {
        this.directorio = directorio;
        initComponents();
        btn_guardar.setEnabled(false);
        btn_borrar.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_direccion.setEnabled(false);
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
        jSeparator1 = new javax.swing.JSeparator();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Ciudad:");

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

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_buscarTelefono.setText("Buscar teléfonos");

        btn_buscarContact.setText("Buscar contactos");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txt_dni)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_apellido)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_ciudad)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono)
                                    .addComponent(lbl_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_descartar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guardar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrar)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_buscarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_buscarContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_buscar)
                            .addComponent(btn_salir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarTelefono))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarContact)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_guardar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_salir)
                    .addComponent(btn_descartar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
                txt_dni.setEnabled(false);
                txt_nombre.setEnabled(false);
                txt_direccion.setEnabled(false);
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
        lista_resultados.setVisible(false);
        btn_nuevo.setEnabled(false);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_descartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descartarActionPerformed
        btn_guardar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_buscarContact.setEnabled(true);
        btn_buscarTelefono.setEnabled(true);
        btn_buscar.setEnabled(true);
        txt_dni.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_direccion.setEnabled(false);
        lista_resultados.setVisible(false);
    }//GEN-LAST:event_btn_descartarActionPerformed

    private void txt_telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyReleased
        txt_dni.setText(String.valueOf(""));
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_ciudad.setText("");
        txt_direccion.setText("");
    }//GEN-LAST:event_txt_telefonoKeyReleased

    private void txt_ciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyReleased
        txt_dni.setText(String.valueOf(""));
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
    }//GEN-LAST:event_txt_ciudadKeyReleased

    private void txt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyReleased
        txt_dni.setText(String.valueOf(""));
        txt_nombre.setText("");
        txt_ciudad.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
    }//GEN-LAST:event_txt_apellidoKeyReleased

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (verificarCampos()) {
            int dni = Integer.parseInt(txt_dni.getText());
            String nombre = txt_nombre.getText();
            String apellido = txt_apellido.getText();
            String ciudad = txt_ciudad.getText();
            String direccion = txt_direccion.getText();
            Long telefono = Long.parseLong(txt_telefono.getText());
            Cliente cliente = new Cliente(dni, nombre, apellido, ciudad, direccion);
            directorio.agregarContacto(telefono, cliente);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    public boolean verificarCampos() {
        boolean dni = true;
        boolean telefono = true;
        try {
            if (txt_dni.getText().length() != 8) {
                dni = false;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un DNI de 8 dígitos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar sólo números para el DNI");
        }
        try {
            if (txt_telefono.getText().length() != 10) {
                telefono = false;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un teléfono de 10 dígitos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar sólo números para el teléfono");
        }

        return txt_nombre.getText().equals("") && txt_apellido.getText().equals("") && txt_ciudad.getText().equals("") && txt_direccion.getText().equals("") && dni && telefono;
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
    private javax.swing.JSeparator jSeparator1;
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
