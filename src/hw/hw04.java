package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
	    int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(fun(m,n));
	}
	public static int fun(int m,int n){
		int max=1;
		for(int i=2;i<m;i++){
			if(m%i==0 && n%i==0){
				max=i;
			}
		}
		return max;
	}

}
