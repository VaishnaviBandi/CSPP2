
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		int large = 0;
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<n ;i++ ) {
			if (arr[i]>arr[i+1]){
				large = arr[i];
			}
			else{
				large = arr[i+1];
			}
		}
		
	}
}
