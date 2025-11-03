import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num , sum = 0 , digit = 0;
		while(num!=0){
		    digit = num%10 ;
		    sum += (int)Math.pow(digit,3);
		    num/=10;
		}
		if(temp==sum){
		    System.out.println(temp+" is an armstrong number..!");
		}
		else{
		    System.out.println(temp+" is not an armstrong number..!");
		}
	}
}
