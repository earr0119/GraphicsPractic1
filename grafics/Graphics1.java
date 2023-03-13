package grafics;

import java.awt.Color;
import java.awt.Graphics;

public class Graphics1 extends javax.swing.JFrame {

    public Graphics1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    boolean flag = false; 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLtitle = new javax.swing.JLabel();
        jLred = new javax.swing.JLabel();
        jLgreen = new javax.swing.JLabel();
        jLblue = new javax.swing.JLabel();
        txt_red = new javax.swing.JTextField();
        txt_green = new javax.swing.JTextField();
        txt_blue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLtitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLtitle.setForeground(new java.awt.Color(51, 51, 51));
        jLtitle.setText("Favorite Color");

        jLred.setText("Red:");

        jLgreen.setText("Green:");

        jLblue.setText("Blue");

        txt_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_redActionPerformed(evt);
            }
        });

        jButton1.setText("Draw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLred, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_red)
                    .addComponent(txt_green)
                    .addComponent(txt_blue, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLred)
                    .addComponent(txt_red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgreen)
                    .addComponent(txt_green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblue)
                    .addComponent(txt_blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_redActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_redActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        flag = true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphics1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblue;
    private javax.swing.JLabel jLgreen;
    private javax.swing.JLabel jLred;
    private javax.swing.JLabel jLtitle;
    private javax.swing.JTextField txt_blue;
    private javax.swing.JTextField txt_green;
    private javax.swing.JTextField txt_red;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g){
        super.paint(g);
        if (flag == true){
            
            String string_red = txt_red.getText();
            String string_green = txt_green.getText();
            String string_blue = txt_blue.getText();
            
            int int_red = Integer.parseInt(string_red);
            int int_green = Integer.parseInt(string_green);
            int int_blue = Integer.parseInt(string_blue);
            
            int total = int_red + int_green + int_blue;
            
            int red_grad = int_red * 360 / total;
            int green_grad = int_green * 360 / total;
            int blue_grad = int_blue * 360 / total;
            
            g.setColor(new Color(155, 0, 0));
            g.fillArc(25, 80, 200, 200, 0, red_grad);
            g.fillRect(250, 120, 20, 20);
            g.drawString("Red Color", 275, 135);
            
            g.setColor(new Color(0, 95, 0));
            g.fillArc(25, 80, 200, 200, red_grad, green_grad);
            g.fillRect(250, 150, 20, 20);
            g.drawString("Green Color", 275, 165);
            
            g.setColor(new Color(0, 0, 60));
            g.fillArc(25, 80, 200, 200, red_grad + green_grad, blue_grad);
            g.fillRect(250, 180, 20, 20);
            g.drawString("Blue Color", 275, 195);
        }
    }

}
