package biblioteca.ventana;

import biblioteca.modelos.Libro;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Libros extends javax.swing.JPanel {
    ArrayList<Libro> libro = new ArrayList<>();
    DefaultListModel modelo = new DefaultListModel();
    public Libros() {
        initComponents();
        lista.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        buttAgregar = new javax.swing.JButton();
        butBuscar = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        butCategoria = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 51, 255));

        panelCa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lecturas que puedes encontrar en nuestra biblioteca");

        jLabel3.setText("Titulo");

        jLabel4.setText("Autor");

        jLabel7.setText("codigo");

        buttAgregar.setText("Agregar libro");
        buttAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAgregarActionPerformed(evt);
            }
        });

        butBuscar.setText("Buscar libro");
        butBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista);

        jLabel1.setText("Codigo ");

        butCategoria.setText("Categorias");
        butCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaLayout = new javax.swing.GroupLayout(panelCa);
        panelCa.setLayout(panelCaLayout);
        panelCaLayout.setHorizontalGroup(
            panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaLayout.createSequentialGroup()
                .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(buttAgregar))
                            .addGroup(panelCaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCaLayout.createSequentialGroup()
                                .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25)
                                .addComponent(txtNombre)))
                        .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(butBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(butCategoria)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCaLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(352, 352, 352))
        );
        panelCaLayout.setVerticalGroup(
            panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCaLayout.createSequentialGroup()
                        .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttAgregar)
                    .addComponent(butBuscar)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCategoria))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAgregarActionPerformed
        String nombre = txtNombre.getText();
        String autor = txtAutor.getText();
        String codigo= txtCodigo.getText();
        if (nombre.isEmpty() || autor.isEmpty() || codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos estan vacios");
        } else {
            libro.add(new Libro(nombre, autor, codigo));
            llenarLista();         
        }
    }//GEN-LAST:event_buttAgregarActionPerformed

    private void butBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarActionPerformed
       String codigo = txtCodigo.getText();
        if (buscar(codigo)) {
            JOptionPane.showMessageDialog(this, "Este libro existe en la lista y tenemos disponibles ");                
        } else {
            JOptionPane.showMessageDialog(this, "Este libro no existe");
        }
    }//GEN-LAST:event_butBuscarActionPerformed

    private void butCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCategoriaActionPerformed
        Categorias c = new Categorias();
        c.setSize(776, 377);
        panelCa.removeAll();
        panelCa.add(c);
        panelCa.revalidate();
        panelCa.repaint();
    }//GEN-LAST:event_butCategoriaActionPerformed
    
    private boolean buscar(String codigo){
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigo().equals(codigo)) {
                return true;
            }         
        }
        return false;
    }
    private void llenarLista(){
        modelo.removeAllElements();
        for (int i = 0; i < libro.size(); i++) {
            modelo.addElement(libro.get(i).toString());
        }
    } 

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBuscar;
    private javax.swing.JButton butCategoria;
    private javax.swing.JButton buttAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel panelCa;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
