/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miesmuschel;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Julian
 */

public class Miesmuschel
{
public static void main(String argc[])
         {
        NeinShuffle neu = new NeinShuffle();
        
        
        }
}

class NeinShuffle  extends JFrame{

         
        
        private final String nein= "Nein!", ja = "Ja!", vielleicht= "Vielleicht";
        private final int height=300, width=300;
        ArrayList<String> antworten= new ArrayList();
    
    public NeinShuffle()  {
        super ("Die Magische Miesmuschel");
        
        antworten.add("Du stinkst");
        antworten.add("Nein");
        antworten.add("Ja");
        antworten.add("Frag mich nochmal in 2 Stunden");
        antworten.add("Deine Mutter sagt ja");
        antworten.add("Deine Mutter sagt nein");
        antworten.add("vielleicht");
        antworten.add("Deine Mutter findet sagt vielleicht");
        antworten.add("8 durch pi");
        antworten.add("42");
        antworten.add("Juckt mich nicht");
        antworten.add("Seh ich so aus als wenn mich das \ninteressiert?");
        
        
        JFrame flaeche = new JFrame();
       
        JButton reset = new JButton("Reset");
        JButton quit = new JButton("Schließen");
        JButton fragen = new JButton("Fragen");
        JTextField textfeld= new JTextField("Frage eingeben!");
        JLabel miesmuschel = new JLabel("Die Magische Miesmuschel",SwingConstants.CENTER);
        JTextArea antwort = new JTextArea("Antwort");
        
        JPanel top = new JPanel(new GridLayout(2,0));
        top.add(miesmuschel);
        top.add(textfeld);
        
        JPanel buttons = new JPanel(new GridLayout(0,2));
        buttons.add(fragen);
        buttons.add(reset);
        
        JPanel ant = new JPanel(new GridLayout(0,1));
        //ant.add(buttons,BorderLayout.NORTH);
        ant.add(antwort);
        
        
        JPanel quitt = new JPanel(new GridLayout(1,1));
        quitt.add(quit);
        
         JPanel combo = new JPanel(new GridLayout(4,0,30,30));
         combo.add(top,BorderLayout.LINE_START);
         combo.add(buttons);
         combo.add(ant);
         combo.add(quitt);
         combo.setSize(width, height);
        flaeche.setSize(width,height);
        flaeche.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flaeche.setLocationRelativeTo(null);         
          flaeche.add(combo, BorderLayout.CENTER);
         flaeche.setVisible(true);
         
         miesmuschel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
         
         
         
         // Action Listener Verbinden!!!
         fragen.addActionListener(new ActionListener() {
             @Override public void actionPerformed(ActionEvent event) 
             {
                 Random rand = new Random();          
                 int randomNum = rand.nextInt((antworten.size()));
                 antwort.setText("Die Miesmuschel sagt: \n >>"+antworten.get(randomNum));
             }
         });
         
         reset.addActionListener(new ActionListener(){
             
             
             @Override public void actionPerformed(ActionEvent event) 
             {
                 textfeld.setText("Frage eingeben!");
                  antwort.setText("Fragen Sie die Magische Miesmuschel!");
             }
         
             
         });
         quit.addActionListener(new ActionListener(){
            @Override public void actionPerformed(ActionEvent event) 
             {
                  System.exit(0);
             }

         }
);
         
         }
         
         
         
         
         
    
    }

   
    
      
    


