
public class Medicament extends Produit{
	
	private boolean generique;
	private boolean ord;
	
	public Medicament(String ref, double prix, boolean generique , boolean ord) {
		super(ref,prix);
		this.generique = generique;
		this.ord = ord;
	}
	
	public String toString() {
		String ch=super.toString();
		if (generique == true){
			ch+=", generique";
		}
		else {
			ch+=", non generique";
		}
		if(ord==true) {
			ch+=", sur ordonnance";
		}
		else {
			ch+=", libre";
		}
		return ch;
	}
	
}
