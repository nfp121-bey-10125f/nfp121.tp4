package question2;

import java.awt.event.MouseEvent;
import java.awt.TextArea;
import java.awt.event.MouseListener;


public class JMouseObserver implements MouseListener{ 

	private String nom;
	private TextArea contenu;
	public JMouseObserver(String nom, TextArea contenu) {
		this.nom = nom;
		this.contenu = contenu;
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		String message = "Observateur "+this.nom+" : Souris entrée en ("+e.getX()+","+e.getY()+")";
		contenu.append(message + "\n");
	}

	public void mouseExited(MouseEvent e) {
	   String message = "Observateur "+this.nom+" : Souris sortie en ("+e.getX()+","+e.getY()+")";
		contenu.append(message + "\n");
	   }

	public void mousePressed(MouseEvent e) {
	   String message = "Observateur "+this.nom+" : Souris appuyée en ("+e.getX()+","+e.getY()+")";
		contenu.append(message + "\n");}

	public void mouseReleased(MouseEvent e) {
	   String message = "Observateur "+this.nom+" : Souris relâchée en ("+e.getX()+","+e.getY()+")";
		contenu.append(message + "\n");}

}
