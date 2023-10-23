package biblioteca.ventana;


public class Libros extends javax.swing.JPanel {

    public Libros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCam = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calculoButton = new javax.swing.JButton();
        cienciasButton = new javax.swing.JButton();
        revistaButton = new javax.swing.JButton();
        politicaButton = new javax.swing.JButton();
        historiasButton = new javax.swing.JButton();
        ingenieriaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 51, 255));

        panelCam.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lecturas que puedes encontrar en nuestra biblioteca");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagenes/periodico.png"))); // NOI18N

        calculoButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        calculoButton.setText("CALCULO");
        calculoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        calculoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoButtonActionPerformed(evt);
            }
        });

        cienciasButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cienciasButton.setText("CIENCIAS");
        cienciasButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        cienciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cienciasButtonActionPerformed(evt);
            }
        });

        revistaButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        revistaButton.setText("REVISTAS");
        revistaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        revistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revistaButtonActionPerformed(evt);
            }
        });

        politicaButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        politicaButton.setText("POLITICA");
        politicaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        politicaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicaButtonActionPerformed(evt);
            }
        });

        historiasButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        historiasButton.setText("HISTORIAS");
        historiasButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        historiasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiasButtonActionPerformed(evt);
            }
        });

        ingenieriaButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ingenieriaButton.setText("INGENIERIA");
        ingenieriaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        ingenieriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingenieriaButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/imagenes/libros-de-texto.png"))); // NOI18N

        javax.swing.GroupLayout panelCamLayout = new javax.swing.GroupLayout(panelCam);
        panelCam.setLayout(panelCamLayout);
        panelCamLayout.setHorizontalGroup(
            panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamLayout.createSequentialGroup()
                .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2))
                    .addGroup(panelCamLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(103, 103, 103)
                        .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(politicaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cienciasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historiasButton))
                        .addGap(34, 34, 34)
                        .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingenieriaButton)
                            .addComponent(revistaButton)))
                    .addGroup(panelCamLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        panelCamLayout.setVerticalGroup(
            panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCamLayout.createSequentialGroup()
                        .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calculoButton)
                            .addComponent(cienciasButton)
                            .addComponent(revistaButton))
                        .addGap(42, 42, 42)
                        .addGroup(panelCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(politicaButton)
                            .addComponent(historiasButton)
                            .addComponent(ingenieriaButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cienciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cienciasButtonActionPerformed
        Ciencia ciencias = new Ciencia();
        ciencias.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(ciencias);        
        panelCam.revalidate();
        panelCam.repaint();
    }//GEN-LAST:event_cienciasButtonActionPerformed

    private void calculoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoButtonActionPerformed
        Calculo c = new Calculo();
        c.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(c);
        panelCam.repaint();
        panelCam.revalidate();
    }//GEN-LAST:event_calculoButtonActionPerformed

    private void revistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revistaButtonActionPerformed
        Revista r = new Revista();
        r.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(r);
        panelCam.repaint();
        panelCam.revalidate();     
    }//GEN-LAST:event_revistaButtonActionPerformed

    private void politicaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicaButtonActionPerformed
        Politica p = new Politica();
        p.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(p);
        panelCam.repaint();
        panelCam.revalidate();         
    }//GEN-LAST:event_politicaButtonActionPerformed

    private void historiasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiasButtonActionPerformed
        Historia h = new Historia();
        h.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(h);
        panelCam.repaint();
        panelCam.revalidate();  
    }//GEN-LAST:event_historiasButtonActionPerformed

    private void ingenieriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingenieriaButtonActionPerformed
        Ingenieria i = new Ingenieria();
        i.setSize(776, 377);
        panelCam.removeAll();
        panelCam.add(i);
        panelCam.repaint();
        panelCam.revalidate();  
    }//GEN-LAST:event_ingenieriaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculoButton;
    private javax.swing.JButton cienciasButton;
    private javax.swing.JButton historiasButton;
    private javax.swing.JButton ingenieriaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelCam;
    private javax.swing.JButton politicaButton;
    private javax.swing.JButton revistaButton;
    // End of variables declaration//GEN-END:variables
}
