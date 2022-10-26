import java.io.*;
import java.util.*;
class Bubble_sort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,temp=0;
		System.out.println("enter the sizeof the array:");
		a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("enter the elements:");
		for(int i=0;i<a;i++){
		 
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<a-1;i++){
			
			for(int j=0;j<a-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("the sorted array is:");
		for(int i=0;i<a;i++){
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		
	}
}
