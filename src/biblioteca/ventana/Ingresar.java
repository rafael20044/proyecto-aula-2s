package biblioteca.ventana;

import biblioteca.modelos.Persona;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ingresar extends javax.swing.JPanel {

    int cuposOcupados = 0,mesaPc=0,mesaGrupal=0,mesaIndividual=0, op1=0,op2=0,op3=0;
    ArrayList<Persona> personas = new ArrayList<>() ;
    DefaultListModel model = new DefaultListModel();
    
    public Ingresar() {
        initComponents();
        listaPersona.setModel(model);
    }
    public boolean cedulaExistente(String cedula) {
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula)) {
                return true;
            }
        }
            return false;
    }
    
        public void actualizarCuposOcupados() {
            txtCuposOcupados.setText("Cupos ocupados: " + cuposOcupados +"/20");
            
        }
    
    // Método para buscar y eliminar una persona por su cédula
        public void buscarYEliminarPersona(String cedula) {
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getCedula().equals(cedula)) {
                    personas.remove(i);
                    cuposOcupados--; // Disminuir el contador de cupos ocupados 
                    actualizarCuposOcupados(); // Actualizar el campo de texto de cupos ocupados
                    llenarLista();
                    if (op1==1) {
                        mesaPc--;
                        op1=0;
                    }else if(op2==1){
                        mesaGrupal--;
                        op2=0;
                    }else if(op3==1){
                        mesaIndividual--;
                        op3=0;
                    }
                    JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente la persona.");
                    
                    break;
                }
            }
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
        txtsemestre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcarrera = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPersona = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        txtCuposOcupados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Carrera:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Semestre:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        txtapellido.setText(" ");

        btRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        btLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("CC/TI:");

        listaPersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(listaPersona);

        txtCuposOcupados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCuposOcupados.setText("Cupos ocupados:           / 20");
        txtCuposOcupados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCuposOcupados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCuposOcupadosMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Eliminar cedula:");

        txtCedulaBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtCuposOcupados))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(778, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimpiar)
                        .addComponent(btRegistrar))
                    .addComponent(txtCuposOcupados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarCuposOcupados();
        String cedulaABuscar = txtCedulaBuscar.getText();
        buscarYEliminarPersona(cedulaABuscar);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        txtnombre.setText(null);//borrar campo nombre
        txtapellido.setText(null);// borrar campo apellido
        txtcarrera.setText(null);// borrar campo carrera
        txtsemestre.setText(null);//borrar campo semestre
        txttelefono.setText(null);//borrar campo telefono
        txtcorreo.setText(null);// borrar campo correo
        txtcedula.setText(null);// borrar campo cedula

    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed

        String nombreS = txtnombre.getText();
        String apellidoS = txtapellido.getText();
        String carreraS = txtcarrera.getText();
        String semestreS = txtsemestre.getText();
        String correoS = txtcorreo.getText();
        String telefonoS = txttelefono.getText();
        String cedulaS = txtcedula.getText();

        if (cuposOcupados >= 20) {
            JOptionPane.showMessageDialog(this, "Se han alcanzado los 20 cupos ocupados, no se pueden registrar más personas", "Error", JOptionPane.DEFAULT_OPTION);
        } else if (nombreS.isEmpty() || apellidoS.isEmpty() || carreraS.isEmpty() || semestreS.isEmpty() || correoS.isEmpty() || telefonoS.isEmpty() || cedulaS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Uno de los campos no tiene información","Error",JOptionPane.DEFAULT_OPTION);
        } else if(tieneNumeros(nombreS) || tieneNumeros(apellidoS) || tieneNumeros(carreraS)|| tieneLetras(semestreS) || tieneLetras(telefonoS) || tieneLetras(cedulaS)) {
            JOptionPane.showMessageDialog(this, "Uno de los campos esta mal llenado","Error",JOptionPane.DEFAULT_OPTION);
        } else if(!correoS.contains("@")){
            JOptionPane.showMessageDialog(this, "Necesitas ingresar la direecion @","Error",JOptionPane.DEFAULT_OPTION);
        } else if(cedulaExistente(cedulaS)) {
            JOptionPane.showMessageDialog(this, "La cédula ya ha sido registrada","Error",JOptionPane.DEFAULT_OPTION);
        } else {
            elegirPuesto();         
        }

    }//GEN-LAST:event_btRegistrarActionPerformed

    private void txtCuposOcupadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCuposOcupadosMouseClicked
        JDialog jd = new JDialog();
        JPanel j = new JPanel();
        JLabel labPc = new JLabel();
        JLabel labMg = new JLabel();
        JLabel labMi = new JLabel();
 
        labPc.setText("Mesa con pc: "+mesaPc+"/5");
        labMg.setText("Mesa grupal: "+mesaGrupal+"/10");
        labMi.setText("Mesa individual: "+mesaIndividual+"/5");
        j.setBackground(Color.WHITE);
        j.add(labPc);
        j.add(labMg);
        j.add(labMi);
        
        jd.setVisible(true);
        jd.setSize(200, 150);
        jd.add(j);       
        jd.setTitle("Puestos disponibles");
    }//GEN-LAST:event_txtCuposOcupadosMouseClicked
   
     private void llenarLista(){
        model.removeAllElements();
        for (int i = 0; i < personas.size(); i++) {
            model.addElement(personas.get(i).toString());
        }
    }  
        
     private boolean tieneNumeros(String str){
            char caracteres[] = str.toCharArray();
            for (int i = 0; i < caracteres.length; i++) {
            char c= caracteres[i];
            char cMin = Character.toLowerCase(c);
                if (Character.isDigit(cMin)) {
                    return true;
                } 
        }
            return false;
    }
    
     private boolean tieneLetras(String str){
            char caracteres[] = str.toCharArray();
            for (int i = 0; i < caracteres.length; i++) {
            char c= caracteres[i];
                if (!Character.isDigit(c)) {
                    return true;
                }          
        }
        return false;
    }
     
     
     private void elegirPuesto(){
          String nombreS= txtnombre.getText();
          String apellidoS= txtapellido.getText();
          String carreraS= txtcarrera.getText();
          String semestreS= txtsemestre.getText();
          String correoS= txtcorreo.getText();
          String telefonoS= txttelefono.getText();
          String cedulaS= txtcedula.getText();
         JDialog j = new JDialog();
         JPanel pane = new JPanel();
         JButton botMesaPc = new JButton();
         JButton botMesaGrupal = new JButton();
         JButton botMesaIndi = new JButton();
         desactivar();
     
         if (mesaPc<5) {
         ActionListener buPc = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
              mesaPc++;
              op1=1;
              activar();
              j.dispose();
            personas.add(new Persona(nombreS, apellidoS, carreraS, semestreS, correoS, telefonoS, cedulaS));            
            cuposOcupados++;       
            llenarLista();
            actualizarCuposOcupados();     
              
             }
         };               
         botMesaPc.addActionListener(buPc);   
         } else {
             JOptionPane.showMessageDialog(j, "Los cupos de pc están llenos");
         }
         pane.add(botMesaPc);    
         
         botMesaGrupal.setText("Mesa grupal");
         botMesaPc.setSize(150,50);         
         if (mesaGrupal<10) {
             ActionListener buGrupa = new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  mesaGrupal++;
                  op2=1;
                  activar();
             personas.add(new Persona(nombreS, apellidoS, carreraS, semestreS, correoS, telefonoS, cedulaS));            
            cuposOcupados++;            
            actualizarCuposOcupados();     
                  llenarLista();                
                  j.dispose();
                 }
             };
             botMesaGrupal.addActionListener(buGrupa);
         } else {
             JOptionPane.showMessageDialog(j, "Los cupos de mesas grupales están llenos");
         }
         pane.add(botMesaGrupal);
         
         botMesaIndi.setText("Mesa individual");
         botMesaPc.setSize(150,50);
         if (mesaIndividual<5) {
             ActionListener buIndi = new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     mesaIndividual++;
                     op3=1;
                     activar();
             personas.add(new Persona(nombreS, apellidoS, carreraS, semestreS, correoS, telefonoS, cedulaS));            
            cuposOcupados++;            
            actualizarCuposOcupados();          
                     llenarLista();
                     j.dispose();
                 }
             };
             botMesaIndi.addActionListener(buIndi);
         } else {
             JOptionPane.showMessageDialog(j, "Los cupos de mesas individuales están llenos");
         }
         pane.add(botMesaIndi);
         
         pane.setBackground(Color.WHITE);
         j.add(pane);
         j.setVisible(true);
         j.setSize(200, 200);  
         j.setTitle("Elegir el puesto");
         j.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);     
         botMesaPc.setText("Mesa con pc");
         botMesaPc.setSize(150,50); 
     }
     
     private void desactivar(){
             txtCedulaBuscar.setEnabled(false);
             txtCuposOcupados.setEnabled(false);
             txtapellido.setEnabled(false);
             txtcarrera.setEnabled(false);
             txtcedula.setEnabled(false);
             txtcorreo.setEnabled(false);
             txtnombre.setEnabled(false);
             txtsemestre.setEnabled(false);
             txttelefono.setEnabled(false);
             btRegistrar.setEnabled(false);
             btLimpiar.setEnabled(false);
            // txtCedulaBuscar.setEnabled(false);
     }
     
     private void activar(){
             txtCedulaBuscar.setEnabled(true);
             txtCuposOcupados.setEnabled(true);
             txtapellido.setEnabled(true);
             txtcarrera.setEnabled(true);
             txtcedula.setEnabled(true);
             txtcorreo.setEnabled(true);
             txtnombre.setEnabled(true);
             txtsemestre.setEnabled(true);
             txttelefono.setEnabled(true);
             btRegistrar.setEnabled(true);
             btLimpiar.setEnabled(true);
     }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPersona;
    private javax.swing.JTextField txtCedulaBuscar;
    private javax.swing.JLabel txtCuposOcupados;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsemestre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
