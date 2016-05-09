
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        thickness = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        result = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        resistivity = new javax.swing.JTextField();
        lenght = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        resistance = new javax.swing.JLabel();
        JBminus = new javax.swing.JButton();
        jBplus = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cable Calculator");
        setBackground(new java.awt.Color(192, 192, 192));
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(355, 440));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thickness.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        thickness.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        thickness.setText("0,");
        thickness.setToolTipText("Enter thicknes of one small wire");
        thickness.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        thickness.setSelectionColor(java.awt.Color.black);
        thickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thicknessActionPerformed(evt);
            }
        });
        thickness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thicknessKeyPressed(evt);
            }
        });
        getContentPane().add(thickness, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 60, -1));

        calculate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        calculate.setForeground(new java.awt.Color(0, 0, 255));
        calculate.setText("Count");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 155, -1, 50));

        jLabel5.setFont(null);
        jLabel5.setForeground(null);
        jLabel5.setText(null);
        JLabel jLabel5 = new JLabel("<html>Resistivity<br>of pure copper</html>");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("mm");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        quantity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantity.setText("48");
        quantity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quantity.setSelectionColor(new java.awt.Color(0, 0, 0));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 60, -1));

        result.setFont(new java.awt.Font("Times New Roman", 1, 32));
        result.setForeground(new java.awt.Color(0, 0, 255));
        result.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 8));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Temperature");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, 20));

        resistivity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        resistivity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resistivity.setText("1,68");
        resistivity.setMinimumSize(new java.awt.Dimension(4, 32));
        resistivity.setPreferredSize(new java.awt.Dimension(49, 20));
        resistivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistivityActionPerformed(evt);
            }
        });
        getContentPane().add(resistivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 60, 35));

        lenght.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lenght.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lenght.setText("1,00");
        lenght.setMinimumSize(new java.awt.Dimension(4, 32));
        lenght.setPreferredSize(new java.awt.Dimension(49, 20));
        lenght.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenghtActionPerformed(evt);
            }
        });
        getContentPane().add(lenght, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, 35));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Resistance");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 20));

        jLabel13.setFont(null);
        jLabel13.setText("<html>·10<sup>-8</sup> m·Ω</html>");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 130, 34));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("°C");
        jLabel14.setPreferredSize(new java.awt.Dimension(17, 28));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 30, 34));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Quantity of wires");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 110, 20));

        jLabel10.setFont(null);
        jLabel10.setForeground(null);
        jLabel10.setText(null);
        JLabel jLabel10 = new JLabel("<html>Cross-sectional<br>area of cable</html>");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 140, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Lenght of wire");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 20));

        temperature.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        temperature.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        temperature.setText("20.0");
        temperature.setMinimumSize(new java.awt.Dimension(4, 32));
        temperature.setPreferredSize(new java.awt.Dimension(49, 20));
        temperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureActionPerformed(evt);
            }
        });
        temperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                temperatureKeyPressed(evt);
            }
        });
        getContentPane().add(temperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 60, 35));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("m");
        jLabel15.setPreferredSize(new java.awt.Dimension(17, 28));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 30, 34));

        jLabel16.setFont(null);
        jLabel16.setForeground(null);
        jLabel16.setText(null);
        JLabel jLabel16 = new JLabel("<html>Thickness of<br>one wire</html>");
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        resistance.setFont(new java.awt.Font("Times New Roman", 1, 32));
        resistance.setForeground(new java.awt.Color(0, 0, 255));
        resistance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(resistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 40));

        JBminus.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        JBminus.setText("-");
        JBminus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBminusMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JBminusMousePressed(evt);
            }
        });
        JBminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBminusActionPerformed(evt);
            }
        });
        getContentPane().add(JBminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 329, 38, 14));

        jBplus.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jBplus.setText("+");
        jBplus.setMinimumSize(new java.awt.Dimension(5, 3));
        jBplus.setPreferredSize(new java.awt.Dimension(35, 15));
        jBplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBplusMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBplusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jBplusMouseReleased(evt);
            }
        });
        jBplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBplusActionPerformed(evt);
            }
        });
        getContentPane().add(jBplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 312, 38, 14));

        getAccessibleContext().setAccessibleDescription("Cable Calculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thicknessActionPerformed
    }//GEN-LAST:event_thicknessActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        
        String diameter = thickness.getText();
        diameter=diameter.replace(',', '.');        
        
        String qty = quantity.getText();
        
        Double res = Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter) * Double.parseDouble(qty) /4;
        double res1=Math.round(res*1000);
	res1/=1000;
        
        String rho = resistivity.getText();
        rho=rho.replace(',', '.');
        
        String dlugosc = lenght.getText();
        dlugosc=dlugosc.replace(',', '.');
        
        Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
        String temp = temperature.getText();
        double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
        double resis1=Math.round(resis2*100);
	resis1/=100;
        
        try {
          result.setText(String.valueOf(engine.eval(Double.toString(res1)))+" mm\u00B2");
          resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
          
        } catch (ScriptException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void thicknessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thicknessKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyChar())
        {
            case '\n':
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            String diameter = thickness.getText();
            diameter=diameter.replace(',', '.');        

            String qty = quantity.getText();

            Double res = Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter) * Double.parseDouble(qty) /4;
            double res1=Math.round(res*1000);
            res1/=1000;
            
            String rho = resistivity.getText();
            rho=rho.replace(',', '.');
        
            String dlugosc = lenght.getText();
            dlugosc=dlugosc.replace(',', '.');
        
            Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
            String temp = temperature.getText();
            double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
            double resis1=Math.round(resis2*100);
            resis1/=100;
        
            try {
              result.setText(String.valueOf(engine.eval(Double.toString(res1)))+" mm\u00B2");
              resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
            } catch (ScriptException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
        }
    }//GEN-LAST:event_thicknessKeyPressed

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyChar())
        {
            case '\n':
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            String diameter = thickness.getText();
            diameter=diameter.replace(',', '.');        

            String qty = quantity.getText();

            Double res = Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter) * Double.parseDouble(qty) /4;
            double res1=Math.round(res*1000);
            res1/=1000;
            
            String rho = resistivity.getText();
            rho=rho.replace(',', '.');
        
            String dlugosc = lenght.getText();
            dlugosc=dlugosc.replace(',', '.');
        
            Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
            String temp = temperature.getText();
            double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
            double resis1=Math.round(resis2*100);
            resis1/=100;
        
            try {
              result.setText(String.valueOf(engine.eval(Double.toString(res1)))+" mm\u00B2");
              resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
            } catch (ScriptException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
        }
    }//GEN-LAST:event_quantityKeyPressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void resistivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resistivityActionPerformed

    private void temperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureActionPerformed

    private void lenghtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenghtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenghtActionPerformed

    private void temperatureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperatureKeyPressed
        switch (evt.getKeyChar())
        {
            case '\n':
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            String diameter = thickness.getText();
            diameter=diameter.replace(',', '.');        
                     
            String rho = resistivity.getText();
            rho=rho.replace(',', '.');
        
            String dlugosc = lenght.getText();
            dlugosc=dlugosc.replace(',', '.');
        
            Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
            String temp = temperature.getText();
            double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
            double resis1=Math.round(resis2*100);
            resis1/=100;
        
            try {
              resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
            } catch (ScriptException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;
        }
    }//GEN-LAST:event_temperatureKeyPressed

    private void JBminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBminusActionPerformed

    private void JBminusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBminusMouseEntered
        
    }//GEN-LAST:event_JBminusMouseEntered

    private void JBminusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBminusMousePressed
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        
            String temp = temperature.getText();
            double temp1 = Double.parseDouble(temp);
        
            String diameter = thickness.getText();
            diameter=diameter.replace(',', '.');        
                     
            String rho = resistivity.getText();
            rho=rho.replace(',', '.');
        
            String dlugosc = lenght.getText();
            dlugosc=dlugosc.replace(',', '.');
        
            Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
            double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
            double resis1=Math.round(resis2*100);
            resis1/=100;
        
        
        try {
              temperature.setText(String.valueOf(engine.eval(Double.toString(temp1-1))));
              resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
            
        } catch (ScriptException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_JBminusMousePressed

    private void jBplusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBplusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBplusMouseEntered

 
     
    private void jBplusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBplusMousePressed
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        String path = "C:\\A.jpg";
        File file = new File(path);
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(600,200);
        f.setVisible(true);
            //process = new ProcessBuilder("mspaint","A.jpg").start();
            String temp = temperature.getText();
            double temp1 = Double.parseDouble(temp);
        
            String diameter = thickness.getText();
            diameter=diameter.replace(',', '.');        
                     
            String rho = resistivity.getText();
            rho=rho.replace(',', '.');
        
            String dlugosc = lenght.getText();
            dlugosc=dlugosc.replace(',', '.');
        
            Double resis = 4 * Double.parseDouble(rho)*Double.parseDouble(dlugosc)/ (Math.PI * Double.parseDouble(diameter) * Double.parseDouble(diameter)*100);
        
            double resis2 = resis + 0.0043 * resis * (Double.parseDouble(temp)-20);
            double resis1=Math.round(resis2*100);
            resis1/=100;
        
        
        try {
              temperature.setText(String.valueOf(engine.eval(Double.toString(temp1+1))));
              resistance.setText(String.valueOf(engine.eval(Double.toString(resis1)))+" Ω");
            
        } catch (ScriptException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBplusMousePressed

    private void jBplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBplusActionPerformed

    private void jBplusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBplusMouseReleased
        
    }//GEN-LAST:event_jBplusMouseReleased

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBminus;
    private javax.swing.JButton calculate;
    private javax.swing.JButton jBplus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lenght;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel resistance;
    private javax.swing.JTextField resistivity;
    private javax.swing.JLabel result;
    private javax.swing.JTextField temperature;
    private javax.swing.JTextField thickness;
    // End of variables declaration//GEN-END:variables
}
