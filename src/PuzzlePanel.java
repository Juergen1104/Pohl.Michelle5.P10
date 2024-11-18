import javax.swing.JPanel;
import java.awt.*;

public class PuzzlePanel extends JPanel {
    private int dim;
    private ZahlButton[][] teile;
    private Schiebepuzzle parent;
    
    public PuzzlePanel(Schiebepuzzle parent, int n){
	this.parent = parent; 
	this.dim = n;
	this.teile = new ZahlButton[n][n];
	/* Aufgabenteil (a) */
    }

    private void mischen(){
	/* Aufgabenteil (b) */

    }

    public ZahlButton checkLeerteilNachbar(ZahlButton zb){
	/* Aufgabenteil (c) */

	return null; // kein Leerteil als Nachbar gefunden
    }

    public boolean fertig(){
	/* Aufgabenteil (d) */
	boolean korrekteReihenfolge = true;

	return korrekteReihenfolge;
    }


    /* public Methoden, die Anfragen nach Informationen von der Klasse
     ZahlButton beantworten oder weiterleiten an die Klasse Schiebepuzzle
     sowie Methoden, die ein Update der Oberflaeche (nach einem Zug oder fuer
     ein neues Spiel) durchfuehren. */

    /* liefert die Anzahl der Zuege von Hauptframe */
    public int getAnzahlZuege(){
	return parent.getAnzahlZuege();
    }

    /* veranlasst die Erhoehung des Zaehlers und ein Neuzeichnen*/
    public void update(){
	parent.erhoeheZugZaehler();
	this.repaint();
    }
    
    /* veranlasst, dass der Zaehlerwert zurueckgesetzt wird und mischt die 
       Puzzleteile neu */
    public void neuesSpiel(){
	parent.resetZugZaehler();
	this.mischen();
    }

}
