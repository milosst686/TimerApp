
package timer.app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Settings extends javax.swing.JFrame {
    
public Integer seconds=0;
public Integer minutes=0;
public Integer hours=0;

String ddSecond,ddMinutes,ddHours;
DecimalFormat df = new DecimalFormat("00");
    
 public Timer t;
 
 Color c;
 
 JFrame frame = new JFrame();
 int sleepTime;
 

  
 
    public Settings() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onTimeButton = new javax.swing.JRadioButton();
        onCountdown = new javax.swing.JRadioButton();
        onCountdownTextArea = new javax.swing.JTextField();
        chooseColoreButton = new javax.swing.JButton();
        coloreSelectedLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        speedCBox = new javax.swing.JComboBox<>();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        onTimeTextArea = new javax.swing.JTextField();
        restartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        onTimeButton.setText("On time");
        onTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTimeButtonActionPerformed(evt);
            }
        });

        onCountdown.setText("Countdown (mins)");
        onCountdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCountdownActionPerformed(evt);
            }
        });

        onCountdownTextArea.setEditable(false);

        chooseColoreButton.setText("Choose colore");
        chooseColoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColoreButtonActionPerformed(evt);
            }
        });

        coloreSelectedLabel.setText("No colore selected");

        speedLabel.setText("Speed: ");

        speedCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        speedCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedCBoxActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Pause");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        onTimeTextArea.setEditable(false);
        onTimeTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTimeTextAreaActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onCountdown)
                            .addComponent(onTimeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(onCountdownTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(onTimeTextArea)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chooseColoreButton)
                        .addGap(30, 30, 30)
                        .addComponent(coloreSelectedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedLabel)
                            .addComponent(speedCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startButton)
                        .addGap(54, 54, 54)
                        .addComponent(stopButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restartButton)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onTimeButton)
                    .addComponent(onTimeTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onCountdown)
                    .addComponent(onCountdownTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseColoreButton)
                    .addComponent(coloreSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(speedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speedCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton)
                    .addComponent(restartButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTimeButtonActionPerformed
        if(onTimeButton.isSelected()){
            onCountdown.setSelected(false);
       onTimeTextArea.setEditable(false);
            if( onTimeTextArea.isEditable())
                onCountdownTextArea.setEditable(false);
        } 
        else
        {
            onTimeTextArea.setEditable(false);
        }
        onCountdownTextArea.setText("");
    }//GEN-LAST:event_onTimeButtonActionPerformed

    private void onCountdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCountdownActionPerformed
        if(onCountdown.isSelected()){
            onTimeButton.setSelected(false);
            onCountdownTextArea.setEditable(true);
                if( onCountdownTextArea.isEditable())
                onTimeTextArea.setEditable(false);
        }
         else
        {
            onTimeTextArea.setEditable(false);
        }
        onTimeTextArea.setText("");
    }//GEN-LAST:event_onCountdownActionPerformed

    private void chooseColoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColoreButtonActionPerformed
     JColorChooser jcc = new JColorChooser();
     c =jcc.showDialog(null, "Choose color", Color.white);
   
    coloreSelectedLabel.setText(c.toString());
        
    }//GEN-LAST:event_chooseColoreButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
      if(onTimeButton.isSelected()){
          
        t = new Timer(1000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               seconds++;
               ddSecond= df.format(seconds);
               ddMinutes = df.format(minutes);
                onTimeTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                if (seconds==58 && minutes<=58)
               {
                   seconds=0;
                   onTimeTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                   minutes++;
               }
                else if(seconds==59 && minutes==59)
               {
                   minutes =0;
                   seconds=-1;
                   onTimeTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                     hours++;
               }
           }
       });
        t.start();
      }
      else if (onCountdown.isSelected()){
          
          int vreme =Integer.parseInt( onCountdownTextArea.getText());
         
          hours = vreme / 60;
          minutes = vreme % 60;
          seconds=0;
        t = new Timer(1000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               ddSecond= df.format(seconds);
               ddMinutes = df.format(minutes);
                   onCountdownTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                   
                  if(seconds==0 && minutes==0 && hours==0)
                      t.stop();
                  
                   if (seconds==0 && minutes!=0)
               {
                   
                   seconds=60;
                   onCountdownTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                   minutes--;
               }
                else if(seconds==0 && minutes==0)
               {
                   minutes =59;
                   seconds=60;
                   
                   onCountdownTextArea.setText(hours+":"+ddMinutes+":"+ddSecond);
                    hours--;
               }
                   seconds--;
           }
           
       });
       t.start();}
      
       startButton.setEnabled(false);
       restartButton.setEnabled(false);
       stopButton.setEnabled(true);
      
      frame.setSize(300, 200);
   
      frame.setVisible(true);
      frame.setBackground(Color.RED);
      frame.getContentPane().setBackground(c);
        
       
     
    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        stopButton.setEnabled(false);
        t.stop();
       frame.setVisible(false);
       startButton.setEnabled(true);
       restartButton.setEnabled(true);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
       seconds=0;
       minutes=0;
       hours=0;
       if(onTimeButton.isSelected()){
       onTimeTextArea.setText(null);
       }
        else if (onCountdown.isSelected()){
            
        onCountdownTextArea.setText(null);
        }
       restartButton.setEnabled(false);
    }//GEN-LAST:event_restartButtonActionPerformed

    private void speedCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedCBoxActionPerformed
        if(speedCBox.equals(1))
            sleepTime=1000;
        if(speedCBox.equals(2))
            sleepTime=2000;
        if(speedCBox.equals(3))
            sleepTime=3000;
        if(speedCBox.equals(4))
            sleepTime=4000;
        if(speedCBox.equals(5))
            sleepTime=5000;
    }//GEN-LAST:event_speedCBoxActionPerformed

    private void onTimeTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTimeTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onTimeTextAreaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseColoreButton;
    public javax.swing.JLabel coloreSelectedLabel;
    private javax.swing.JRadioButton onCountdown;
    private javax.swing.JTextField onCountdownTextArea;
    private javax.swing.JRadioButton onTimeButton;
    private javax.swing.JTextField onTimeTextArea;
    private javax.swing.JButton restartButton;
    private javax.swing.JComboBox<String> speedCBox;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
