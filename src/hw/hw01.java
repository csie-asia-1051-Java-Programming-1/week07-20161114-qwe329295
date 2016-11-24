package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		System.out.println(fun(fun(a1,a2),a3));
	}
	public static int fun(int a1,int a2){
		int max=1,min;
		for(int i=2;i<=a1;i++){
			if(a1%i==0 &&a2%i==0){
				max=i;
			}
		}
		min =a1*a2/max;
		return min;
	}
	}


