package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(fun(m)/fun(n)*fun(m-n));
	}
public static int fun( int y){
	if(y==1){
		return 1;
	}else{
		return y*fun(y-1);
	}
}
}
