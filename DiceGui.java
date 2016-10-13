
package electronicdice;


public class DiceGui extends javax.swing.JFrame {

    public int rollCount = 0;
    
    public DiceGui() {
        initComponents();
        textFieldRollCount.setText("0");
        textFieldDiceSides.setText("6");
        textFieldRolls.setText("");
        

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        textFieldRolls = new javax.swing.JTextField();
        buttonRoll = new javax.swing.JButton();
        textFieldDiceSides = new javax.swing.JTextField();
        labelDiceSides = new javax.swing.JLabel();
        labelRollCount = new javax.swing.JLabel();
        textFieldRollCount = new javax.swing.JTextField();
        buttonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELECTRONIC DICE");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        textFieldRolls.setBackground(new java.awt.Color(153, 153, 255));
        textFieldRolls.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        textFieldRolls.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonRoll.setBackground(new java.awt.Color(204, 255, 204));
        buttonRoll.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        buttonRoll.setText("Roll");
        buttonRoll.setName(""); // NOI18N
        buttonRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRollActionPerformed(evt);
            }
        });

        textFieldDiceSides.setBackground(new java.awt.Color(153, 153, 255));
        textFieldDiceSides.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelDiceSides.setText("Dice Sides:");

        labelRollCount.setText("Rolls");

        textFieldRollCount.setBackground(new java.awt.Color(153, 153, 255));
        textFieldRollCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonReset.setBackground(new java.awt.Color(255, 204, 204));
        buttonReset.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldRolls)
                    .addComponent(buttonRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiceSides)
                            .addComponent(labelRollCount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRollCount, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(textFieldDiceSides))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldRolls, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDiceSides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiceSides))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRollCount)
                    .addComponent(textFieldRollCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void buttonRollActionPerformed(java.awt.event.ActionEvent evt) {                                           
//ROLL BUTTON      
    
        
       
        int diceSides = Integer.parseInt(textFieldDiceSides.getText());
        if(diceSides < 1){
            
        }
        int roll = (int)(Math.random() * diceSides);
        String rollStr = Integer.toString(roll);
        textFieldRolls.setText(rollStr); 
        rollCount++;
        String rollCountStr = Integer.toString(rollCount);
        textFieldRollCount.setText(rollCountStr); 

    }                                          

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //reset button
        
        textFieldRolls.setText("");
        textFieldDiceSides.setText("6");
        textFieldRollCount.setText("0");        
    }                                           

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGui().setVisible(true);
            }
        });
    
     
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonRoll;
    private javax.swing.JLabel labelDiceSides;
    private javax.swing.JLabel labelRollCount;
    private javax.swing.JTextField textFieldDiceSides;
    private javax.swing.JTextField textFieldRollCount;
    private javax.swing.JTextField textFieldRolls;
    // End of variables declaration                   
}
