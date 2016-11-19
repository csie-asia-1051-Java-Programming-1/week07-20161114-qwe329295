package ex;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		double sum =0,t=0;
		double[][]v=new double[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				v[i][j]=scn.nextDouble();
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				sum=sum+v[i][j];
			}
		}
		sum=sum/(a*b);
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				t=t+var(v[i][j],sum);
			}
		}
		System.out.println("變異數"+t/(a*b));
		System.out.println("標準差"+std(t/(a*b)));
	}
	public static double var(double v,double sum){
		v=(v-sum)*(v-sum);
		return v;
	}
	public static double std(double y){
		y=Math.pow(y, 1/2);
		return y;
	}
}
