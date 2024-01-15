import java.util.Arrays;

public class Matrice {
	private static final int RCUB = 0;
	private static final int RCAR = 1;
	private static final int VAL = 2;
	private static final int CAR = 3;
	private static final int CUB = 4;
	
	private int n;
	private double[][] M;
	
	public Matrice(int n) {
		this.n = n;
		this.M = new double[n+1][5];
		initMat();
	}
	
	public void initMat() {
		for(int i=0; i<=n ; i++) {
			M[i][RCUB] = Math.round(Math.cbrt(i)*1000.0)/1000.0;
			M[i][RCAR] = Math.round(Math.sqrt(i)*1000.0)/1000.0;
			M[i][VAL] = i;
			M[i][CAR] = Math.round(Math.pow(i,2)*1000.0)/1000.0;
			M[i][CUB] = Math.round(Math.pow(i,3)*1000.0)/1000.0;
		}
	}
	
	public void afficheMat() {
		for(int i=0 ; i<= n ; i++) {
			for(int j = 0 ; j<5 ; j++) {
				System.out.print(Math.round(M[i][j]*1000.0)/1000.0+"\t");
				System.out.println();
			}
		}
	}
}
