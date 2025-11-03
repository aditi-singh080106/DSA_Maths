import java.util.Scanner;
import java.util.*;
public class Main
{
    //  GCD of 2 number
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number : ");
		int num2 = sc.nextInt();
		for(int i = Math.min(num1,num2) ; i >= 1 ; i-- ){
		    if(num1%i==0 && num2%i==0){
		        System.out.print(i+" is the GCD of "+num1+" & "+num2);
		        break;
		    }
		}
	}
}
