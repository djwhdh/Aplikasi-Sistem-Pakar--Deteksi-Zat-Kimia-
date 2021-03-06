/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmat.deteksisenyawa.internalframe.ciri;

import com.uiMIF.JTextEx;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import jmat.deteksisenyawa.controller.ControllerCiri;
import jmat.deteksisenyawa.entity.EntityCiri;
import jmat.deteksisenyawa.entity.EntitySenyawa;
import jmat.deteksisenyawa.frame.DeteksiSenyawa;
import jmat.deteksisenyawa.internalframe.rule.InternalRule;
import jmat.deteksisenyawa.listener.ListenerCiri;
import jmat.deteksisenyawa.model.ModelCiri;

/**
 *
 * @author hasani
 */
public class InternalCiri extends javax.swing.JInternalFrame
        implements ListenerCiri {

    /**
     * Creates new form InternalCiri
     */
    private DeteksiSenyawa deteksiSenyawa;
    private ModelCiri modelCiri;
    private ControllerCiri controllerCiri;
    private String oldPenjelasan;

    public InternalCiri() {
        initComponents();
        setBisnisLogic();
    }

    public DeteksiSenyawa getDeteksiSenyawa() {
        return deteksiSenyawa;
    }

    public void setDeteksiSenyawa(DeteksiSenyawa deteksiSenyawa) {
        this.deteksiSenyawa = deteksiSenyawa;
    }

    public void setTitleBaru(String title) {
        lblKeterangan.setVisible(false);
        this.setTitle(title);
    }

    private void setBisnisLogic() {
        modelCiri = new ModelCiri();
        controllerCiri = new ControllerCiri();
        controllerCiri.setModelCiri(modelCiri);
        modelCiri.setListenerCiri(this);
    }

    public JTextArea getTxtPenjelasan() {
        return txtPenjelasan;
    }

    public JTextEx getTxtIdCiri() {
        return txtIdCiri;
    }

    public JLabel getLblKeterangan() {
        return lblKeterangan;
    }

    public JProgressBar getProgresbarCiri() {
        return progresbarCiri;
    }

    public JButton getBtnClearCiri() {
        return btnClearCiri;
    }

    public JButton getBtnSimpanCiri() {
        return btnSimpanCiri;
    }

    public void setOldCiri(String penjelasan) {
        this.oldPenjelasan = penjelasan;
    }

    private Boolean validasiPerubahan() {
        boolean cek = false;
        if (!oldPenjelasan.equals(txtPenjelasan.getText().trim())) {
            cek = true;
        }
        return cek;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdCiri = new com.uiMIF.JTextEx();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPenjelasan = new javax.swing.JTextArea();
        btnSimpanCiri = new javax.swing.JButton();
        btnClearCiri = new javax.swing.JButton();
        progresbarCiri = new javax.swing.JProgressBar();
        lblKeterangan = new javax.swing.JLabel();

        txtIdCiri.setInputType(com.uiMIF.JTextEx.TypeText.Number);

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Penjelasan :");

        txtPenjelasan.setColumns(20);
        txtPenjelasan.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtPenjelasan.setLineWrap(true);
        txtPenjelasan.setRows(5);
        txtPenjelasan.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPenjelasan);

        btnSimpanCiri.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSimpanCiri.setText("Simpan");
        btnSimpanCiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanCiriActionPerformed(evt);
            }
        });

        btnClearCiri.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnClearCiri.setText("Clear");
        btnClearCiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCiriActionPerformed(evt);
            }
        });

        lblKeterangan.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblKeterangan.setForeground(new java.awt.Color(66, 208, 75));
        lblKeterangan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKeterangan.setText("Sukses Menyimpan data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(progresbarCiri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKeterangan)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpanCiri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearCiri)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanCiri)
                    .addComponent(btnClearCiri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progresbarCiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKeterangan)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        deteksiSenyawa.internalCiri = null;
        deteksiSenyawa = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnClearCiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCiriActionPerformed
        // TODO add your handling code here:
        txtPenjelasan.setText("");
    }//GEN-LAST:event_btnClearCiriActionPerformed

    private void btnSimpanCiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanCiriActionPerformed
        // TODO add your handling code here:
        switch (getTitle()) {
            case "Tambah Ciri Suatu Zat":
                controllerCiri.insertCiri(this);
                break;
            case "Ubah Ciri Suatu Zat":
                if (validasiPerubahan() == true) {
                    controllerCiri.updateCiri(this);
                } else {
                    dispose();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSimpanCiriActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearCiri;
    private javax.swing.JButton btnSimpanCiri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JProgressBar progresbarCiri;
    private com.uiMIF.JTextEx txtIdCiri;
    private javax.swing.JTextArea txtPenjelasan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insert(EntityCiri entityCiri) {
        if (deteksiSenyawa.internalTBCiri instanceof InternalTBCiri) {
            InternalTBCiri internalTBCiri;
            internalTBCiri = (InternalTBCiri) deteksiSenyawa.internalTBCiri;
            internalTBCiri.getTabelModelCiri().add(entityCiri);

        }
        if(deteksiSenyawa.internalRule instanceof InternalRule){
            InternalRule internalRule;
            internalRule = (InternalRule) deteksiSenyawa.internalRule;
            internalRule.getTabelModelCiri().add(entityCiri);
        }

    }

    @Override
    public void update(EntityCiri entityCiri) {
        if (deteksiSenyawa.internalTBCiri instanceof InternalTBCiri) {
            InternalTBCiri internalTBCiri;
            internalTBCiri = (InternalTBCiri) deteksiSenyawa.internalTBCiri;
            int selectedRow = internalTBCiri.getTabelCiri().getSelectedRow();
            internalTBCiri.getTabelModelCiri().set(selectedRow, entityCiri);
            dispose();
        }else{
            EventIntRule();
            dispose();
        }
    }
    
    private void EventIntRule() {
        if (deteksiSenyawa.internalRule instanceof InternalRule) {
            InternalRule internalRule;
            internalRule = (InternalRule) deteksiSenyawa.internalRule;
            if (internalRule.getListModelCiri().size() > 0) {

                Object selectedItem = internalRule.getComboBoxModelSenyawa().getSelectedItem();
                if (selectedItem instanceof EntitySenyawa) {
                    EntitySenyawa entitySenyawa;
                    entitySenyawa = (EntitySenyawa) selectedItem;
                    internalRule.loadRule(entitySenyawa);
                }
            }
            if (internalRule.getTabelPenjelasan().getRowCount() > 0) {
                internalRule.loadCiriPenjelasan();
            }
        }
    }
}
