
package csomag;

import javax.swing.JOptionPane;

/**
 *
 * @author gergo
 */
public class PizzaGui extends javax.swing.JFrame {

    /**
     * Creates new form PizzaGui
     */
    public PizzaGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        szoszokBTNG = new javax.swing.ButtonGroup();
        meretBTNG = new javax.swing.ButtonGroup();
        szoszokPNL = new javax.swing.JPanel();
        paradicsomRBTTN = new javax.swing.JRadioButton();
        bbqRBTTN = new javax.swing.JRadioButton();
        tejfolRBTTN = new javax.swing.JRadioButton();
        meretPNL = new javax.swing.JPanel();
        nagyRBTTN = new javax.swing.JRadioButton();
        kicsiRBTTN = new javax.swing.JRadioButton();
        sajtokPNL = new javax.swing.JPanel();
        cheddarCMB = new javax.swing.JCheckBox();
        mozzarellaCMB = new javax.swing.JCheckBox();
        parmesanCMB = new javax.swing.JCheckBox();
        marvanyCMB = new javax.swing.JCheckBox();
        husokPNL = new javax.swing.JPanel();
        szalamiCMB = new javax.swing.JCheckBox();
        baconCMB = new javax.swing.JCheckBox();
        sonkaCMB = new javax.swing.JCheckBox();
        zoldsegekPNL = new javax.swing.JPanel();
        hagymaCMB = new javax.swing.JCheckBox();
        pariCMB = new javax.swing.JCheckBox();
        gombaCMB = new javax.swing.JCheckBox();
        kukoricaCMB = new javax.swing.JCheckBox();
        bogyoCMB = new javax.swing.JCheckBox();
        paprikaCMB = new javax.swing.JCheckBox();
        darabPNL = new javax.swing.JPanel();
        darabSPR = new javax.swing.JSpinner();
        rendelesPNL = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        torlesBTTN = new javax.swing.JButton();
        osszegPNL = new javax.swing.JPanel();
        osszegTXT = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        szoszokPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Alapszósz"));

        szoszokBTNG.add(paradicsomRBTTN);
        paradicsomRBTTN.setText("Paradicsomos");

        szoszokBTNG.add(bbqRBTTN);
        bbqRBTTN.setText("BBQ");

        szoszokBTNG.add(tejfolRBTTN);
        tejfolRBTTN.setText("Tejfölös");

