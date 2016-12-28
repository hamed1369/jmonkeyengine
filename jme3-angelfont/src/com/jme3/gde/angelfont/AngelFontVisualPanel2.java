/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.angelfont;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings({"unchecked", "rawtypes"})
public final class AngelFontVisualPanel2 extends JPanel {

    String fontName = "";
    int fontSize = 16;
    int imageSize = 256;
    int paddingX = 0;
    int paddingY = 0;
    int letterSpacing = 0;
    String fileName = "";
    int style = Font.PLAIN;
    int charRangeStart = 0;
    int charRangeEnd = 256;

    /** Creates new form AngelFontVisualPanel2 */
    public AngelFontVisualPanel2() {
        initComponents();
        jComboBox1.removeAllItems();
        jComboBox1.addItem("PLAIN");
        jComboBox1.addItem("ITALIC");
        jComboBox1.addItem("BOLD");
    }

    @Override
    public String getName() {
        return "Configure Font";
    }

    public void setFont(String name) {
        this.fontName = name;
        jTextField1.setText(fontName);
        jLabel10.setText(fontName);
        updateFont();
    }

    public String getFileName() {
        return jTextField1.getText();
    }

    private void updateFont() {
        jLabel3.setIcon(new ImageIcon(FontCreator.buildFont(fontName, getFileName(), imageSize, fontSize, style, paddingX, paddingY, letterSpacing, charRangeStart, charRangeEnd, true).getImage()));
        jLabel3.repaint();
        jPanel1.repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jButton1.text")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel7.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jTextField1.text")); // NOI18N
        jTextField1.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jTextField1.toolTipText")); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel2.text")); // NOI18N

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(256), Integer.valueOf(64), null, Integer.valueOf(1)));
        jSpinner2.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner2.toolTipText")); // NOI18N
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                updateImageSize(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel4.text")); // NOI18N

        jSpinner3.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner3.toolTipText")); // NOI18N
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                updatePaddingX(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel5.text")); // NOI18N

        jSpinner4.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner4.toolTipText")); // NOI18N
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                updatePaddingY(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinner3)
                    .addComponent(jSpinner4)
                    .addComponent(jSpinner2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jPanel3.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel1.text")); // NOI18N

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(16), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinner1.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner1.toolTipText")); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                updateFontSize(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jComboBox1.toolTipText")); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel9.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel10.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel11.text")); // NOI18N

        jSpinner5.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner5.toolTipText")); // NOI18N
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                letterSpacingUpdate(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel12.text")); // NOI18N

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 32));
        jSpinner6.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner6.toolTipText")); // NOI18N
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6letterSpacingUpdate(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jLabel13.text")); // NOI18N

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(256, 0, 65535, 32));
        jSpinner7.setToolTipText(org.openide.util.NbBundle.getMessage(AngelFontVisualPanel2.class, "AngelFontVisualPanel2.jSpinner7.toolTipText")); // NOI18N
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7letterSpacingUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateFontSize(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_updateFontSize
        fontSize = (Integer) jSpinner1.getValue();
        updateFont();
    }//GEN-LAST:event_updateFontSize

    private void updateImageSize(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_updateImageSize
        imageSize = (Integer) jSpinner2.getValue();
        updateFont();
    }//GEN-LAST:event_updateImageSize

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if ("PLAIN".equals(jComboBox1.getSelectedItem())) {
            style = Font.PLAIN;
        } else if ("BOLD".equals(jComboBox1.getSelectedItem())) {
            style = Font.BOLD;
        } else if ("ITALIC".equals(jComboBox1.getSelectedItem())) {
            style = Font.ITALIC;
        }
        updateFont();
    }//GEN-LAST:event_jComboBox1ActionPerformed

private void updatePaddingX(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_updatePaddingX
    paddingX = (Integer) jSpinner3.getValue();
    updateFont();
}//GEN-LAST:event_updatePaddingX

private void updatePaddingY(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_updatePaddingY
    paddingY = (Integer) jSpinner4.getValue();
    updateFont();
}//GEN-LAST:event_updatePaddingY

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    fileName = jTextField1.getText();
}//GEN-LAST:event_jTextField1ActionPerformed

private void letterSpacingUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_letterSpacingUpdate
    letterSpacing = (Integer) jSpinner5.getValue();
}//GEN-LAST:event_letterSpacingUpdate

    private void jSpinner6letterSpacingUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6letterSpacingUpdate
        charRangeStart = (Integer)jSpinner6.getValue();
        updateFont();
    }//GEN-LAST:event_jSpinner6letterSpacingUpdate

    private void jSpinner7letterSpacingUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7letterSpacingUpdate
        charRangeEnd = (Integer)jSpinner7.getValue();
        updateFont();
    }//GEN-LAST:event_jSpinner7letterSpacingUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
