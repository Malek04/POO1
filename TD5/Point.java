
public class Point {
	private static int aNbPoints;
	private int aX;
	private int aY;
	
	public Point(int aX , int aY) {
		this.aX = aX;
		this.aY = aY;
		this.aNbPoints++;
	}
	
	public Point(){
		this(0,0);
	}
	
	public void deplace(int Dx , int Dy) {
		this.aX += Dx;
		this.aY += Dy;
	}
	
	public String toString() {
		return "("+aX+","+aY+")";
	}
	
	public void affiche() {
		System.out.println(this.toString());
	}
	
	public boolean equals(Object Po) {
		if(Po==this) {
			return true;
		}
		if(Po==null) {
			return false;
		}
		if(Po.getClass()!=this.getClass()) {
			return false;
		}
		Point p = (Point) Po;
		return (this.aX==p.aX)&&(this.aY==p.aY);
	}
	
	public int getNbPoints() {
		return aNbPoints;
	}
	
	public void finalize() {
		this.aNbPoints--;
	}
}
