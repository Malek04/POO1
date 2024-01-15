public class PointColore extends Point{
	
	private String aCouleur;
	
	public PointColore(String aCouleur , int aX ,int aY) {
		super(aX,aY);
		this.aCouleur = aCouleur;
	}
	
	public PointColore(int aX , int aY) {
		this("N",aX,aY);
	}
	
	public PointColore() {
		this("N",0,0);
	}
	
	public String toString() {
		return aCouleur +":"+super.toString();
	}
	
	public boolean equals(Object Po) {
		if(!super.equals(Po)) {
			return false;
		}
		PointColore pc = (PointColore) Po;
		return this.aCouleur.equals(pc.aCouleur);
	}
	
	public void finalize() {
		super.finalize();
		System.out.println("PoitnColore");
	}
}