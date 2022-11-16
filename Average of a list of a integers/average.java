import java.util.*;

class ListAverage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		System.out.println("Enter the List Elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("the average of a list of integers is " + sum/n);
	}
}
