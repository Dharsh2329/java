import java.util.*;
public class Array{
	public static void main(String args[]){
		int arr[]=new int[10];
		int count=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i < arr.length;i++){
			arr[i]=s.nextInt();
		}
		int SearchElement=s.nextInt();
		for(int i=0;i<arr.length;i++){
		
			if(SearchElement==arr[i]){
				count++;
				System.out.println("Index:"+i);	
			
			}
		}
		System.out.println(count);
		

	}
}