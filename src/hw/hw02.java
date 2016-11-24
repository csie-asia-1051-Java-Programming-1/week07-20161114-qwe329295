package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fun(n));
	}
	public static int fun(int n){
		if(n<10){
			return 1;
		}else{
			return 1+fun(n/10);
		}
	}

}
