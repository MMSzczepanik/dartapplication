/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

/**
 *
 * @author Yogi
 */
public class MatchPanel extends javax.swing.JPanel {

    /**
     * Creates new form MatchPanel
     * @param posX - pozycja x dla panelu 
     * @param posY - pozycja y dla panelu
     */
    public MatchPanel(){
        initComponents();
    }
    
    public MatchPanel(int posX, int posY, Match match) {
        initComponents();
        this.match = match;
        
        MatchIdLabel.setText("Mecz: " + match.getId_match());
        Player1Label.setText(match.getPlayer1().toString());
        Player2Label.setText(match.getPlayer2().toString());
        
        this.setLocation(posX, posY);
        this.setSize(sizeX,sizeY);
        this.setVisible(true);
       // this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        MatchIdLabel = new javax.swing.JLabel();
        Player2Label = new javax.swing.JLabel();
        Player1Label = new javax.swing.JLabel();
        Player1Legs = new javax.swing.JTextField();
        Player2Text = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        MatchIdLabel.setText("Metch ID");

        Player2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player2Label.setText("Zawodnik 2");
        Player2Label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Player1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player1Label.setText("Zawodnik 1");
        Player1Label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(MatchIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player2Text))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player1Legs)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MatchIdLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1Legs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    private Match match;
    private int sizeX = 301;
    private int sizeY = 150;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MatchIdLabel;
    private javax.swing.JLabel Player1Label;
    private javax.swing.JTextField Player1Legs;
    private javax.swing.JLabel Player2Label;
    private javax.swing.JTextField Player2Text;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
