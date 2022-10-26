import java.util.*;
class Add_matrix{
	public static void main(String args[]){
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		System.out.println("enter the value of m");
		n=sc.nextInt();
		m=sc.nextInt();
		int c[][]=new int[n][m];
		int a[][] =new int[n][m];
		int b[][] =new int[n][m];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("the ans is:");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				
				 c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
		
		}
		System.out.println();
		
	}
}