import java.util.Scanner;
import java.util.*;
public class Main
{
    //  Prime Number
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2 ; i <= num/2 ; i++){
		    if(num%i==0){
		        isPrime = false;
		        break;
		    }
		}
		if(isPrime)     System.out.print(num+" is a Prime Number..!");
		else            System.out.print(num+" is not a Prime Number..!");
	}
}
