package ex;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
import java.util.*;
public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		var(n);

	}
	public static void var(int n){
		Scanner scn =new Scanner(System.in);
		int sum1=0,sum2=0,v1,v2,v3,v4,t;
		int[]data =new int[n];
		for(v1=0;v1<n;v1++){
			data[v1]=scn.nextInt();
		}
		for(v1=0;v1<n;v1++){
			sum1+=data[v1];
		}
		v3=sum1/n;
		for(v1=0;v1<n;v1++){
			v2=v3=data[v1];
			v4=v2*v2;
			sum2+=v4;
		}
		t=sum2/n;
		System.out.println(t);
	}

}