        javax.swing.GroupLayout szoszokPNLLayout = new javax.swing.GroupLayout(szoszokPNL);
        szoszokPNL.setLayout(szoszokPNLLayout);
        szoszokPNLLayout.setHorizontalGroup(
            szoszokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(szoszokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(szoszokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bbqRBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tejfolRBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paradicsomRBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        szoszokPNLLayout.setVerticalGroup(
            szoszokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(szoszokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paradicsomRBTTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tejfolRBTTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bbqRBTTN)
                .addContainerGap())
        );

        meretPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Méret"));

        meretBTNG.add(nagyRBTTN);
        nagyRBTTN.setText("45 cm (3000ft)");
        nagyRBTTN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nagyRBTTNItemStateChanged(evt);
            }
        });

        meretBTNG.add(kicsiRBTTN);
        kicsiRBTTN.setText("32 cm (2000ft)");
        kicsiRBTTN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kicsiRBTTNItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout meretPNLLayout = new javax.swing.GroupLayout(meretPNL);
        meretPNL.setLayout(meretPNLLayout);
        meretPNLLayout.setHorizontalGroup(
            meretPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meretPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(meretPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kicsiRBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nagyRBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        meretPNLLayout.setVerticalGroup(
            meretPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meretPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kicsiRBTTN)
                .addGap(18, 18, 18)
                .addComponent(nagyRBTTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sajtokPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Sajtok (400ft/ feltét)"));

        cheddarCMB.setText("Cheddar");
        cheddarCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cheddarCMBItemStateChanged(evt);
            }
        });

        mozzarellaCMB.setText("Mozzarella");
        mozzarellaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mozzarellaCMBItemStateChanged(evt);
            }
        });

        parmesanCMB.setText("Parmesan");
        parmesanCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parmesanCMBItemStateChanged(evt);
            }
        });

        marvanyCMB.setText("Márványsajt ");
        marvanyCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                marvanyCMBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout sajtokPNLLayout = new javax.swing.GroupLayout(sajtokPNL);
        sajtokPNL.setLayout(sajtokPNLLayout);
        sajtokPNLLayout.setHorizontalGroup(
            sajtokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sajtokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sajtokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marvanyCMB)
                    .addComponent(cheddarCMB)
                    .addComponent(mozzarellaCMB)
                    .addComponent(parmesanCMB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sajtokPNLLayout.setVerticalGroup(
            sajtokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sajtokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(marvanyCMB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cheddarCMB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mozzarellaCMB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parmesanCMB)
                .addContainerGap())
        );

        husokPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Húsok (300ft/feltét)"));

        szalamiCMB.setText("Szalámi");
        szalamiCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                szalamiCMBItemStateChanged(evt);
            }
        });

        baconCMB.setText("Bacon");
        baconCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                baconCMBItemStateChanged(evt);
            }
        });

        sonkaCMB.setText("Sonka ");
        sonkaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sonkaCMBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout husokPNLLayout = new javax.swing.GroupLayout(husokPNL);
        husokPNL.setLayout(husokPNLLayout);
        husokPNLLayout.setHorizontalGroup(
            husokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(husokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(husokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(szalamiCMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sonkaCMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baconCMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        husokPNLLayout.setVerticalGroup(
            husokPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(husokPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonkaCMB)
                .addGap(18, 18, 18)
                .addComponent(szalamiCMB)
                .addGap(18, 18, 18)
                .addComponent(baconCMB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zoldsegekPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Zöldségek (200ft/feltét)"));

        hagymaCMB.setText("Hagyma");
        hagymaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hagymaCMBItemStateChanged(evt);
            }
        });

        pariCMB.setText("Paradicsom");
        pariCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pariCMBItemStateChanged(evt);
            }
        });

        gombaCMB.setText("Gomba");
        gombaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gombaCMBItemStateChanged(evt);
            }
        });

        kukoricaCMB.setText("Kukorica");
        kukoricaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kukoricaCMBItemStateChanged(evt);
            }
        });

        bogyoCMB.setText("Olivabogyó");

        paprikaCMB.setText("Paprika");
        paprikaCMB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paprikaCMBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout zoldsegekPNLLayout = new javax.swing.GroupLayout(zoldsegekPNL);
        zoldsegekPNL.setLayout(zoldsegekPNLLayout);
        zoldsegekPNLLayout.setHorizontalGroup(
            zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoldsegekPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kukoricaCMB)
                    .addComponent(gombaCMB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hagymaCMB)
                    .addComponent(pariCMB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paprikaCMB)
                    .addComponent(bogyoCMB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        zoldsegekPNLLayout.setVerticalGroup(
            zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zoldsegekPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gombaCMB)
                    .addComponent(hagymaCMB)
                    .addComponent(paprikaCMB))
                .addGap(44, 44, 44)
                .addGroup(zoldsegekPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kukoricaCMB)
                    .addComponent(pariCMB)
                    .addComponent(bogyoCMB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        darabPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Darabszám:"));

        darabSPR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        javax.swing.GroupLayout darabPNLLayout = new javax.swing.GroupLayout(darabPNL);
        darabPNL.setLayout(darabPNLLayout);
        darabPNLLayout.setHorizontalGroup(
            darabPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darabPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(darabSPR)
                .addContainerGap())
        );
        darabPNLLayout.setVerticalGroup(
            darabPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darabPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(darabSPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rendelesPNL.setBorder(javax.swing.BorderFactory.createTitledBorder("Rendelés"));

        jToggleButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kepek/pizza.png"))); // NOI18N
        jToggleButton1.setMaximumSize(new java.awt.Dimension(208, 124));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(117, 117));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(117, 117));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rendelesPNLLayout = new javax.swing.GroupLayout(rendelesPNL);
        rendelesPNL.setLayout(rendelesPNLLayout);
        rendelesPNLLayout.setHorizontalGroup(
            rendelesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendelesPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rendelesPNLLayout.setVerticalGroup(
            rendelesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendelesPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        torlesBTTN.setBackground(new java.awt.Color(255, 96, 96));
        torlesBTTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        torlesBTTN.setText("Törlés");
        torlesBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torlesBTTNActionPerformed(evt);
            }
        });

        osszegPNL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Összeg:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        osszegTXT.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        osszegTXT.setText("*összeg*");
        osszegTXT.setEnabled(false);

        javax.swing.GroupLayout osszegPNLLayout = new javax.swing.GroupLayout(osszegPNL);
        osszegPNL.setLayout(osszegPNLLayout);
        osszegPNLLayout.setHorizontalGroup(
            osszegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszegPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(osszegTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        osszegPNLLayout.setVerticalGroup(
            osszegPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(osszegPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(osszegTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Négysajtos (kicsi)", "Négysajtos (nagy)", "Son-Go-Ku (kicsi)", "Son-Go-Ku (nagy)", "Sonka-Gomba(kicsi)", "Sonka-Gomba(nagy)", "Sonka-Kukorica(kicsi)", "Sonka-Kukorica(nagy)" }));

        jLabel1.setText("Klasszikusok:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(szoszokPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sajtokPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(husokPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meretPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(zoldsegekPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(torlesBTTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(osszegPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(darabPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rendelesPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(szoszokPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meretPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sajtokPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(husokPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(osszegPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(darabPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(torlesBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rendelesPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(zoldsegekPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marvanyCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_marvanyCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_marvanyCMBItemStateChanged

    private void cheddarCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cheddarCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_cheddarCMBItemStateChanged

    private void mozzarellaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mozzarellaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_mozzarellaCMBItemStateChanged

    private void parmesanCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parmesanCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_parmesanCMBItemStateChanged

    private void sonkaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sonkaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_sonkaCMBItemStateChanged

    private void szalamiCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_szalamiCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_szalamiCMBItemStateChanged

    private void baconCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_baconCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_baconCMBItemStateChanged

    private void gombaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gombaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_gombaCMBItemStateChanged

    private void hagymaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hagymaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_hagymaCMBItemStateChanged

    private void paprikaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paprikaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_paprikaCMBItemStateChanged

    private void kukoricaCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kukoricaCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_kukoricaCMBItemStateChanged

    private void pariCMBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pariCMBItemStateChanged
        fizetendo();
    }//GEN-LAST:event_pariCMBItemStateChanged

    private void kicsiRBTTNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kicsiRBTTNItemStateChanged
        fizetendo();
    }//GEN-LAST:event_kicsiRBTTNItemStateChanged

    private void nagyRBTTNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nagyRBTTNItemStateChanged
        fizetendo();
    }//GEN-LAST:event_nagyRBTTNItemStateChanged

    private void torlesBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torlesBTTNActionPerformed

        meretBTNG.clearSelection();
        szoszokBTNG.clearSelection();
        marvanyCMB.setSelected(false);
        cheddarCMB.setSelected(false);
        mozzarellaCMB.setSelected(false);
        parmesanCMB.setSelected(false);
        sonkaCMB.setSelected(false);
        baconCMB.setSelected(false);
        szalamiCMB.setSelected(false);
        gombaCMB.setSelected(false);
        hagymaCMB.setSelected(false);
        kukoricaCMB.setSelected(false);
        bogyoCMB.setSelected(false);
        pariCMB.setSelected(false);
        paprikaCMB.setSelected(false);
                
    }//GEN-LAST:event_torlesBTTNActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        boolean nincsMeret = kicsiRBTTN.isSelected() == false && nagyRBTTN.isSelected() == false;
        boolean nincsSzosz = paradicsomRBTTN.isSelected() == false && tejfolRBTTN.isSelected() == false && bbqRBTTN.isSelected() == false;

        if (nincsSzosz && nincsMeret) {
            JOptionPane.showMessageDialog(rootPane, "Nincs alapszósz és méret választva", "Hiba! Alapszósz/Méret", 0);

        }
        else if (nincsSzosz ){
            JOptionPane.showMessageDialog(rootPane, "Nincs szósz választva", "Hiba! szósz", 2);
        }

        else if (nincsMeret) {
            JOptionPane.showMessageDialog(rootPane, "Nincs méret választva", "Hiba! méret", 2);

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sikeres rendelés");

        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGui().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox baconCMB;
    private javax.swing.JRadioButton bbqRBTTN;
    private javax.swing.JCheckBox bogyoCMB;
    private javax.swing.JCheckBox cheddarCMB;
    private javax.swing.JPanel darabPNL;
    private javax.swing.JSpinner darabSPR;
    private javax.swing.JCheckBox gombaCMB;
    private javax.swing.JCheckBox hagymaCMB;
    private javax.swing.JPanel husokPNL;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton kicsiRBTTN;
    private javax.swing.JCheckBox kukoricaCMB;
    private javax.swing.JCheckBox marvanyCMB;
    private javax.swing.ButtonGroup meretBTNG;
    private javax.swing.JPanel meretPNL;
    private javax.swing.JCheckBox mozzarellaCMB;
    private javax.swing.JRadioButton nagyRBTTN;
    private javax.swing.JPanel osszegPNL;
    private javax.swing.JTextField osszegTXT;
    private javax.swing.JCheckBox paprikaCMB;
    private javax.swing.JRadioButton paradicsomRBTTN;
    private javax.swing.JCheckBox pariCMB;
    private javax.swing.JCheckBox parmesanCMB;
    private javax.swing.JPanel rendelesPNL;
    private javax.swing.JPanel sajtokPNL;
    private javax.swing.JCheckBox sonkaCMB;
    private javax.swing.JCheckBox szalamiCMB;
    private javax.swing.ButtonGroup szoszokBTNG;
    private javax.swing.JPanel szoszokPNL;
    private javax.swing.JRadioButton tejfolRBTTN;
    private javax.swing.JButton torlesBTTN;
    private javax.swing.JPanel zoldsegekPNL;
    // End of variables declaration//GEN-END:variables

    private void fizetendo() {
        int a = Integer.parseInt( darabSPR.getValue().toString());
        int osszeg = 0;
        int ar = 0;
        if (gombaCMB.isSelected() == true){
              ar = 200;
              osszeg = (osszeg + ar);}
      
        if (kukoricaCMB.isSelected()==true){
            ar = 200;
            osszeg = (osszeg + ar);}
        
        if (hagymaCMB.isSelected()==true){
            ar = 200;
            osszeg = (osszeg + ar);}
        
        if (paprikaCMB.isSelected()==true){
            ar = 200;
            osszeg = (osszeg + ar);}   
        
        if (bogyoCMB.isSelected()==true){
            ar = 200;
            osszeg = (osszeg + ar);}
        
        if (pariCMB.isSelected()==true){
            ar = 200;
            osszeg = (osszeg + ar);}
        
        if (sonkaCMB.isSelected() == true ){
            ar = 300;
            osszeg = (osszeg + ar);}
        if(szalamiCMB.isSelected()==true){
           ar = 300;
           osszeg = (osszeg + ar);}
        if(baconCMB.isSelected()==true){
           ar = 300;
           osszeg = (osszeg + ar);}
        
        if (cheddarCMB.isSelected() == true  ){
                ar = 400;
                osszeg = (osszeg + ar);}
        if (parmesanCMB.isSelected()==true){
            ar = 400;
            osszeg = (osszeg + ar);}
        if (mozzarellaCMB.isSelected()==true){
            ar = 400;
            osszeg = (osszeg + ar);}
        if (marvanyCMB.isSelected()==true){
            ar = 400;
            osszeg = (osszeg + ar);}
        
        if (kicsiRBTTN.isSelected()==true){
            ar = 2000;
            osszeg = (osszeg + ar);

        }
        if (nagyRBTTN.isSelected()==true){
            ar = 3000;
            osszeg = (osszeg + ar);
            
        }
        if (a == 1){
        osszeg = osszeg * a;
        }
        
        if (a == 2){
        osszeg = osszeg * a;
        }
        
        if (a == 3){
        osszeg = osszeg * a;
        }
        



        else{}

        osszegTXT.setText(String.valueOf(osszeg));
        
    }
}
                    
    
   

