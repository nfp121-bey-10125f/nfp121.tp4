package question2;


import java.awt.TextArea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JButtonObserver implements ActionListener { 

    private String nom;
    private TextArea contenu;

    
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

  
    public void actionPerformed(ActionEvent ev) {
        String message = "observateur "+this.nom+": clic du boutton "+((JButton)(ev.getSource())).getText(); 
        contenu.append(message + "\n");
    }

}

