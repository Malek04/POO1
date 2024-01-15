
public class ParaPharmacie extends Produit{

	private boolean beaute;
	private boolean cosmetique;
	private boolean dietitique;
	
	public ParaPharmacie(String ref, double prix, boolean beaute , boolean cosmetique, boolean dietitique){
		super(ref,prix);
		this.beaute = beaute;
		this.cosmetique = cosmetique;
		this.dietitique = dietitique;
	}
	
	public String toString() {
		String ch = super.toString();
		if(beaute) {
			return ch +" ,beaute";
		}
		else {
			if(cosmetique) {
				return ch +" ,cosmetique";
			}
			else {
				return ch +" ,dietitique";
			}
		}
	}
	
}
