package pers.william.MCB;

import java.util.Scanner;
import java.util.Stack;

public class SecondTest {
	
	static int n=0;
	static int k=0;
	boolean flag[][][];
	Stack<String> info = new Stack<String>();
	
	private void printFlag(){
		for(int i=0;i<=n;i++){
			for(int j=0; j<=n; j++){
				System.out.print(flag[i][j][0]+"\t");
			}
			System.out.print("\t");
			for(int j=0; j<=n; j++){
				System.out.print(flag[i][j][1]+"\t");
			}
			System.out.println();
		}
	}
	private void initialFlag(){
		flag = new boolean[n+1][n+1][2];
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				if(i==j||i==0||i==n){
					flag[i][j][0] = true;
					flag[i][j][1] = true;
				}else{
					flag[i][j][0] = false;//this can be omit
					flag[i][j][1] = false;
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of N and k:\n");

		n = scan.nextInt();
		k = scan.nextInt();
		scan.close();
		
		
		System.out.println(n + " missionaries and cannibals.\n"
				+ k +" max people on board.\n");
		SecondTest ft = new SecondTest();
		
		ft.initialFlag();
		//ft.printFlag();
		ft.DFS(n, n, true);
		
		//ft.printFlag();
		System.out.println("End of the search.");
	}
	
	private boolean DFS(int liv_m, int liv_c, boolean locationOfBoard){
		
		info.push(liv_m + " " + liv_c + " " + locationOfBoard);
		if(liv_m==0 && liv_c==0){
			System.out.println(info.toString() + "\n");
			return true;
		}
		if(locationOfBoard){
			if(flag[liv_m][liv_c][0]){
				flag[liv_m][liv_c][0] = false;
			}else{
				return false;
			}
		}else{
			if(flag[liv_m][liv_c][1]){
				flag[liv_m][liv_c][1] = false;
			}else{
				return false;
			}
		}		
		
		if(locationOfBoard){
			for(int i=0; i<=k && i<=liv_m; i++){
				for(int j=0; j<=k-i && j<=liv_c; j++){
					if(i+j!=0){
						DFS(liv_m-i, liv_c-j, false);
						info.pop();
					}
				}
			}
		}else{
			for(int i=0; i<=k && i<=n-liv_m; i++){
				for(int j=0; j<=k-i && j<=n-liv_c ; j++){
					if(i+j!=0){
						DFS(liv_m+i, liv_c+j, true);
						info.pop();
					}
				}
			}
		}
		
		if(locationOfBoard){
			flag[liv_m][liv_c][0] = true;
		}else{
			flag[liv_m][liv_c][1] = true;
		}
		return false;
	}
}
