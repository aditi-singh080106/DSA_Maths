import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		ArrayList arr = new ArrayList<>();
		for(int div = 1 ; div <= Math.sqrt(num); div++){
		    if(num%div==0){
		        arr.add(div);
		        arr.add(num/div);
		    }
		}
		Collections.sort(arr);
		System.out.print(arr);
	}
}
