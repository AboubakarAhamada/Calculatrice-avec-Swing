/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboubakar
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame implements ActionListener {

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
        setTitle("MyLittle_Calculator");
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bVirgule.addActionListener(this);
        bAddition.addActionListener(this);
        bSoustraction.addActionListener(this);
        bDivision.addActionListener(this);
        bMultiplication.addActionListener(this);
        bEgal.addActionListener(this);
        bReset.addActionListener(this);
        bClear.addActionListener(this);
        bParenth1.addActionListener(this);
        bParenth2.addActionListener(this);
        bracine.addActionListener(this);
        bcarre.addActionListener(this);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ev){
      
        /*
         * 
      String touche=ev.getActionCommand();
      String str=zoneAffichage.getText();
      zoneAffichage.setText(str+touche);
       *
       */
      
        Object source=ev.getSource();
       
        String str=zoneAffichage.getText();
        
        if(source==bReset)    zoneAffichage.setText("");
        
        if(source==bClear){
             str=zoneAffichage.getText();
             str=str.substring(0,str.length()-1);
             zoneAffichage.setText(str);          
        }    
        
        if(source==b0) zoneAffichage.setText(str+"0");
        if(source==b1) zoneAffichage.setText(str+"1");
        if(source==b2) zoneAffichage.setText(str+"2");
        if(source==b3) zoneAffichage.setText(str+"3");
        if(source==b4) zoneAffichage.setText(str+"4");
        if(source==b5) zoneAffichage.setText(str+"5");
        if(source==b6) zoneAffichage.setText(str+"6");
        if(source==b7) zoneAffichage.setText(str+"7");
        if(source==b8) zoneAffichage.setText(str+"8");
        if(source==b9) zoneAffichage.setText(str+"9"); 
        if(source==bVirgule) zoneAffichage.setText(str+".");
        if(source==bAddition) zoneAffichage.setText(str+"+");   
        if(source==bSoustraction) zoneAffichage.setText(str+"-");
        if(source==bMultiplication) zoneAffichage.setText(str+"*");
        if(source==bDivision) zoneAffichage.setText(str+"/");
        
        if(source==bParenth1) zoneAffichage.setText("("+str);
        if(source==bParenth2) zoneAffichage.setText(str+")");
        
        //if(source==bcarre)    zoneAffichage.setText(str+"²");
        //if(source==bracine)   zoneAffichage.setText("V"+str);

        if(source==bEgal){
            calcul();
        }
         
             
    }
     
    /*** méthode pour faire le calcul ***/
    
    void calcul(){
        String ch=zoneAffichage.getText();
        String str1="",str2="";
        double nombre1,nombre2;
        int pPlus=ch.indexOf('+');
        int pMoins=ch.indexOf('-');
        int pFoix=ch.indexOf('*');
        int pDiv=ch.indexOf('/');
        
    
       try{
           
       
        if(pPlus!=-1){
            
            str1=ch.substring(0,pPlus);
                
            str2=ch.substring(pPlus+1,ch.length());
            
            nombre1=Double.parseDouble(str1+"");
            nombre2=Double.parseDouble(str2+"");
            nombre=nombre1+nombre2;
            zoneAffichage.setText(nombre+"");     
        }
           else if(pMoins!=-1){
            str1=ch.substring(0,pMoins);
            str2=ch.substring(pMoins+1,ch.length());
            nombre1=Double.parseDouble(str1+"");
            nombre2=Double.parseDouble(str2+"");
            nombre=nombre1-nombre2;
            zoneAffichage.setText(nombre+"");          
        }
           else if(pFoix!=-1){
           
            str1=ch.substring(0,pFoix);
            str2=ch.substring(pFoix+1,ch.length());
            nombre1=Double.parseDouble(str1+"");
            nombre2=Double.parseDouble(str2+"");
            
            nombre=nombre1*nombre2;
            zoneAffichage.setText(nombre+"");    
        }
        
        else if(pDiv!=-1){
            
            
            str1=ch.substring(0,pDiv);
            str2=ch.substring(pDiv+1,ch.length());
            nombre1=Double.parseDouble(str1+"");
            nombre2=Double.parseDouble(str2+"");
            nombre=nombre1/nombre2;
            zoneAffichage.setText(nombre+"");    
       
        }
        
        
        
       }
       catch(ArithmeticException e){
        zoneAffichage.setText("Syntaxe error !");     
       }
      
    }// end calcul()
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        paneDesktop = new javax.swing.JDesktopPane();
        b2 = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        bMultiplication = new javax.swing.JButton();
        bParenth1 = new javax.swing.JButton();
        bParenth2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        bAddition = new javax.swing.JButton();
        bcarre = new javax.swing.JButton();
        bracine = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bVirgule = new javax.swing.JButton();
        bPourcentage = new javax.swing.JButton();
        bSoustraction = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bEgal = new javax.swing.JButton();
        zoneAffichage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b2.setText("2");
        b2.setBounds(100, 110, 50, 30);
        paneDesktop.add(b2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bDivision.setText("/");
        bDivision.setBounds(150, 110, 50, 30);
        paneDesktop.add(bDivision, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bClear.setText("clear");
        bClear.setBounds(200, 110, 50, 30);
        paneDesktop.add(bClear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bReset.setText("reset");
        bReset.setBounds(250, 110, 50, 30);
        paneDesktop.add(bReset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b3.setText("3");
        b3.setBounds(0, 140, 50, 30);
        paneDesktop.add(b3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b4.setText("4");
        b4.setBounds(50, 140, 50, 30);
        paneDesktop.add(b4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b5.setText("5");
        b5.setBounds(100, 140, 50, 30);
        paneDesktop.add(b5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bMultiplication.setText("x");
        bMultiplication.setBounds(150, 140, 50, 30);
        paneDesktop.add(bMultiplication, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bParenth1.setText("(");
        bParenth1.setBounds(200, 140, 50, 30);
        paneDesktop.add(bParenth1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bParenth2.setText(")");
        bParenth2.setBounds(250, 140, 50, 30);
        paneDesktop.add(bParenth2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b6.setText("6");
        b6.setBounds(0, 170, 50, 30);
        paneDesktop.add(b6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b7.setText("7");
        b7.setBounds(50, 170, 50, 30);
        paneDesktop.add(b7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b8.setText("8");
        b8.setBounds(100, 170, 50, 30);
        paneDesktop.add(b8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bAddition.setText("+");
        bAddition.setBounds(150, 170, 50, 30);
        paneDesktop.add(bAddition, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bcarre.setText("x²");
        bcarre.setBounds(200, 170, 50, 30);
        paneDesktop.add(bcarre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bracine.setText("√");
        bracine.setBounds(250, 170, 50, 30);
        paneDesktop.add(bracine, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b9.setText("9");
        b9.setBounds(0, 200, 50, 30);
        paneDesktop.add(b9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bVirgule.setText(",");
        bVirgule.setBounds(50, 200, 50, 30);
        paneDesktop.add(bVirgule, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bPourcentage.setText("%");
        bPourcentage.setBounds(100, 200, 50, 30);
        paneDesktop.add(bPourcentage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bSoustraction.setText("-");
        bSoustraction.setBounds(150, 200, 50, 30);
        paneDesktop.add(bSoustraction, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b1.setText("1");
        b1.setBounds(50, 110, 50, 30);
        paneDesktop.add(b1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b0.setText("0");
        b0.setBounds(0, 110, 50, 30);
        paneDesktop.add(b0, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bEgal.setText("=");
        bEgal.setBounds(200, 200, 100, 30);
        paneDesktop.add(bEgal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        zoneAffichage.setBounds(6, 10, 290, 50);
        paneDesktop.add(zoneAffichage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Uniquement  pour les calculs de 2 chiffres !");
        jLabel1.setBounds(10, 68, 280, 30);
        paneDesktop.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }
    
    double nombre;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bAddition;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bEgal;
    private javax.swing.JButton bMultiplication;
    private javax.swing.JButton bParenth1;
    private javax.swing.JButton bParenth2;
    private javax.swing.JButton bPourcentage;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSoustraction;
    private javax.swing.JButton bVirgule;
    private javax.swing.JButton bcarre;
    private javax.swing.JButton bracine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane paneDesktop;
    private javax.swing.JTextField zoneAffichage;
    // End of variables declaration//GEN-END:variables
}
