import java.util.List;
public class Etudiant {
	private String nom;
	private String prenom;
	private List<Note> notes;
	public Etudiant() {
	
	}
	
	public Etudiant(String nom, String prenom, List<Note> notes) {
		this.nom = nom;
		this.prenom = prenom;
		this.notes = notes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}


	
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom ;
	}
	
	public double getMoyenne (){
	double somme=0, moyenne=0;
		for(int i=0;i<notes.size();i++){
			somme += notes.get(i).getNote();
			
		}
		moyenne =somme / notes.size();
		return moyenne;
	}
	
	
}
