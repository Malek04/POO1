
public class Segment {
	private int extr1;
	private int extr2;
	
	private void ordonne() {
		int c;
		if(extr1>extr2) {
			c = extr2;
			extr2 = extr1;
			extr1 = c;
		}
	}
	
	public Segment (int extr1,int extr2) {
		this.extr1 = extr1;
		this.extr2 = extr2;
		ordonne();
	}
	
	public int longeur() {
		return extr2 - extr1;
	}
	
	public boolean appartient(int x) {
		if(x>=extr1 && x<=extr2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getExtr1() {
		return extr1;
	}
	
	public int setExtr1(int a) {
		return extr1 = a;
	}
	
	public int getExtr2() {
		return extr2;
	}
	
	public int setExtr2(int a) {
		return extr2 = a;
	}
	
	public String toString() {
		return "segment ["+extr1+","+extr2+"]";
	}
}
