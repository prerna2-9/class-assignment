import java.util.*;
public class subarray
{
public static void main(String[] args)
{
	int size;
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	int arr[]= new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	int var;
	if(k==1)
	{
		System.out.println((size*(size+1))/2);
	}
	else{
	var=((size*(size+1))/2)-(2*k+1);
	System.out.println(var);
	}
}
}