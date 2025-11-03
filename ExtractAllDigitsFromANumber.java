import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		while(num!=0){
		    int val = num%10 ; 
		    arr.add(val);
		    num/=10;
		}
		for(int ele : arr){
		    System.out.printf(ele+"\t");
		}
	}
}
