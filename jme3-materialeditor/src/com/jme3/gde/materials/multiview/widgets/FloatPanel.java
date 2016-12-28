/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NumberPanel.java
 *
 * Created on 14.06.2010, 16:42:25
 */
package com.jme3.gde.materials.multiview.widgets;

import com.jme3.gde.materials.MaterialProperty;

/**
 *
 * @author normenhansen
 */
public class FloatPanel extends MaterialPropertyWidget {

    /** Creates new form NumberPanel */
    public FloatPanel() {
        initComponents();
           jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(FloatPanel.class, "FloatPanel.jLabel1.text")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));
        jToolBar1.add(jLabel1);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel1);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(1.0f)));
        jSpinner1.setPreferredSize(new java.awt.Dimension(70, 20));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valueChanged(evt);
            }
        });
        jToolBar1.add(jSpinner1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void valueChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valueChanged
        if (property == null) {
            return;
        }
        property.setValue(jSpinner1.getValue() + "");
        fireChanged();
    }//GEN-LAST:event_valueChanged

    @Override
    protected void readProperty() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                jLabel1.setText(property.getName());
                jLabel1.setToolTipText(property.getName());
                MaterialProperty prop = property;
                property = null;
                try {
                    jSpinner1.setValue(Float.parseFloat(prop.getValue()));
                } catch (Exception e) {
                    jSpinner1.setValue(0);
                }
                property = prop;
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}