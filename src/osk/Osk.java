/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Osk.java
 *
 * Created on 2013-4-14, 11:59:22
 */
package osk;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Osk extends javax.swing.JFrame {

    public Osk() {
        key_map = new KeyMap(); //Add the key map support
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        l3 = new javax.swing.JPanel();
        caps = new javax.swing.JButton();
        ち = new javax.swing.JButton();
        と = new javax.swing.JButton();
        し = new javax.swing.JButton();
        は = new javax.swing.JButton();
        き = new javax.swing.JButton();
        く = new javax.swing.JButton();
        ま = new javax.swing.JButton();
        の = new javax.swing.JButton();
        り = new javax.swing.JButton();
        れ = new javax.swing.JButton();
        け = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tab = new javax.swing.JButton();
        た = new javax.swing.JButton();
        い = new javax.swing.JButton();
        て = new javax.swing.JButton();
        す = new javax.swing.JButton();
        か = new javax.swing.JButton();
        ん = new javax.swing.JButton();
        な = new javax.swing.JButton();
        に = new javax.swing.JButton();
        ら = new javax.swing.JButton();
        せ = new javax.swing.JButton();
        point = new javax.swing.JButton();
        circle = new javax.swing.JButton();
        む = new javax.swing.JButton();
        l1 = new javax.swing.JPanel();
        ろ = new javax.swing.JButton();
        ぬ = new javax.swing.JButton();
        や = new javax.swing.JButton();
        お = new javax.swing.JButton();
        え = new javax.swing.JButton();
        う = new javax.swing.JButton();
        あ = new javax.swing.JButton();
        ふ = new javax.swing.JButton();
        へ = new javax.swing.JButton();
        ほ = new javax.swing.JButton();
        わ = new javax.swing.JButton();
        よ = new javax.swing.JButton();
        ゆ = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        l4 = new javax.swing.JPanel();
        shift1 = new javax.swing.JButton();
        つ = new javax.swing.JButton();
        さ = new javax.swing.JButton();
        そ = new javax.swing.JButton();
        ひ = new javax.swing.JButton();
        こ = new javax.swing.JButton();
        み = new javax.swing.JButton();
        も = new javax.swing.JButton();
        ね = new javax.swing.JButton();
        る = new javax.swing.JButton();
        め = new javax.swing.JButton();
        shift2 = new javax.swing.JButton();
        l5 = new javax.swing.JPanel();
        ctrl1 = new javax.swing.JButton();
        win = new javax.swing.JButton();
        alt1 = new javax.swing.JButton();
        space = new javax.swing.JButton();
        alt2 = new javax.swing.JButton();
        appl = new javax.swing.JButton();
        ctrl2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(osk.OskApp.class).getContext().getResourceMap(Osk.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                extensionKeyPressed(evt);
            }
        });

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                extensionKeyPressed(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setName("l3"); // NOI18N

        caps.setText(resourceMap.getString("caps.text")); // NOI18N
        caps.setActionCommand(resourceMap.getString("caps.actionCommand")); // NOI18N
        caps.setName("caps"); // NOI18N
        caps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ち.setBackground(resourceMap.getColor("つ.background")); // NOI18N
        ち.setForeground(resourceMap.getColor("つ.foreground")); // NOI18N
        ち.setText(resourceMap.getString("ち.text")); // NOI18N
        ち.setActionCommand(resourceMap.getString("ち.actionCommand")); // NOI18N
        ち.setName("ち"); // NOI18N
        ち.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        と.setBackground(resourceMap.getColor("つ.background")); // NOI18N
        と.setForeground(resourceMap.getColor("つ.foreground")); // NOI18N
        と.setText(resourceMap.getString("と.text")); // NOI18N
        と.setActionCommand(resourceMap.getString("と.actionCommand")); // NOI18N
        と.setName("と"); // NOI18N
        と.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        し.setBackground(resourceMap.getColor("し.background")); // NOI18N
        し.setFont(resourceMap.getFont("し.font")); // NOI18N
        し.setForeground(resourceMap.getColor("し.foreground")); // NOI18N
        し.setText(resourceMap.getString("し.text")); // NOI18N
        し.setActionCommand(resourceMap.getString("し.actionCommand")); // NOI18N
        し.setName("し"); // NOI18N
        し.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        は.setBackground(resourceMap.getColor("へ.background")); // NOI18N
        は.setForeground(resourceMap.getColor("へ.foreground")); // NOI18N
        は.setText(resourceMap.getString("は.text")); // NOI18N
        は.setActionCommand(resourceMap.getString("は.actionCommand")); // NOI18N
        は.setName("は"); // NOI18N
        は.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        き.setBackground(resourceMap.getColor("こ.background")); // NOI18N
        き.setForeground(resourceMap.getColor("こ.foreground")); // NOI18N
        き.setText(resourceMap.getString("き.text")); // NOI18N
        き.setActionCommand(resourceMap.getString("き.actionCommand")); // NOI18N
        き.setName("き"); // NOI18N
        き.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        く.setBackground(resourceMap.getColor("こ.background")); // NOI18N
        く.setForeground(resourceMap.getColor("こ.foreground")); // NOI18N
        く.setText(resourceMap.getString("く.text")); // NOI18N
        く.setActionCommand(resourceMap.getString("く.actionCommand")); // NOI18N
        く.setName("く"); // NOI18N
        く.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ま.setBackground(resourceMap.getColor("ま.background")); // NOI18N
        ま.setForeground(resourceMap.getColor("ま.foreground")); // NOI18N
        ま.setText(resourceMap.getString("ま.text")); // NOI18N
        ま.setActionCommand(resourceMap.getString("ま.actionCommand")); // NOI18N
        ま.setName("ま"); // NOI18N
        ま.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        の.setBackground(resourceMap.getColor("な.background")); // NOI18N
        の.setForeground(resourceMap.getColor("な.foreground")); // NOI18N
        の.setText(resourceMap.getString("の.text")); // NOI18N
        の.setActionCommand(resourceMap.getString("の.actionCommand")); // NOI18N
        の.setName("の"); // NOI18N
        の.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        り.setBackground(resourceMap.getColor("り.background")); // NOI18N
        り.setText(resourceMap.getString("り.text")); // NOI18N
        り.setActionCommand(resourceMap.getString("り.actionCommand")); // NOI18N
        り.setName("り"); // NOI18N
        り.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        れ.setBackground(resourceMap.getColor("り.background")); // NOI18N
        れ.setText(resourceMap.getString("れ.text")); // NOI18N
        れ.setActionCommand(resourceMap.getString("れ.actionCommand")); // NOI18N
        れ.setName("れ"); // NOI18N
        れ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        け.setBackground(resourceMap.getColor("こ.background")); // NOI18N
        け.setForeground(resourceMap.getColor("こ.foreground")); // NOI18N
        け.setText(resourceMap.getString("け.text")); // NOI18N
        け.setActionCommand(resourceMap.getString("け.actionCommand")); // NOI18N
        け.setName("け"); // NOI18N
        け.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        enter.setFont(resourceMap.getFont("enter.font")); // NOI18N
        enter.setText(resourceMap.getString("enter.text")); // NOI18N
        enter.setActionCommand(resourceMap.getString("enter.actionCommand")); // NOI18N
        enter.setName("enter"); // NOI18N
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        javax.swing.GroupLayout l3Layout = new javax.swing.GroupLayout(l3);
        l3.setLayout(l3Layout);
        l3Layout.setHorizontalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l3Layout.createSequentialGroup()
                .addComponent(caps, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ち)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(と)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(し)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(は)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(き)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(く)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ま)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(の)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(り)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(れ, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(け)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        l3Layout.setVerticalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(caps, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(け, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(れ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(り, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(の, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ち, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(と, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(し, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(は, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addComponent(き, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(く, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ま, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        mainPanel.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 900, 40));

        jPanel2.setName("jPanel2"); // NOI18N

        tab.setFont(resourceMap.getFont("tab.font")); // NOI18N
        tab.setText(resourceMap.getString("tab.text")); // NOI18N
        tab.setActionCommand(resourceMap.getString("tab.actionCommand")); // NOI18N
        tab.setName("tab"); // NOI18N
        tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        た.setBackground(resourceMap.getColor("つ.background")); // NOI18N
        た.setForeground(resourceMap.getColor("つ.foreground")); // NOI18N
        た.setText(resourceMap.getString("た.text")); // NOI18N
        た.setActionCommand(resourceMap.getString("た.actionCommand")); // NOI18N
        た.setName("た"); // NOI18N
        た.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        い.setBackground(resourceMap.getColor("お.background")); // NOI18N
        い.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        い.setForeground(resourceMap.getColor("お.foreground")); // NOI18N
        い.setText(resourceMap.getString("い.text")); // NOI18N
        い.setActionCommand(resourceMap.getString("い.actionCommand")); // NOI18N
        い.setName("い"); // NOI18N
        い.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        て.setBackground(resourceMap.getColor("つ.background")); // NOI18N
        て.setForeground(resourceMap.getColor("つ.foreground")); // NOI18N
        て.setText(resourceMap.getString("て.text")); // NOI18N
        て.setActionCommand(resourceMap.getString("て.actionCommand")); // NOI18N
        て.setName("て"); // NOI18N
        て.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        す.setBackground(resourceMap.getColor("し.background")); // NOI18N
        す.setForeground(resourceMap.getColor("し.foreground")); // NOI18N
        す.setText(resourceMap.getString("す.text")); // NOI18N
        す.setActionCommand(resourceMap.getString("す.actionCommand")); // NOI18N
        す.setName("す"); // NOI18N
        す.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        か.setBackground(resourceMap.getColor("こ.background")); // NOI18N
        か.setForeground(resourceMap.getColor("こ.foreground")); // NOI18N
        か.setText(resourceMap.getString("か.text")); // NOI18N
        か.setActionCommand(resourceMap.getString("か.actionCommand")); // NOI18N
        か.setName("か"); // NOI18N
        か.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ん.setBackground(resourceMap.getColor("ん.background")); // NOI18N
        ん.setForeground(resourceMap.getColor("ん.foreground")); // NOI18N
        ん.setText(resourceMap.getString("ん.text")); // NOI18N
        ん.setActionCommand(resourceMap.getString("ん.actionCommand")); // NOI18N
        ん.setName("ん"); // NOI18N
        ん.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        な.setBackground(resourceMap.getColor("な.background")); // NOI18N
        な.setForeground(resourceMap.getColor("な.foreground")); // NOI18N
        な.setText(resourceMap.getString("な.text")); // NOI18N
        な.setActionCommand(resourceMap.getString("な.actionCommand")); // NOI18N
        な.setName("な"); // NOI18N
        な.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        に.setBackground(resourceMap.getColor("な.background")); // NOI18N
        に.setForeground(resourceMap.getColor("な.foreground")); // NOI18N
        に.setText(resourceMap.getString("に.text")); // NOI18N
        に.setActionCommand(resourceMap.getString("に.actionCommand")); // NOI18N
        に.setName("に"); // NOI18N
        に.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ら.setBackground(resourceMap.getColor("り.background")); // NOI18N
        ら.setText(resourceMap.getString("ら.text")); // NOI18N
        ら.setActionCommand(resourceMap.getString("ら.actionCommand")); // NOI18N
        ら.setName("ら"); // NOI18N
        ら.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        せ.setBackground(resourceMap.getColor("し.background")); // NOI18N
        せ.setForeground(resourceMap.getColor("し.foreground")); // NOI18N
        せ.setText(resourceMap.getString("せ.text")); // NOI18N
        せ.setActionCommand(resourceMap.getString("せ.actionCommand")); // NOI18N
        せ.setName("せ"); // NOI18N
        せ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        point.setBackground(resourceMap.getColor("point.background")); // NOI18N
        point.setForeground(resourceMap.getColor("point.foreground")); // NOI18N
        point.setText(resourceMap.getString("point.text")); // NOI18N
        point.setActionCommand(resourceMap.getString("point.actionCommand")); // NOI18N
        point.setName("point"); // NOI18N
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        circle.setBackground(resourceMap.getColor("point.background")); // NOI18N
        circle.setForeground(resourceMap.getColor("point.foreground")); // NOI18N
        circle.setText(resourceMap.getString("circle.text")); // NOI18N
        circle.setActionCommand(resourceMap.getString("circle.actionCommand")); // NOI18N
        circle.setName("circle"); // NOI18N
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        む.setBackground(resourceMap.getColor("ま.background")); // NOI18N
        む.setForeground(resourceMap.getColor("ま.foreground")); // NOI18N
        む.setText(resourceMap.getString("む.text")); // NOI18N
        む.setActionCommand(resourceMap.getString("む.actionCommand")); // NOI18N
        む.setName("む"); // NOI18N
        む.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(た)
                .addGap(4, 4, 4)
                .addComponent(て)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(い)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(す)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(か)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ん)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(な)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(に)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ら)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(せ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(circle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(む, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(た, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(て, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(い, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(す, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(か, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(ん, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(な, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(に, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(ら, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(せ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(point, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(circle, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(む, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 900, 40));

        l1.setName("l1"); // NOI18N

        ろ.setBackground(resourceMap.getColor("り.background")); // NOI18N
        ろ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        ろ.setText(resourceMap.getString("ろ.text")); // NOI18N
        ろ.setActionCommand(resourceMap.getString("ろ.actionCommand")); // NOI18N
        ろ.setName("ろ"); // NOI18N
        ろ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ぬ.setBackground(resourceMap.getColor("な.background")); // NOI18N
        ぬ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        ぬ.setForeground(resourceMap.getColor("な.foreground")); // NOI18N
        ぬ.setText(resourceMap.getString("ぬ.text")); // NOI18N
        ぬ.setActionCommand(resourceMap.getString("ぬ.actionCommand")); // NOI18N
        ぬ.setName("ぬ"); // NOI18N
        ぬ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        や.setBackground(resourceMap.getColor("よ.background")); // NOI18N
        や.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        や.setForeground(resourceMap.getColor("よ.foreground")); // NOI18N
        や.setText(resourceMap.getString("や.text")); // NOI18N
        や.setActionCommand(resourceMap.getString("や.actionCommand")); // NOI18N
        や.setName("や"); // NOI18N
        や.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        お.setBackground(resourceMap.getColor("お.background")); // NOI18N
        お.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        お.setForeground(resourceMap.getColor("お.foreground")); // NOI18N
        お.setText(resourceMap.getString("お.text")); // NOI18N
        お.setActionCommand(resourceMap.getString("お.actionCommand")); // NOI18N
        お.setName("お"); // NOI18N
        お.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        え.setBackground(resourceMap.getColor("お.background")); // NOI18N
        え.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        え.setForeground(resourceMap.getColor("お.foreground")); // NOI18N
        え.setText(resourceMap.getString("え.text")); // NOI18N
        え.setActionCommand(resourceMap.getString("え.actionCommand")); // NOI18N
        え.setName("え"); // NOI18N
        え.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        う.setBackground(resourceMap.getColor("お.background")); // NOI18N
        う.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        う.setForeground(resourceMap.getColor("お.foreground")); // NOI18N
        う.setText(resourceMap.getString("う.text")); // NOI18N
        う.setActionCommand(resourceMap.getString("う.actionCommand")); // NOI18N
        う.setName("う"); // NOI18N
        う.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        あ.setBackground(resourceMap.getColor("お.background")); // NOI18N
        あ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        あ.setForeground(resourceMap.getColor("お.foreground")); // NOI18N
        あ.setText(resourceMap.getString("あ.text")); // NOI18N
        あ.setActionCommand(resourceMap.getString("あ.actionCommand")); // NOI18N
        あ.setName("あ"); // NOI18N
        あ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ふ.setBackground(resourceMap.getColor("へ.background")); // NOI18N
        ふ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        ふ.setForeground(resourceMap.getColor("へ.foreground")); // NOI18N
        ふ.setText(resourceMap.getString("ふ.text")); // NOI18N
        ふ.setActionCommand(resourceMap.getString("ふ.actionCommand")); // NOI18N
        ふ.setName("ふ"); // NOI18N
        ふ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        へ.setBackground(resourceMap.getColor("へ.background")); // NOI18N
        へ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        へ.setForeground(resourceMap.getColor("へ.foreground")); // NOI18N
        へ.setText(resourceMap.getString("へ.text")); // NOI18N
        へ.setActionCommand(resourceMap.getString("へ.actionCommand")); // NOI18N
        へ.setName("へ"); // NOI18N
        へ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ほ.setBackground(resourceMap.getColor("へ.background")); // NOI18N
        ほ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        ほ.setForeground(resourceMap.getColor("へ.foreground")); // NOI18N
        ほ.setText(resourceMap.getString("ほ.text")); // NOI18N
        ほ.setActionCommand(resourceMap.getString("ほ.actionCommand")); // NOI18N
        ほ.setName("ほ"); // NOI18N
        ほ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        わ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        わ.setText(resourceMap.getString("わ.text")); // NOI18N
        わ.setActionCommand(resourceMap.getString("わ.actionCommand")); // NOI18N
        わ.setName("わ"); // NOI18N
        わ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        よ.setBackground(resourceMap.getColor("よ.background")); // NOI18N
        よ.setFont(resourceMap.getFont("よ.font")); // NOI18N
        よ.setForeground(resourceMap.getColor("よ.foreground")); // NOI18N
        よ.setText(resourceMap.getString("よ.text")); // NOI18N
        よ.setActionCommand(resourceMap.getString("よ.actionCommand")); // NOI18N
        よ.setName("よ"); // NOI18N
        よ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ゆ.setBackground(resourceMap.getColor("よ.background")); // NOI18N
        ゆ.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        ゆ.setForeground(resourceMap.getColor("よ.foreground")); // NOI18N
        ゆ.setText(resourceMap.getString("ゆ.text")); // NOI18N
        ゆ.setActionCommand(resourceMap.getString("ゆ.actionCommand")); // NOI18N
        ゆ.setName("ゆ"); // NOI18N
        ゆ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        backspace.setFont(resourceMap.getFont("backspace.font")); // NOI18N
        backspace.setText(resourceMap.getString("backspace.text")); // NOI18N
        backspace.setActionCommand(resourceMap.getString("backspace.actionCommand")); // NOI18N
        backspace.setName("backspace"); // NOI18N
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        javax.swing.GroupLayout l1Layout = new javax.swing.GroupLayout(l1);
        l1.setLayout(l1Layout);
        l1Layout.setHorizontalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l1Layout.createSequentialGroup()
                .addComponent(ろ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ぬ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ふ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(あ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(う)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(え)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(お)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(や)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ゆ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(よ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(わ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ほ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(へ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        l1Layout.setVerticalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ぬ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ふ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(あ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(う, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(え, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(お, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(や, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ゆ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(よ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(わ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ほ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(へ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
            .addComponent(ろ, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        mainPanel.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 900, -1));

        l4.setName("l4"); // NOI18N

        shift1.setText(resourceMap.getString("shift1.text")); // NOI18N
        shift1.setName("shift1"); // NOI18N
        shift1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        つ.setBackground(resourceMap.getColor("つ.background")); // NOI18N
        つ.setForeground(resourceMap.getColor("つ.foreground")); // NOI18N
        つ.setText(resourceMap.getString("つ.text")); // NOI18N
        つ.setActionCommand(resourceMap.getString("つ.actionCommand")); // NOI18N
        つ.setName("つ"); // NOI18N
        つ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        さ.setBackground(resourceMap.getColor("し.background")); // NOI18N
        さ.setForeground(resourceMap.getColor("し.foreground")); // NOI18N
        さ.setText(resourceMap.getString("さ.text")); // NOI18N
        さ.setActionCommand(resourceMap.getString("さ.actionCommand")); // NOI18N
        さ.setName("さ"); // NOI18N
        さ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        そ.setBackground(resourceMap.getColor("し.background")); // NOI18N
        そ.setFont(resourceMap.getFont("そ.font")); // NOI18N
        そ.setForeground(resourceMap.getColor("し.foreground")); // NOI18N
        そ.setText(resourceMap.getString("そ.text")); // NOI18N
        そ.setActionCommand(resourceMap.getString("そ.actionCommand")); // NOI18N
        そ.setName("そ"); // NOI18N
        そ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ひ.setBackground(resourceMap.getColor("へ.background")); // NOI18N
        ひ.setForeground(resourceMap.getColor("へ.foreground")); // NOI18N
        ひ.setText(resourceMap.getString("ひ.text")); // NOI18N
        ひ.setActionCommand(resourceMap.getString("ひ.actionCommand")); // NOI18N
        ひ.setName("ひ"); // NOI18N
        ひ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        こ.setBackground(resourceMap.getColor("こ.background")); // NOI18N
        こ.setForeground(resourceMap.getColor("こ.foreground")); // NOI18N
        こ.setText(resourceMap.getString("こ.text")); // NOI18N
        こ.setActionCommand(resourceMap.getString("こ.actionCommand")); // NOI18N
        こ.setName("こ"); // NOI18N
        こ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        み.setBackground(resourceMap.getColor("ま.background")); // NOI18N
        み.setForeground(resourceMap.getColor("ま.foreground")); // NOI18N
        み.setText(resourceMap.getString("み.text")); // NOI18N
        み.setActionCommand(resourceMap.getString("み.actionCommand")); // NOI18N
        み.setName("み"); // NOI18N
        み.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        も.setBackground(resourceMap.getColor("ま.background")); // NOI18N
        も.setForeground(resourceMap.getColor("ま.foreground")); // NOI18N
        も.setText(resourceMap.getString("も.text")); // NOI18N
        も.setActionCommand(resourceMap.getString("も.actionCommand")); // NOI18N
        も.setName("も"); // NOI18N
        も.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ね.setBackground(resourceMap.getColor("な.background")); // NOI18N
        ね.setForeground(resourceMap.getColor("な.foreground")); // NOI18N
        ね.setText(resourceMap.getString("ね.text")); // NOI18N
        ね.setActionCommand(resourceMap.getString("ね.actionCommand")); // NOI18N
        ね.setName("ね"); // NOI18N
        ね.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        る.setBackground(resourceMap.getColor("り.background")); // NOI18N
        る.setText(resourceMap.getString("る.text")); // NOI18N
        る.setActionCommand(resourceMap.getString("る.actionCommand")); // NOI18N
        る.setName("る"); // NOI18N
        る.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        め.setBackground(resourceMap.getColor("ま.background")); // NOI18N
        め.setForeground(resourceMap.getColor("ま.foreground")); // NOI18N
        め.setText(resourceMap.getString("め.text")); // NOI18N
        め.setActionCommand(resourceMap.getString("め.actionCommand")); // NOI18N
        め.setName("め"); // NOI18N
        め.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        shift2.setText(resourceMap.getString("shift2.text")); // NOI18N
        shift2.setName("shift2"); // NOI18N
        shift2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        javax.swing.GroupLayout l4Layout = new javax.swing.GroupLayout(l4);
        l4.setLayout(l4Layout);
        l4Layout.setHorizontalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l4Layout.createSequentialGroup()
                .addComponent(shift1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(つ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(さ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(そ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ひ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(こ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(み)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(も)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ね)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(る)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(め, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shift2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );
        l4Layout.setVerticalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(shift1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(め, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(る, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ね, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(つ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(さ, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addComponent(そ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(ひ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(こ, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(み, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(も, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(shift2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        mainPanel.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 900, -1));

        l5.setName("l5"); // NOI18N

        ctrl1.setText(resourceMap.getString("ctrl1.text")); // NOI18N
        ctrl1.setActionCommand(resourceMap.getString("ctrl1.actionCommand")); // NOI18N
        ctrl1.setName("ctrl1"); // NOI18N
        ctrl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        win.setText(resourceMap.getString("win.text")); // NOI18N
        win.setActionCommand(resourceMap.getString("win.actionCommand")); // NOI18N
        win.setName("win"); // NOI18N
        win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        alt1.setText(resourceMap.getString("alt1.text")); // NOI18N
        alt1.setActionCommand(resourceMap.getString("alt1.actionCommand")); // NOI18N
        alt1.setName("alt1"); // NOI18N
        alt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        space.setText(resourceMap.getString("space.text")); // NOI18N
        space.setActionCommand(resourceMap.getString("space.actionCommand")); // NOI18N
        space.setName("space"); // NOI18N
        space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        alt2.setText(resourceMap.getString("alt2.text")); // NOI18N
        alt2.setActionCommand(resourceMap.getString("alt2.actionCommand")); // NOI18N
        alt2.setName("alt2"); // NOI18N
        alt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        appl.setText(resourceMap.getString("appl.text")); // NOI18N
        appl.setActionCommand(resourceMap.getString("appl.actionCommand")); // NOI18N
        appl.setBorder(null);
        appl.setName("appl"); // NOI18N
        appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        ctrl2.setFont(resourceMap.getFont("ctrl2.font")); // NOI18N
        ctrl2.setText(resourceMap.getString("ctrl2.text")); // NOI18N
        ctrl2.setActionCommand(resourceMap.getString("ctrl2.actionCommand")); // NOI18N
        ctrl2.setBorder(null);
        ctrl2.setName("ctrl2"); // NOI18N
        ctrl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPressAction(evt);
            }
        });

        javax.swing.GroupLayout l5Layout = new javax.swing.GroupLayout(l5);
        l5.setLayout(l5Layout);
        l5Layout.setHorizontalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(l5Layout.createSequentialGroup()
                .addComponent(ctrl1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(win)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(space, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appl, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ctrl2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        l5Layout.setVerticalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ctrl1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(win, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(alt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(space, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(alt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(appl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(ctrl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainPanel.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 900, -1));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        textArea.setColumns(20);
        textArea.setFont(resourceMap.getFont("textArea.font")); // NOI18N
        textArea.setRows(1);
        textArea.setName("textArea"); // NOI18N
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Osk.this.keyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 50));

        text.setFont(resourceMap.getFont("text.font")); // NOI18N
        text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text.setName("text"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(811, Short.MAX_VALUE)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-957)/2, (screenSize.height-421)/2, 957, 421);
    }// </editor-fold>//GEN-END:initComponents
    //Click the button
    private void keyPressAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyPressAction
        String tmp = evt.getActionCommand();
        text.setText(tmp);
        textArea.append(tmp);
    }//GEN-LAST:event_keyPressAction
    //Key pressed from outside
    private void extensionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extensionKeyPressed
        String tmp = String.valueOf(evt.getKeyChar());
        text.setText(tmp);
        textArea.append(tmp);
    }//GEN-LAST:event_extensionKeyPressed
    //按下按钮
    private void keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressed
        String key = String.valueOf(evt.getKeyChar());
        String tmp = null;
        //如果键盘输入的ASCII字符能在key_map中找到，则追加到文本框中
//        if (key_map.containsKey(key)) {
//            tmp = tmp.substring(0, tmp.length() - 2);
//            textArea.setText(tmp);
//            textArea.append(key_map.get(key) + "");
//        }
        text.setText(key_map.containsKey(key) + "");
//        text.setText(tmp);
    }//GEN-LAST:event_keyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Osk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Osk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Osk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Osk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Osk().setVisible(true);
            }
        });
    }
    private HashMap key_map;    //假名和键值的映射
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alt1;
    private javax.swing.JButton alt2;
    private javax.swing.JButton appl;
    private javax.swing.JButton backspace;
    private javax.swing.JButton caps;
    private javax.swing.JButton circle;
    private javax.swing.JButton ctrl1;
    private javax.swing.JButton ctrl2;
    private javax.swing.JButton enter;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l3;
    private javax.swing.JPanel l4;
    private javax.swing.JPanel l5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton point;
    private javax.swing.JButton shift1;
    private javax.swing.JButton shift2;
    private javax.swing.JButton space;
    private javax.swing.JButton tab;
    private javax.swing.JTextField text;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton win;
    private javax.swing.JButton あ;
    private javax.swing.JButton い;
    private javax.swing.JButton う;
    private javax.swing.JButton え;
    private javax.swing.JButton お;
    private javax.swing.JButton か;
    private javax.swing.JButton き;
    private javax.swing.JButton く;
    private javax.swing.JButton け;
    private javax.swing.JButton こ;
    private javax.swing.JButton さ;
    private javax.swing.JButton し;
    private javax.swing.JButton す;
    private javax.swing.JButton せ;
    private javax.swing.JButton そ;
    private javax.swing.JButton た;
    private javax.swing.JButton ち;
    private javax.swing.JButton つ;
    private javax.swing.JButton て;
    private javax.swing.JButton と;
    private javax.swing.JButton な;
    private javax.swing.JButton に;
    private javax.swing.JButton ぬ;
    private javax.swing.JButton ね;
    private javax.swing.JButton の;
    private javax.swing.JButton は;
    private javax.swing.JButton ひ;
    private javax.swing.JButton ふ;
    private javax.swing.JButton へ;
    private javax.swing.JButton ほ;
    private javax.swing.JButton ま;
    private javax.swing.JButton み;
    private javax.swing.JButton む;
    private javax.swing.JButton め;
    private javax.swing.JButton も;
    private javax.swing.JButton や;
    private javax.swing.JButton ゆ;
    private javax.swing.JButton よ;
    private javax.swing.JButton ら;
    private javax.swing.JButton り;
    private javax.swing.JButton る;
    private javax.swing.JButton れ;
    private javax.swing.JButton ろ;
    private javax.swing.JButton わ;
    private javax.swing.JButton ん;
    // End of variables declaration//GEN-END:variables
}
