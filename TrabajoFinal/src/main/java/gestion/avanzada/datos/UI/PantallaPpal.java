/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.avanzada.datos.UI;

import gestion.avanzada.datos.DAOs.SenialDAO;
import gestion.avanzada.datos.Dominio.Senial;
import gestion.avanzada.datos.TrabajoFinal.Imagen;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Milton
 */
public class PantallaPpal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPpal
     */
    
    private ArrayList<String> selectedFilesPaths = new ArrayList<>();
    
    public PantallaPpal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSScaleLabel1 = new rsscalelabel.RSScaleLabel();
        jMenu1 = new javax.swing.JMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buscarImagenBtn = new javax.swing.JButton();
        textBoxFile = new javax.swing.JTextField();
        buscarSenialBtn = new javax.swing.JButton();
        imagenLbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imageBoxResult_2 = new javax.swing.JLabel();
        imageBoxResult_3 = new javax.swing.JLabel();
        imageBoxResult_1 = new javax.swing.JLabel();
        imageBoxResult_5 = new javax.swing.JLabel();
        imageBoxResult_4 = new javax.swing.JLabel();
        resultado_label_1 = new javax.swing.JLabel();
        resultado_label_2 = new javax.swing.JLabel();
        resultado_label_3 = new javax.swing.JLabel();
        resultado_label_4 = new javax.swing.JLabel();
        resultado_label_5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        buscarImagenBtn1 = new javax.swing.JButton();
        textBoxFile1 = new javax.swing.JTextField();
        cargarSenialesBtn = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        statusProgressBarLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(700, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        buscarImagenBtn.setText("Buscar");
        buscarImagenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarImagenBtnActionPerformed(evt);
            }
        });

        textBoxFile.setEditable(false);
        textBoxFile.setText("Seleccione una imagen");
        textBoxFile.setName("fileInput"); // NOI18N
        textBoxFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxFileActionPerformed(evt);
            }
        });

        buscarSenialBtn.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        buscarSenialBtn.setText("Buscar Señal");
        buscarSenialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buscarSenialBtnActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        imagenLbl.setBackground(new java.awt.Color(255, 255, 255));
        imagenLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagenLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(textBoxFile, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarImagenBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarSenialBtn)
                        .addGap(139, 139, 139)))
                .addComponent(imagenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarImagenBtn)
                            .addComponent(textBoxFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(buscarSenialBtn)))
                .addContainerGap())
        );

        textBoxFile.getAccessibleContext().setAccessibleName("fileInput");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Rsultados"));

        imageBoxResult_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageBoxResult_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageBoxResult_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageBoxResult_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageBoxResult_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        resultado_label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado_label_1.setText("<html><center>Señal 1<center><html>");

        resultado_label_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado_label_2.setText("<html><center>Señal 2<center><html>");

        resultado_label_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado_label_3.setText("<html><center>Señal 3<center><html>");

        resultado_label_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado_label_4.setText("<html><center>Señal 4<center><html>");

        resultado_label_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado_label_5.setText("<html><center>Señal 5<center><html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(imageBoxResult_1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageBoxResult_2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageBoxResult_3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageBoxResult_4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageBoxResult_5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(resultado_label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultado_label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultado_label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultado_label_4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultado_label_5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageBoxResult_1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageBoxResult_2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageBoxResult_3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageBoxResult_4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageBoxResult_5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado_label_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(resultado_label_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado_label_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado_label_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultado_label_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consultar", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        buscarImagenBtn1.setText("Buscar");
        buscarImagenBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarImagenBtn1ActionPerformed(evt);
            }
        });

        textBoxFile1.setEditable(false);
        textBoxFile1.setText("Seleccione una o mas imagenes");
        textBoxFile1.setToolTipText("");
        textBoxFile1.setName("fileInput"); // NOI18N
        textBoxFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxFile1ActionPerformed(evt);
            }
        });

        cargarSenialesBtn.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        cargarSenialesBtn.setText("Cargar Señal");
        cargarSenialesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarSenialesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(textBoxFile1)
                .addGap(18, 18, 18)
                .addComponent(buscarImagenBtn1)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(cargarSenialesBtn)
                .addGap(273, 273, 273))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarImagenBtn1)
                    .addComponent(textBoxFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(cargarSenialesBtn)
                .addContainerGap())
        );

        progressBar.setName(""); // NOI18N

        statusProgressBarLabel.setText("Procesando...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(statusProgressBarLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(statusProgressBarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cargar", jPanel1);

        jLabel1.setText("Este es un programa de reconocimiento de señales de transito por similitud.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Gestion Avanzada de Datos 2019");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel2)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Acerca de", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarImagenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarImagenBtnActionPerformed
        this.textBoxFile.setText("");
        this.rSScaleLabel1.setScaleLabel(this.imagenLbl, null);
        JFileChooser exploradorArch = new JFileChooser("C:\\Users\\Milton\\Desktop\\Imagenes para pruebas");
         exploradorArch.showOpenDialog(this);
         if (exploradorArch.getSelectedFile().getAbsolutePath() != null){
        	 String selectedFilePath = exploradorArch.getSelectedFile().getAbsolutePath();
             this.textBoxFile.setText(selectedFilePath);
             this.rSScaleLabel1.setScaleLabel(this.imagenLbl, selectedFilePath);
         }
         
         
         
        
    }//GEN-LAST:event_buscarImagenBtnActionPerformed

    private void textBoxFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBoxFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBoxFileActionPerformed

    private void buscarImagenBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarImagenBtn1ActionPerformed
        JFileChooser exploradorArch = new JFileChooser("C:\\Señales");
        exploradorArch.setMultiSelectionEnabled(true);
        exploradorArch.showOpenDialog(this);
        String selectedFilesNames = " ";
        for (File file:exploradorArch.getSelectedFiles()){
            this.selectedFilesPaths.add(file.getAbsolutePath());
            System.out.print(file.getAbsolutePath());
            selectedFilesNames = selectedFilesNames.concat(" "+file.getAbsolutePath());
        }
        System.out.print(selectedFilesNames);
        this.textBoxFile1.setText(selectedFilesNames);
    }//GEN-LAST:event_buscarImagenBtn1ActionPerformed

    private void textBoxFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBoxFile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBoxFile1ActionPerformed

    class ProgressBar extends SwingWorker<Void,Void>{

		@Override
		protected Void doInBackground() throws Exception {
			progressBar.setValue(0);
			statusProgressBarLabel.setVisible(true);
	        if (selectedFilesPaths.size() > 0){
	            statusProgressBarLabel.setVisible(true);
	            statusProgressBarLabel.setText("Procesando...");
	            int cantImages = selectedFilesPaths.size();
	            int porcentaje = 100/cantImages;
	            try {
	                int sum = 0;
	                for (String path:selectedFilesPaths){
	                	Imagen img = new Imagen();
	                    img.loadImageToBD(path);
	                    sum = sum + porcentaje;
	                    progressBar.setValue(sum);
	                }
	                
	            } catch (Exception ex) {
	                statusProgressBarLabel.setText("Error");
	                System.out.print("Algo salio mal intentar cargar las imagenes");
	            }
	        }
			return null;
		}
		
		@Override
		protected void done() {
			selectedFilesPaths = new ArrayList<>();
			progressBar.setValue(100);
			statusProgressBarLabel.setText("Completado");
		}

    }
    
    private void cargarSenialesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarSenialesBtnActionPerformed
    	if (this.textBoxFile1.getText().equals("Seleccione una o mas imagenes") || this.textBoxFile1.getText().equals(" ") ) {
    		JOptionPane.showMessageDialog(this, "Debe seleccionar una imagen o más para cargar");
    		return;
    	}
    	SwingWorker progress = new ProgressBar();
        progress.execute();
    }//GEN-LAST:event_cargarSenialesBtnActionPerformed

    private void initRSScalabelResultBoxes(){
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_1, null);
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_2, null);
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_3, null);
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_4, null);
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_5, null);
    }    
    
    private void buscarSenialBtnActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_buscarSenialBtnActionPerformed
    	if (this.textBoxFile.getText().equals("Seleccione una imagen") || this.textBoxFile.getText().equals("") ) {
    		JOptionPane.showMessageDialog(this, "Debe seleccionar una imagen para realizar la búsqueda");
    		return;
    	}
        this.initRSScalabelResultBoxes();
        Imagen img = new Imagen();
        SenialDAO senial = new SenialDAO();
        List<Senial> seniales = (List<Senial>) img.findSimilarImagesAs(this.textBoxFile.getText());
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_1, seniales.get(0).getRuta());
        this.resultado_label_1.setText("<html><center>"+seniales.get(0).getDescripcion()+"<center><html>");
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_2, seniales.get(1).getRuta());
        this.resultado_label_2.setText("<html><center>"+seniales.get(1).getDescripcion()+"<center><html>");
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_3, seniales.get(2).getRuta());
        this.resultado_label_3.setText("<html><center>"+seniales.get(2).getDescripcion()+"<center><html>");
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_4, seniales.get(3).getRuta());
        this.resultado_label_4.setText("<html><center>"+seniales.get(3).getDescripcion()+"<center><html>");
        this.rSScaleLabel1.setScaleLabel(this.imageBoxResult_5, seniales.get(4).getRuta());
        this.resultado_label_5.setText("<html><center>"+seniales.get(4).getDescripcion()+"<center><html>");
    }//GEN-LAST:event_buscarSenialBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarImagenBtn;
    private javax.swing.JButton buscarImagenBtn1;
    private javax.swing.JButton buscarSenialBtn;
    private javax.swing.JButton cargarSenialesBtn;
    private javax.swing.JLabel imageBoxResult_1;
    private javax.swing.JLabel imageBoxResult_2;
    private javax.swing.JLabel imageBoxResult_3;
    private javax.swing.JLabel imageBoxResult_4;
    private javax.swing.JLabel imageBoxResult_5;
    private javax.swing.JLabel imagenLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JProgressBar progressBar;
    private rsscalelabel.RSScaleLabel rSScaleLabel1;
    private javax.swing.JLabel resultado_label_1;
    private javax.swing.JLabel resultado_label_2;
    private javax.swing.JLabel resultado_label_3;
    private javax.swing.JLabel resultado_label_4;
    private javax.swing.JLabel resultado_label_5;
    private javax.swing.JLabel statusProgressBarLabel;
    private javax.swing.JTextField textBoxFile;
    private javax.swing.JTextField textBoxFile1;
    // End of variables declaration//GEN-END:variables
}
