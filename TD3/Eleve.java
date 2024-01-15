import java.util.ArrayList;

public class Eleve {
	private String nom;
	private ArrayList<Integer> ListeNotes = new ArrayList<Integer>();
	private double moyenne;
	
	public Eleve(String nom) {
		this.nom = nom;
	}
	
	public double getMoyenne() {
		return moyenne;
	}
	
	public ArrayList<Integer> getListeNotes() {
		return ListeNotes;
	}
	
	public void ajouterNote(int note) {
        int taille = ListeNotes.size();
        if (note < 0) {
            note = 0;
        }
        else {
            if (note > 20) {
                note = 20;
            }
        }
        moyenne = (moyenne * taille + note) / (taille + 1);
        ListeNotes.add(note);
    }
	
	public String toString(){
		return this.nom+"("+this.moyenne+")";
	}
}
