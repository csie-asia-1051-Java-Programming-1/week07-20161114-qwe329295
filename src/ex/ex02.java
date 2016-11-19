package ex;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		double[]a =new double[n];
		double sum=0,t=0;
		for(int i=0;i<n;i++){
			a[i]=scn.nextDouble();
		}
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		sum=sum/n;
		for(int i=0;i<n;i++){
			t=t+var(a[i],sum);
		}
		System.out.println(std(t/n));
	}
   public static double var(double a,double sum ){
	   a=(a-sum)*(a-sum);
	   return a;
	}
public static double std(double y){
	y=Math.pow(y,1/2);
	return y;
}
}
