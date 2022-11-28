
package projekat1s.filozofi;
import java.awt.Color;
import java.io.*;
import static java.lang.Thread.*;
import java.util.concurrent.*;
import javax.swing.ImageIcon;


public class FilozofiGDI extends javax.swing.JFrame {

public static class Filozofi extends Thread{
int id;
int firstodd, secondeven;
Semaphore [] fork;
public Filozofi (int i, int n , Semaphore [] fork){
id = i;
this.fork = fork;
if((i % 2) == 1){
firstodd = i;
secondeven = (i + 1) % n;
}
else{
firstodd = (i + 1) % n;
secondeven = i;
}
}
private void think(){
	try {
	sleep((int)(1000));
            switch (id) {
                case 0:
                    System.out.println("Sokrat razmislja...");
                    SokratSemafor.setBackground(Color.red);
                    break;
                case 1:
                    System.out.println("Volter razmislja");
                    VolterSemafor.setBackground(Color.red);
                    break;
                case 2:
                    System.out.println("Heraklit razmislja");
                    HeraklitSemafor.setBackground(Color.red);
                    break;
                case 3:
                    System.out.println("Nice razmislja");
                    NiceSemafor.setBackground(Color.red);
                    break;
                case 4:
                    System.out.println("Hegel razmislja");
                    HegelSemafor.setBackground(Color.red);
                    break;
                default:
                    break;
            }
	} 
        catch (InterruptedException e) 
        {
        System.out.println("Greska kod think");
        }
	}
	private void eat(){
	try {
	sleep((int)(1000));
            switch (id) {
                case 0:
                    System.out.println("Sokrat jede");
                    SokratSemafor.setBackground(Color.green);
                    break;
                case 1:
                    System.out.println("Volter jede");
                    VolterSemafor.setBackground(Color.green);
                    break;
                case 2:
                    System.out.println("Heraklit jede");
                    HeraklitSemafor.setBackground(Color.green);
                    break;
                case 3:
                    System.out.println("Nice jede");
                    NiceSemafor.setBackground(Color.green);
                    break;
                case 4:
                    System.out.println("Hegel jede");
                    HegelSemafor.setBackground(Color.green);
                    break;
                default:
                    break;
            }
	} catch (InterruptedException e) 
        {
            System.out.println("Greska kod eat");
        }
	}
	public void run(){
	while(true){
        try{
        think();
	fork[firstodd].acquire();
	fork[secondeven].acquire();
	eat();
	fork[secondeven].release();
	fork[firstodd].release();
        }
        catch(InterruptedException e)
        {
        }
	}
	}
}
    public int radi=0;
    public static final int N = 5;
    
    public FilozofiGDI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sokrat = new javax.swing.JLabel();
        Volter = new javax.swing.JLabel();
        Heraklit = new javax.swing.JLabel();
        Hegel = new javax.swing.JLabel();
        Nice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SokratSemafor = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        VolterSemafor = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        HeraklitSemafor = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        NiceSemafor = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        HegelSemafor = new javax.swing.JTextPane();
        Dugme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Sokrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Volter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Heraklit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Hegel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        SokratSemafor.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(SokratSemafor);

        jScrollPane2.setBackground(new java.awt.Color(255, 0, 0));

        VolterSemafor.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(VolterSemafor);

        HeraklitSemafor.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane3.setViewportView(HeraklitSemafor);

        NiceSemafor.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane5.setViewportView(NiceSemafor);

        HegelSemafor.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane6.setViewportView(HegelSemafor);

        Dugme.setText("Start");
        Dugme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DugmeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Sokrat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Volter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(Dugme))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Heraklit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Hegel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nice, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hegel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Nice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sokrat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dugme)
                                .addGap(18, 18, 18)
                                .addComponent(Heraklit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Volter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DugmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DugmeMouseClicked
        ImageIcon slSokrat=new ImageIcon("Slike//Sokrat.jpg"),slVolter=new ImageIcon("Slike//Volter.jpg"),
                slHegel=new ImageIcon("Slike//Hegel.jpg"),slHeraklit=new ImageIcon("Slike//Heraklit.jpg"),
                slNice=new ImageIcon("Slike//Nice.jpg");
        Hegel.setIcon(slHegel);
        Heraklit.setIcon(slHeraklit);
        Nice.setIcon(slNice);
        Sokrat.setIcon(slSokrat);
        Volter.setIcon(slVolter);
        int n = N;
        Semaphore [] viljuska = new Semaphore[n];
        Filozofi [] philosopher = new Filozofi[n];
        int i;

        for( i=0; i < n; i++) {philosopher[i] = new Filozofi(i, n , viljuska);}
        for( i=0; i < n; i++) {viljuska[i]=new Semaphore(1);}
        if(radi==0)
        {
        radi=1;
        Dugme.setText("Zaustavi");
        System.out.println("Krece");
            
            philosopher[0].start();
            philosopher[1].start();
            philosopher[2].start();
            philosopher[3].start();
            philosopher[4].start();
        }
        else
        {
            System.out.println("Kraj");
            System.exit(0);
        }
    }//GEN-LAST:event_DugmeMouseClicked

    
    public static void main(String args[]) {
            
            
        
        
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(FilozofiGDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilozofiGDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilozofiGDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilozofiGDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilozofiGDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dugme;
    public static javax.swing.JLabel Hegel;
    public static javax.swing.JTextPane HegelSemafor;
    public static javax.swing.JLabel Heraklit;
    public static javax.swing.JTextPane HeraklitSemafor;
    public static javax.swing.JLabel Nice;
    public static javax.swing.JTextPane NiceSemafor;
    public static javax.swing.JLabel Sokrat;
    public static javax.swing.JTextPane SokratSemafor;
    public static javax.swing.JLabel Volter;
    public static javax.swing.JTextPane VolterSemafor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
