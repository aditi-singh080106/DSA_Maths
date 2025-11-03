import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int ans = 0 ;
		ArrayList<Integer> arr = new ArrayList<>();
		while(num!=0){
		    ans*=10;
		    ans += (num%10);
		    num/=10;
		}
        System.out.print("Reverse of a number is : "+ans);
	}
}
